package net.mrconqueso.misty_world.client.renderer.block;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.init.ModBlocks;

import java.awt.*;

@Mod.EventBusSubscriber(modid = MistyWorld.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColorHandler {
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {

        //Foliage Coloring
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.DESERT_COTTON.get());

        //Grass Coloring
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D),
                ModBlocks.FLOATING_MAT.get(),
                ModBlocks.MOSSY_FOGGY_COBBLESTONE.get(),
                ModBlocks.MOSSY_FOGGY_STONE.get(),
                ModBlocks.MOSSY_MINED_FOGGY_STONE.get(),
                ModBlocks.MOSSY_CHISELED_FOGGY_STONE.get(),
                ModBlocks.MOSSY_FOGGY_COBBLESTONE_WALL.get(),
                ModBlocks.MOSSY_FOGGY_STONE_WALL.get(),
                ModBlocks.MOSSY_FOGGY_STONE_BRICKS.get());

        //Leaves Coloring
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? getLeavesColor(state) : FoliageColor.getDefaultColor(),
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

        /* Rainbow Birch Leaf Coloring
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? getRainbowBirchColor(world, pos) : FoliageColor.getDefaultColor(),
                BOPBlocks.RAINBOW_BIRCH_LEAVES.get());

         */


        /* Default Grass Color
        event.getBlockColors().register((state, world, pos, tintIndex) -> {
                    if (tintIndex != 0) { return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.getDefaultColor(); }
                    else { return -1; }},
                BOPBlocks.WHITE_PETALS.get());

         */

        /* Custom Tint
        event.getBlockColors().register((state, world, pos, tintIndex) -> {
                    return world != null && pos != null ? 2129968 : 7455580; },
                BOPBlocks.HUGE_LILY_PAD.get());

         */
    }

    public static int getRainbowBirchColor(BlockAndTintGetter world, BlockPos pos)
    {
        Color foliage = Color.getHSBColor((((float)pos.getX() + Mth.sin(((float)pos.getZ() + (float)pos.getX()) / 35) * 35) % 150) / 150, 0.6F, 1.0F);

        return foliage.getRGB();
    }

    public static int getLeavesColor(BlockState state) {
        if (state.getBlock() == ModBlocks.ASPEN_LEAVES.get()) { return 14341733; }
        if (state.getBlock() == ModBlocks.WILLOW_LEAVES.get()) { return 7913605; }
        if (state.getBlock() == ModBlocks.ARAUCARIA_LEAVES.get()) { return 13028968; }
        if (state.getBlock() == ModBlocks.FOGGY_OAK_LEAVES.get()) { return 7317818; }
        if (state.getBlock() == ModBlocks.FOGGY_PINE_LEAVES.get()) { return 5411160; }
        if (state.getBlock() == ModBlocks.SNOWY_TREE_LEAVES.get()) { return 9980747; }
        if (state.getBlock() == ModBlocks.STONE_TREE_LEAVES.get()) { return 5479281; }
        if (state.getBlock() == ModBlocks.RUBBER_TREE_LEAVES.get()) { return 7913605; }
        if (state.getBlock() == ModBlocks.TROPIC_TREE_LEAVES.get()) { return 5545083; }
        if (state.getBlock() == ModBlocks.PRICKLY_TREE_LEAVES.get()) { return 6006373; }
        if (state.getBlock() == ModBlocks.SWAMPY_POPLAR_LEAVES.get()) { return 10142325; }
        if (state.getBlock() == ModBlocks.UMBRELLA_TREE_LEAVES.get()) { return 10668875; }
        if (state.getBlock() == ModBlocks.FOREST_DECEIVER_LEAVES.get()) { return 10270319; }

        return FoliageColor.getDefaultColor();
    }
}
