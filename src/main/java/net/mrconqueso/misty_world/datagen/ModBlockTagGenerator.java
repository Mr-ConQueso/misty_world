package net.mrconqueso.misty_world.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
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
                .add(ModBlocks.SALTPETER_BLOCK.get())
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
        /*
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.ASPEN_PLANKS.get());
         */

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
                .add(ModBlocks.SALTPETER_BLOCK.get())
                .add(ModBlocks.CLEAN_FILTER_COAL_BLOCK.get())
                .add(ModBlocks.RAW_NIOBIUM_BLOCK.get())
                .add(ModBlocks.NIOBIUM_BLOCK.get())
                .add(ModBlocks.BIO_SHALE_BLOCK.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get())
                .add(ModBlocks.UMBRELLA_TREE_LOG.get())
                .add(ModBlocks.UMBRELLA_TREE_WOOD.get())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get())
                .add(ModBlocks.FOREST_DECEIVER_LOG.get())
                .add(ModBlocks.FOREST_DECEIVER_WOOD.get())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get())
                .add(ModBlocks.ARAUCARIA_LOG.get())
                .add(ModBlocks.ARAUCARIA_WOOD.get())
                .add(ModBlocks.STRIPPED_ARAUCARIA_LOG.get())
                .add(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get())
                .add(ModBlocks.FOGGY_OAK_LOG.get())
                .add(ModBlocks.FOGGY_OAK_WOOD.get())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get())
                .add(ModBlocks.FOGGY_PINE_LOG.get())
                .add(ModBlocks.FOGGY_PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get())
                .add(ModBlocks.SWAMPY_POPLAR_LOG.get())
                .add(ModBlocks.SWAMPY_POPLAR_WOOD.get())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get())
                .add(ModBlocks.SNOWY_TREE_LOG.get())
                .add(ModBlocks.SNOWY_TREE_WOOD.get())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get());

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
}
