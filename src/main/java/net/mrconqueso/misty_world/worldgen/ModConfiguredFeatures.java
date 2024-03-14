package net.mrconqueso.misty_world.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SULFUR_ORE_KEY = registerKey("sulfur_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ASPEN_KEY = registerKey("aspen");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ARAUCARIA_KEY = registerKey("araucaria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOGGY_OAK_KEY = registerKey("foggy_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOGGY_PINE_KEY = registerKey("foggy_pine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SNOWY_TREE_KEY = registerKey("snowy_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_TREE_KEY = registerKey("stone_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBBER_TREE_KEY = registerKey("rubber_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TROPIC_TREE_KEY = registerKey("tropic_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRICKLY_TREE_KEY = registerKey("prickly_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWAMPY_POPLAR_KEY = registerKey("swampy_poplar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UMBRELLA_TREE_KEY = registerKey("umbrella_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOREST_DECEIVER_KEY = registerKey("forest_deceiver");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // --------- / ORES / --------- //

        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SULFUR_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.SULFUR_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSulfurOres, 9));

        // --------- / TREES / --------- //

        register(context, ASPEN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ASPEN_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.ASPEN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ARAUCARIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.ARAUCARIA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, FOGGY_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FOGGY_OAK_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.FOGGY_OAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, FOGGY_PINE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FOGGY_PINE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.FOGGY_PINE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, SNOWY_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SNOWY_TREE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.SNOWY_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, STONE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.STONE_TREE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.STONE_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, RUBBER_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RUBBER_TREE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.RUBBER_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, TROPIC_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.TROPIC_TREE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.TROPIC_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, PRICKLY_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PRICKLY_TREE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.PRICKLY_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, SWAMPY_POPLAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SWAMPY_POPLAR_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.SWAMPY_POPLAR_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, UMBRELLA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.UMBRELLA_TREE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.UMBRELLA_TREE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, FOREST_DECEIVER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FOREST_DECEIVER_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.FOREST_DECEIVER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MistyWorld.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
