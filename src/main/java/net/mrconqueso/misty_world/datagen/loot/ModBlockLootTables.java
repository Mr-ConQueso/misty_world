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



        this.add(ModBlocks.SALT_ORE.get(),
                block -> createOreDrops(ModBlocks.SALT_ORE.get(), ModItems.SALT_FOOD.get()));
    }

    protected LootTable.Builder createOreDrops(Block pblock, Item item) {
        return createSilkTouchDispatchTable(pblock,
                this.applyExplosionDecay(pblock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
