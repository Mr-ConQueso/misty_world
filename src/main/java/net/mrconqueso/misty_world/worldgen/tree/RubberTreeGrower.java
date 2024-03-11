package net.mrconqueso.misty_world.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.mrconqueso.misty_world.worldgen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class RubberTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return ModConfiguredFeatures.RUBBER_TREE_KEY;
    }
}
