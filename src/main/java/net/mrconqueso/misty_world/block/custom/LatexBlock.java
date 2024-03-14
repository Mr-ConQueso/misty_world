package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LatexBlock extends Block {
    public static final VoxelShape COLLISION_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    public LatexBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return COLLISION_SHAPE;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return COLLISION_SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return super.getRenderShape(pState);
    }

    @Override
    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        pEntity.fallDistance = pFallDistance * 0.3F;
    }
}
