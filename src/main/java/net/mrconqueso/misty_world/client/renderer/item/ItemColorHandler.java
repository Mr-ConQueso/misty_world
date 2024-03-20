package net.mrconqueso.misty_world.client.renderer.item;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.init.ModBlocks;

@Mod.EventBusSubscriber(modid = MistyWorld.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemColorHandler {
    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event)
    {
        event.getItemColors().register((stack, tintIndex) -> {
                    BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                    return event.getBlockColors().getColor(state, null, null, tintIndex); },
                ModBlocks.FLOATING_MAT.get(),

                ModBlocks.MOSSY_FOGGY_COBBLESTONE.get(),
                ModBlocks.MOSSY_FOGGY_STONE.get(),
                ModBlocks.MOSSY_MINED_FOGGY_STONE.get(),
                ModBlocks.MOSSY_CHISELED_FOGGY_STONE.get(),
                ModBlocks.MOSSY_FOGGY_COBBLESTONE_WALL.get(),
                ModBlocks.MOSSY_FOGGY_STONE_WALL.get(),
                ModBlocks.MOSSY_FOGGY_STONE_BRICKS.get(),

                ModBlocks.ASPEN_LEAVES.get(),
                ModBlocks.WILLOW_LEAVES.get(),
                ModBlocks.ARAUCARIA_LEAVES.get(),
                ModBlocks.FOGGY_OAK_LEAVES.get(),
                ModBlocks.FOGGY_PINE_LEAVES.get(),
                ModBlocks.SNOWY_TREE_LEAVES.get(),
                ModBlocks.STONE_TREE_LEAVES.get(),
                ModBlocks.RUBBER_TREE_LEAVES.get(),
                ModBlocks.TROPIC_TREE_LEAVES.get(),
                ModBlocks.PRICKLY_TREE_LEAVES.get(),
                ModBlocks.SWAMPY_POPLAR_LEAVES.get(),
                ModBlocks.UMBRELLA_TREE_LEAVES.get(),
                ModBlocks.FOREST_DECEIVER_LEAVES.get());
    }
}
