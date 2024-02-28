package net.mrconqueso.misty_world.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
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

        // --------- / NATURAL / --------- //
        simpleItem(ModItems.BIO_SHALE);
        simpleItem(ModItems.COMPOST);
        simpleItem(ModItems.DESERT_COTTON_FLOWER);
        simpleItem(ModItems.DESERT_COTTON_SEED);
        simpleItem(ModItems.HUMUS);
        simpleItem(ModItems.MULCH);
        simpleItem(ModItems.REMAINS);
        simpleItem(ModItems.ROCKS);
        simpleItem(ModItems.TINDER_FUNGUS);
        // --- / SEEDS / --- //
        simpleItem(ModItems.ARAUCARIA_SEED);
        simpleItem(ModItems.ACACIA_SEED);
        simpleItem(ModItems.ASPEN_SEED);
        simpleItem(ModItems.BIRCH_SEED);
        simpleItem(ModItems.FOGGY_OAK_SEED);
        simpleItem(ModItems.FOGGY_PINE_SEED);
        simpleItem(ModItems.POPLAR_SEED);
        simpleItem(ModItems.SPRUCE_SEED);
        simpleItem(ModItems.WILLOW_SEED);
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
        simpleItem(ModItems.NIOBIUM_AXE);
        simpleItem(ModItems.NIOBIUM_PICKAXE);
        simpleItem(ModItems.NIOBIUM_CHISEL);
        simpleItem(ModItems.NIOBIUM_SWORD);
        simpleItem(ModItems.NIOBIUM_SHOVEL);
        simpleItem(ModItems.NIOBIUM_HOE);
        // --------- / ARMOR / --------- //
        simpleItem(ModItems.RESPIRATOR);
        // --- / NIOBIUM / --- //
        simpleItem(ModItems.NIOBIUM_BOOTS);
        simpleItem(ModItems.NIOBIUM_LEGGINGS);
        simpleItem(ModItems.NIOBIUM_CHESTPLATE);
        simpleItem(ModItems.NIOBIUM_HELMET);
        // --- / RUBBER / --- //
        simpleItem(ModItems.RUBBER_BOOTS);
        simpleItem(ModItems.RUBBER_LEGGINGS);
        simpleItem(ModItems.RUBBER_CHESTPLATE);
        simpleItem(ModItems.RUBBER_HELMET);
        // --------- / FOOD / --------- //
        simpleItem(ModItems.NIGHTBERRY);
        simpleItem(ModItems.BITTER_PILLS);
        simpleItem(ModItems.SALTPETER);
        simpleItem(ModItems.SPONGE_MEAT);
        // --- / FOOD ON A STICK / --- //
        simpleItem(ModItems.CUP_ON_A_STICK);
        simpleItem(ModItems.MARSH_ON_A_STICK);
        simpleItem(ModItems.PINK_ON_A_STICK);
        simpleItem(ModItems.SAND_ON_A_STICK);
        simpleItem(ModItems.TAN_ON_A_STICK);
        // --- / MEAT / --- //
        simpleItem(ModItems.TAN_ON_A_STICK);
        
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
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MistyWorld.MOD_ID, "item/" + item.getId().getPath()));
    }
}
