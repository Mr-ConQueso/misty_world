package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import net.mrconqueso.misty_world.block.entity.FoggyStoneFurnaceBlockEntity;
import net.mrconqueso.misty_world.block.entity.ModBlockEntities;
import org.apache.logging.log4j.core.jmx.Server;
import org.jetbrains.annotations.Nullable;

public class FoggyStoneFurnaceBlock extends BaseEntityBlock {
    public FoggyStoneFurnaceBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FoggyStoneFurnaceBlockEntity(blockPos, blockState);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof FoggyStoneFurnaceBlockEntity) {
                ((FoggyStoneFurnaceBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof FoggyStoneFurnaceBlockEntity) {
                NetworkHooks.openScreen(((ServerPlayer) pPlayer), (FoggyStoneFurnaceBlockEntity) blockEntity, pPos);
            } else {
                throw new IllegalStateException("Foggy Stone Furnace Container Provider is Missing");
            }
        }

        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if(pLevel.isClientSide()) {
            return null;
        }
        return createTickerHelper(pBlockEntityType, ModBlockEntities.FOGGY_STONE_FURNACE_BLOCK_ENTITY.get(),
                (level, blockPos, blockState, pBlockEntity) -> pBlockEntity.tick(level, blockPos, blockState));
    }
}
