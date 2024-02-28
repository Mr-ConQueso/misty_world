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

                // --------- / ORES / --------- //
                
                output.accept(ModBlocks.SALT_ORE.get());
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
