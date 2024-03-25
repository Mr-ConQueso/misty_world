package net.mrconqueso.misty_world.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.mrconqueso.misty_world.api.item.IFilter;
import net.mrconqueso.misty_world.api.item.IMask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LeatherMaskItem extends DyeableArmorItem implements IMask {
    private final float impermeability;
    private final boolean canEat;
    public LeatherMaskItem(float impermeability, boolean canEat, ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        this.impermeability = impermeability;
        this.canEat = canEat;
    }

    /*
    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {

        Component filterTooltip = Component.empty();
        Component filterDamageTooltip = Component.empty();
        Component filterTypeTooltip = Component.empty();
        ItemStack filter = IMask.getFilter(pStack);

        float damage = (float)filter.getDamageValue() / filter.getMaxDamage() * 100;

        if (!filter.isEmpty()) {
            filterTooltip = Component.translatable("item.misty_world.filter.tooltip").append(": ")
                    .append(filter.getDisplayName())
                    .append("item.misty_world.respirator.efficiency.tooltip").append(": ")
                    .withStyle(ChatFormatting.GREEN)
                    .append(String.format("%.2f", IMask.getImpermeability(pStack)* IFilter.getDepthOfFilteration(filter)/100)).append("%");

            if (damage >= 25) {
                filterDamageTooltip = Component.translatable("item.misty_world.filter.filter_damage.tooltip").append(": ")
                        .withStyle(ChatFormatting.YELLOW).append(String.format("%.2f", damage)).append("%");
            } else if (damage < 75) {
                filterDamageTooltip = Component.translatable("item.misty_world.filter.filter_damage.tooltip").append(": ")
                        .withStyle(ChatFormatting.GOLD).append(String.format("%.2f", damage)).append("%");
            } else {
                filterDamageTooltip = Component.translatable("item.misty_world.filter.filter_damage.tooltip").append(": ")
                        .withStyle(ChatFormatting.RED).append(String.format("%.2f", damage)).append("%");
            }
        } else {

            filterTypeTooltip = Component.translatable("item.misty_world.respirator.impermeability.tooltip").append(": ").withStyle(ChatFormatting.GREEN)
                            .append(String.format("%.2f", IMask.getImpermeability(pStack))).append("%")
                            .append("item.misty_world.filter.filter_empty.tooltip");
        }

        Component finalTooltip = Component.literal(filterTooltip.getString()).append(filterDamageTooltip.getString()).append(filterTypeTooltip.getString());
        pTooltipComponents.add(finalTooltip);
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
     */
}
