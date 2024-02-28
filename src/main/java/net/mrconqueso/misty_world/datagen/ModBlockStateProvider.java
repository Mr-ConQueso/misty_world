package net.mrconqueso.misty_world.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MistyWorld.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // --------- / WOOD / --------- //

        // --- / ASPEN / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.ASPEN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ASPEN_WOOD.get()), blockTexture(ModBlocks.ASPEN_LOG.get()), blockTexture(ModBlocks.ASPEN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ASPEN_LOG.get()), blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_aspen_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ASPEN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()));

        blockItem(ModBlocks.ASPEN_LOG);
        blockItem(ModBlocks.ASPEN_WOOD);
        blockItem(ModBlocks.STRIPPED_ASPEN_LOG);
        blockItem(ModBlocks.STRIPPED_ASPEN_WOOD);

        leavesBlock(ModBlocks.ASPEN_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.ASPEN_STAIRS.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ASPEN_SLAB.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.ASPEN_BUTTON.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ASPEN_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.ASPEN_FENCE.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ASPEN_FENCE_GATE.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.ASPEN_DOOR.get()), modLoc("block/aspen_door_bottom"), modLoc("block/aspen_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ASPEN_TRAPDOOR.get()), modLoc("block/aspen_trapdoor"), true, "cutout");
        
        // --- / UMBRELLA TREE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.UMBRELLA_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.UMBRELLA_TREE_WOOD.get()), blockTexture(ModBlocks.UMBRELLA_TREE_LOG.get()), blockTexture(ModBlocks.UMBRELLA_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_umbrella_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get()));

        blockItem(ModBlocks.UMBRELLA_TREE_LOG);
        blockItem(ModBlocks.UMBRELLA_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD);

        leavesBlock(ModBlocks.UMBRELLA_TREE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.UMBRELLA_TREE_STAIRS.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.UMBRELLA_TREE_SLAB.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.UMBRELLA_TREE_BUTTON.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.UMBRELLA_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.UMBRELLA_TREE_FENCE.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.UMBRELLA_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.UMBRELLA_TREE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.UMBRELLA_TREE_DOOR.get()), modLoc("block/umbrella_tree_door_bottom"), modLoc("block/umbrella_tree_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.UMBRELLA_TREE_TRAPDOOR.get()), modLoc("block/umbrella_tree_trapdoor"), true, "cutout");

        // --- / FOREST DECEIVER / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.FOREST_DECEIVER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FOREST_DECEIVER_WOOD.get()), blockTexture(ModBlocks.FOREST_DECEIVER_LOG.get()), blockTexture(ModBlocks.FOREST_DECEIVER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()), blockTexture(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_forest_deceiver_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()));

        blockItem(ModBlocks.FOREST_DECEIVER_LOG);
        blockItem(ModBlocks.FOREST_DECEIVER_WOOD);
        blockItem(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG);
        blockItem(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD);

        leavesBlock(ModBlocks.FOREST_DECEIVER_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.FOREST_DECEIVER_STAIRS.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FOREST_DECEIVER_SLAB.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.FOREST_DECEIVER_BUTTON.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FOREST_DECEIVER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.FOREST_DECEIVER_FENCE.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FOREST_DECEIVER_FENCE_GATE.get()), blockTexture(ModBlocks.FOREST_DECEIVER_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.FOREST_DECEIVER_DOOR.get()), modLoc("block/forest_deceiver_door_bottom"), modLoc("block/forest_deceiver_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FOREST_DECEIVER_TRAPDOOR.get()), modLoc("block/forest_deceiver_trapdoor"), true, "cutout");

        // --- / ARAUCARIA / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ARAUCARIA_WOOD.get()), blockTexture(ModBlocks.ARAUCARIA_LOG.get()), blockTexture(ModBlocks.ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ARAUCARIA_LOG.get()), blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_araucaria_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ARAUCARIA_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()));

        blockItem(ModBlocks.ARAUCARIA_LOG);
        blockItem(ModBlocks.ARAUCARIA_WOOD);
        blockItem(ModBlocks.STRIPPED_ARAUCARIA_LOG);
        blockItem(ModBlocks.STRIPPED_ARAUCARIA_WOOD);

        leavesBlock(ModBlocks.ARAUCARIA_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.ARAUCARIA_STAIRS.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ARAUCARIA_SLAB.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.ARAUCARIA_BUTTON.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ARAUCARIA_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.ARAUCARIA_FENCE.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ARAUCARIA_FENCE_GATE.get()), blockTexture(ModBlocks.ARAUCARIA_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.ARAUCARIA_DOOR.get()), modLoc("block/araucaria_door_bottom"), modLoc("block/araucaria_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ARAUCARIA_TRAPDOOR.get()), modLoc("block/araucaria_trapdoor"), true, "cutout");

        // --- / FOGGY OAK / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.FOGGY_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FOGGY_OAK_WOOD.get()), blockTexture(ModBlocks.FOGGY_OAK_LOG.get()), blockTexture(ModBlocks.FOGGY_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_foggy_oak_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()));

        blockItem(ModBlocks.FOGGY_OAK_LOG);
        blockItem(ModBlocks.FOGGY_OAK_WOOD);
        blockItem(ModBlocks.STRIPPED_FOGGY_OAK_LOG);
        blockItem(ModBlocks.STRIPPED_FOGGY_OAK_WOOD);

        leavesBlock(ModBlocks.FOGGY_OAK_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.FOGGY_OAK_STAIRS.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FOGGY_OAK_SLAB.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.FOGGY_OAK_BUTTON.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FOGGY_OAK_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.FOGGY_OAK_FENCE.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FOGGY_OAK_FENCE_GATE.get()), blockTexture(ModBlocks.FOGGY_OAK_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.FOGGY_OAK_DOOR.get()), modLoc("block/foggy_oak_door_bottom"), modLoc("block/foggy_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FOGGY_OAK_TRAPDOOR.get()), modLoc("block/foggy_oak_trapdoor"), true, "cutout");

        // --- / FOGGY PINE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.FOGGY_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FOGGY_PINE_WOOD.get()), blockTexture(ModBlocks.FOGGY_PINE_LOG.get()), blockTexture(ModBlocks.FOGGY_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_foggy_pine_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()));

        blockItem(ModBlocks.FOGGY_PINE_LOG);
        blockItem(ModBlocks.FOGGY_PINE_WOOD);
        blockItem(ModBlocks.STRIPPED_FOGGY_PINE_LOG);
        blockItem(ModBlocks.STRIPPED_FOGGY_PINE_WOOD);

        leavesBlock(ModBlocks.FOGGY_PINE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.FOGGY_PINE_STAIRS.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FOGGY_PINE_SLAB.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.FOGGY_PINE_BUTTON.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FOGGY_PINE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.FOGGY_PINE_FENCE.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FOGGY_PINE_FENCE_GATE.get()), blockTexture(ModBlocks.FOGGY_PINE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.FOGGY_PINE_DOOR.get()), modLoc("block/foggy_pine_door_bottom"), modLoc("block/foggy_pine_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FOGGY_PINE_TRAPDOOR.get()), modLoc("block/foggy_pine_trapdoor"), true, "cutout");


        // --------- / ORES / --------- //

        blockWithItem(ModBlocks.SALT_ORE);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));

    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MistyWorld.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
