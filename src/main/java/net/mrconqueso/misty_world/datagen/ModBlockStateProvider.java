package net.mrconqueso.misty_world.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.block.custom.DesertCottonCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MistyWorld.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // --------- / STONES / --------- //

        blockWithItem(ModBlocks.FOGGY_STONE);
        blockWithItem(ModBlocks.POROUS_FOGGY_STONE);
        blockWithItem(ModBlocks.HARD_FOGGY_STONE);
        blockWithItem(ModBlocks.MINED_FOGGY_STONE);
        blockWithItem(ModBlocks.MOSSY_MINED_FOGGY_STONE);
        blockWithItem(ModBlocks.FOGGY_COBBLESTONE);
        blockWithItem(ModBlocks.MOSSY_FOGGY_COBBLESTONE);

        // --------- / GRAVEL & SAND / --------- //

        blockWithItem(ModBlocks.FOGGY_GRAVEL);

        // --------- / WOOD / --------- //

        // --- / CARVED / --- //
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_ASPEN_LOG.get()), blockTexture(ModBlocks.CARVED_ASPEN_LOG.get()), blockTexture(ModBlocks.ASPEN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_WILLOW_LOG.get()), blockTexture(ModBlocks.CARVED_WILLOW_LOG.get()), blockTexture(ModBlocks.WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_ARAUCARIA_LOG.get()), blockTexture(ModBlocks.CARVED_ARAUCARIA_LOG.get()), blockTexture(ModBlocks.ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_FOGGY_OAK_LOG.get()), blockTexture(ModBlocks.CARVED_FOGGY_OAK_LOG.get()), blockTexture(ModBlocks.FOGGY_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_FOGGY_PINE_LOG.get()), blockTexture(ModBlocks.CARVED_FOGGY_PINE_LOG.get()), blockTexture(ModBlocks.FOGGY_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_SNOWY_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_SNOWY_TREE_LOG.get()), blockTexture(ModBlocks.SNOWY_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_STONE_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_STONE_TREE_LOG.get()), blockTexture(ModBlocks.STONE_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_RUBBER_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_RUBBER_TREE_LOG.get()), blockTexture(ModBlocks.RUBBER_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_TROPIC_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_TROPIC_TREE_LOG.get()), blockTexture(ModBlocks.TROPIC_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_PRICKLY_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_PRICKLY_TREE_LOG.get()), blockTexture(ModBlocks.PRICKLY_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get()), blockTexture(ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_UMBRELLA_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_UMBRELLA_TREE_LOG.get()), blockTexture(ModBlocks.UMBRELLA_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CARVED_FOREST_DECEIVER_LOG.get()), blockTexture(ModBlocks.CARVED_FOREST_DECEIVER_LOG.get()), blockTexture(ModBlocks.FOREST_DECEIVER_LOG.get()));

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
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_FOREST_DECEIVER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FOREST_DECEIVER_WOOD.get()), blockTexture(ModBlocks.CARVED_FOREST_DECEIVER_LOG.get()), blockTexture(ModBlocks.CARVED_FOREST_DECEIVER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()), blockTexture(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_forest_deceiver_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get()));

        blockItem(ModBlocks.CARVED_FOREST_DECEIVER_LOG);
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
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ARAUCARIA_WOOD.get()), blockTexture(ModBlocks.CARVED_ARAUCARIA_LOG.get()), blockTexture(ModBlocks.CARVED_ARAUCARIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ARAUCARIA_LOG.get()), blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_araucaria_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ARAUCARIA_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ARAUCARIA_LOG.get()));

        blockItem(ModBlocks.CARVED_ARAUCARIA_LOG);
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
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_FOGGY_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FOGGY_OAK_WOOD.get()), blockTexture(ModBlocks.CARVED_FOGGY_OAK_LOG.get()), blockTexture(ModBlocks.CARVED_FOGGY_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_foggy_oak_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get()));

        blockItem(ModBlocks.CARVED_FOGGY_OAK_LOG);
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
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_FOGGY_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FOGGY_PINE_WOOD.get()), blockTexture(ModBlocks.CARVED_FOGGY_PINE_LOG.get()), blockTexture(ModBlocks.CARVED_FOGGY_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_foggy_pine_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get()));

        blockItem(ModBlocks.CARVED_FOGGY_PINE_LOG);
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

        // --- / SWAMPY POPLAR / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SWAMPY_POPLAR_WOOD.get()), blockTexture(ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get()), blockTexture(ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get()), blockTexture(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_swampy_poplar_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get()), blockTexture(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get()));

        blockItem(ModBlocks.CARVED_SWAMPY_POPLAR_LOG);
        blockItem(ModBlocks.SWAMPY_POPLAR_WOOD);
        blockItem(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG);
        blockItem(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD);

        leavesBlock(ModBlocks.SWAMPY_POPLAR_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.SWAMPY_POPLAR_STAIRS.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SWAMPY_POPLAR_SLAB.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.SWAMPY_POPLAR_BUTTON.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SWAMPY_POPLAR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.SWAMPY_POPLAR_FENCE.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SWAMPY_POPLAR_FENCE_GATE.get()), blockTexture(ModBlocks.SWAMPY_POPLAR_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.SWAMPY_POPLAR_DOOR.get()), modLoc("block/swampy_poplar_door_bottom"), modLoc("block/swampy_poplar_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SWAMPY_POPLAR_TRAPDOOR.get()), modLoc("block/swampy_poplar_trapdoor"), true, "cutout");

        // --- / SNOWY TREE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_SNOWY_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SNOWY_TREE_WOOD.get()), blockTexture(ModBlocks.CARVED_SNOWY_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_SNOWY_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SNOWY_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_snowy_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get()));

        blockItem(ModBlocks.CARVED_SNOWY_TREE_LOG);
        blockItem(ModBlocks.SNOWY_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_SNOWY_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_SNOWY_TREE_WOOD);

        leavesBlock(ModBlocks.SNOWY_TREE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.SNOWY_TREE_STAIRS.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SNOWY_TREE_SLAB.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.SNOWY_TREE_BUTTON.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SNOWY_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.SNOWY_TREE_FENCE.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SNOWY_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.SNOWY_TREE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.SNOWY_TREE_DOOR.get()), modLoc("block/snowy_tree_door_bottom"), modLoc("block/snowy_tree_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SNOWY_TREE_TRAPDOOR.get()), modLoc("block/snowy_tree_trapdoor"), true, "cutout");

        // --- / PRICKLY TREE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_PRICKLY_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PRICKLY_TREE_WOOD.get()), blockTexture(ModBlocks.CARVED_PRICKLY_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_PRICKLY_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_prickly_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get()));

        blockItem(ModBlocks.CARVED_PRICKLY_TREE_LOG);
        blockItem(ModBlocks.PRICKLY_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_PRICKLY_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_PRICKLY_TREE_WOOD);

        leavesBlock(ModBlocks.PRICKLY_TREE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.PRICKLY_TREE_STAIRS.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PRICKLY_TREE_SLAB.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.PRICKLY_TREE_BUTTON.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PRICKLY_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.PRICKLY_TREE_FENCE.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PRICKLY_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.PRICKLY_TREE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.PRICKLY_TREE_DOOR.get()), modLoc("block/prickly_tree_door_bottom"), modLoc("block/prickly_tree_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PRICKLY_TREE_TRAPDOOR.get()), modLoc("block/prickly_tree_trapdoor"), true, "cutout");

        // --- / STONE TREE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_STONE_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STONE_TREE_WOOD.get()), blockTexture(ModBlocks.CARVED_STONE_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_STONE_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_STONE_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_STONE_TREE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_stone_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_STONE_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_STONE_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_STONE_TREE_LOG.get()));

        blockItem(ModBlocks.CARVED_STONE_TREE_LOG);
        blockItem(ModBlocks.STONE_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_STONE_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_STONE_TREE_WOOD);

        leavesBlock(ModBlocks.STONE_TREE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.STONE_TREE_STAIRS.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.STONE_TREE_SLAB.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.STONE_TREE_BUTTON.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.STONE_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.STONE_TREE_FENCE.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.STONE_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.STONE_TREE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.STONE_TREE_DOOR.get()), modLoc("block/stone_tree_door_bottom"), modLoc("block/stone_tree_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.STONE_TREE_TRAPDOOR.get()), modLoc("block/stone_tree_trapdoor"), true, "cutout");

        // --- / TROPIC TREE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_TROPIC_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.TROPIC_TREE_WOOD.get()), blockTexture(ModBlocks.CARVED_TROPIC_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_TROPIC_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_TROPIC_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_tropic_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get()));

        blockItem(ModBlocks.CARVED_TROPIC_TREE_LOG);
        blockItem(ModBlocks.TROPIC_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_TROPIC_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_TROPIC_TREE_WOOD);

        leavesBlock(ModBlocks.TROPIC_TREE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.TROPIC_TREE_STAIRS.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.TROPIC_TREE_SLAB.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.TROPIC_TREE_BUTTON.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.TROPIC_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.TROPIC_TREE_FENCE.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.TROPIC_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.TROPIC_TREE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.TROPIC_TREE_DOOR.get()), modLoc("block/tropic_tree_door_bottom"), modLoc("block/tropic_tree_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.TROPIC_TREE_TRAPDOOR.get()), modLoc("block/tropic_tree_trapdoor"), true, "cutout");

        // --- / WILLOW / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WILLOW_WOOD.get()), blockTexture(ModBlocks.CARVED_WILLOW_LOG.get()), blockTexture(ModBlocks.CARVED_WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_LOG.get()), blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_willow_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()));

        blockItem(ModBlocks.CARVED_WILLOW_LOG);
        blockItem(ModBlocks.WILLOW_WOOD);
        blockItem(ModBlocks.STRIPPED_WILLOW_LOG);
        blockItem(ModBlocks.STRIPPED_WILLOW_WOOD);

        leavesBlock(ModBlocks.WILLOW_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.WILLOW_STAIRS.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WILLOW_SLAB.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.WILLOW_BUTTON.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.WILLOW_PRESSURE_PLATE.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.WILLOW_FENCE.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.WILLOW_FENCE_GATE.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.WILLOW_DOOR.get()), modLoc("block/willow_door_bottom"), modLoc("block/willow_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WILLOW_TRAPDOOR.get()), modLoc("block/willow_trapdoor"), true, "cutout");

        // --- / RUBBER_TREE / --- //
        logBlock(((RotatedPillarBlock) ModBlocks.CARVED_RUBBER_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.RUBBER_TREE_WOOD.get()), blockTexture(ModBlocks.CARVED_RUBBER_TREE_LOG.get()), blockTexture(ModBlocks.CARVED_RUBBER_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RUBBER_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_rubber_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get()));

        blockItem(ModBlocks.CARVED_RUBBER_TREE_LOG);
        blockItem(ModBlocks.RUBBER_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_RUBBER_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_RUBBER_TREE_WOOD);

        leavesBlock(ModBlocks.RUBBER_TREE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.RUBBER_TREE_STAIRS.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.RUBBER_TREE_SLAB.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.RUBBER_TREE_BUTTON.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.RUBBER_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.RUBBER_TREE_FENCE.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.RUBBER_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.RUBBER_TREE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.RUBBER_TREE_DOOR.get()), modLoc("block/rubber_tree_door_bottom"), modLoc("block/rubber_tree_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.RUBBER_TREE_TRAPDOOR.get()), modLoc("block/rubber_tree_trapdoor"), true, "cutout");

        // --------- / SEEDS / --------- //
        
        saplingBlock(ModBlocks.ASPEN_SAPLING);
        saplingBlock(ModBlocks.WILLOW_SAPLING);
        saplingBlock(ModBlocks.CARVED_ARAUCARIA_SAPLING);
        saplingBlock(ModBlocks.FOGGY_OAK_SAPLING);
        saplingBlock(ModBlocks.FOGGY_PINE_SAPLING);
        saplingBlock(ModBlocks.SNOWY_TREE_SAPLING);
        saplingBlock(ModBlocks.STONE_TREE_SAPLING);
        saplingBlock(ModBlocks.RUBBER_TREE_SAPLING);
        saplingBlock(ModBlocks.TROPIC_TREE_SAPLING);
        saplingBlock(ModBlocks.PRICKLY_TREE_SAPLING);
        saplingBlock(ModBlocks.SWAMPY_POPLAR_SAPLING);
        saplingBlock(ModBlocks.UMBRELLA_TREE_SAPLING);
        saplingBlock(ModBlocks.FOREST_DECEIVER_SAPLING);

        // --------- / ORES / --------- //

        blockWithItem(ModBlocks.GOLD_ORE);
        blockWithItem(ModBlocks.IRON_ORE);
        blockWithItem(ModBlocks.SALT_ORE);
        blockWithItem(ModBlocks.LAPIS_ORE);
        blockWithItem(ModBlocks.SULFUR_ORE);
        blockWithItem(ModBlocks.NIOBIUM_ORE);
        blockWithItem(ModBlocks.BIO_SHALE_ORE);
        blockWithItem(ModBlocks.SALTPETER_ORE);
        blockWithItem(ModBlocks.FILTER_COAL_ORE);

        // --------- / RAW / ORE BLOCKS / --------- //

        blockWithItem(ModBlocks.SALT_BLOCK);
        blockWithItem(ModBlocks.SULFUR_BLOCK);
        blockWithItem(ModBlocks.RAW_NIOBIUM_BLOCK);
        blockWithItem(ModBlocks.NIOBIUM_BLOCK);
        blockWithItem(ModBlocks.BIO_SHALE_BLOCK);
        blockWithItem(ModBlocks.SALTPETER_BLOCK);
        // --- / FILTER COAL BLOCKS / --- //
        blockWithItem(ModBlocks.CLEAN_FILTER_COAL_BLOCK);
        blockWithItem(ModBlocks.SLIGHTLY_POLLUTED_FILTER_COAL_BLOCK);
        blockWithItem(ModBlocks.MODERATELY_POLLUTED_FILTER_COAL_BLOCK);
        blockWithItem(ModBlocks.VERY_POLLUTED_FILTER_COAL_BLOCK);

        // --------- / NATURAL / --------- //
        //makeTwoTallCrop(((CropBlock) ModBlocks.DESERT_COTTON.get()), "desert_cotton_stage_", "desert_cotton_stage_");

        // --- / FLOWERS / --- //
        simpleBlockWithItem(ModBlocks.VIOLET_VEIL.get(), models().cross(blockTexture(ModBlocks.VIOLET_VEIL.get()).getPath(),
                blockTexture(ModBlocks.VIOLET_VEIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_VIOLET_VEIL.get(), models().singleTexture("potted_violet_veil",
                new ResourceLocation("flower_pot_cross"), "plant", blockTexture(ModBlocks.VIOLET_VEIL.get())).renderType("cutout"));
    }

    public void makeTwoTallCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> desertCottonStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] desertCottonStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((DesertCottonCropBlock) block).getAgeProperty()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/" + textureName + state.getValue(((DesertCottonCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
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
