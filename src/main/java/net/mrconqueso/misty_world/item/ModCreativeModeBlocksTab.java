package net.mrconqueso.misty_world.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;

public class ModCreativeModeBlocksTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MistyWorld.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MISTY_WORLD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("misty_world_blocks_tab", () -> CreativeModeTab.builder()

            .title(Component.translatable("creativetab." + MistyWorld.MOD_ID + ".misty_world_blocks_tab"))
            .icon(() -> new ItemStack(ModItems.ICON.get()))
            .displayItems((params, output) -> {

                // --------- / WOOD / --------- //
                // --- / ASPEN / --- //
                output.accept(ModBlocks.ASPEN_LOG.get());
                output.accept(ModBlocks.ASPEN_WOOD.get());
                output.accept(ModBlocks.STRIPPED_ASPEN_LOG.get());
                output.accept(ModBlocks.STRIPPED_ASPEN_WOOD.get());
                output.accept(ModBlocks.ASPEN_PLANKS.get());

                output.accept(ModBlocks.ASPEN_STAIRS.get());
                output.accept(ModBlocks.ASPEN_SLAB.get());
                output.accept(ModBlocks.ASPEN_BUTTON.get());
                output.accept(ModBlocks.ASPEN_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ASPEN_FENCE.get());
                output.accept(ModBlocks.ASPEN_FENCE_GATE.get());
                output.accept(ModBlocks.ASPEN_DOOR.get());
                output.accept(ModBlocks.ASPEN_TRAPDOOR.get());

                output.accept(ModBlocks.ASPEN_LEAVES.get());

                // --- / UMBRELLA TREE / --- //
                output.accept(ModBlocks.UMBRELLA_TREE_LOG.get());
                output.accept(ModBlocks.UMBRELLA_TREE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get());
                output.accept(ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get());
                output.accept(ModBlocks.UMBRELLA_TREE_PLANKS.get());

                output.accept(ModBlocks.UMBRELLA_TREE_STAIRS.get());
                output.accept(ModBlocks.UMBRELLA_TREE_SLAB.get());
                output.accept(ModBlocks.UMBRELLA_TREE_BUTTON.get());
                output.accept(ModBlocks.UMBRELLA_TREE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.UMBRELLA_TREE_FENCE.get());
                output.accept(ModBlocks.UMBRELLA_TREE_FENCE_GATE.get());
                output.accept(ModBlocks.UMBRELLA_TREE_DOOR.get());
                output.accept(ModBlocks.UMBRELLA_TREE_TRAPDOOR.get());

                output.accept(ModBlocks.UMBRELLA_TREE_LEAVES.get());

                // --- / FOREST DECEIVER / --- //
                output.accept(ModBlocks.FOREST_DECEIVER_LOG.get());
                output.accept(ModBlocks.FOREST_DECEIVER_WOOD.get());
                output.accept(ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get());
                output.accept(ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get());
                output.accept(ModBlocks.FOREST_DECEIVER_PLANKS.get());

                output.accept(ModBlocks.FOREST_DECEIVER_STAIRS.get());
                output.accept(ModBlocks.FOREST_DECEIVER_SLAB.get());
                output.accept(ModBlocks.FOREST_DECEIVER_BUTTON.get());
                output.accept(ModBlocks.FOREST_DECEIVER_PRESSURE_PLATE.get());
                output.accept(ModBlocks.FOREST_DECEIVER_FENCE.get());
                output.accept(ModBlocks.FOREST_DECEIVER_FENCE_GATE.get());
                output.accept(ModBlocks.FOREST_DECEIVER_DOOR.get());
                output.accept(ModBlocks.FOREST_DECEIVER_TRAPDOOR.get());

                output.accept(ModBlocks.FOREST_DECEIVER_LEAVES.get());

                // --- / ARAUCARIA / --- //
                output.accept(ModBlocks.ARAUCARIA_LOG.get());
                output.accept(ModBlocks.ARAUCARIA_WOOD.get());
                output.accept(ModBlocks.STRIPPED_ARAUCARIA_LOG.get());
                output.accept(ModBlocks.STRIPPED_ARAUCARIA_WOOD.get());
                output.accept(ModBlocks.ARAUCARIA_PLANKS.get());

                output.accept(ModBlocks.ARAUCARIA_STAIRS.get());
                output.accept(ModBlocks.ARAUCARIA_SLAB.get());
                output.accept(ModBlocks.ARAUCARIA_BUTTON.get());
                output.accept(ModBlocks.ARAUCARIA_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ARAUCARIA_FENCE.get());
                output.accept(ModBlocks.ARAUCARIA_FENCE_GATE.get());
                output.accept(ModBlocks.ARAUCARIA_DOOR.get());
                output.accept(ModBlocks.ARAUCARIA_TRAPDOOR.get());

                output.accept(ModBlocks.ARAUCARIA_LEAVES.get());

                // --- / FOGGY OAK / --- //
                output.accept(ModBlocks.FOGGY_OAK_LOG.get());
                output.accept(ModBlocks.FOGGY_OAK_WOOD.get());
                output.accept(ModBlocks.STRIPPED_FOGGY_OAK_LOG.get());
                output.accept(ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get());
                output.accept(ModBlocks.FOGGY_OAK_PLANKS.get());

                output.accept(ModBlocks.FOGGY_OAK_STAIRS.get());
                output.accept(ModBlocks.FOGGY_OAK_SLAB.get());
                output.accept(ModBlocks.FOGGY_OAK_BUTTON.get());
                output.accept(ModBlocks.FOGGY_OAK_PRESSURE_PLATE.get());
                output.accept(ModBlocks.FOGGY_OAK_FENCE.get());
                output.accept(ModBlocks.FOGGY_OAK_FENCE_GATE.get());
                output.accept(ModBlocks.FOGGY_OAK_DOOR.get());
                output.accept(ModBlocks.FOGGY_OAK_TRAPDOOR.get());

                output.accept(ModBlocks.FOGGY_OAK_LEAVES.get());

                // --- / FOGGY PINE / --- //
                output.accept(ModBlocks.FOGGY_PINE_LOG.get());
                output.accept(ModBlocks.FOGGY_PINE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_FOGGY_PINE_LOG.get());
                output.accept(ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get());
                output.accept(ModBlocks.FOGGY_PINE_PLANKS.get());

                output.accept(ModBlocks.FOGGY_PINE_STAIRS.get());
                output.accept(ModBlocks.FOGGY_PINE_SLAB.get());
                output.accept(ModBlocks.FOGGY_PINE_BUTTON.get());
                output.accept(ModBlocks.FOGGY_PINE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.FOGGY_PINE_FENCE.get());
                output.accept(ModBlocks.FOGGY_PINE_FENCE_GATE.get());
                output.accept(ModBlocks.FOGGY_PINE_DOOR.get());
                output.accept(ModBlocks.FOGGY_PINE_TRAPDOOR.get());

                output.accept(ModBlocks.FOGGY_PINE_LEAVES.get());

                // --- / SWAMPY POPLAR / --- //
                output.accept(ModBlocks.SWAMPY_POPLAR_LOG.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_WOOD.get());
                output.accept(ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get());
                output.accept(ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_PLANKS.get());

                output.accept(ModBlocks.SWAMPY_POPLAR_STAIRS.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_SLAB.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_BUTTON.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_PRESSURE_PLATE.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_FENCE.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_FENCE_GATE.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_DOOR.get());
                output.accept(ModBlocks.SWAMPY_POPLAR_TRAPDOOR.get());

                output.accept(ModBlocks.SWAMPY_POPLAR_LEAVES.get());

                // --- / SNOWY TREE / --- //
                output.accept(ModBlocks.SNOWY_TREE_LOG.get());
                output.accept(ModBlocks.SNOWY_TREE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_SNOWY_TREE_LOG.get());
                output.accept(ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get());
                output.accept(ModBlocks.SNOWY_TREE_PLANKS.get());

                output.accept(ModBlocks.SNOWY_TREE_STAIRS.get());
                output.accept(ModBlocks.SNOWY_TREE_SLAB.get());
                output.accept(ModBlocks.SNOWY_TREE_BUTTON.get());
                output.accept(ModBlocks.SNOWY_TREE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.SNOWY_TREE_FENCE.get());
                output.accept(ModBlocks.SNOWY_TREE_FENCE_GATE.get());
                output.accept(ModBlocks.SNOWY_TREE_DOOR.get());
                output.accept(ModBlocks.SNOWY_TREE_TRAPDOOR.get());

                output.accept(ModBlocks.SNOWY_TREE_LEAVES.get());

                // --- / PRICKLY TREE / --- //
                output.accept(ModBlocks.PRICKLY_TREE_LOG.get());
                output.accept(ModBlocks.PRICKLY_TREE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get());
                output.accept(ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get());
                output.accept(ModBlocks.PRICKLY_TREE_PLANKS.get());

                output.accept(ModBlocks.PRICKLY_TREE_STAIRS.get());
                output.accept(ModBlocks.PRICKLY_TREE_SLAB.get());
                output.accept(ModBlocks.PRICKLY_TREE_BUTTON.get());
                output.accept(ModBlocks.PRICKLY_TREE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.PRICKLY_TREE_FENCE.get());
                output.accept(ModBlocks.PRICKLY_TREE_FENCE_GATE.get());
                output.accept(ModBlocks.PRICKLY_TREE_DOOR.get());
                output.accept(ModBlocks.PRICKLY_TREE_TRAPDOOR.get());

                output.accept(ModBlocks.PRICKLY_TREE_LEAVES.get());

                // --- / STONE TREE / --- //
                output.accept(ModBlocks.STONE_TREE_LOG.get());
                output.accept(ModBlocks.STONE_TREE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_STONE_TREE_LOG.get());
                output.accept(ModBlocks.STRIPPED_STONE_TREE_WOOD.get());
                output.accept(ModBlocks.STONE_TREE_PLANKS.get());

                output.accept(ModBlocks.STONE_TREE_STAIRS.get());
                output.accept(ModBlocks.STONE_TREE_SLAB.get());
                output.accept(ModBlocks.STONE_TREE_BUTTON.get());
                output.accept(ModBlocks.STONE_TREE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.STONE_TREE_FENCE.get());
                output.accept(ModBlocks.STONE_TREE_FENCE_GATE.get());
                output.accept(ModBlocks.STONE_TREE_DOOR.get());
                output.accept(ModBlocks.STONE_TREE_TRAPDOOR.get());

                output.accept(ModBlocks.STONE_TREE_LEAVES.get());

                // --- / TROPIC TREE / --- //
                output.accept(ModBlocks.TROPIC_TREE_LOG.get());
                output.accept(ModBlocks.TROPIC_TREE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_TROPIC_TREE_LOG.get());
                output.accept(ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get());
                output.accept(ModBlocks.TROPIC_TREE_PLANKS.get());

                output.accept(ModBlocks.TROPIC_TREE_STAIRS.get());
                output.accept(ModBlocks.TROPIC_TREE_SLAB.get());
                output.accept(ModBlocks.TROPIC_TREE_BUTTON.get());
                output.accept(ModBlocks.TROPIC_TREE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.TROPIC_TREE_FENCE.get());
                output.accept(ModBlocks.TROPIC_TREE_FENCE_GATE.get());
                output.accept(ModBlocks.TROPIC_TREE_DOOR.get());
                output.accept(ModBlocks.TROPIC_TREE_TRAPDOOR.get());

                output.accept(ModBlocks.TROPIC_TREE_LEAVES.get());

                // --- / WILLOW / --- //
                output.accept(ModBlocks.WILLOW_LOG.get());
                output.accept(ModBlocks.WILLOW_WOOD.get());
                output.accept(ModBlocks.STRIPPED_WILLOW_LOG.get());
                output.accept(ModBlocks.STRIPPED_WILLOW_WOOD.get());
                output.accept(ModBlocks.WILLOW_PLANKS.get());

                output.accept(ModBlocks.WILLOW_STAIRS.get());
                output.accept(ModBlocks.WILLOW_SLAB.get());
                output.accept(ModBlocks.WILLOW_BUTTON.get());
                output.accept(ModBlocks.WILLOW_PRESSURE_PLATE.get());
                output.accept(ModBlocks.WILLOW_FENCE.get());
                output.accept(ModBlocks.WILLOW_FENCE_GATE.get());
                output.accept(ModBlocks.WILLOW_DOOR.get());
                output.accept(ModBlocks.WILLOW_TRAPDOOR.get());

                output.accept(ModBlocks.WILLOW_LEAVES.get());

                // --- / RUBBER_TREE / --- //
                output.accept(ModBlocks.RUBBER_TREE_LOG.get());
                output.accept(ModBlocks.RUBBER_TREE_WOOD.get());
                output.accept(ModBlocks.STRIPPED_RUBBER_TREE_LOG.get());
                output.accept(ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());
                output.accept(ModBlocks.RUBBER_TREE_PLANKS.get());

                output.accept(ModBlocks.RUBBER_TREE_STAIRS.get());
                output.accept(ModBlocks.RUBBER_TREE_SLAB.get());
                output.accept(ModBlocks.RUBBER_TREE_BUTTON.get());
                output.accept(ModBlocks.RUBBER_TREE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.RUBBER_TREE_FENCE.get());
                output.accept(ModBlocks.RUBBER_TREE_FENCE_GATE.get());
                output.accept(ModBlocks.RUBBER_TREE_DOOR.get());
                output.accept(ModBlocks.RUBBER_TREE_TRAPDOOR.get());

                output.accept(ModBlocks.RUBBER_TREE_LEAVES.get());

                // --------- / ORES / --------- //
                
                output.accept(ModBlocks.GOLD_ORE.get());
                output.accept(ModBlocks.IRON_ORE.get());
                output.accept(ModBlocks.SALT_ORE.get());
                output.accept(ModBlocks.LAPIS_ORE.get());
                output.accept(ModBlocks.SULFUR_ORE.get());
                output.accept(ModBlocks.NIOBIUM_ORE.get());
                output.accept(ModBlocks.BIO_SHALE_ORE.get());
                output.accept(ModBlocks.SALTPETER_ORE.get());
                output.accept(ModBlocks.FILTER_COAL_ORE.get());
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
