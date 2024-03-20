package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.mrconqueso.misty_world.block.custom.state.CampfireCookingTool;
import net.mrconqueso.misty_world.block.custom.state.UrnType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CampfireBlock extends Block {
    protected static final VoxelShape ROCKS_SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 3.0F, 16.0F);
    protected static final VoxelShape CAMPFIRE_SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 6.0F, 16.0F);
    protected static final VoxelShape FIRE_PIT_POT_SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 13.0F, 16.0F);
    protected static final VoxelShape FIRE_WOOD_SHAPE = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 6.0F, 12.0F);
    protected static final VoxelShape POT_SHAPE = Block.box(3.5F, 0.0F, 3.5F, 12.5F, 13.0F, 12.5F);
    protected static final VoxelShape FIRE_GRILL_SHAPE = Block.box(0.0F, 0.0F, 0.0F, 16.0F, 9.0F, 16.0F);
    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 10);
    public static final EnumProperty<CampfireCookingTool> COOKING_TOOL = EnumProperty.create("cooking_tool", CampfireCookingTool.class);
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public CampfireBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(STAGE, 0)
                .setValue(COOKING_TOOL, CampfireCookingTool.NONE)
                .setValue(WATERLOGGED, false));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        FluidState fluid = level.getFluidState(context.getClickedPos());

        BlockState state = this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(STAGE, 0)
                .setValue(COOKING_TOOL, CampfireCookingTool.NONE)
                .setValue(WATERLOGGED, fluid.getType() == Fluids.WATER);

        return state;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (pState.getValue(COOKING_TOOL) == CampfireCookingTool.POT) return POT_SHAPE;
        else if (pState.getValue(COOKING_TOOL) == CampfireCookingTool.GRILL) return FIRE_GRILL_SHAPE;
        return pState.getValue(STAGE) < 6 ? ROCKS_SHAPE : CAMPFIRE_SHAPE;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        int st = state.getValue(STAGE);
        return st == 8 ? 14 : st == 9 ? 10 : 0;
    }


    @Override
    public @NotNull BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
            state.setValue(STAGE, 0);
        }
        return state;
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(FACING, STAGE, COOKING_TOOL, WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
}
