package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WebBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FloatingMatBlock extends WebBlock {
    public static final BooleanProperty GROWTH = BooleanProperty.create("growth");
    public static final VoxelShape DEFAULT_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    public static final VoxelShape GROWTH_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public FloatingMatBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = this.defaultBlockState()
                .setValue(GROWTH, false);
        return state;
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(GROWTH);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (GROWTH.equals(true)) {
            return GROWTH_SHAPE;
        }
        return DEFAULT_SHAPE;
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.makeStuckInBlock(pState, new Vec3(0.25, 0.05000000074505806, 0.25));
    }
}
