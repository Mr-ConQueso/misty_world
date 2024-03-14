package net.mrconqueso.misty_world.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.util.ForgeTags;
import net.mrconqueso.misty_world.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MistyWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        registerForgeTags();

        // --------- / TOOLS / --------- //

        // --- / MINE LEVEL / --- //
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_NIOBIUM_TOOL)
                .add(ModBlocks.FILTER_COAL_ORE.get());
        /*
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ASPEN_PLANKS.get());
         */

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.IRON_ORE.get())
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.SULFUR_ORE.get())
                .add(ModBlocks.LAPIS_ORE.get())
                .add(ModBlocks.NIOBIUM_ORE.get())
                .add(ModBlocks.BIO_SHALE_ORE.get())
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.SALTPETER_ORE.get())
                // --- / RAW / ORE BLOCKS / --- //
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.SULFUR_BLOCK.get())
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.ROCKS.get())
                .add(ModBlocks.NIOBIUM_BLOCK.get())
                .add(ModBlocks.RAW_NIOBIUM_BLOCK.get())
                .add(ModBlocks.BIO_SHALE_BLOCK.get())
                // --- / FILTER COAL BLOCKS / --- //
                .add(ModBlocks.CLEAN_FILTER_COAL_BLOCK.get())
                .add(ModBlocks.SLIGHTLY_POLLUTED_FILTER_COAL_BLOCK.get())
                .add(ModBlocks.MODERATELY_POLLUTED_FILTER_COAL_BLOCK.get())
                .add(ModBlocks.VERY_POLLUTED_FILTER_COAL_BLOCK.get());

        // --- / USABLE TOOL / --- //

        addBlocksToAxeMineableTag();

        /*
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ASPEN_PLANKS.get(),
                        ModBlocks.ASPEN_LOG.get()
                );

         */
        /*
        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.ASPEN_PLANKS.get());
         */

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.WET_SAND.get())
                .add(ModBlocks.DRY_SAND.get())
                .add(ModBlocks.WET_RED_SAND.get())
                .add(ModBlocks.DRY_RED_SAND.get())
                .add(ModBlocks.WET_ACIDIC_SAND.get())
                .add(ModBlocks.DRY_ACIDIC_SAND.get())
                .add(ModBlocks.FOGGY_GRAVEL.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.IRON_ORE.get())
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.SULFUR_ORE.get())
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.SALTPETER_ORE.get())
                .add(ModBlocks.FILTER_COAL_ORE.get())
                .add(ModBlocks.GOLD_ORE.get())
                .add(ModBlocks.LAPIS_ORE.get())
                .add(ModBlocks.NIOBIUM_ORE.get())
                .add(ModBlocks.BIO_SHALE_ORE.get())
                // --------- / RAW / ORE BLOCKS / --------- //
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.SULFUR_BLOCK.get())
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.ROCKS.get())
                .add(ModBlocks.CLEAN_FILTER_COAL_BLOCK.get())
                .add(ModBlocks.RAW_NIOBIUM_BLOCK.get())
                .add(ModBlocks.NIOBIUM_BLOCK.get())
                .add(ModBlocks.BIO_SHALE_BLOCK.get())
                // --------- / STONES / --------- //
                .add(ModBlocks.POROUS_FOGGY_STONE.get())
                .add(ModBlocks.MOSSY_FOGGY_COBBLESTONE.get());

        // --------- / SEEDS / --------- //

        this.tag(BlockTags.SAPLINGS)
                .add(ModBlocks.ASPEN_SAPLING.get())
                .add(ModBlocks.WILLOW_SAPLING.get())
                .add(ModBlocks.FOGGY_OAK_SAPLING.get())
                .add(ModBlocks.ARAUCARIA_SAPLING.get())
                .add(ModBlocks.FOGGY_PINE_SAPLING.get())
                .add(ModBlocks.SNOWY_TREE_SAPLING.get())
                .add(ModBlocks.STONE_TREE_SAPLING.get())
                .add(ModBlocks.RUBBER_TREE_SAPLING.get())
                .add(ModBlocks.TROPIC_TREE_SAPLING.get())
                .add(ModBlocks.PRICKLY_TREE_SAPLING.get())
                .add(ModBlocks.SWAMPY_POPLAR_SAPLING.get())
                .add(ModBlocks.UMBRELLA_TREE_SAPLING.get())
                .add(ModBlocks.FOREST_DECEIVER_SAPLING.get());

        // --------- / STONES / --------- //

        this.tag(ModTags.Blocks.FOGGY_STONES)
                .add(ModBlocks.FOGGY_STONE.get())
                .add(ModBlocks.POROUS_FOGGY_STONE.get())
                .add(ModBlocks.HARD_FOGGY_STONE.get())
                .add(ModBlocks.MINED_FOGGY_STONE.get())
                .add(ModBlocks.MOSSY_MINED_FOGGY_STONE.get())
                .add(ModBlocks.FOGGY_COBBLESTONE.get())
                .add(ModBlocks.MOSSY_FOGGY_COBBLESTONE.get());

        // --------- / GROUND / --------- //

        this.tag(ModTags.Blocks.WET_SAND)
                .add(ModBlocks.WET_SAND.get())
                .add(ModBlocks.WET_RED_SAND.get())
                .add(ModBlocks.WET_ACIDIC_SAND.get());

        this.tag(ModTags.Blocks.DRY_SAND)
                .add(ModBlocks.DRY_SAND.get())
                .add(ModBlocks.DRY_RED_SAND.get())
                .add(ModBlocks.DRY_ACIDIC_SAND.get());

        this.tag(ModTags.Blocks.WET_CLAY)
                .add(ModBlocks.WET_GRAY_CLAY.get())
                .add(ModBlocks.WET_VIRGIN_GRAY_CLAY.get())
                .add(ModBlocks.WET_CRACKED_GRAY_CLAY.get())
                .add(ModBlocks.WET_RED_CLAY.get())
                .add(ModBlocks.WET_VIRGIN_RED_CLAY.get())
                .add(ModBlocks.WET_CRACKED_RED_CLAY.get());

        this.tag(ModTags.Blocks.DRY_CLAY)
                .add(ModBlocks.DRY_GRAY_CLAY.get())
                .add(ModBlocks.DRY_VIRGIN_GRAY_CLAY.get())
                .add(ModBlocks.DRY_CRACKED_GRAY_CLAY.get())
                .add(ModBlocks.DRY_RED_CLAY.get())
                .add(ModBlocks.DRY_VIRGIN_RED_CLAY.get())
                .add(ModBlocks.DRY_CRACKED_RED_CLAY.get());
        
        this.tag(ModTags.Blocks.WET_GROUND)
                .addTag(ModTags.Blocks.WET_SAND)
                .addTag(ModTags.Blocks.WET_CLAY)
                .add(ModBlocks.WET_PEAT.get())
                .add(ModBlocks.WET_VIRGIN_SAPROPEL.get())
                .add(ModBlocks.WET_HUMUS.get());

        this.tag(ModTags.Blocks.DRY_GROUND)
                .addTag(ModTags.Blocks.DRY_SAND)
                .addTag(ModTags.Blocks.DRY_CLAY)
                .add(ModBlocks.DRY_PEAT.get())
                .add(ModBlocks.DRY_VIRGIN_SAPROPEL.get())
                .add(ModBlocks.DRY_HUMUS.get());

        // --------- / WOOD TYPES / --------- //

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ASPEN_PLANKS.get())
                .add(ModBlocks.WILLOW_PLANKS.get())
                .add(ModBlocks.ARAUCARIA_PLANKS.get())
                .add(ModBlocks.FOGGY_OAK_PLANKS.get())
                .add(ModBlocks.FOGGY_PINE_PLANKS.get())
                .add(ModBlocks.SNOWY_TREE_PLANKS.get())
                .add(ModBlocks.STONE_TREE_PLANKS.get())
                .add(ModBlocks.RUBBER_TREE_PLANKS.get())
                .add(ModBlocks.TROPIC_TREE_PLANKS.get())
                .add(ModBlocks.PRICKLY_TREE_PLANKS.get())
                .add(ModBlocks.SWAMPY_POPLAR_PLANKS.get())
                .add(ModBlocks.UMBRELLA_TREE_PLANKS.get())
                .add(ModBlocks.FOREST_DECEIVER_PLANKS.get());

        // --------- / LOGS / --------- //

        this.tag(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.ASPEN_LOGS)
                .addTag(ModTags.Blocks.WILLOW_LOGS)
                .addTag(ModTags.Blocks.ARAUCARIA_LOGS)
                .addTag(ModTags.Blocks.FOGGY_OAK_LOGS)
                .addTag(ModTags.Blocks.FOGGY_PINE_LOGS)
                .addTag(ModTags.Blocks.SNOWY_TREE_LOGS)
                .addTag(ModTags.Blocks.STONE_TREE_LOGS)
                .addTag(ModTags.Blocks.RUBBER_TREE_LOGS)
                .addTag(ModTags.Blocks.TROPIC_TREE_LOGS)
                .addTag(ModTags.Blocks.PRICKLY_TREE_LOGS)
                .addTag(ModTags.Blocks.SWAMPY_POPLAR_LOGS)
                .addTag(ModTags.Blocks.UMBRELLA_TREE_LOGS)
                .addTag(ModTags.Blocks.FOREST_DECEIVER_LOGS);

        this.tag(ModTags.Blocks.ASPEN_LOGS)
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.CARVED_ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get());

        this.tag(ModTags.Blocks.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG.get())
                .add(ModBlocks.WILLOW_WOOD.get())
                .add(ModBlocks.CARVED_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get());

        this.tag(ModTags.Blocks.ARAUCARIA_LOGS)
                .add(ModBlocks.ARAUCARIA_LOG.get())
                .add(ModBlocks.ARAUCARIA_WOOD.get())
                .add(ModBlocks.CARVED_ARAUCARIA_LOG.get())
                .add(ModBlocks.STRIPPED_ARAUCARIA_LOG.get())
                .add(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get());

        this.tag(ModTags.Blocks.FOGGY_OAK_LOGS)
                .add(ModBlocks.FOGGY_OAK_LOG.get())
                .add(ModBlocks.FOGGY_OAK_WOOD.get())
                .add(ModBlocks.CARVED_FOGGY_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get());

        this.tag(ModTags.Blocks.FOGGY_PINE_LOGS)
                .add(ModBlocks.FOGGY_PINE_LOG.get())
                .add(ModBlocks.FOGGY_PINE_WOOD.get())
                .add(ModBlocks.CARVED_FOGGY_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get());

        this.tag(ModTags.Blocks.SNOWY_TREE_LOGS)
                .add(ModBlocks.SNOWY_TREE_LOG.get())
                .add(ModBlocks.SNOWY_TREE_WOOD.get())
                .add(ModBlocks.CARVED_SNOWY_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get());

        this.tag(ModTags.Blocks.STONE_TREE_LOGS)
                .add(ModBlocks.STONE_TREE_LOG.get())
                .add(ModBlocks.STONE_TREE_WOOD.get())
                .add(ModBlocks.CARVED_STONE_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_STONE_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_STONE_TREE_WOOD.get());

        this.tag(ModTags.Blocks.RUBBER_TREE_LOGS)
                .add(ModBlocks.RUBBER_TREE_LOG.get())
                .add(ModBlocks.RUBBER_TREE_WOOD.get())
                .add(ModBlocks.CARVED_RUBBER_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());

        this.tag(ModTags.Blocks.TROPIC_TREE_LOGS)
                .add(ModBlocks.TROPIC_TREE_LOG.get())
                .add(ModBlocks.TROPIC_TREE_WOOD.get())
                .add(ModBlocks.CARVED_TROPIC_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get());

        this.tag(ModTags.Blocks.PRICKLY_TREE_LOGS)
                .add(ModBlocks.PRICKLY_TREE_LOG.get())
                .add(ModBlocks.PRICKLY_TREE_WOOD.get())
                .add(ModBlocks.CARVED_PRICKLY_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get());

        this.tag(ModTags.Blocks.SWAMPY_POPLAR_LOGS)
                .add(ModBlocks.SWAMPY_POPLAR_LOG.get())
                .add(ModBlocks.SWAMPY_POPLAR_WOOD.get())
                .add(ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get());

        this.tag(ModTags.Blocks.UMBRELLA_TREE_LOGS)
                .add(ModBlocks.UMBRELLA_TREE_LOG.get())
                .add(ModBlocks.UMBRELLA_TREE_WOOD.get())
                .add(ModBlocks.CARVED_UMBRELLA_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get());

        this.tag(ModTags.Blocks.FOREST_DECEIVER_LOGS)
                .add(ModBlocks.FOREST_DECEIVER_LOG.get())
                .add(ModBlocks.FOREST_DECEIVER_WOOD.get())
                .add(ModBlocks.CARVED_FOREST_DECEIVER_LOG.get())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get());

        // --------- / FENCES / --------- //

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ASPEN_FENCE.get())
                .add(ModBlocks.WILLOW_FENCE.get())
                .add(ModBlocks.ARAUCARIA_FENCE.get())
                .add(ModBlocks.FOGGY_OAK_FENCE.get())
                .add(ModBlocks.FOGGY_PINE_FENCE.get())
                .add(ModBlocks.SNOWY_TREE_FENCE.get())
                .add(ModBlocks.STONE_TREE_FENCE.get())
                .add(ModBlocks.RUBBER_TREE_FENCE.get())
                .add(ModBlocks.TROPIC_TREE_FENCE.get())
                .add(ModBlocks.PRICKLY_TREE_FENCE.get())
                .add(ModBlocks.SWAMPY_POPLAR_FENCE.get())
                .add(ModBlocks.UMBRELLA_TREE_FENCE.get())
                .add(ModBlocks.FOREST_DECEIVER_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ASPEN_FENCE_GATE.get())
                .add(ModBlocks.WILLOW_FENCE.get())
                .add(ModBlocks.ARAUCARIA_FENCE_GATE.get())
                .add(ModBlocks.FOGGY_OAK_FENCE_GATE.get())
                .add(ModBlocks.FOGGY_PINE_FENCE_GATE.get())
                .add(ModBlocks.SNOWY_TREE_FENCE_GATE.get())
                .add(ModBlocks.STONE_TREE_FENCE_GATE.get())
                .add(ModBlocks.RUBBER_TREE_FENCE_GATE.get())
                .add(ModBlocks.TROPIC_TREE_FENCE_GATE.get())
                .add(ModBlocks.PRICKLY_TREE_FENCE_GATE.get())
                .add(ModBlocks.SWAMPY_POPLAR_FENCE_GATE.get())
                .add(ModBlocks.UMBRELLA_TREE_FENCE_GATE.get())
                .add(ModBlocks.FOREST_DECEIVER_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.FOGGY_STONE_WALL.get())
                .add(ModBlocks.MOSSY_FOGGY_STONE_WALL.get())
                .add(ModBlocks.FOGGY_COBBLESTONE_WALL.get())
                .add(ModBlocks.MOSSY_FOGGY_COBBLESTONE_WALL.get());

        this.tag(BlockTags.FLOWER_POTS).add(ModBlocks.POTTED_VIOLET_VEIL.get());
        this.tag(BlockTags.SMALL_FLOWERS).add(ModBlocks.VIOLET_VEIL.get());
    }

    protected void addBlocksToAxeMineableTag() {
        List<String> woodVariations = Arrays.asList(
                "aspen", "willow", "araucaria", "foggy_oak", "foggy_pine", "snowy_tree",
                "stone_tree", "rubber_tree", "tropic_tree", "prickly_tree", "swampy_poplar", "umbrella_tree",
                "forest_deceiver"
        );

        ForgeRegistries.BLOCKS.forEach((block) -> {
            String registryName = block.getName().toString();
            if (registryName != null && containsWoodVariation(registryName, woodVariations)) {
                this.tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            }
        });
    }

    protected static boolean containsWoodVariation(String blockName, List<String> woodVariations) {
        String lowerCaseBlockName = blockName.toLowerCase();
        for (String variation : woodVariations) {
            if (lowerCaseBlockName.contains(variation)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void registerForgeTags() {

        this.tag(ForgeTags.COBBLESTONE).add(ModBlocks.MOSSY_FOGGY_COBBLESTONE.get());
        this.tag(ForgeTags.GRAVEL).add(ModBlocks.FOGGY_GRAVEL.get());
        this.tag(ForgeTags.SAND).add(ModBlocks.MOSSY_FOGGY_COBBLESTONE.get());
        this.tag(ForgeTags.SANDSTONE).add(ModBlocks.MOSSY_FOGGY_COBBLESTONE.get());
        this.tag(ForgeTags.STONE).add(ModBlocks.POROUS_FOGGY_STONE.get());

        this.tag(ForgeTags.ORE_BEARING_MISTY_STONE).add(ModBlocks.POROUS_FOGGY_STONE.get());

        this.tag(ForgeTags.ORES_IN_MISTY_STONE).add(
                ModBlocks.LAPIS_ORE.get(),
                ModBlocks.SALT_ORE.get(),
                ModBlocks.SALTPETER_ORE.get(),
                ModBlocks.GOLD_ORE.get(),
                ModBlocks.IRON_ORE.get(),
                ModBlocks.NIOBIUM_ORE.get(),
                ModBlocks.FILTER_COAL_ORE.get(),
                ModBlocks.SULFUR_ORE.get(),
                ModBlocks.BIO_SHALE_ORE.get()
        );

        this.tag(ForgeTags.ORE_RATES_DENSE).add(
                ModBlocks.LAPIS_ORE.get(),
                ModBlocks.SALT_ORE.get(),
                ModBlocks.SALTPETER_ORE.get(),
                ModBlocks.SULFUR_ORE.get()
        );
        this.tag(ForgeTags.ORE_RATES_SINGULAR).add(
                ModBlocks.GOLD_ORE.get(),
                ModBlocks.IRON_ORE.get(),
                ModBlocks.NIOBIUM_ORE.get(),
                ModBlocks.FILTER_COAL_ORE.get()
        );
        this.tag(ForgeTags.ORE_RATES_SPARSE).add(ModBlocks.BIO_SHALE_ORE.get());

        this.tag(ForgeTags.IRON_ORE).add(ModBlocks.IRON_ORE.get());
        this.tag(ForgeTags.GOLD_ORE).add(ModBlocks.GOLD_ORE.get());
        this.tag(ForgeTags.LAPIS_ORE).add(ModBlocks.LAPIS_ORE.get());
    }
}
