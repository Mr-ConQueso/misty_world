package net.mrconqueso.misty_world.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
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
import net.mrconqueso.misty_world.block.custom.ModFlammableRotatedPillarBlock;
import net.mrconqueso.misty_world.block.custom.ModFlammableRotatedPlankBlock;
import net.mrconqueso.misty_world.block.custom.ModLeavesBlock;
import net.mrconqueso.misty_world.block.custom.ModPlankBlock;
import net.mrconqueso.misty_world.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MistyWorld.MOD_ID);

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

    // --------- / ORES / --------- //
    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

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
