package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.mrconqueso.misty_world.api.block.IMossable;
import net.mrconqueso.misty_world.block.custom.state.MistyStoneType;
import net.mrconqueso.misty_world.block.custom.state.UrnType;
import org.jetbrains.annotations.Nullable;

public class MinedFoggyStoneBlock extends Block implements IMossable {
    public static final EnumProperty<MistyStoneType> TYPE = EnumProperty.create("type", MistyStoneType.class);
    public MinedFoggyStoneBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(TYPE, MistyStoneType.NORMAL));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = this.defaultBlockState()
                .setValue(TYPE, MistyStoneType.NORMAL);

        return state;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(TYPE);
    }

    @Override
    public boolean setMossy(BlockState state, Level level, BlockPos pos) {
        return true;
    }
}
