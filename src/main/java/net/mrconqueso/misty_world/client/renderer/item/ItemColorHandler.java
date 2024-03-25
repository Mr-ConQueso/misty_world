package net.mrconqueso.misty_world.client.renderer.item;

import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.api.item.DyableRubberItem;
import net.mrconqueso.misty_world.init.ModBlocks;
import net.mrconqueso.misty_world.init.ModItems;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = MistyWorld.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemColorHandler {
    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event)
    {
        //Foliage Coloring
        event.getItemColors().register((stack, tintIndex) -> FoliageColor.getDefaultColor(),
                ModBlocks.DESERT_COTTON.get());

        //Grass Coloring
        event.getItemColors().register((stack, tintIndex) -> GrassColor.get(0.5D, 1.0D),
                ModBlocks.FLOATING_MAT.get(),
                ModBlocks.MOSSY_FOGGY_COBBLESTONE.get(),
                ModBlocks.MOSSY_FOGGY_STONE.get(),
                ModBlocks.MOSSY_MINED_FOGGY_STONE.get(),
                ModBlocks.MOSSY_CHISELED_FOGGY_STONE.get(),
                ModBlocks.MOSSY_FOGGY_COBBLESTONE_WALL.get(),
                ModBlocks.MOSSY_FOGGY_STONE_WALL.get(),
                ModBlocks.MOSSY_FOGGY_STONE_BRICKS.get());

        //Leaves Coloring
        event.getItemColors().register((stack, tintIndex) -> getLeavesColor(stack),
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

        // Default Rubber Coloring
        event.getItemColors().register((stack, tintIndex) ->
                        (stack.getTagElement("display") != null && Objects.requireNonNull(stack.getTagElement("display")).contains("color")) ?
                                Objects.requireNonNull(stack.getTagElement("display")).getInt("color") : DyableRubberItem.DEFAULT_RUBBER_COLOR,
                ModItems.RUBBER_BOOTS.get(),
                ModItems.RUBBER_LEGGINGS.get(),
                ModItems.RUBBER_CHESTPLATE.get(),
                ModItems.RUBBER_HELMET.get(),
                ModItems.RUBBER_RESPIRATOR.get(),
                ModItems.OPEN_RUBBER_RESPIRATOR.get());

        // Default Leather Coloring
        event.getItemColors().register((stack, tintIndex) ->(stack.getTagElement("display") != null && Objects.requireNonNull(stack.getTagElement("display")).contains("color")) ?
                        Objects.requireNonNull(stack.getTagElement("display")).getInt("color") : DyeableLeatherItem.DEFAULT_LEATHER_COLOR,
                ModItems.LEATHER_RESPIRATOR.get(),
                ModItems.OPEN_LEATHER_RESPIRATOR.get());

        /* Rainbow Birch Leaf Coloring
        event.getItemColors().register((stack, tintIndex) ->
                        world != null && pos != null ? getRainbowBirchColor(world, pos) : FoliageColor.getDefaultColor(),
                BOPBlocks.RAINBOW_BIRCH_LEAVES.get());

         */


        /* Default Grass Color
        event.getItemColors().register((stack, tintIndex) -> {
                    if (tintIndex != 0) { return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.getDefaultColor(); }
                    else { return -1; }},
                BOPBlocks.WHITE_PETALS.get());

         */

        /* Custom Tint
        event.getItemColors().register((stack, tintIndex) -> {
                    return world != null && pos != null ? 2129968 : 7455580; },
                BOPBlocks.HUGE_LILY_PAD.get());

         */
    }

    public static int getLeavesColor(ItemStack stack) {
        Block block = Block.byItem(stack.getItem());
        if (block == ModBlocks.ASPEN_LEAVES.get()) { return 14341733; }
        if (block == ModBlocks.WILLOW_LEAVES.get()) { return 7913605; }
        if (block == ModBlocks.ARAUCARIA_LEAVES.get()) { return 13028968; }
        if (block == ModBlocks.FOGGY_OAK_LEAVES.get()) { return 7317818; }
        if (block == ModBlocks.FOGGY_PINE_LEAVES.get()) { return 5411160; }
        if (block == ModBlocks.SNOWY_TREE_LEAVES.get()) { return 9980747; }
        if (block == ModBlocks.STONE_TREE_LEAVES.get()) { return 5479281; }
        if (block == ModBlocks.RUBBER_TREE_LEAVES.get()) { return 7913605; }
        if (block == ModBlocks.TROPIC_TREE_LEAVES.get()) { return 5545083; }
        if (block == ModBlocks.PRICKLY_TREE_LEAVES.get()) { return 6006373; }
        if (block == ModBlocks.SWAMPY_POPLAR_LEAVES.get()) { return 10142325; }
        if (block == ModBlocks.UMBRELLA_TREE_LEAVES.get()) { return 10668875; }
        if (block == ModBlocks.FOREST_DECEIVER_LEAVES.get()) { return 10270319; }

        return FoliageColor.getDefaultColor();
    }
}
