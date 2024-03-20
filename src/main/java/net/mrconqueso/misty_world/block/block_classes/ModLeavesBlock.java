package net.mrconqueso.misty_world.block.block_classes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.mrconqueso.misty_world.block.custom.state.UrnType;

public class ModLeavesBlock extends LeavesBlock {
    //protected MistTreeTrunk trunkBlock;
    public final int bloomMonth;
    public final int spoilMonth;
    //BooleanProperty FAST_LEAVES = BooleanProperty.create("fast_leaves");

    public ModLeavesBlock(int bloomMonth, int spoilMonth, Properties pProperties) {
        super(pProperties);
        this.bloomMonth = bloomMonth;
        this.spoilMonth = spoilMonth;
        //.registerDefaultState(this.defaultBlockState()
        //        .setValue(FAST_LEAVES, false));
    }
    /*
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
        if (random.nextInt(10) == 0) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (!isFaceFull(blockstate.getCollisionShape(level, blockpos), Direction.UP)) {
                ParticleUtils.spawnParticleBelow(level, pos, random, DAParticles.ROSEROOT_LEAVES.get());
            }
        }
    }
     */

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 60;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 30;
    }
}
