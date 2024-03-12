package net.mrconqueso.misty_world.api.block;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.mrconqueso.misty_world.block.ModBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface PollutableBlock extends ChangeOverTimeBlock<PollutableBlock.PollutionState> {
    com.google.common.base.Supplier<ImmutableBiMap<Object, Object>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.builder()
                .put(ModBlocks.CLEAN_FILTER_COAL_BLOCK, ModBlocks.SLIGHTLY_POLLUTED_FILTER_COAL_BLOCK)
                .put(ModBlocks.SLIGHTLY_POLLUTED_FILTER_COAL_BLOCK, ModBlocks.MODERATELY_POLLUTED_FILTER_COAL_BLOCK)
                .put(ModBlocks.MODERATELY_POLLUTED_FILTER_COAL_BLOCK, ModBlocks.VERY_POLLUTED_FILTER_COAL_BLOCK).build();
    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return ((BiMap)NEXT_BY_BLOCK.get()).inverse();
    });

    static Optional<Block> getPrevious(Block pBlock) {
        return Optional.ofNullable((Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get(pBlock));
    }

    static Block getFirst(Block pBlock) {
        Block $$1 = pBlock;

        for(Block $$2 = (Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get(pBlock); $$2 != null; $$2 = (Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get($$2)) {
            $$1 = $$2;
        }

        return $$1;
    }

    static Optional<BlockState> getPrevious(BlockState pState) {
        return getPrevious(pState.getBlock()).map((p_154903_) -> {
            return p_154903_.withPropertiesOf(pState);
        });
    }

    static Optional<Block> getNext(Block pBlock) {
        return Optional.ofNullable((Block)((BiMap)NEXT_BY_BLOCK.get()).get(pBlock));
    }

    static BlockState getFirst(BlockState pState) {
        return getFirst(pState.getBlock()).withPropertiesOf(pState);
    }

    default Optional<BlockState> getNext(BlockState pState) {
        return getNext(pState.getBlock()).map((p_154896_) -> {
            return p_154896_.withPropertiesOf(pState);
        });
    }

    default float getChanceModifier() {
        return this.getAge() == PollutionState.CLEAN ? 0.75F : 1.0F;
    }

    public static enum PollutionState {
        CLEAN,
        SLIGHTLY_POLLUTED,
        MODERATELY_POLLUTED,
        VERY_POLLUTED;

        private PollutionState() {
        }
    }
}
