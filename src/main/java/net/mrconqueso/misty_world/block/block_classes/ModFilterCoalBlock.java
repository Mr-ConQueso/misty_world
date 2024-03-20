package net.mrconqueso.misty_world.block.block_classes;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.mrconqueso.misty_world.api.block.IPollutableBlock;
import org.jetbrains.annotations.NotNull;

public class ModFilterCoalBlock extends Block implements IPollutableBlock {
    private final PollutionState pollutionState;

    public ModFilterCoalBlock(Properties pProperties, PollutionState pollutionState) {
        super(pProperties);
        pProperties.strength(5.0F);
        pProperties.explosionResistance(10.0F);
        this.pollutionState = pollutionState;
    }
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        this.onRandomTick(pState, pLevel, pPos, pRandom);
    }

    public boolean isRandomlyTicking(BlockState pState) {
        return IPollutableBlock.getNext(pState.getBlock()).isPresent();
    }

    public IPollutableBlock.@NotNull PollutionState getAge() {
        return this.pollutionState;
    }
}
