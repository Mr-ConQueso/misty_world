package net.mrconqueso.misty_world.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.mrconqueso.misty_world.api.blockentity.ModBlockEntityTypes;

public class ModTrappedChestBlockEntity extends ModChestBlockEntity {
    public ModTrappedChestBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.TRAPPED_CHEST.get(), pos, state);
    }

    protected void signalOpenCount(Level level, BlockPos pos, BlockState state, int i, int j) {
        super.signalOpenCount(level, pos, state, i, j);
        if (i != j) {
            Block block = state.getBlock();
            level.updateNeighborsAt(pos, block);
            level.updateNeighborsAt(pos.below(), block);
        }
    }
}
