package net.mrconqueso.misty_world.block.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.mrconqueso.misty_world.block.block_classes.ModFilterCoalBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SlightlyPollutedModFilterCoalBlock extends ModFilterCoalBlock {
    public SlightlyPollutedModFilterCoalBlock(Properties pProperties, PollutionState pollutionState) {
        super(pProperties, pollutionState);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {

        pTooltip.add(Component.translatable("block.misty_world.filter_coal_block.tooltip").withStyle(ChatFormatting.GRAY).append("25.00%").withStyle(ChatFormatting.YELLOW));

        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
