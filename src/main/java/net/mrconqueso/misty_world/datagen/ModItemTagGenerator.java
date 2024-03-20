package net.mrconqueso.misty_world.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.init.ModBlocks;
import net.mrconqueso.misty_world.init.ModItems;
import net.mrconqueso.misty_world.util.ForgeTags;
import net.mrconqueso.misty_world.util.ModTags;
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

        // --------- / WOOD TYPES / --------- //

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

        // --------- / LOGS / --------- //

        this.tag(ItemTags.LOGS_THAT_BURN)
                .addTag(ModTags.Items.ASPEN_LOGS)
                .addTag(ModTags.Items.WILLOW_LOGS)
                .addTag(ModTags.Items.ARAUCARIA_LOGS)
                .addTag(ModTags.Items.FOGGY_OAK_LOGS)
                .addTag(ModTags.Items.FOGGY_PINE_LOGS)
                .addTag(ModTags.Items.SNOWY_TREE_LOGS)
                .addTag(ModTags.Items.STONE_TREE_LOGS)
                .addTag(ModTags.Items.RUBBER_TREE_LOGS)
                .addTag(ModTags.Items.TROPIC_TREE_LOGS)
                .addTag(ModTags.Items.PRICKLY_TREE_LOGS)
                .addTag(ModTags.Items.SWAMPY_POPLAR_LOGS)
                .addTag(ModTags.Items.UMBRELLA_TREE_LOGS)
                .addTag(ModTags.Items.FOREST_DECEIVER_LOGS);

        this.tag(ModTags.Items.ASPEN_LOGS)
                .add(ModBlocks.ASPEN_LOG.get().asItem())
                .add(ModBlocks.ASPEN_WOOD.get().asItem())
                .add(ModBlocks.CARVED_ASPEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get().asItem());

        this.tag(ModTags.Items.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG.get().asItem())
                .add(ModBlocks.WILLOW_WOOD.get().asItem())
                .add(ModBlocks.CARVED_WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(ModTags.Items.ARAUCARIA_LOGS)
                .add(ModBlocks.ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.ARAUCARIA_WOOD.get().asItem())
                .add(ModBlocks.CARVED_ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ARAUCARIA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get().asItem());

        this.tag(ModTags.Items.FOGGY_OAK_LOGS)
                .add(ModBlocks.FOGGY_OAK_LOG.get().asItem())
                .add(ModBlocks.FOGGY_OAK_WOOD.get().asItem())
                .add(ModBlocks.CARVED_FOGGY_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get().asItem());

        this.tag(ModTags.Items.FOGGY_PINE_LOGS)
                .add(ModBlocks.FOGGY_PINE_LOG.get().asItem())
                .add(ModBlocks.FOGGY_PINE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_FOGGY_PINE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get().asItem());

        this.tag(ModTags.Items.SNOWY_TREE_LOGS)
                .add(ModBlocks.SNOWY_TREE_LOG.get().asItem())
                .add(ModBlocks.SNOWY_TREE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_SNOWY_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get().asItem());

        this.tag(ModTags.Items.STONE_TREE_LOGS)
                .add(ModBlocks.STONE_TREE_LOG.get().asItem())
                .add(ModBlocks.STONE_TREE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_STONE_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_STONE_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_STONE_TREE_WOOD.get().asItem());

        this.tag(ModTags.Items.RUBBER_TREE_LOGS)
                .add(ModBlocks.RUBBER_TREE_LOG.get().asItem())
                .add(ModBlocks.RUBBER_TREE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_RUBBER_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get().asItem());

        this.tag(ModTags.Items.TROPIC_TREE_LOGS)
                .add(ModBlocks.TROPIC_TREE_LOG.get().asItem())
                .add(ModBlocks.TROPIC_TREE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_TROPIC_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get().asItem());

        this.tag(ModTags.Items.PRICKLY_TREE_LOGS)
                .add(ModBlocks.PRICKLY_TREE_LOG.get().asItem())
                .add(ModBlocks.PRICKLY_TREE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_PRICKLY_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get().asItem());

        this.tag(ModTags.Items.SWAMPY_POPLAR_LOGS)
                .add(ModBlocks.SWAMPY_POPLAR_LOG.get().asItem())
                .add(ModBlocks.SWAMPY_POPLAR_WOOD.get().asItem())
                .add(ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get().asItem());

        this.tag(ModTags.Items.UMBRELLA_TREE_LOGS)
                .add(ModBlocks.UMBRELLA_TREE_LOG.get().asItem())
                .add(ModBlocks.UMBRELLA_TREE_WOOD.get().asItem())
                .add(ModBlocks.CARVED_UMBRELLA_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get().asItem());

        this.tag(ModTags.Items.FOREST_DECEIVER_LOGS)
                .add(ModBlocks.FOREST_DECEIVER_LOG.get().asItem())
                .add(ModBlocks.FOREST_DECEIVER_WOOD.get().asItem())
                .add(ModBlocks.CARVED_FOREST_DECEIVER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get().asItem());

    }

    @SuppressWarnings("unchecked")
    private void registerForgeTags() {

        tag(ForgeTags.SALT).add(ModItems.SALT.get());
        tag(ForgeTags.SALT_DUSTS).add(ModItems.SALT.get());
        tag(ForgeTags.SALTS).add(ModItems.SALT.get());

        tag(ForgeTags.COMPOST).add(ModItems.COMPOST.get());

        tag(ForgeTags.SEEDS)
                .add(ModItems.DESERT_COTTON_FLOWER.get())
                .add(ModBlocks.ASPEN_SAPLING.get().asItem())
                .add(ModBlocks.WILLOW_SAPLING.get().asItem())
                .add(ModBlocks.FOGGY_OAK_SAPLING.get().asItem())
                .add(ModBlocks.ARAUCARIA_SAPLING.get().asItem())
                .add(ModBlocks.FOGGY_PINE_SAPLING.get().asItem())
                .add(ModBlocks.SNOWY_TREE_SAPLING.get().asItem())
                .add(ModBlocks.STONE_TREE_SAPLING.get().asItem())
                .add(ModBlocks.RUBBER_TREE_SAPLING.get().asItem())
                .add(ModBlocks.TROPIC_TREE_SAPLING.get().asItem())
                .add(ModBlocks.PRICKLY_TREE_SAPLING.get().asItem())
                .add(ModBlocks.SWAMPY_POPLAR_SAPLING.get().asItem())
                .add(ModBlocks.UMBRELLA_TREE_SAPLING.get().asItem())
                .add(ModBlocks.FOREST_DECEIVER_SAPLING.get().asItem());

        tag(ForgeTags.FEATHERS).add(ModItems.WING.get());
        tag(ForgeTags.TALLOW).add(ModItems.TALLOW.get());
        tag(ForgeTags.SLIMEBALLS).add(ModItems.SPONGE_SLIME.get(), ModItems.SAPROPEL_BALL.get());

        tag(ForgeTags.CLAY).add(ModItems.RED_CLAY_BALL.get(), ModItems.GRAY_CLAY_BALL.get());
        tag(ForgeTags.INGOTS).add(ModItems.NIOBIUM_INGOT.get());
        tag(ForgeTags.NUGGETS).add(ModItems.NIOBIUM_NUGGET.get());
        tag(ForgeTags.RAW_MATERIALS).add(ModItems.RAW_NIOBIUM.get());
        tag(ForgeTags.ASH).add(ModItems.ASH.get());
        tag(ForgeTags.LATEX).add(ModItems.LATEX.get());
        tag(ForgeTags.RUBBER).add(ModItems.RUBBER.get());
        tag(ForgeTags.SULFUR_DUST).add(ModItems.SULFUR.get());

        tag(ForgeTags.SOAPS).add(ModItems.SOAP.get());
        tag(ForgeTags.FLINT_AND_STEELS).add(ModItems.FLINT_AND_STONE.get());
        tag(ForgeTags.SWORDS).add(ModItems.NIOBIUM_SWORD.get());
        tag(ForgeTags.SHOVELS).add(ModItems.NIOBIUM_SHOVEL.get());
        tag(ForgeTags.PICKAXES).add(ModItems.NIOBIUM_PICKAXE.get());
        tag(ForgeTags.AXES).add(ModItems.NIOBIUM_AXE.get());
        tag(ForgeTags.HOES).add(ModItems.NIOBIUM_HOE.get());
        tag(ForgeTags.CHISELS).add(ModItems.NIOBIUM_CHISEL.get());

        tag(ForgeTags.BOOTS).add(ModItems.NIOBIUM_BOOTS.get(), ModItems.RUBBER_BOOTS.get());
        tag(ForgeTags.LEGGINGS).add(ModItems.NIOBIUM_LEGGINGS.get(), ModItems.RUBBER_LEGGINGS.get());
        tag(ForgeTags.CHESTPLATES).add(ModItems.NIOBIUM_CHESTPLATE.get(), ModItems.RUBBER_CHESTPLATE.get());
        tag(ForgeTags.HELMETS).add(ModItems.NIOBIUM_HELMET.get(), ModItems.RUBBER_HELMET.get());

        tag(ForgeTags.BERRIES).add(Items.SWEET_BERRIES, Items.GLOW_BERRIES);
    }
}
