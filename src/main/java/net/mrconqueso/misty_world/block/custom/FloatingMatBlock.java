package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
    public static final BooleanProperty HAS_BLOCK_ON_TOP = BooleanProperty.create("has_block_on_top");
    public static final VoxelShape DEFAULT_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    public static final VoxelShape GROWTH_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public FloatingMatBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockState state;
        if (level.getBlockState(context.getClickedPos().above(1)) == Blocks.AIR.defaultBlockState()) {
            state = this.defaultBlockState()
                    .setValue(GROWTH, false)
                    .setValue(HAS_BLOCK_ON_TOP, false);
        } else {
            state = this.defaultBlockState()
                    .setValue(GROWTH, false)
                    .setValue(HAS_BLOCK_ON_TOP, true);
        }
        return state;
    }
    /*
    @Override
    public void onNeighborChange(BlockState state, LevelReader level, BlockPos pos, BlockPos neighbor) {
        BlockState neighborState = level.getBlockState(neighbor);
        if (level.getBlockState(pos.above(1)) == neighborState) {
            if (!neighborState.is(Blocks.AIR) || !neighborState.is(Blocks.WATER)) {
                state.setValue(HAS_BLOCK_ON_TOP, true);
            }
        }

        super.onNeighborChange(state, level, pos, neighbor);
    }
     */

    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pPos, BlockPos pNeighborPos) {
        if (pLevel.getBlockState(pPos.above(1)) == pNeighborState) {
            if (!pNeighborState.is(Blocks.AIR) || !pNeighborState.is(Blocks.WATER)) {
                return pState.setValue(HAS_BLOCK_ON_TOP, true);
            }
            if (pNeighborState.is(Blocks.AIR) || pNeighborState.is(Blocks.WATER)) {
                return pState.setValue(HAS_BLOCK_ON_TOP, false);
            }
        }

        return super.updateShape(pState, pDirection, pNeighborState, pLevel, pPos, pNeighborPos);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(GROWTH, HAS_BLOCK_ON_TOP);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (GROWTH.equals(true) || HAS_BLOCK_ON_TOP.equals(true)) {
            return GROWTH_SHAPE;
        }
        return DEFAULT_SHAPE;
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.makeStuckInBlock(pState, new Vec3(0.25, 0.05000000074505806, 0.25));
    }
}
