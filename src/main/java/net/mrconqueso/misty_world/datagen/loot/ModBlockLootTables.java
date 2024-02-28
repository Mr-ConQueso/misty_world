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
        this.dropSelf(ModBlocks.ASPEN_LOG.get());
        this.dropSelf(ModBlocks.ASPEN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ASPEN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        this.dropSelf(ModBlocks.ASPEN_PLANKS.get());
        this.add(ModBlocks.ASPEN_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ASPEN_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change to Sampling

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
