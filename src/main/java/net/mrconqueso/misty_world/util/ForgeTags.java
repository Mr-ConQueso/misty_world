package net.mrconqueso.misty_world.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * References to tags under the Forge namespace.
 * These tags are generally used for crafting recipes across different mods.
 */
public class ForgeTags
{
    // --------------- / ITEMS / --------------- //

    // --------- / NATURAL / --------- //
    public static final TagKey<Item> COMPOST = forgeItemTag("compost");
    public static final TagKey<Item> CROPS = forgeItemTag("crops");
    public static final TagKey<Item> MUSHROOMS = forgeItemTag("mushrooms");

    // --- / SEEDS / --- //
    public static final TagKey<Item> SEEDS = forgeItemTag("seeds");

    // --------- / MOB DROPS / --------- //
    public static final TagKey<Item> FEATHERS = forgeItemTag("feathers");
    public static final TagKey<Item> TALLOW = forgeItemTag("tallow");
    public static final TagKey<Item> SLIMEBALLS = forgeItemTag("slimeballs");

    // --------- / MATERIALS / --------- //
    public static final TagKey<Item> CLAY = forgeItemTag("clay");
    public static final TagKey<Item> INGOTS = forgeItemTag("ingots");
    public static final TagKey<Item> NUGGETS = forgeItemTag("nuggets");
    public static final TagKey<Item> RAW_MATERIALS = forgeItemTag("raw_materials");
    public static final TagKey<Item> ASH = forgeItemTag("ash");
    public static final TagKey<Item> LATEX = forgeItemTag("latex");
    public static final TagKey<Item> RUBBER = forgeItemTag("rubber");
    public static final TagKey<Item> SULFUR_DUST = forgeItemTag("dusts/sulfur");

    // --------- / TOOLS / --------- //
    public static final TagKey<Item> SOAPS = forgeItemTag("tools/soap");
    public static final TagKey<Item> FLINT_AND_STEELS = forgeItemTag("tools/flint_and_steels");
    public static final TagKey<Item> SWORDS = forgeItemTag("tools/swords");
    public static final TagKey<Item> SHOVELS = forgeItemTag("tools/shovels");
    public static final TagKey<Item> PICKAXES = forgeItemTag("tools/pickaxes");
    public static final TagKey<Item> AXES = forgeItemTag("tools/axes");
    public static final TagKey<Item> HOES = forgeItemTag("tools/hoes");
    public static final TagKey<Item> CHISELS = forgeItemTag("tools/chisels");

    // --------- / ARMOR / --------- //
    public static final TagKey<Item> BOOTS = forgeItemTag("armors/boots");
    public static final TagKey<Item> LEGGINGS = forgeItemTag("armors/leggings");
    public static final TagKey<Item> CHESTPLATES = forgeItemTag("armors/chestplates");
    public static final TagKey<Item> HELMETS = forgeItemTag("armors/helmets");

    // --------- / FOOD / --------- //
    public static final TagKey<Item> BERRIES = forgeItemTag("berries");
    public static final TagKey<Item> SALT = forgeItemTag("dusts/salt");
    public static final TagKey<Item> EGGS = forgeItemTag("eggs");
    public static final TagKey<Item> MILK = forgeItemTag("milk");
    public static final TagKey<Item> MILK_BUCKET = forgeItemTag("milk/milk");
    public static final TagKey<Item> MILK_BOTTLE = forgeItemTag("milk/milk_bottle");




    // --------------- / BLOCKS / --------------- //

    // --------- / ORES / --------- //
    public static final TagKey<Block> ORE_BEARING_MISTY_STONE = forgeBlockTag("ore_bearing_ground/misty_stone");
    public static final TagKey<Block> ORES_IN_MISTY_STONE = forgeBlockTag("ores_in_ground/misty_stone");
    public static final TagKey<Block> ORE_RATES_SINGULAR = forgeBlockTag("ore_rates/singular");
    public static final TagKey<Block> ORE_RATES_SPARSE = forgeBlockTag("ore_rates/sparse");
    public static final TagKey<Block> ORE_RATES_DENSE = forgeBlockTag("ore_rates/dense");
    public static final TagKey<Block> IRON_ORE = forgeBlockTag("ores/iron");
    public static final TagKey<Block> GOLD_ORE = forgeBlockTag("ores/gold");
    public static final TagKey<Block> LAPIS_ORE = forgeBlockTag("ores/lapis");

    // --------- / STONES / --------- //

    public static final TagKey<Block> COBBLESTONE = forgeBlockTag("cobblestone");
    public static final TagKey<Block> GRAVEL = forgeBlockTag("gravel");
    public static final TagKey<Block> SAND = forgeBlockTag("sand");
    public static final TagKey<Block> SANDSTONE = forgeBlockTag("sandstone");
    public static final TagKey<Block> STONE = forgeBlockTag("stone");


    private static TagKey<Block> forgeBlockTag(String path) {
        return BlockTags.create(new ResourceLocation("forge", path));
    }

    private static TagKey<Item> forgeItemTag(String path) {
        return ItemTags.create(new ResourceLocation("forge", path));
    }

}

