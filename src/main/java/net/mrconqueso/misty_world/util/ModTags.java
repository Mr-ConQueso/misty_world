package net.mrconqueso.misty_world.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.mrconqueso.misty_world.MistyWorld;

public class ModTags {
    public static class Blocks {

        // --------- / STONES / --------- //
        public static final TagKey<Block> FOGGY_STONES = tag("foggy_stones");

        // --------- / GROUND / --------- //
        public static final TagKey<Block> WET_SAND = tag("wet_sand");
        public static final TagKey<Block> DRY_SAND = tag("dry_sand");
        public static final TagKey<Block> WET_CLAY = tag("wet_clay");
        public static final TagKey<Block> DRY_CLAY = tag("dry_clay");

        public static final TagKey<Block> WET_GROUND = tag("wet_ground");
        public static final TagKey<Block> DRY_GROUND = tag("dry_ground");

        // --------- / LOGS / --------- //
        public static final TagKey<Block> ASPEN_LOGS = tag("aspen_logs");
        public static final TagKey<Block> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Block> ARAUCARIA_LOGS = tag("araucaria_logs");
        public static final TagKey<Block> FOGGY_OAK_LOGS = tag("foggy_oak_logs");
        public static final TagKey<Block> FOGGY_PINE_LOGS = tag("foggy_pine_logs");
        public static final TagKey<Block> SNOWY_TREE_LOGS = tag("snow_tree_logs");
        public static final TagKey<Block> STONE_TREE_LOGS = tag("stone_tree_logs");
        public static final TagKey<Block> RUBBER_TREE_LOGS = tag("rubber_tree_logs");
        public static final TagKey<Block> TROPIC_TREE_LOGS = tag("tropic_tree_logs");
        public static final TagKey<Block> PRICKLY_TREE_LOGS = tag("prickly_tree_logs");
        public static final TagKey<Block> SWAMPY_POPLAR_LOGS = tag("swampy_poplar_logs");
        public static final TagKey<Block> UMBRELLA_TREE_LOGS = tag("umbrella_tree_logs");
        public static final TagKey<Block> FOREST_DECEIVER_LOGS = tag("forest_deceiver_logs");

        // --------- / TOOLS / --------- //
        // --- / MINE LEVEL / --- //
        public static final TagKey<Block> NEEDS_NIOBIUM_TOOL = tag("needs_niobium_tool");

        // --- / USABLE TOOL / --- //
        public static final TagKey<Block> MINEABLE_WITH_CHISEL = tag("mineable_with_chisel");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MistyWorld.MOD_ID, name));
        }
    }

    public static class Items {

        // --------- / LOGS / --------- //
        public static final TagKey<Item> ASPEN_LOGS = tag("aspen_logs");
        public static final TagKey<Item> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Item> ARAUCARIA_LOGS = tag("araucaria_logs");
        public static final TagKey<Item> FOGGY_OAK_LOGS = tag("foggy_oak_logs");
        public static final TagKey<Item> FOGGY_PINE_LOGS = tag("foggy_pine_logs");
        public static final TagKey<Item> SNOWY_TREE_LOGS = tag("snow_tree_logs");
        public static final TagKey<Item> STONE_TREE_LOGS = tag("stone_tree_logs");
        public static final TagKey<Item> RUBBER_TREE_LOGS = tag("rubber_tree_logs");
        public static final TagKey<Item> TROPIC_TREE_LOGS = tag("tropic_tree_logs");
        public static final TagKey<Item> PRICKLY_TREE_LOGS = tag("prickly_tree_logs");
        public static final TagKey<Item> SWAMPY_POPLAR_LOGS = tag("swampy_poplar_logs");
        public static final TagKey<Item> UMBRELLA_TREE_LOGS = tag("umbrella_tree_logs");
        public static final TagKey<Item> FOREST_DECEIVER_LOGS = tag("forest_deceiver_logs");
        

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MistyWorld.MOD_ID, name));
        }
    }
}
