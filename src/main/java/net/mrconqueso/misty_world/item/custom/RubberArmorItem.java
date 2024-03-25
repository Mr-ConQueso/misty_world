package net.mrconqueso.misty_world.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.mrconqueso.misty_world.api.item.ISuit;
import net.mrconqueso.misty_world.item.item_classes.ModDyableRubberArmorItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RubberArmorItem extends ModDyableRubberArmorItem implements ISuit {
    private final float pollutionProtection;
    public RubberArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties, int pollutionProtection) {
        super(pMaterial, pType, pProperties);
        this.pollutionProtection = pollutionProtection;
    }

    @Override
    public float getPollutionProtection() {
        return this.pollutionProtection;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {

        Component tooltip = Component.translatable("item.misty_world.suit_protection.tooltip")
                .append(": ").withStyle(ChatFormatting.GREEN)
                .append(String.format("%.2f", getPollutionProtection())).append("%");

        pTooltipComponents.add(tooltip);
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public boolean isRepairable(@NotNull ItemStack stack) {
        return true;
    }
}
