package net.mrconqueso.misty_world.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.custom.CentrometerItem;
import net.mrconqueso.misty_world.item.item_classes.*;
import net.mrconqueso.misty_world.item.custom.GasAnalyzerItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MistyWorld.MOD_ID);
    public static final RegistryObject<Item> ICON = ITEMS.register("creativemenu_icon",
            () -> new Item(new Item.Properties()));

    // --------- / NATURAL / --------- //
    public static final RegistryObject<Item> BIO_SHALE = ITEMS.register("bio_shale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPOST = ITEMS.register("compost",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESERT_COTTON_SEED = ITEMS.register("desert_cotton_seed",
            () -> new ItemNameBlockItem(ModBlocks.DESERT_COTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> DESERT_COTTON_FLOWER = ITEMS.register("desert_cotton_flower",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUMUS = ITEMS.register("humus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MULCH = ITEMS.register("mulch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REMAINS = ITEMS.register("remains",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINDER_FUNGUS = ITEMS.register("tinder_fungus",
            () -> new Item(new Item.Properties()));


    // --------- / MOB DROPS / --------- //
    public static final RegistryObject<Item> WING = ITEMS.register("wing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TALLOW = ITEMS.register("tallow",
            () -> new Item(new Item.Properties()));


    // --------- / MATERIALS / --------- //
    public static final RegistryObject<Item> GRAY_CLAY_BALL = ITEMS.register("gray_clay_ball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_CLAY_BALL = ITEMS.register("red_clay_ball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FILTER_COAL = ITEMS.register("filter_coal",
            () -> new ModFilterItem(1000, new Item.Properties().durability(100).defaultDurability(85)));
    public static final RegistryObject<Item> LATEX = ITEMS.register("latex",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NIOBIUM = ITEMS.register("raw_niobium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_NUGGET = ITEMS.register("niobium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_INGOT = ITEMS.register("niobium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPROPEL_BALL = ITEMS.register("sapropel_ball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPONGE_FIBRE = ITEMS.register("sponge_fibre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAR_SPONGE_FIBRE = ITEMS.register("clear_sponge_fibre",
                () -> new ModFilterItem(300, new Item.Properties().durability(90)));
    public static final RegistryObject<Item> SPONGE_SLIME = ITEMS.register("sponge_slime",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPONGE_SPORE = ITEMS.register("sponge_spore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALTPETER = ITEMS.register("saltpeter",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLAY_URN = ITEMS.register("clay_urn",
            () -> new Item(new Item.Properties()));


    // --------- / TOOLS / --------- //
    public static final RegistryObject<Item> CENTROMETER = ITEMS.register("centrometer",
            () -> new CentrometerItem(new Item.Properties()));
    public static final RegistryObject<Item> GAS_ANALYZER = ITEMS.register("gas_analyzer",
            () -> new GasAnalyzerItem(new Item.Properties()));
    public static final RegistryObject<Item> FLINT_AND_STONE = ITEMS.register("flint_and_stone",
            () -> new FlintAndSteelItem(new Item.Properties().durability(48)));
    public static final RegistryObject<Item> HYGROMETER = ITEMS.register("hygrometer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOAP = ITEMS.register("soap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAP_UP = ITEMS.register("map_up",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAP_DOWN = ITEMS.register("map_down",
            () -> new Item(new Item.Properties()));

    // --- / NIOBIUM / --- //
    public static final RegistryObject<Item> NIOBIUM_AXE = ITEMS.register("niobium_axe",
            () -> new AxeItem(ModToolTiers.NIOBIUM, 8.0f, -3.1f, new  Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_CHISEL = ITEMS.register("niobium_chisel",
            () -> new ModChiselItem(new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_HOE = ITEMS.register("niobium_hoe",
            () -> new HoeItem(ModToolTiers.NIOBIUM, 4, 1, new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_PICKAXE = ITEMS.register("niobium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NIOBIUM, 5, 1.2f, new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_SWORD = ITEMS.register("niobium_sword",
            () -> new SwordItem(ModToolTiers.NIOBIUM, 6, 1.2f, new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_SHOVEL = ITEMS.register("niobium_shovel",
            () -> new ShovelItem(ModToolTiers.NIOBIUM, 5, 1, new Item.Properties()));


    // --------- / ARMOR / --------- //
    public static final RegistryObject<Item> RESPIRATOR = ITEMS.register("respirator",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OPEN_RESPIRATOR = ITEMS.register("open_respirator",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_RESPIRATOR = ITEMS.register("rubber_respirator",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OPEN_RUBBER_RESPIRATOR = ITEMS.register("open_rubber_respirator",
            () -> new ArmorItem(ModArmorMaterials.LEATHER_MASK, ArmorItem.Type.HELMET, new Item.Properties()));

    // --- / NIOBIUM / --- //
    public static final RegistryObject<Item> NIOBIUM_BOOTS = ITEMS.register("niobium_boots",
            () -> new ArmorItem(ModArmorMaterials.NIOBIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_LEGGINGS = ITEMS.register("niobium_leggings",
            () -> new ArmorItem(ModArmorMaterials.NIOBIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_CHESTPLATE = ITEMS.register("niobium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NIOBIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_HELMET = ITEMS.register("niobium_helmet",
            () -> new ArmorItem(ModArmorMaterials.NIOBIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    // --- / RUBBER / --- //
    public static final RegistryObject<Item> RUBBER_BOOTS = ITEMS.register("rubber_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBBER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_LEGGINGS = ITEMS.register("rubber_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBBER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_CHESTPLATE = ITEMS.register("rubber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBBER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_HELMET = ITEMS.register("rubber_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBBER, ArmorItem.Type.HELMET, new Item.Properties()));


    // --------- / FOOD / --------- //
    public static final RegistryObject<Item> NIGHTBERRY = ITEMS.register("nightberry",
            () -> new Item(new Item.Properties().food(ModFoods.NIGHTBERRY)));
    public static final RegistryObject<Item> BITTER_PILLS = ITEMS.register("bitter_pills",
            () -> new ModToxicFoodItem(new Item.Properties().food(ModFoods.BITTER_PILLS), -1000));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().food(ModFoods.SALT_FOOD)));
    public static final RegistryObject<Item> SOUP = ITEMS.register("soup",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPONGE_MEAT = ITEMS.register("sponge_meat",
            () -> new ModToxicFoodItem(new Item.Properties().food(ModFoods.SPONGE_MEAT), 128));
    public static final RegistryObject<Item> SWIM_BLADDER = ITEMS.register("swim_bladder",
            () -> new ModToxicFoodItem(new Item.Properties().food(ModFoods.SWIM_BLADDER), -300));

    // --- / MUSHROOMS ON A STICK / --- //
    public static final RegistryObject<Item> CUP_MUSHROOM_ON_A_STICK = ITEMS.register("cup_mushroom_on_a_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARSH_MUSHROOM_ON_A_STICK = ITEMS.register("marsh_mushroom_on_a_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_MUSHROOM_ON_A_STICK = ITEMS.register("pink_mushroom_on_a_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_MUSHROOM_ON_A_STICK = ITEMS.register("sand_mushroom_on_a_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAN_MUSHROOM_ON_A_STICK = ITEMS.register("tan_mushroom_on_a_stick",
            () -> new Item(new Item.Properties()));

    // --- / MEAT / --- //
    public static final RegistryObject<Item> BARVOG_MEAT = ITEMS.register("barvog_meat",
            () -> new Item(new Item.Properties().food(ModFoods.BARVOG_MEAT)));
    public static final RegistryObject<Item> BARVOG_MEAT_COOKED = ITEMS.register("barvog_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.BARVOG_MEAT_COOKED)));
    public static final RegistryObject<Item> BRACHIODON_MEAT = ITEMS.register("brachiodon_meat",
            () -> new Item(new Item.Properties().food(ModFoods.BRACHIDON_MEAT)));
    public static final RegistryObject<Item> BRACHIODON_MEAT_COOKED = ITEMS.register("brachiodon_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.BRACHIDON_MEAT_COOKED)));
    public static final RegistryObject<Item> CARAVAN_MEAT = ITEMS.register("caravan_meat",
            () -> new Item(new Item.Properties().food(ModFoods.CARAVAN_MEAT)));
    public static final RegistryObject<Item> CARAVAN_MEAT_COOKED = ITEMS.register("caravan_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.CARAVAN_MEAT_COOKED)));
    public static final RegistryObject<Item> FOREST_RUNNER_MEAT = ITEMS.register("forest_runner_meat",
            () -> new Item(new Item.Properties().food(ModFoods.FOREST_RUNNER_MEAT)));
    public static final RegistryObject<Item> FOREST_RUNNER_MEAT_COOKED = ITEMS.register("forest_runner_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.FOREST_RUNNER_MEAT_COOKED)));
    public static final RegistryObject<Item> GALAGA_MEAT = ITEMS.register("galaga_meat",
            () -> new Item(new Item.Properties().food(ModFoods.GALAGA_MEAT)));
    public static final RegistryObject<Item> GALAGA_MEAT_COOKED = ITEMS.register("galaga_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.GALAGA_MEAT_COOKED)));
    public static final RegistryObject<Item> HORB_MEAT = ITEMS.register("horb_meat",
            () -> new Item(new Item.Properties().food(ModFoods.HORB_MEAT)));
    public static final RegistryObject<Item> HORB_MEAT_COOKED = ITEMS.register("horb_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.HORB_MEAT_COOKED)));
    public static final RegistryObject<Item> HULTER_MEAT = ITEMS.register("hulter_meat",
            () -> new Item(new Item.Properties().food(ModFoods.HULTER_MEAT)));
    public static final RegistryObject<Item> HULTER_MEAT_COOKED = ITEMS.register("hulter_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.HULTER_MEAT_COOKED)));
    public static final RegistryObject<Item> MOMO_MEAT = ITEMS.register("momo_meat",
            () -> new Item(new Item.Properties().food(ModFoods.MOMO_MEAT)));
    public static final RegistryObject<Item> MOMO_MEAT_COOKED = ITEMS.register("momo_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.MOMO_MEAT_COOKED)));
    public static final RegistryObject<Item> MONK_MEAT = ITEMS.register("monk_meat",
            () -> new Item(new Item.Properties().food(ModFoods.MONK_MEAT)));
    public static final RegistryObject<Item> MONK_MEAT_COOKED = ITEMS.register("monk_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.MONK_MEAT_COOKED)));
    public static final RegistryObject<Item> MOSSLING_MEAT = ITEMS.register("mossling_meat",
            () -> new Item(new Item.Properties().food(ModFoods.MOSSLING_MEAT)));
    public static final RegistryObject<Item> MOSSLING_MEAT_COOKED = ITEMS.register("mossling_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.MOSSLING_MEAT_COOKED)));
    public static final RegistryObject<Item> PRICKLER_MEAT = ITEMS.register("prickler_meat",
            () -> new Item(new Item.Properties().food(ModFoods.PRICKLER_MEAT)));
    public static final RegistryObject<Item> PRICKLER_MEAT_COOKED = ITEMS.register("prickler_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.PRICKLER_MEAT_COOKED)));
    public static final RegistryObject<Item> SLOTH_MEAT = ITEMS.register("sloth_meat",
            () -> new Item(new Item.Properties().food(ModFoods.SLOTH_MEAT)));
    public static final RegistryObject<Item> SLOTH_MEAT_COOKED = ITEMS.register("sloth_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.SLOTH_MEAT_COOKED)));
    public static final RegistryObject<Item> SNIFF_MEAT = ITEMS.register("sniff_meat",
            () -> new Item(new Item.Properties().food(ModFoods.SNIFF_MEAT)));
    public static final RegistryObject<Item> SNIFF_MEAT_COOKED = ITEMS.register("sniff_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.SNIFF_MEAT_COOKED)));
    public static final RegistryObject<Item> WULDER_MEAT = ITEMS.register("wulder_meat",
            () -> new Item(new Item.Properties().food(ModFoods.WULDER_MEAT)));
    public static final RegistryObject<Item> WULDER_MEAT_COOKED = ITEMS.register("wulder_meat_cooked",
            () -> new Item(new Item.Properties().food(ModFoods.WULDER_MEAT_COOKED)));

    // --------- / Registrar / --------- //
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
