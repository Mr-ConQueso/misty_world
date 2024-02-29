package net.mrconqueso.misty_world.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.ModItems;
import net.mrconqueso.misty_world.util.ModTags;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        
        // --------- / WOOD / --------- //
        
        // --- / ASPEN / --- //
        this.dropSelf(ModBlocks.ASPEN_LOG.get());
        this.dropSelf(ModBlocks.ASPEN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ASPEN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        this.dropSelf(ModBlocks.ASPEN_PLANKS.get());

        this.dropSelf(ModBlocks.ASPEN_STAIRS.get());
        this.add(ModBlocks.ASPEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ASPEN_SLAB.get()));
        this.dropSelf(ModBlocks.ASPEN_BUTTON.get());
        this.dropSelf(ModBlocks.ASPEN_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ASPEN_FENCE.get());
        this.dropSelf(ModBlocks.ASPEN_FENCE_GATE.get());
        this.add(ModBlocks.ASPEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.ASPEN_DOOR.get()));
        this.dropSelf(ModBlocks.ASPEN_TRAPDOOR.get());

        this.add(ModBlocks.ASPEN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ASPEN_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / UMBRELLA TREE / --- //
        this.dropSelf(ModBlocks.UMBRELLA_TREE_LOG.get());
        this.dropSelf(ModBlocks.UMBRELLA_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get());
        this.dropSelf(ModBlocks.UMBRELLA_TREE_PLANKS.get());

        this.dropSelf(ModBlocks.UMBRELLA_TREE_STAIRS.get());
        this.add(ModBlocks.UMBRELLA_TREE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.UMBRELLA_TREE_SLAB.get()));
        this.dropSelf(ModBlocks.UMBRELLA_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.UMBRELLA_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.UMBRELLA_TREE_FENCE.get());
        this.dropSelf(ModBlocks.UMBRELLA_TREE_FENCE_GATE.get());
        this.add(ModBlocks.UMBRELLA_TREE_DOOR.get(),
                block -> createDoorTable(ModBlocks.UMBRELLA_TREE_DOOR.get()));
        this.dropSelf(ModBlocks.UMBRELLA_TREE_TRAPDOOR.get());

        this.add(ModBlocks.UMBRELLA_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.UMBRELLA_TREE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / FOREST DECEIVER / --- //
        this.dropSelf(ModBlocks.FOREST_DECEIVER_LOG.get());
        this.dropSelf(ModBlocks.FOREST_DECEIVER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get());
        this.dropSelf(ModBlocks.FOREST_DECEIVER_PLANKS.get());

        this.dropSelf(ModBlocks.FOREST_DECEIVER_STAIRS.get());
        this.add(ModBlocks.FOREST_DECEIVER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FOREST_DECEIVER_SLAB.get()));
        this.dropSelf(ModBlocks.FOREST_DECEIVER_BUTTON.get());
        this.dropSelf(ModBlocks.FOREST_DECEIVER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FOREST_DECEIVER_FENCE.get());
        this.dropSelf(ModBlocks.FOREST_DECEIVER_FENCE_GATE.get());
        this.add(ModBlocks.FOREST_DECEIVER_DOOR.get(),
                block -> createDoorTable(ModBlocks.FOREST_DECEIVER_DOOR.get()));
        this.dropSelf(ModBlocks.FOREST_DECEIVER_TRAPDOOR.get());

        this.add(ModBlocks.FOREST_DECEIVER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FOREST_DECEIVER_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / ARAUCARIA / --- //
        this.dropSelf(ModBlocks.ARAUCARIA_LOG.get());
        this.dropSelf(ModBlocks.ARAUCARIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ARAUCARIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get());
        this.dropSelf(ModBlocks.ARAUCARIA_PLANKS.get());

        this.dropSelf(ModBlocks.ARAUCARIA_STAIRS.get());
        this.add(ModBlocks.ARAUCARIA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ARAUCARIA_SLAB.get()));
        this.dropSelf(ModBlocks.ARAUCARIA_BUTTON.get());
        this.dropSelf(ModBlocks.ARAUCARIA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ARAUCARIA_FENCE.get());
        this.dropSelf(ModBlocks.ARAUCARIA_FENCE_GATE.get());
        this.add(ModBlocks.ARAUCARIA_DOOR.get(),
                block -> createDoorTable(ModBlocks.ARAUCARIA_DOOR.get()));
        this.dropSelf(ModBlocks.ARAUCARIA_TRAPDOOR.get());

        this.add(ModBlocks.ARAUCARIA_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ARAUCARIA_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / FOGGY OAK / --- //
        this.dropSelf(ModBlocks.FOGGY_OAK_LOG.get());
        this.dropSelf(ModBlocks.FOGGY_OAK_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get());
        this.dropSelf(ModBlocks.FOGGY_OAK_PLANKS.get());

        this.dropSelf(ModBlocks.FOGGY_OAK_STAIRS.get());
        this.add(ModBlocks.FOGGY_OAK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FOGGY_OAK_SLAB.get()));
        this.dropSelf(ModBlocks.FOGGY_OAK_BUTTON.get());
        this.dropSelf(ModBlocks.FOGGY_OAK_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FOGGY_OAK_FENCE.get());
        this.dropSelf(ModBlocks.FOGGY_OAK_FENCE_GATE.get());
        this.add(ModBlocks.FOGGY_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.FOGGY_OAK_DOOR.get()));
        this.dropSelf(ModBlocks.FOGGY_OAK_TRAPDOOR.get());

        this.add(ModBlocks.FOGGY_OAK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FOGGY_OAK_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / FOGGY PINE / --- //
        this.dropSelf(ModBlocks.FOGGY_PINE_LOG.get());
        this.dropSelf(ModBlocks.FOGGY_PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get());
        this.dropSelf(ModBlocks.FOGGY_PINE_PLANKS.get());

        this.dropSelf(ModBlocks.FOGGY_PINE_STAIRS.get());
        this.add(ModBlocks.FOGGY_PINE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FOGGY_PINE_SLAB.get()));
        this.dropSelf(ModBlocks.FOGGY_PINE_BUTTON.get());
        this.dropSelf(ModBlocks.FOGGY_PINE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FOGGY_PINE_FENCE.get());
        this.dropSelf(ModBlocks.FOGGY_PINE_FENCE_GATE.get());
        this.add(ModBlocks.FOGGY_PINE_DOOR.get(),
                block -> createDoorTable(ModBlocks.FOGGY_PINE_DOOR.get()));
        this.dropSelf(ModBlocks.FOGGY_PINE_TRAPDOOR.get());

        this.add(ModBlocks.FOGGY_PINE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FOGGY_PINE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / SWAMPY POPLAR / --- //
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_LOG.get());
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_PLANKS.get());

        this.dropSelf(ModBlocks.SWAMPY_POPLAR_STAIRS.get());
        this.add(ModBlocks.SWAMPY_POPLAR_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SWAMPY_POPLAR_SLAB.get()));
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_BUTTON.get());
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_FENCE.get());
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_FENCE_GATE.get());
        this.add(ModBlocks.SWAMPY_POPLAR_DOOR.get(),
                block -> createDoorTable(ModBlocks.SWAMPY_POPLAR_DOOR.get()));
        this.dropSelf(ModBlocks.SWAMPY_POPLAR_TRAPDOOR.get());

        this.add(ModBlocks.SWAMPY_POPLAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.SWAMPY_POPLAR_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / SNOWY TREE / --- //
        this.dropSelf(ModBlocks.SNOWY_TREE_LOG.get());
        this.dropSelf(ModBlocks.SNOWY_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get());
        this.dropSelf(ModBlocks.SNOWY_TREE_PLANKS.get());

        this.dropSelf(ModBlocks.SNOWY_TREE_STAIRS.get());
        this.add(ModBlocks.SNOWY_TREE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SNOWY_TREE_SLAB.get()));
        this.dropSelf(ModBlocks.SNOWY_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.SNOWY_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SNOWY_TREE_FENCE.get());
        this.dropSelf(ModBlocks.SNOWY_TREE_FENCE_GATE.get());
        this.add(ModBlocks.SNOWY_TREE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SNOWY_TREE_DOOR.get()));
        this.dropSelf(ModBlocks.SNOWY_TREE_TRAPDOOR.get());

        this.add(ModBlocks.SNOWY_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.SNOWY_TREE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / PRICKLY TREE / --- //
        this.dropSelf(ModBlocks.PRICKLY_TREE_LOG.get());
        this.dropSelf(ModBlocks.PRICKLY_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get());
        this.dropSelf(ModBlocks.PRICKLY_TREE_PLANKS.get());

        this.dropSelf(ModBlocks.PRICKLY_TREE_STAIRS.get());
        this.add(ModBlocks.PRICKLY_TREE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PRICKLY_TREE_SLAB.get()));
        this.dropSelf(ModBlocks.PRICKLY_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.PRICKLY_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PRICKLY_TREE_FENCE.get());
        this.dropSelf(ModBlocks.PRICKLY_TREE_FENCE_GATE.get());
        this.add(ModBlocks.PRICKLY_TREE_DOOR.get(),
                block -> createDoorTable(ModBlocks.PRICKLY_TREE_DOOR.get()));
        this.dropSelf(ModBlocks.PRICKLY_TREE_TRAPDOOR.get());

        this.add(ModBlocks.PRICKLY_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PRICKLY_TREE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / STONE TREE / --- //
        this.dropSelf(ModBlocks.STONE_TREE_LOG.get());
        this.dropSelf(ModBlocks.STONE_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_STONE_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_STONE_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STONE_TREE_PLANKS.get());

        this.dropSelf(ModBlocks.STONE_TREE_STAIRS.get());
        this.add(ModBlocks.STONE_TREE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.STONE_TREE_SLAB.get()));
        this.dropSelf(ModBlocks.STONE_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.STONE_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.STONE_TREE_FENCE.get());
        this.dropSelf(ModBlocks.STONE_TREE_FENCE_GATE.get());
        this.add(ModBlocks.STONE_TREE_DOOR.get(),
                block -> createDoorTable(ModBlocks.STONE_TREE_DOOR.get()));
        this.dropSelf(ModBlocks.STONE_TREE_TRAPDOOR.get());

        this.add(ModBlocks.STONE_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.STONE_TREE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / TROPIC TREE / --- //
        this.dropSelf(ModBlocks.TROPIC_TREE_LOG.get());
        this.dropSelf(ModBlocks.TROPIC_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get());
        this.dropSelf(ModBlocks.TROPIC_TREE_PLANKS.get());

        this.dropSelf(ModBlocks.TROPIC_TREE_STAIRS.get());
        this.add(ModBlocks.TROPIC_TREE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TROPIC_TREE_SLAB.get()));
        this.dropSelf(ModBlocks.TROPIC_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.TROPIC_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.TROPIC_TREE_FENCE.get());
        this.dropSelf(ModBlocks.TROPIC_TREE_FENCE_GATE.get());
        this.add(ModBlocks.TROPIC_TREE_DOOR.get(),
                block -> createDoorTable(ModBlocks.TROPIC_TREE_DOOR.get()));
        this.dropSelf(ModBlocks.TROPIC_TREE_TRAPDOOR.get());

        this.add(ModBlocks.TROPIC_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.TROPIC_TREE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / WILLOW / --- //
        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());

        this.dropSelf(ModBlocks.WILLOW_STAIRS.get());
        this.add(ModBlocks.WILLOW_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WILLOW_SLAB.get()));
        this.dropSelf(ModBlocks.WILLOW_BUTTON.get());
        this.dropSelf(ModBlocks.WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE_GATE.get());
        this.add(ModBlocks.WILLOW_DOOR.get(),
                block -> createDoorTable(ModBlocks.WILLOW_DOOR.get()));
        this.dropSelf(ModBlocks.WILLOW_TRAPDOOR.get());

        this.add(ModBlocks.WILLOW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WILLOW_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

        // --- / RUBBER_TREE / --- //
        this.dropSelf(ModBlocks.RUBBER_TREE_LOG.get());
        this.dropSelf(ModBlocks.RUBBER_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());
        this.dropSelf(ModBlocks.RUBBER_TREE_PLANKS.get());

        this.dropSelf(ModBlocks.RUBBER_TREE_STAIRS.get());
        this.add(ModBlocks.RUBBER_TREE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBBER_TREE_SLAB.get()));
        this.dropSelf(ModBlocks.RUBBER_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.RUBBER_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RUBBER_TREE_FENCE.get());
        this.dropSelf(ModBlocks.RUBBER_TREE_FENCE_GATE.get());
        this.add(ModBlocks.RUBBER_TREE_DOOR.get(),
                block -> createDoorTable(ModBlocks.RUBBER_TREE_DOOR.get()));
        this.dropSelf(ModBlocks.RUBBER_TREE_TRAPDOOR.get());

        this.add(ModBlocks.RUBBER_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RUBBER_TREE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling


        // --------- / ORES / --------- //

        this.add(ModBlocks.GOLD_ORE.get(),
                block -> createOreDrops(ModBlocks.GOLD_ORE.get(), Items.RAW_GOLD, 1.0f, 1.0f));
        this.add(ModBlocks.IRON_ORE.get(),
                block -> createOreDrops(ModBlocks.IRON_ORE.get(), Items.RAW_IRON, 1.0f, 1.0f));
        this.add(ModBlocks.SALT_ORE.get(),
                block -> createOreDrops(ModBlocks.SALT_ORE.get(), ModItems.SALT_FOOD.get(), 1.0f, 3.0f));
        this.add(ModBlocks.LAPIS_ORE.get(),
                block -> createOreDrops(ModBlocks.LAPIS_ORE.get(), Items.LAPIS_ORE, 2.0f, 5.0f));
        this.add(ModBlocks.SULFUR_ORE.get(),
                block -> createOreDrops(ModBlocks.SULFUR_ORE.get(), ModItems.SULFUR.get(), 1.0f, 4.0f));
        this.add(ModBlocks.NIOBIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.NIOBIUM_ORE.get(), ModItems.RAW_NIOBIUM.get(), 1.0f, 1.0f));
        this.add(ModBlocks.BIO_SHALE_ORE.get(),
                block -> createOreDrops(ModBlocks.BIO_SHALE_ORE.get(), ModItems.BIO_SHALE.get(), 1.0f, 1.0f));
        this.add(ModBlocks.SALTPETER_ORE.get(),
                block -> createOreDrops(ModBlocks.SALTPETER_ORE.get(), ModItems.SALTPETER.get(), 3.0f, 5.0f));
        this.add(ModBlocks.FILTER_COAL_ORE.get(),
                block -> createOreDrops(ModBlocks.FILTER_COAL_ORE.get(), ModItems.FILTER_COAL.get(), 1.0f, 2.0f));
    }

    protected LootTable.Builder createOreDrops(Block pblock, Item item, float minDrop, float maxDrop) {
        return createSilkTouchDispatchTable(pblock,
                this.applyExplosionDecay(pblock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
