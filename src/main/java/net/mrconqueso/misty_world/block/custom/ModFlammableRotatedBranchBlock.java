package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ToolAction;
import net.mrconqueso.misty_world.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModFlammableRotatedBranchBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = null;
    public static final EnumProperty<Direction.Axis> AXIS;
    public static final BooleanProperty TOP_CONNECTION = BooleanProperty.create("top_connection");
    public static final BooleanProperty BOTTOM_CONNECTION = BooleanProperty.create("bottom_connection");
    private final Block base;
    private final BlockState baseState;
    private final Supplier<BlockState> stateSupplier;

    public ModFlammableRotatedBranchBlock(BlockState pBaseState, BlockBehaviour.Properties pProperties) {
        super(pProperties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any())
                .setValue(AXIS, Direction.Axis.Y))
                .setValue(TOP_CONNECTION, false))
                .setValue(BOTTOM_CONNECTION, false))
                .setValue(WATERLOGGED, false));
        this.base = pBaseState.getBlock();
        this.baseState = pBaseState;
        this.stateSupplier = () -> {
            return pBaseState;
        };
    }

    public BlockState rotate(BlockState pState, Rotation pRot) {
        return rotatePillar(pState, pRot);
    }

    public static BlockState rotatePillar(BlockState pState, Rotation pRotation) {
        switch (pRotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch ((Direction.Axis)pState.getValue(AXIS)) {
                    case X:
                        return (BlockState)pState.setValue(AXIS, Direction.Axis.Z);
                    case Z:
                        return (BlockState)pState.setValue(AXIS, Direction.Axis.X);
                    default:
                        return pState;
                }
            default:
                return pState;
        }
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
        BlockState blockstate = (BlockState)((BlockState)((BlockState)this.defaultBlockState()
                .setValue(AXIS, pContext.getClickedFace().getAxis())
                .setValue(TOP_CONNECTION, false))
                .setValue(BOTTOM_CONNECTION, false))
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);

        return (BlockState)blockstate.setValue(AXIS, pContext.getClickedFace().getAxis());
    }

    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if ((Boolean)pState.getValue(WATERLOGGED)) {
            pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }
        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(new Property[]{AXIS, BOTTOM_CONNECTION, TOP_CONNECTION, WATERLOGGED});
    }

    public FluidState getFluidState(BlockState pState) {
        return (Boolean)pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return false;
    }


    static {
        AXIS = BlockStateProperties.AXIS;
    }

    // --------------- / Bounding Box / --------------- //

    public static final VoxelShape SHAPE_X_AXIS = Block.box(0.0f, 0.375f, 0.375f, 1.0f, 0.625f, 0.625f);
    public static final VoxelShape SHAPE_Y_AXIS = Block.box(0.375f, 0.0f, 0.375f, 0.625f, 1.0f, 0.625f);
    public static final VoxelShape SHAPE_Z_AXIS = Block.box(0.375f, 0.375f, 0.0f, 0.625f, 0.625f, 1.0f);
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch ((Direction.Axis)pState.getValue(AXIS)) {
            case X:
                return SHAPE_X_AXIS;
            case Z:
                return SHAPE_Z_AXIS;
            default:
                return SHAPE_Y_AXIS;
        }
    }

    // --------------- / Rendering / --------------- //
    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(ModBlocks.ASPEN_LOG.get())) {
                return ModBlocks.STRIPPED_ASPEN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ASPEN_WOOD.get())) {
                return ModBlocks.STRIPPED_ASPEN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
