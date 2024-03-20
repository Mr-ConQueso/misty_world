package net.mrconqueso.misty_world.api.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface IMossable {
    public boolean setMossy(BlockState state, Level level, BlockPos pos);
}
