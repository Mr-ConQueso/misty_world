package net.mrconqueso.misty_world.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.ModItems;
import net.mrconqueso.misty_world.util.ForgeTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MistyWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // --------- / FORGE COMPATS / --------- //
        registerForgeTags();

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NIOBIUM_HELMET.get())
                .add(ModItems.NIOBIUM_CHESTPLATE.get())
                .add(ModItems.NIOBIUM_LEGGINGS.get())
                .add(ModItems.NIOBIUM_BOOTS.get())
                .add(ModItems.RUBBER_HELMET.get())
                .add(ModItems.RUBBER_CHESTPLATE.get())
                .add(ModItems.RUBBER_LEGGINGS.get())
                .add(ModItems.RUBBER_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ASPEN_LOG.get().asItem().asItem())
                .add(ModBlocks.ASPEN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get().asItem())
                .add(ModBlocks.UMBRELLA_TREE_LOG.get().asItem())
                .add(ModBlocks.UMBRELLA_TREE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get().asItem())
                .add(ModBlocks.FOREST_DECEIVER_LOG.get().asItem())
                .add(ModBlocks.FOREST_DECEIVER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get().asItem())
                .add(ModBlocks.ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.ARAUCARIA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get().asItem())
                .add(ModBlocks.FOGGY_OAK_LOG.get().asItem())
                .add(ModBlocks.FOGGY_OAK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get().asItem())
                .add(ModBlocks.FOGGY_PINE_LOG.get().asItem())
                .add(ModBlocks.FOGGY_PINE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get().asItem())
                .add(ModBlocks.SWAMPY_POPLAR_LOG.get().asItem())
                .add(ModBlocks.SWAMPY_POPLAR_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get().asItem())
                .add(ModBlocks.SNOWY_TREE_LOG.get().asItem())
                .add(ModBlocks.SNOWY_TREE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.ASPEN_PLANKS.get().asItem())
                .add(ModBlocks.WILLOW_PLANKS.get().asItem())
                .add(ModBlocks.ARAUCARIA_PLANKS.get().asItem())
                .add(ModBlocks.FOGGY_OAK_PLANKS.get().asItem())
                .add(ModBlocks.FOGGY_PINE_PLANKS.get().asItem())
                .add(ModBlocks.SNOWY_TREE_PLANKS.get().asItem())
                .add(ModBlocks.STONE_TREE_PLANKS.get().asItem())
                .add(ModBlocks.RUBBER_TREE_PLANKS.get().asItem())
                .add(ModBlocks.TROPIC_TREE_PLANKS.get().asItem())
                .add(ModBlocks.PRICKLY_TREE_PLANKS.get().asItem())
                .add(ModBlocks.SWAMPY_POPLAR_PLANKS.get().asItem())
                .add(ModBlocks.UMBRELLA_TREE_PLANKS.get().asItem())
                .add(ModBlocks.FOREST_DECEIVER_PLANKS.get().asItem());
    }

    @SuppressWarnings("unchecked")
    private void registerForgeTags() {
        tag(ForgeTags.BERRIES).add(Items.SWEET_BERRIES, Items.GLOW_BERRIES);
    }
}
