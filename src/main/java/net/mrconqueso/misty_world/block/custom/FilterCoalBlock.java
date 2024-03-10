package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.mrconqueso.misty_world.block.util.PollutableBlock;
import org.jetbrains.annotations.NotNull;

public class FilterCoalBlock extends Block implements PollutableBlock {
    private final PollutionState pollutionState;

    public FilterCoalBlock(Properties pProperties, PollutionState pollutionState) {
        super(pProperties);
        this.pollutionState = pollutionState;
    }
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        this.onRandomTick(pState, pLevel, pPos, pRandom);
    }

    public boolean isRandomlyTicking(BlockState pState) {
        return PollutableBlock.getNext(pState.getBlock()).isPresent();
    }

    public PollutableBlock.@NotNull PollutionState getAge() {
        return this.pollutionState;
    }
}
