package net.mrconqueso.misty_world.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.model.Model;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.mrconqueso.misty_world.api.item.IColoredItem;
import net.mrconqueso.misty_world.api.item.IFilter;
import net.mrconqueso.misty_world.api.item.IMask;
import net.mrconqueso.misty_world.item.ModArmorMaterials;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.List;

public class MaskItem extends ArmorItem implements IMask, IColoredItem {

    private static final ItemColor ITEM_ARMOR_COLORING = (stack, tintIndex) -> {
        // Your custom logic to determine the color of the item
        // You can return the color based on the item's properties, NBT data, etc.
        return 0xFFFFFF; // For example, white color
    };
    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemColor getItemColor() {
        return ITEM_ARMOR_COLORING;
    }
    private final boolean canEat;
    private final float impermeability;
    private final String texture;
    private final String overlay;

    public MaskItem(ArmorMaterial pMaterial, Type pType, Properties pProperties, float impermeability, boolean canEat) {
        super(pMaterial, Type.HELMET, pProperties);
        this.canEat = canEat;
        this.impermeability = impermeability;
        this.texture = canEat ? "mist:textures/models/armor/respirator_open.png" : "mist:textures/models/armor/respirator.png";
        this.overlay = "mist:textures/models/armor/respirator_overlay.png";
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (stack.getItem() instanceof IMask && ((IMask)stack.getItem()).isRespirator()) {
            ItemStack filter = IMask.getFilter(stack);
            if (!filter.isEmpty()) {
                String filterName = filter.getDescriptionId();
                tooltip.add(Component.translatable("item.mist.filter.tooltip").append(": ").append(Component.translatable(filterName)));
                tooltip.add(Component.translatable("item.mist.respirator_efficiency.tooltip")
                        .append(": ")
                        .append(Component.translatable(String.format("%.2f", IMask.getImpermeability(stack) *
                                IFilter.getDepthOfFilteration(filter) / 100), ChatFormatting.GREEN))
                        .append("%"));

                float damagePercentage = ((float)filter.getDamageValue() / filter.getMaxDamage()) * 100;
                String damageColor = ChatFormatting.GREEN.toString();
                if (damagePercentage >= 25) {
                    damageColor = damagePercentage < 50 ? ChatFormatting.YELLOW.toString() :
                            damagePercentage < 75 ? ChatFormatting.GOLD.toString() : ChatFormatting.RED.toString();
                }
                tooltip.add(Component.translatable("item.mist.filter_damage.tooltip")
                        .append(": ")
                        .append(Component.translatable(String.format("%.2f", damagePercentage), damageColor))
                        .append("%"));
            } else {
                tooltip.add(Component.translatable("item.mist.respirator_impermeability.tooltip")
                        .append(": ")
                        .append(Component.translatable(String.format("%.2f", IMask.getImpermeability(stack)), ChatFormatting.GREEN))
                        .append("%"));
                tooltip.add(Component.translatable("item.mist.filter_empty.tooltip"));
            }
        }
    }

    /*
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Direction facing = context.getClickedFace();
        ItemStack stack = context.getItemInHand();
        Player player = context.getPlayer();

        if (hasColor(stack)) {
            BlockState state = world.getBlockState(pos);
            Block block = state.getBlock();

            if (block instanceof CauldronBlock) {
                IntegerProperty LEVEL = null;
                int level = state.getValue(LEVEL);
                if (level > 0) {
                    if (!world.isClientSide()) {
                        removeColor(stack);
                        world.setBlockAndUpdate(pos, state.setValue(LEVEL, level - 1));
                        if (player != null) {
                            player.awardStat(Stats.ITEM_USED.get(this));
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.PASS;
    }

     */

    @Override
    public boolean canEat() {
        return this.canEat;
    }

    @Override
    public float getImpermeability() {
        return this.impermeability;
    }

    public boolean getOverlay(ItemStack stack) {
        return this.getMaterial() == ModArmorMaterials.LEATHER_MASK ||
                this.getMaterial() == ModArmorMaterials.RUBBER || getColor(stack) != 0x00FFFFFF;
    }

    public boolean hasColor(ItemStack stack) {
        if (this.getMaterial() != ModArmorMaterials.LEATHER_MASK &&
                this.getMaterial() != ModArmorMaterials.RUBBER) return false;
        else {
            CompoundTag tag = stack.getTag();
            return tag != null && tag.contains("display") ? tag.getCompound("display").contains("color", 3) : false;

        }
    }

    public int getColor(ItemStack stack) {
        if (!this.hasColor(stack)) {
            if (this.getMaterial() == ModArmorMaterials.LEATHER_MASK) return 0xA06540;
            else if (this.getMaterial() == ModArmorMaterials.RUBBER) return 0x726d61;
            else return 0xFFFFFF;
        } else return stack.getTag().getCompound("display").getInt("color");
    }

    public void removeColor(ItemStack stack) {
        if (this.getMaterial() == ModArmorMaterials.LEATHER_MASK ||
                this.getMaterial() == ModArmorMaterials.RUBBER) {
            CompoundTag tag = stack.getTag();
            if (tag != null) {
                CompoundTag tag1 = tag.getCompound("display");
                if (tag1.contains("color")) {
                    tag1.remove("color");
                }
            }
        }
    }

    public void setColor(ItemStack stack, int color) {
        if (this.getMaterial() != ModArmorMaterials.LEATHER_MASK &&
                this.getMaterial() != ModArmorMaterials.RUBBER) {
            throw new UnsupportedOperationException("Can\'t dye non-leather or non-rubber!");
        } else {
            CompoundTag tab = stack.getTag();
            if (tab == null) {
                tab = new CompoundTag();
                stack.setTag(tab);
            }
            CompoundTag tab1 = tab.getCompound("display");
            if (!tab.contains("display", 10)) {
                tab.put("display", tab1);
            }
            tab1.putInt("color", color);
        }
    }
}
