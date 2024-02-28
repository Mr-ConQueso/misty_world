package net.mrconqueso.misty_world.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MistyWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // --------- / TOOLS / --------- //

        // --- / USABLE TOOL / --- //
        this.tag(ModTags.Blocks.NEEDS_IRON_TOOL)
                .add(ModBlocks.ASPEN_PLANKS.get());

        this.tag(ModTags.Blocks.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ASPEN_PLANKS.get());

        this.tag(ModTags.Blocks.NEEDS_STONE_TOOL)
                .add(ModBlocks.ASPEN_PLANKS.get());

        // --- / MINE LEVEL / --- //

        this.tag(ModTags.Blocks.MINEABLE_WITH_AXE)
                .add(ModBlocks.ASPEN_PLANKS.get(),
                        ModBlocks.ASPEN_LOG.get()
                );

        this.tag(ModTags.Blocks.MINEABLE_WITH_HOE)
                .add(ModBlocks.ASPEN_PLANKS.get());

        this.tag(ModTags.Blocks.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.ASPEN_PLANKS.get());

        this.tag(ModTags.Blocks.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ASPEN_PLANKS.get());

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
                .add(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ASPEN_PLANKS.get())
                .add(ModBlocks.UMBRELLA_TREE_PLANKS.get())
                .add(ModBlocks.FOREST_DECEIVER_PLANKS.get())
                .add(ModBlocks.ARAUCARIA_PLANKS.get())
                .add(ModBlocks.FOGGY_OAK_PLANKS.get())
                .add(ModBlocks.FOGGY_PINE_PLANKS.get());

        // --------- / FENCES / --------- //

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ASPEN_FENCE.get())
                .add(ModBlocks.UMBRELLA_TREE_FENCE.get())
                .add(ModBlocks.FOREST_DECEIVER_FENCE.get())
                .add(ModBlocks.ARAUCARIA_FENCE.get())
                .add(ModBlocks.FOGGY_OAK_FENCE.get())
                .add(ModBlocks.FOGGY_PINE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ASPEN_FENCE_GATE.get())
                .add(ModBlocks.UMBRELLA_TREE_FENCE_GATE.get())
                .add(ModBlocks.FOREST_DECEIVER_FENCE_GATE.get())
                .add(ModBlocks.ARAUCARIA_FENCE_GATE.get())
                .add(ModBlocks.FOGGY_OAK_FENCE_GATE.get())
                .add(ModBlocks.FOGGY_PINE_FENCE_GATE.get());
    }
}
