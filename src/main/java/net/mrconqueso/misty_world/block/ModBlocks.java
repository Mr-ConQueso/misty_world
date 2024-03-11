package net.mrconqueso.misty_world.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.custom.*;
import net.mrconqueso.misty_world.block.util.PollutableBlock;
import net.mrconqueso.misty_world.item.ModItems;
import net.mrconqueso.misty_world.worldgen.tree.*;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MistyWorld.MOD_ID);

    // --------- / STONES / --------- //
    public static final RegistryObject<Block> FOGGY_STONE = registerBlock("foggy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POROUS_FOGGY_STONE = registerBlock("porous_foggy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARD_FOGGY_STONE = registerBlock("hard_foggy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MINED_FOGGY_STONE = registerBlock("mined_foggy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MOSSY_MINED_FOGGY_STONE = registerBlock("mossy_mined_foggy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FOGGY_COBBLESTONE = registerBlock("foggy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_FOGGY_COBBLESTONE = registerBlock("mossy_foggy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    // --------- / GRAVEL & SAND / --------- //
    public static final RegistryObject<Block> FOGGY_GRAVEL = registerBlock("foggy_gravel",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));

    // --------- / WOOD / --------- //

    // --- / ASPEN / --- //
    public static final RegistryObject<Block> ASPEN_LOG = registerBlock("aspen_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> ASPEN_WOOD = registerBlock("aspen_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ASPEN_LOG = registerBlock("stripped_aspen_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD = registerBlock("stripped_aspen_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    //public static final RegistryObject<Block> ASPEN_TRUNK = registerBlock("aspen_trunk",
    //        () -> new ModFlammableRotatedBranchBlock(ASPEN_LOG.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ASPEN_PLANKS = registerBlock("aspen_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> ASPEN_LEAVES = registerBlock("aspen_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> ASPEN_STAIRS = registerBlock("aspen_stairs",
            () -> new StairBlock(() -> ModBlocks.ASPEN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> ASPEN_SLAB = registerBlock("aspen_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> ASPEN_BUTTON = registerBlock("aspen_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ASPEN_PRESSURE_PLATE = registerBlock("aspen_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> ASPEN_FENCE = registerBlock("aspen_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> ASPEN_FENCE_GATE = registerBlock("aspen_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> ASPEN_DOOR = registerBlock("aspen_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> ASPEN_TRAPDOOR = registerBlock("aspen_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / UMBRELLA TREE / --- //
    public static final RegistryObject<Block> UMBRELLA_TREE_LOG = registerBlock("umbrella_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> UMBRELLA_TREE_WOOD = registerBlock("umbrella_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_UMBRELLA_TREE_LOG = registerBlock("stripped_umbrella_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_UMBRELLA_TREE_WOOD = registerBlock("stripped_umbrella_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> UMBRELLA_TREE_PLANKS = registerBlock("umbrella_tree_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> UMBRELLA_TREE_LEAVES = registerBlock("umbrella_tree_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES)));

    public static final RegistryObject<Block> UMBRELLA_TREE_STAIRS = registerBlock("umbrella_tree_stairs",
            () -> new StairBlock(() -> ModBlocks.UMBRELLA_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MANGROVE_STAIRS)));
    public static final RegistryObject<Block> UMBRELLA_TREE_SLAB = registerBlock("umbrella_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB)));

    public static final RegistryObject<Block> UMBRELLA_TREE_BUTTON = registerBlock("umbrella_tree_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_BUTTON),
                    BlockSetType.MANGROVE, 10, true));
    public static final RegistryObject<Block> UMBRELLA_TREE_PRESSURE_PLATE = registerBlock("umbrella_tree_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MANGROVE_PRESSURE_PLATE),
                    BlockSetType.MANGROVE));

    public static final RegistryObject<Block> UMBRELLA_TREE_FENCE = registerBlock("umbrella_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE)));
    public static final RegistryObject<Block> UMBRELLA_TREE_FENCE_GATE = registerBlock("umbrella_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> UMBRELLA_TREE_DOOR = registerBlock("umbrella_tree_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_DOOR),
                    BlockSetType.MANGROVE));
    public static final RegistryObject<Block> UMBRELLA_TREE_TRAPDOOR = registerBlock("umbrella_tree_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_TRAPDOOR ),
                    BlockSetType.MANGROVE));

    // --- / FOREST DECEIVER / --- //
    public static final RegistryObject<Block> FOREST_DECEIVER_LOG = registerBlock("forest_deceiver_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> FOREST_DECEIVER_WOOD = registerBlock("forest_deceiver_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FOREST_DECEIVER_LOG = registerBlock("stripped_forest_deceiver_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FOREST_DECEIVER_WOOD = registerBlock("stripped_forest_deceiver_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> FOREST_DECEIVER_PLANKS = registerBlock("forest_deceiver_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOREST_DECEIVER_LEAVES = registerBlock("forest_deceiver_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> FOREST_DECEIVER_STAIRS = registerBlock("forest_deceiver_stairs",
            () -> new StairBlock(() -> ModBlocks.FOREST_DECEIVER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOREST_DECEIVER_SLAB = registerBlock("forest_deceiver_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> FOREST_DECEIVER_BUTTON = registerBlock("forest_deceiver_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> FOREST_DECEIVER_PRESSURE_PLATE = registerBlock("forest_deceiver_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> FOREST_DECEIVER_FENCE = registerBlock("forest_deceiver_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOREST_DECEIVER_FENCE_GATE = registerBlock("forest_deceiver_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> FOREST_DECEIVER_DOOR = registerBlock("forest_deceiver_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> FOREST_DECEIVER_TRAPDOOR = registerBlock("forest_deceiver_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / ARAUCARIA / --- //
    public static final RegistryObject<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> ARAUCARIA_WOOD = registerBlock("araucaria_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ARAUCARIA_LOG = registerBlock("stripped_araucaria_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ARAUCARIA_WOOD = registerBlock("stripped_araucaria_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> ARAUCARIA_LEAVES = registerBlock("araucaria_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> ARAUCARIA_STAIRS = registerBlock("araucaria_stairs",
            () -> new StairBlock(() -> ModBlocks.ARAUCARIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> ARAUCARIA_SLAB = registerBlock("araucaria_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> ARAUCARIA_BUTTON = registerBlock("araucaria_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> ARAUCARIA_PRESSURE_PLATE = registerBlock("araucaria_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> ARAUCARIA_FENCE = registerBlock("araucaria_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> ARAUCARIA_FENCE_GATE = registerBlock("araucaria_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> ARAUCARIA_DOOR = registerBlock("araucaria_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> ARAUCARIA_TRAPDOOR = registerBlock("araucaria_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / FOGGY_OAK / --- //
    public static final RegistryObject<Block> FOGGY_OAK_LOG = registerBlock("foggy_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> FOGGY_OAK_WOOD = registerBlock("foggy_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FOGGY_OAK_LOG = registerBlock("stripped_foggy_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FOGGY_OAK_WOOD = registerBlock("stripped_foggy_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> FOGGY_OAK_PLANKS = registerBlock("foggy_oak_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOGGY_OAK_LEAVES = registerBlock("foggy_oak_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> FOGGY_OAK_STAIRS = registerBlock("foggy_oak_stairs",
            () -> new StairBlock(() -> ModBlocks.FOGGY_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOGGY_OAK_SLAB = registerBlock("foggy_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> FOGGY_OAK_BUTTON = registerBlock("foggy_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> FOGGY_OAK_PRESSURE_PLATE = registerBlock("foggy_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> FOGGY_OAK_FENCE = registerBlock("foggy_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOGGY_OAK_FENCE_GATE = registerBlock("foggy_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> FOGGY_OAK_DOOR = registerBlock("foggy_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> FOGGY_OAK_TRAPDOOR = registerBlock("foggy_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / FOGGY_PINE / --- //
    public static final RegistryObject<Block> FOGGY_PINE_LOG = registerBlock("foggy_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> FOGGY_PINE_WOOD = registerBlock("foggy_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FOGGY_PINE_LOG = registerBlock("stripped_foggy_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FOGGY_PINE_WOOD = registerBlock("stripped_foggy_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> FOGGY_PINE_PLANKS = registerBlock("foggy_pine_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOGGY_PINE_LEAVES = registerBlock("foggy_pine_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> FOGGY_PINE_STAIRS = registerBlock("foggy_pine_stairs",
            () -> new StairBlock(() -> ModBlocks.FOGGY_PINE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOGGY_PINE_SLAB = registerBlock("foggy_pine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> FOGGY_PINE_BUTTON = registerBlock("foggy_pine_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> FOGGY_PINE_PRESSURE_PLATE = registerBlock("foggy_pine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> FOGGY_PINE_FENCE = registerBlock("foggy_pine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> FOGGY_PINE_FENCE_GATE = registerBlock("foggy_pine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> FOGGY_PINE_DOOR = registerBlock("foggy_pine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> FOGGY_PINE_TRAPDOOR = registerBlock("foggy_pine_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / SWAMPY POPLAR / --- //
    public static final RegistryObject<Block> SWAMPY_POPLAR_LOG = registerBlock("swampy_poplar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> SWAMPY_POPLAR_WOOD = registerBlock("swampy_poplar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_SWAMPY_POPLAR_LOG = registerBlock("stripped_swampy_poplar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_SWAMPY_POPLAR_WOOD = registerBlock("stripped_swampy_poplar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> SWAMPY_POPLAR_PLANKS = registerBlock("swampy_poplar_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SWAMPY_POPLAR_LEAVES = registerBlock("swampy_poplar_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> SWAMPY_POPLAR_STAIRS = registerBlock("swampy_poplar_stairs",
            () -> new StairBlock(() -> ModBlocks.SWAMPY_POPLAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SWAMPY_POPLAR_SLAB = registerBlock("swampy_poplar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> SWAMPY_POPLAR_BUTTON = registerBlock("swampy_poplar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> SWAMPY_POPLAR_PRESSURE_PLATE = registerBlock("swampy_poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> SWAMPY_POPLAR_FENCE = registerBlock("swampy_poplar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SWAMPY_POPLAR_FENCE_GATE = registerBlock("swampy_poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> SWAMPY_POPLAR_DOOR = registerBlock("swampy_poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> SWAMPY_POPLAR_TRAPDOOR = registerBlock("swampy_poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / SNOWY TREE / --- //
    public static final RegistryObject<Block> SNOWY_TREE_LOG = registerBlock("snowy_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> SNOWY_TREE_WOOD = registerBlock("snowy_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_SNOWY_TREE_LOG = registerBlock("stripped_snowy_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_SNOWY_TREE_WOOD = registerBlock("stripped_snowy_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> SNOWY_TREE_PLANKS = registerBlock("snowy_tree_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SNOWY_TREE_LEAVES = registerBlock("snowy_tree_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> SNOWY_TREE_STAIRS = registerBlock("snowy_tree_stairs",
            () -> new StairBlock(() -> ModBlocks.SNOWY_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SNOWY_TREE_SLAB = registerBlock("snowy_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> SNOWY_TREE_BUTTON = registerBlock("snowy_tree_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> SNOWY_TREE_PRESSURE_PLATE = registerBlock("snowy_tree_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> SNOWY_TREE_FENCE = registerBlock("snowy_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SNOWY_TREE_FENCE_GATE = registerBlock("snowy_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> SNOWY_TREE_DOOR = registerBlock("snowy_tree_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> SNOWY_TREE_TRAPDOOR = registerBlock("snowy_tree_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / PRICKLY TREE / --- //
    public static final RegistryObject<Block> PRICKLY_TREE_LOG = registerBlock("prickly_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> PRICKLY_TREE_WOOD = registerBlock("prickly_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PRICKLY_TREE_LOG = registerBlock("stripped_prickly_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PRICKLY_TREE_WOOD = registerBlock("stripped_prickly_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> PRICKLY_TREE_PLANKS = registerBlock("prickly_tree_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> PRICKLY_TREE_LEAVES = registerBlock("prickly_tree_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> PRICKLY_TREE_STAIRS = registerBlock("prickly_tree_stairs",
            () -> new StairBlock(() -> ModBlocks.PRICKLY_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> PRICKLY_TREE_SLAB = registerBlock("prickly_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> PRICKLY_TREE_BUTTON = registerBlock("prickly_tree_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> PRICKLY_TREE_PRESSURE_PLATE = registerBlock("prickly_tree_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> PRICKLY_TREE_FENCE = registerBlock("prickly_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> PRICKLY_TREE_FENCE_GATE = registerBlock("prickly_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PRICKLY_TREE_DOOR = registerBlock("prickly_tree_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> PRICKLY_TREE_TRAPDOOR = registerBlock("prickly_tree_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / STONE TREE / --- //
    public static final RegistryObject<Block> STONE_TREE_LOG = registerBlock("stone_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STONE_TREE_WOOD = registerBlock("stone_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_STONE_TREE_LOG = registerBlock("stripped_stone_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_STONE_TREE_WOOD = registerBlock("stripped_stone_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STONE_TREE_PLANKS = registerBlock("stone_tree_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> STONE_TREE_LEAVES = registerBlock("stone_tree_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> STONE_TREE_STAIRS = registerBlock("stone_tree_stairs",
            () -> new StairBlock(() -> ModBlocks.STONE_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> STONE_TREE_SLAB = registerBlock("stone_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> STONE_TREE_BUTTON = registerBlock("stone_tree_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> STONE_TREE_PRESSURE_PLATE = registerBlock("stone_tree_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> STONE_TREE_FENCE = registerBlock("stone_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> STONE_TREE_FENCE_GATE = registerBlock("stone_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> STONE_TREE_DOOR = registerBlock("stone_tree_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> STONE_TREE_TRAPDOOR = registerBlock("stone_tree_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / TROPIC TREE / --- //
    public static final RegistryObject<Block> TROPIC_TREE_LOG = registerBlock("tropic_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> TROPIC_TREE_WOOD = registerBlock("tropic_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_TROPIC_TREE_LOG = registerBlock("stripped_tropic_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_TROPIC_TREE_WOOD = registerBlock("stripped_tropic_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> TROPIC_TREE_PLANKS = registerBlock("tropic_tree_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> TROPIC_TREE_LEAVES = registerBlock("tropic_tree_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> TROPIC_TREE_STAIRS = registerBlock("tropic_tree_stairs",
            () -> new StairBlock(() -> ModBlocks.TROPIC_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> TROPIC_TREE_SLAB = registerBlock("tropic_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> TROPIC_TREE_BUTTON = registerBlock("tropic_tree_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> TROPIC_TREE_PRESSURE_PLATE = registerBlock("tropic_tree_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> TROPIC_TREE_FENCE = registerBlock("tropic_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> TROPIC_TREE_FENCE_GATE = registerBlock("tropic_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> TROPIC_TREE_DOOR = registerBlock("tropic_tree_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> TROPIC_TREE_TRAPDOOR = registerBlock("tropic_tree_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / WILLOW / --- //
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new StairBlock(() -> ModBlocks.WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / RUBBER_TREE / --- //
    public static final RegistryObject<Block> RUBBER_TREE_LOG = registerBlock("rubber_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> RUBBER_TREE_WOOD = registerBlock("rubber_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_TREE_LOG = registerBlock("stripped_rubber_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_TREE_WOOD = registerBlock("stripped_rubber_tree_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(DyeColor.LIME).strength(3f)));
    public static final RegistryObject<Block> RUBBER_TREE_PLANKS = registerBlock("rubber_tree_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> RUBBER_TREE_LEAVES = registerBlock("rubber_tree_leaves",
            () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> RUBBER_TREE_STAIRS = registerBlock("rubber_tree_stairs",
            () -> new StairBlock(() -> ModBlocks.RUBBER_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> RUBBER_TREE_SLAB = registerBlock("rubber_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> RUBBER_TREE_BUTTON = registerBlock("rubber_tree_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).mapColor(DyeColor.LIME),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> RUBBER_TREE_PRESSURE_PLATE = registerBlock("rubber_tree_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> RUBBER_TREE_FENCE = registerBlock("rubber_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> RUBBER_TREE_FENCE_GATE = registerBlock("rubber_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).mapColor(DyeColor.LIME),
                    SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RUBBER_TREE_DOOR = registerBlock("rubber_tree_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> RUBBER_TREE_TRAPDOOR = registerBlock("rubber_tree_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR ).mapColor(DyeColor.LIME),
                    BlockSetType.OAK));

    // --- / SEEDS / --- //
    
    public static final RegistryObject<Block> ARAUCARIA_SAPLING = registerBlock("araucaria_sapling",
            () -> new SaplingBlock(new AraucariaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> UMBRELLA_TREE_SAPLING = registerBlock("umbrella_tree_sapling",
            () -> new SaplingBlock(new UmbrellaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ASPEN_SAPLING = registerBlock("aspen_sapling",
            () -> new SaplingBlock(new AspenTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> FOREST_DECEIVER_SAPLING = registerBlock("forest_deceiver_sapling",
            () -> new SaplingBlock(new ForestDeceiverTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SNOWY_TREE_SAPLING = registerBlock("snowy_tree_sapling",
            () -> new SaplingBlock(new SnowyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> FOGGY_OAK_SAPLING = registerBlock("foggy_oak_sapling",
            () -> new SaplingBlock(new FoggyOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> FOGGY_PINE_SAPLING = registerBlock("foggy_pine_sapling",
            () -> new SaplingBlock(new FoggyPineTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SWAMPY_POPLAR_SAPLING = registerBlock("swampy_poplar_sapling",
            () -> new SaplingBlock(new SwampyPoplarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PRICKLY_TREE_SAPLING = registerBlock("prickly_tree_sapling",
            () -> new SaplingBlock(new PricklyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> RUBBER_TREE_SAPLING = registerBlock("rubber_tree_sapling",
            () -> new SaplingBlock(new RubberTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> STONE_TREE_SAPLING = registerBlock("stone_tree_sapling",
            () -> new SaplingBlock(new StoneTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> TROPIC_TREE_SAPLING = registerBlock("tropic_tree_sapling",
            () -> new SaplingBlock(new TropicTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    
    // --------- / ORES / --------- //
    public static final RegistryObject<Block> GOLD_ORE = registerBlock("gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> IRON_ORE = registerBlock("iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> LAPIS_ORE = registerBlock("lapis_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> NIOBIUM_ORE = registerBlock("niobium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> BIO_SHALE_ORE = registerBlock("bio_shale_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SALTPETER_ORE = registerBlock("saltpeter_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> FILTER_COAL_ORE = registerBlock("filter_coal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    // --------- / RAW ORES / --------- //
    public static final RegistryObject<Block> RAW_NIOBIUM_BLOCK = registerBlock("raw_niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    // --------- / RAW / ORE BLOCKS / --------- //
    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = registerBlock("niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> BIO_SHALE_BLOCK = registerBlock("bio_shale_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));
    public static final RegistryObject<Block> SALTPETER_BLOCK = registerBlock("saltpeter_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)));

    // --- / FILTER COAL BLOCKS / --- //
    public static final RegistryObject<Block> CLEAN_FILTER_COAL_BLOCK = registerBlock("clean_filter_coal_block",
            () -> new CleanFilterCoalBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK), PollutableBlock.PollutionState.CLEAN));
    public static final RegistryObject<Block> SLIGHTLY_POLLUTED_FILTER_COAL_BLOCK = registerBlock("slightly_polluted_filter_coal_block",
            () -> new SlightlyPollutedFilterCoalBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK), PollutableBlock.PollutionState.CLEAN));
    public static final RegistryObject<Block> MODERATELY_POLLUTED_FILTER_COAL_BLOCK = registerBlock("moderately_polluted_filter_coal_block",
            () -> new ModeratelyPollutedFilterCoalBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK), PollutableBlock.PollutionState.CLEAN));
    public static final RegistryObject<Block> VERY_POLLUTED_FILTER_COAL_BLOCK = registerBlock("very_polluted_filter_coal_block",
            () -> new CompletelyPollutedFilterCoalBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK), PollutableBlock.PollutionState.CLEAN));


    // --------- / NATURAL / --------- //
    public static final RegistryObject<Block> ROCKS = registerBlock("rocks",
            () -> new RocksBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noCollission()));
    public static final RegistryObject<Block> DESERT_COTTON_CROP = BLOCKS.register("desert_cotton_crop",
            () -> new DesertCottonCropBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission()));

    // --- / FLOWERS / --- //
    public static final RegistryObject<Block> VIOLET_VEIL = registerBlock("violet_veil",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(Blocks.DANDELION).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_VIOLET_VEIL = BLOCKS.register("potted_violet_veil",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.VIOLET_VEIL,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    // --------- / Registrar / --------- //
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
