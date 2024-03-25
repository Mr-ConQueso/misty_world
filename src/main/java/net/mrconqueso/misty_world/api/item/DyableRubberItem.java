package net.mrconqueso.misty_world.api.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public interface DyableRubberItem {
    String TAG_COLOR = "color";
    String TAG_DISPLAY = "display";
    int DEFAULT_RUBBER_COLOR = 7499105;

    default boolean hasCustomColor(ItemStack pStack) {
        CompoundTag compoundtag = pStack.getTagElement(TAG_DISPLAY);
        return compoundtag != null && compoundtag.contains(TAG_COLOR, 99);
    }

    default int getColor(ItemStack pStack) {
        CompoundTag compoundtag = pStack.getTagElement(TAG_DISPLAY);
        return compoundtag != null && compoundtag.contains(TAG_COLOR, 99) ? compoundtag.getInt(TAG_COLOR) : DEFAULT_RUBBER_COLOR;
    }

    default void clearColor(ItemStack pStack) {
        CompoundTag compoundtag = pStack.getTagElement(TAG_DISPLAY);
        if (compoundtag != null && compoundtag.contains(TAG_COLOR)) {
            compoundtag.remove(TAG_COLOR);
        }
    }

    default void setColor(ItemStack pStack, int pColor) {
        pStack.getOrCreateTagElement(TAG_DISPLAY).putInt(TAG_COLOR, pColor);
    }

    static ItemStack dyeArmor(ItemStack pStack, List<DyeItem> pDyes) {
        ItemStack emptyStack = ItemStack.EMPTY;
        int[] rbgColor = new int[3];
        int i = 0;
        int j = 0;
        Item item = pStack.getItem();
        DyableRubberItem dyableRubberItem = null;
        if (item instanceof DyeableLeatherItem) {
            dyableRubberItem = (DyableRubberItem) item;
            emptyStack = pStack.copyWithCount(1);
            if (dyableRubberItem.hasCustomColor(pStack)) {
                int k = dyableRubberItem.getColor(emptyStack);
                float f = (float)(k >> 16 & 255) / 255.0F;
                float f1 = (float)(k >> 8 & 255) / 255.0F;
                float f2 = (float)(k & 255) / 255.0F;
                i += (int)(Math.max(f, Math.max(f1, f2)) * 255.0F);
                rbgColor[0] += (int)(f * 255.0F);
                rbgColor[1] += (int)(f1 * 255.0F);
                rbgColor[2] += (int)(f2 * 255.0F);
                ++j;
            }

            for(DyeItem dyeitem : pDyes) {
                float[] afloat = dyeitem.getDyeColor().getTextureDiffuseColors();
                int i2 = (int)(afloat[0] * 255.0F);
                int l = (int)(afloat[1] * 255.0F);
                int i1 = (int)(afloat[2] * 255.0F);
                i += Math.max(i2, Math.max(l, i1));
                rbgColor[0] += i2;
                rbgColor[1] += l;
                rbgColor[2] += i1;
                ++j;
            }
        }

        if (dyableRubberItem == null) {
            return ItemStack.EMPTY;
        } else {
            int j1 = rbgColor[0] / j;
            int k1 = rbgColor[1] / j;
            int l1 = rbgColor[2] / j;
            float f3 = (float)i / (float)j;
            float f4 = (float)Math.max(j1, Math.max(k1, l1));
            j1 = (int)((float)j1 * f3 / f4);
            k1 = (int)((float)k1 * f3 / f4);
            l1 = (int)((float)l1 * f3 / f4);
            int j2 = (j1 << 8) + k1;
            j2 = (j2 << 8) + l1;
            dyableRubberItem.setColor(emptyStack, j2);
            return emptyStack;
        }
    }
}
