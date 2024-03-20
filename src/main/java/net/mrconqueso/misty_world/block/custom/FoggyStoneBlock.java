package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FoggyStoneBlock extends Block {
    public FoggyStoneBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pMovedByPiston) {
        this.checkFireBlock(pLevel, pPos);
    }

    private void checkFireBlock(Level level, BlockPos pos) {
        /*
        BlockState state = level.getBlockState(pos.below(1));
        if (state.getBlock() == MistBlocks.CAMPFIRE || state.getBlock() == Blocks.FIRE || state.getBlock() == Blocks.LAVA) {
            state.setValue(pos, MistBlocks.STONE_MINED.getDefaultState().withProperty(MistStoneMined.TYPE, EnumStoneType.NATURE).withProperty(MistStoneMined.STAGE, EnumStoneStage.NORMAL));
        }

         */
    }
}
