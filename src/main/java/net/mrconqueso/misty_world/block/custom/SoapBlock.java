package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.mrconqueso.misty_world.block.ModBlocks;

public class SoapBlock extends Block {
    public SoapBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public float getFriction() {
        return 0.99F;
        //return world instanceof World && MistWorld.isPosInFog((World)world, pos.getY() + 2) ? 0.7F : 0.99F;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        /*
        if (pRandom.nextBoolean() && pLevel.isRainingAt(pPos.above()) && !MistWorld.isPosInFog(pLevel, pPos.getY() + 2)) {
            double x = pPos.getX() + pLevel.random.nextDouble();
            double y = pPos.getY() + pLevel.random.nextDouble() * 0.2 + 1.05;
            double z = pPos.getZ() + pLevel.random.nextDouble();
            pLevel.sendParticles(ModParticle.MIST_BUBBLE, x, y, z, 0, -pLevel.random.nextFloat() * 0.2F, 0);
        }

         */
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pMovedByPiston) {
        /*
        if (!pLevel.isClientSide()) {
            for (EnumFacing face : FacingHelper.NOTDOWN) {
                if (world.getBlockState(pos.offset(face)).getBlock() == MistBlocks.ACID_BLOCK) {
                    world.setBlockState(pos, this.getDefaultState());
                    break;
                }
            }
        }

         */
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pNeighborBlock, BlockPos pNeighborPos, boolean pMovedByPiston) {
        /*
        if (!pLevel.isClientSide() && pNeighborPos.getY() >= pPos.getY() && pLevel.getBlockState(pNeighborPos).getBlock() == ModBlocks.ACID_BLOCK) {
            world.setBlockState(pos, this.getDefaultState());
        }

         */
    }
}
