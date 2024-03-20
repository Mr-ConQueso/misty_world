package net.mrconqueso.misty_world.block.block_classes;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.mrconqueso.misty_world.block.custom.state.ChestVariants;
import net.mrconqueso.misty_world.api.block.IVariantChest;
import net.mrconqueso.misty_world.api.blockentity.ModBlockEntityTypes;

public class ModChestBlock extends ChestBlock implements IVariantChest {
    private final ChestVariants variant;

    public ModChestBlock(ChestVariants variantIn, Properties properties) {
        super(properties, ModBlockEntityTypes.CHEST::get);
        this.variant = variantIn;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntityTypes.CHEST.get().create(pos, state);
    }

    @Override
    public ChestVariants getVariant() {
        return variant;
    }
}
