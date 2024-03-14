package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class RubberBlock extends Block {
    public RubberBlock(Properties pProperties) {
        super(pProperties);
    }

    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        if (pEntity.isSuppressingBounce()) {
            super.fallOn(pLevel, pState, pPos, pEntity, pFallDistance);
        } else {
            pEntity.causeFallDamage(pFallDistance, 0.0F, pLevel.damageSources().fall());
        }

    }

    public void updateEntityAfterFallOn(BlockGetter pLevel, Entity pEntity) {
        if (pEntity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(pLevel, pEntity);
        } else {
            this.bounceUp(pEntity);
        }

    }

    private void bounceUp(Entity pEntity) {
        Vec3 $$1 = pEntity.getDeltaMovement();
        if ($$1.y < 0.0) {
            double $$2 = pEntity instanceof LivingEntity ? 1.0 : 0.8;
            pEntity.setDeltaMovement($$1.x, -$$1.y * $$2, $$1.z);
        }

    }
}
