package net.mrconqueso.misty_world.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1f);
        trimMaterials.put(TrimMaterials.IRON, 0.2f);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3f);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4f);
        trimMaterials.put(TrimMaterials.COPPER, 0.5f);
        trimMaterials.put(TrimMaterials.GOLD, 0.6f);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7f);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8f);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9f);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0f);
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MistyWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ICON);
        // --------- / BLOCKS / --------- //
        
        // --------- / WOOD / --------- //
        // --- / ASPEN / --- //
        evenSimplerBlockItem(ModBlocks.ASPEN_PLANKS);
        evenSimplerBlockItem(ModBlocks.ASPEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.ASPEN_SLAB);
        buttonItem(ModBlocks.ASPEN_BUTTON, ModBlocks.ASPEN_PLANKS);
        evenSimplerBlockItem(ModBlocks.ASPEN_PRESSURE_PLATE);
        fenceItem(ModBlocks.ASPEN_FENCE, ModBlocks.ASPEN_PLANKS);
        evenSimplerBlockItem(ModBlocks.ASPEN_FENCE_GATE);
        simpleBlockItem(ModBlocks.ASPEN_DOOR);
        trapdoorItem(ModBlocks.ASPEN_TRAPDOOR);
        // --- / UMBRELLA TREE / --- //
        evenSimplerBlockItem(ModBlocks.UMBRELLA_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.UMBRELLA_TREE_STAIRS);
        evenSimplerBlockItem(ModBlocks.UMBRELLA_TREE_SLAB);
        buttonItem(ModBlocks.UMBRELLA_TREE_BUTTON, ModBlocks.UMBRELLA_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.UMBRELLA_TREE_PRESSURE_PLATE);
        fenceItem(ModBlocks.UMBRELLA_TREE_FENCE, ModBlocks.UMBRELLA_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.UMBRELLA_TREE_FENCE_GATE);
        simpleBlockItem(ModBlocks.UMBRELLA_TREE_DOOR);
        trapdoorItem(ModBlocks.UMBRELLA_TREE_TRAPDOOR);
        // --- / FOREST DECEIVER / --- //
        evenSimplerBlockItem(ModBlocks.FOREST_DECEIVER_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOREST_DECEIVER_STAIRS);
        evenSimplerBlockItem(ModBlocks.FOREST_DECEIVER_SLAB);
        buttonItem(ModBlocks.FOREST_DECEIVER_BUTTON, ModBlocks.FOREST_DECEIVER_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOREST_DECEIVER_PRESSURE_PLATE);
        fenceItem(ModBlocks.FOREST_DECEIVER_FENCE, ModBlocks.FOREST_DECEIVER_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOREST_DECEIVER_FENCE_GATE);
        simpleBlockItem(ModBlocks.FOREST_DECEIVER_DOOR);
        trapdoorItem(ModBlocks.FOREST_DECEIVER_TRAPDOOR);
        // --- / ARAUCARIA / --- //
        evenSimplerBlockItem(ModBlocks.ARAUCARIA_PLANKS);
        evenSimplerBlockItem(ModBlocks.ARAUCARIA_STAIRS);
        evenSimplerBlockItem(ModBlocks.ARAUCARIA_SLAB);
        buttonItem(ModBlocks.ARAUCARIA_BUTTON, ModBlocks.ARAUCARIA_PLANKS);
        evenSimplerBlockItem(ModBlocks.ARAUCARIA_PRESSURE_PLATE);
        fenceItem(ModBlocks.ARAUCARIA_FENCE, ModBlocks.ARAUCARIA_PLANKS);
        evenSimplerBlockItem(ModBlocks.ARAUCARIA_FENCE_GATE);
        simpleBlockItem(ModBlocks.ARAUCARIA_DOOR);
        trapdoorItem(ModBlocks.ARAUCARIA_TRAPDOOR);
        // --- / FOGGY OAK / --- //
        evenSimplerBlockItem(ModBlocks.FOGGY_OAK_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOGGY_OAK_STAIRS);
        evenSimplerBlockItem(ModBlocks.FOGGY_OAK_SLAB);
        buttonItem(ModBlocks.FOGGY_OAK_BUTTON, ModBlocks.FOGGY_OAK_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOGGY_OAK_PRESSURE_PLATE);
        fenceItem(ModBlocks.FOGGY_OAK_FENCE, ModBlocks.FOGGY_OAK_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOGGY_OAK_FENCE_GATE);
        simpleBlockItem(ModBlocks.FOGGY_OAK_DOOR);
        trapdoorItem(ModBlocks.FOGGY_OAK_TRAPDOOR);
        // --- / FOGGY PINE / --- //
        evenSimplerBlockItem(ModBlocks.FOGGY_PINE_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOGGY_PINE_STAIRS);
        evenSimplerBlockItem(ModBlocks.FOGGY_PINE_SLAB);
        buttonItem(ModBlocks.FOGGY_PINE_BUTTON, ModBlocks.FOGGY_PINE_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOGGY_PINE_PRESSURE_PLATE);
        fenceItem(ModBlocks.FOGGY_PINE_FENCE, ModBlocks.FOGGY_PINE_PLANKS);
        evenSimplerBlockItem(ModBlocks.FOGGY_PINE_FENCE_GATE);
        simpleBlockItem(ModBlocks.FOGGY_PINE_DOOR);
        trapdoorItem(ModBlocks.FOGGY_PINE_TRAPDOOR);
        // --- / SWAMPY POPLAR / --- //
        evenSimplerBlockItem(ModBlocks.SWAMPY_POPLAR_PLANKS);
        evenSimplerBlockItem(ModBlocks.SWAMPY_POPLAR_STAIRS);
        evenSimplerBlockItem(ModBlocks.SWAMPY_POPLAR_SLAB);
        buttonItem(ModBlocks.SWAMPY_POPLAR_BUTTON, ModBlocks.SWAMPY_POPLAR_PLANKS);
        evenSimplerBlockItem(ModBlocks.SWAMPY_POPLAR_PRESSURE_PLATE);
        fenceItem(ModBlocks.SWAMPY_POPLAR_FENCE, ModBlocks.SWAMPY_POPLAR_PLANKS);
        evenSimplerBlockItem(ModBlocks.SWAMPY_POPLAR_FENCE_GATE);
        simpleBlockItem(ModBlocks.SWAMPY_POPLAR_DOOR);
        trapdoorItem(ModBlocks.SWAMPY_POPLAR_TRAPDOOR);
        // --- / SNOWY TREE / --- //
        evenSimplerBlockItem(ModBlocks.SNOWY_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.SNOWY_TREE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SNOWY_TREE_SLAB);
        buttonItem(ModBlocks.SNOWY_TREE_BUTTON, ModBlocks.SNOWY_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.SNOWY_TREE_PRESSURE_PLATE);
        fenceItem(ModBlocks.SNOWY_TREE_FENCE, ModBlocks.SNOWY_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.SNOWY_TREE_FENCE_GATE);
        simpleBlockItem(ModBlocks.SNOWY_TREE_DOOR);
        trapdoorItem(ModBlocks.SNOWY_TREE_TRAPDOOR);
        // --- / PRICKLY TREE / --- //
        evenSimplerBlockItem(ModBlocks.PRICKLY_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.PRICKLY_TREE_STAIRS);
        evenSimplerBlockItem(ModBlocks.PRICKLY_TREE_SLAB);
        buttonItem(ModBlocks.PRICKLY_TREE_BUTTON, ModBlocks.PRICKLY_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.PRICKLY_TREE_PRESSURE_PLATE);
        fenceItem(ModBlocks.PRICKLY_TREE_FENCE, ModBlocks.PRICKLY_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.PRICKLY_TREE_FENCE_GATE);
        simpleBlockItem(ModBlocks.PRICKLY_TREE_DOOR);
        trapdoorItem(ModBlocks.PRICKLY_TREE_TRAPDOOR);
        // --- / STONE TREE / --- //
        evenSimplerBlockItem(ModBlocks.STONE_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.STONE_TREE_STAIRS);
        evenSimplerBlockItem(ModBlocks.STONE_TREE_SLAB);
        buttonItem(ModBlocks.STONE_TREE_BUTTON, ModBlocks.STONE_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.STONE_TREE_PRESSURE_PLATE);
        fenceItem(ModBlocks.STONE_TREE_FENCE, ModBlocks.STONE_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.STONE_TREE_FENCE_GATE);
        simpleBlockItem(ModBlocks.STONE_TREE_DOOR);
        trapdoorItem(ModBlocks.STONE_TREE_TRAPDOOR);
        // --- / TROPIC TREE / --- //
        evenSimplerBlockItem(ModBlocks.TROPIC_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.TROPIC_TREE_STAIRS);
        evenSimplerBlockItem(ModBlocks.TROPIC_TREE_SLAB);
        buttonItem(ModBlocks.TROPIC_TREE_BUTTON, ModBlocks.TROPIC_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.TROPIC_TREE_PRESSURE_PLATE);
        fenceItem(ModBlocks.TROPIC_TREE_FENCE, ModBlocks.TROPIC_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.TROPIC_TREE_FENCE_GATE);
        simpleBlockItem(ModBlocks.TROPIC_TREE_DOOR);
        trapdoorItem(ModBlocks.TROPIC_TREE_TRAPDOOR);
        // --- / WILLOW / --- //
        evenSimplerBlockItem(ModBlocks.WILLOW_PLANKS);
        evenSimplerBlockItem(ModBlocks.WILLOW_STAIRS);
        evenSimplerBlockItem(ModBlocks.WILLOW_SLAB);
        buttonItem(ModBlocks.WILLOW_BUTTON, ModBlocks.WILLOW_PLANKS);
        evenSimplerBlockItem(ModBlocks.WILLOW_PRESSURE_PLATE);
        fenceItem(ModBlocks.WILLOW_FENCE, ModBlocks.WILLOW_PLANKS);
        evenSimplerBlockItem(ModBlocks.WILLOW_FENCE_GATE);
        simpleBlockItem(ModBlocks.WILLOW_DOOR);
        trapdoorItem(ModBlocks.WILLOW_TRAPDOOR);
        // --- / RUBBER_TREE / --- //
        evenSimplerBlockItem(ModBlocks.RUBBER_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.RUBBER_TREE_STAIRS);
        evenSimplerBlockItem(ModBlocks.RUBBER_TREE_SLAB);
        buttonItem(ModBlocks.RUBBER_TREE_BUTTON, ModBlocks.RUBBER_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.RUBBER_TREE_PRESSURE_PLATE);
        fenceItem(ModBlocks.RUBBER_TREE_FENCE, ModBlocks.RUBBER_TREE_PLANKS);
        evenSimplerBlockItem(ModBlocks.RUBBER_TREE_FENCE_GATE);
        simpleBlockItem(ModBlocks.RUBBER_TREE_DOOR);
        trapdoorItem(ModBlocks.RUBBER_TREE_TRAPDOOR);
        // --------- / SEEDS / --------- //
        simpleBlockItem(ModBlocks.ASPEN_SAPLING);
        simpleBlockItem(ModBlocks.WILLOW_SAPLING);
        simpleBlockItem(ModBlocks.ARAUCARIA_SAPLING);
        simpleBlockItem(ModBlocks.FOGGY_OAK_SAPLING);
        simpleBlockItem(ModBlocks.FOGGY_PINE_SAPLING);
        simpleBlockItem(ModBlocks.SNOWY_TREE_SAPLING);
        simpleBlockItem(ModBlocks.STONE_TREE_SAPLING);
        simpleBlockItem(ModBlocks.RUBBER_TREE_SAPLING);
        simpleBlockItem(ModBlocks.TROPIC_TREE_SAPLING);
        simpleBlockItem(ModBlocks.PRICKLY_TREE_SAPLING);
        simpleBlockItem(ModBlocks.SWAMPY_POPLAR_SAPLING);
        simpleBlockItem(ModBlocks.UMBRELLA_TREE_SAPLING);
        simpleBlockItem(ModBlocks.FOREST_DECEIVER_SAPLING);
        // --------- / NATURAL / --------- //
        simpleBlockItem(ModBlocks.ROCKS);

        // --------- / NATURAL / --------- //
        simpleItem(ModItems.BIO_SHALE);
        simpleItem(ModItems.COMPOST);
        simpleItem(ModItems.DESERT_COTTON_SEED);
        simpleItem(ModItems.DESERT_COTTON_FLOWER);
        simpleItem(ModItems.HUMUS);
        simpleItem(ModItems.MULCH);
        simpleItem(ModItems.REMAINS);
        simpleItem(ModItems.TINDER_FUNGUS);
        // --------- / MOB DROPS / --------- //
        simpleItem(ModItems.WING);
        simpleItem(ModItems.TALLOW);
        simpleItem(ModItems.SWIM_BLADDER);
        // --------- / MATERIALS / --------- //
        simpleItem(ModItems.GRAY_CLAY_BALL);
        simpleItem(ModItems.RED_CLAY_BALL);
        simpleItem(ModItems.ASH);
        simpleItem(ModItems.GRAY_BRICK);
        simpleItem(ModItems.FILTER_COAL);
        simpleItem(ModItems.LATEX);
        simpleItem(ModItems.RAW_NIOBIUM);
        simpleItem(ModItems.NIOBIUM_NUGGET);
        simpleItem(ModItems.NIOBIUM_INGOT);
        simpleItem(ModItems.RUBBER);
        simpleItem(ModItems.SAPROPEL_BALL);
        simpleItem(ModItems.SPONGE_FIBRE);
        simpleItem(ModItems.CLEAR_SPONGE_FIBRE);
        simpleItem(ModItems.SPONGE_SLIME);
        simpleItem(ModItems.SPONGE_SPORE);
        simpleItem(ModItems.SULFUR);
        // --------- / TOOLS / --------- //
        simpleItem(ModItems.CENTROMETER);
        simpleItem(ModItems.GAS_ANALYZER);
        simpleItem(ModItems.FLINT_AND_STONE);
        simpleItem(ModItems.HYGROMETER);
        simpleItem(ModItems.SOAP);
        simpleItem(ModItems.MAP_UP);
        simpleItem(ModItems.MAP_DOWN);
        // --- / NIOBIUM / --- //
        handheldItem(ModItems.NIOBIUM_AXE);
        handheldItem(ModItems.NIOBIUM_PICKAXE);
        handheldItem(ModItems.NIOBIUM_CHISEL);
        handheldItem(ModItems.NIOBIUM_SWORD);
        handheldItem(ModItems.NIOBIUM_SHOVEL);
        handheldItem(ModItems.NIOBIUM_HOE);
        // --------- / ARMOR / --------- //
        trimmedArmorItem(ModItems.RESPIRATOR);
        // --- / NIOBIUM / --- //
        trimmedArmorItem(ModItems.NIOBIUM_BOOTS);
        trimmedArmorItem(ModItems.NIOBIUM_LEGGINGS);
        trimmedArmorItem(ModItems.NIOBIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.NIOBIUM_HELMET);
        // --- / RUBBER / --- //
        trimmedArmorItem(ModItems.RUBBER_BOOTS);
        trimmedArmorItem(ModItems.RUBBER_LEGGINGS);
        trimmedArmorItem(ModItems.RUBBER_CHESTPLATE);
        trimmedArmorItem(ModItems.RUBBER_HELMET);
        // --------- / FOOD / --------- //
        simpleItem(ModItems.NIGHTBERRY);
        simpleItem(ModItems.BITTER_PILLS);
        simpleItem(ModItems.SALT);
        simpleItem(ModItems.SALTPETER);
        simpleItem(ModItems.SPONGE_MEAT);
        // --- / FOOD ON A STICK / --- //
        simpleItem(ModItems.CUP_MUSHROOM_ON_A_STICK);
        simpleItem(ModItems.MARSH_MUSHROOM_ON_A_STICK);
        simpleItem(ModItems.PINK_MUSHROOM_ON_A_STICK);
        simpleItem(ModItems.SAND_MUSHROOM_ON_A_STICK);
        simpleItem(ModItems.TAN_MUSHROOM_ON_A_STICK);
        // --- / MEAT / --- //
        simpleItem(ModItems.BARVOG_MEAT);
        simpleItem(ModItems.BARVOG_MEAT_COOKED);
        simpleItem(ModItems.BRACHIODON_MEAT);
        simpleItem(ModItems.BRACHIODON_MEAT_COOKED);
        simpleItem(ModItems.CARAVAN_MEAT);
        simpleItem(ModItems.CARAVAN_MEAT_COOKED);
        simpleItem(ModItems.FOREST_RUNNER_MEAT);
        simpleItem(ModItems.FOREST_RUNNER_MEAT_COOKED);
        simpleItem(ModItems.GALAGA_MEAT);
        simpleItem(ModItems.GALAGA_MEAT_COOKED);
        simpleItem(ModItems.HORB_MEAT);
        simpleItem(ModItems.HORB_MEAT_COOKED);
        simpleItem(ModItems.HULTER_MEAT);
        simpleItem(ModItems.HULTER_MEAT_COOKED);
        simpleItem(ModItems.MOMO_MEAT);
        simpleItem(ModItems.MOMO_MEAT_COOKED);
        simpleItem(ModItems.MONK_MEAT);
        simpleItem(ModItems.MONK_MEAT_COOKED);
        simpleItem(ModItems.MOSSLING_MEAT);
        simpleItem(ModItems.MOSSLING_MEAT_COOKED);
        simpleItem(ModItems.PRICKLER_MEAT);
        simpleItem(ModItems.PRICKLER_MEAT_COOKED);
        simpleItem(ModItems.SLOTH_MEAT);
        simpleItem(ModItems.SLOTH_MEAT_COOKED);
        simpleItem(ModItems.SNIFF_MEAT);
        simpleItem(ModItems.SNIFF_MEAT_COOKED);
        simpleItem(ModItems.WULDER_MEAT);
        simpleItem(ModItems.WULDER_MEAT_COOKED);

        // --------- / NATURAL / --------- //

        // --- / FLOWERS / --- //
        //simpleBlockItemBlockTexture(ModBlocks.VIOLET_VEIL);
        simpleBlockItem(ModBlocks.VIOLET_VEIL);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = MistyWorld.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MistyWorld.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder evenSimplerBlockItem(RegistryObject<Block> item) {
        return withExistingParent(MistyWorld.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(item.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(item.get()).getPath()));
    }
    private ItemModelBuilder trapdoorItem(RegistryObject<Block> block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(MistyWorld.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MistyWorld.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("texture", new ResourceLocation(MistyWorld.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public ItemModelBuilder handheldItem(RegistryObject<Item> itemRegistryObject) {
        return withExistingParent(itemRegistryObject.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MistyWorld.MOD_ID, "item/" + itemRegistryObject.getId().getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MistyWorld.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MistyWorld.MOD_ID, "block/" + item.getId().getPath()));
    }
}
