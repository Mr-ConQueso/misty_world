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

        // --------- / FORGE COMPATS / --------- //



        // --------- / TOOLS / --------- //
        // --- / MINE LEVEL / --- //
        public static final TagKey<Block> NEEDS_NIOBIUM_TOOL = tag("needs_niobium_tool");

        // --- / USABLE TOOL / --- //
        public static final TagKey<Block> MINEABLE_WITH_AXE = tag("mineable_with_axe");

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
