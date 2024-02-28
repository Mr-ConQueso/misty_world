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

        // --------- / TOOLS / --------- //
        // --- / MINE LEVEL / --- //
        public static final TagKey<Block> EXAMPLE_BLOCK_TAG = tag("example_block_tag");
        public static final TagKey<Block> NEEDS_STONE_TOOL = tag("needs_stone_tool");
        public static final TagKey<Block> NEEDS_IRON_TOOL = tag("needs_iron_tool");
        public static final TagKey<Block> NEEDS_DIAMOND_TOOL = tag("needs_diamond_tool");

        // --- / USABLE TOOL / --- //
        public static final TagKey<Block> MINEABLE_WITH_AXE = tag("mineable_with_axe");
        public static final TagKey<Block> MINEABLE_WITH_SHOVEL = tag("mineable_with_shovel");
        public static final TagKey<Block> MINEABLE_WITH_HOE = tag("mineable_with_hoe");
        public static final TagKey<Block> MINEABLE_WITH_PICKAXE = tag("mineable_with_pickaxe");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MistyWorld.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MistyWorld.MOD_ID, name));
        }
    }
}
