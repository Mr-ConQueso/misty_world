package net.mrconqueso.misty_world.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.mrconqueso.misty_world.api.item.IFilter;

import java.util.List;
import java.util.function.Consumer;

public class FilterItem extends Item implements IFilter {
    private final float filteringDepth;

    public FilterItem(float filteringDepth, Properties properties) {
        super(properties);
        this.filteringDepth = filteringDepth;
    }

    @Override
    public float getFilteringDepth() {
        return this.filteringDepth;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @org.jetbrains.annotations.Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        float itemDamage = (float)pStack.getDamageValue() / pStack.getMaxDamage() * 100;
        float filtrationDepth = this.filteringDepth / 10;

        pTooltipComponents.add(Component.translatable("item.misty_world.filter_depth.tooltip")
                .append(": ").withStyle(ChatFormatting.GREEN)
                .append(String.format("%.2f", filtrationDepth))
                .append("%"));

        Component filterDamage;

        if (itemDamage >= 25) {
            filterDamage = Component.empty().withStyle(ChatFormatting.GRAY);
        } else if (itemDamage < 50) {
            filterDamage = Component.empty().withStyle(ChatFormatting.YELLOW);
        } else if (itemDamage < 75) {
            filterDamage = Component.empty().withStyle(ChatFormatting.GOLD);
        } else {
            filterDamage = Component.empty().withStyle(ChatFormatting.RED);
        }

        pTooltipComponents.add(Component.translatable("item.misty_world.filter_damage.tooltip")
                .append(": ").append(filterDamage)
                .append(String.format("%.2f", itemDamage))
                .append("%"));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return !stack.isDamaged() ? super.getMaxStackSize() : 1;
    }

    @Override
    public void setDamage(ItemStack stack, int damage) {
        stack = FilterItem.setDamageNBT(stack, true);
        super.setDamage(stack, damage);
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return super.damageItem(stack, amount, entity, onBroken);
    }


    /** Used to prevent merging stacks of filters with different damage. Also see removeDamageNBT(ItemStack stack). */
    public static ItemStack setDamageNBT(ItemStack stack, boolean checkDamage) {
        if (!checkDamage || !stack.isDamaged()) {
            CompoundTag tag = stack.getOrCreateTag();
            tag.putBoolean("isPolluted", true);
        }
        return stack;
    }

    /** Used to prevent merging stacks of filters with different damage. Also see setDamageNBT(ItemStack stack). */
    public static ItemStack removeDamageNBT(ItemStack stack) {
        CompoundTag tag = stack.getTag();
        if (tag != null && tag.contains("isPolluted")) {
            tag.remove("isPolluted");
        }
        return stack;
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
