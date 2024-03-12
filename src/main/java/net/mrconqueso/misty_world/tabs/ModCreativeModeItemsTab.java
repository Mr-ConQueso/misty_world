package net.mrconqueso.misty_world.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.item.ModItems;

public class ModCreativeModeItemsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MistyWorld.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MISTY_WORLD_ITEMS_TAB = CREATIVE_MODE_TABS.register("misty_world_items_tab", () -> CreativeModeTab.builder()

            .title(Component.translatable("creativetab." + MistyWorld.MOD_ID + ".misty_world_items_tab"))
            .icon(() -> new ItemStack(ModItems.ICON.get()))
            .displayItems((params, output) -> {

                // --------- / NATURAL / --------- //
                output.accept(ModItems.BIO_SHALE.get());
                output.accept(ModItems.COMPOST.get());
                output.accept(ModItems.HUMUS.get());
                output.accept(ModItems.MULCH.get());
                output.accept(ModItems.REMAINS.get());
                output.accept(ModItems.TINDER_FUNGUS.get());
                // --- / SEEDS / --- //
                output.accept(ModItems.DESERT_COTTON_SEED.get());
                output.accept(ModItems.DESERT_COTTON_FLOWER.get());
                // --------- / MOB DROPS / --------- //
                output.accept(ModItems.WING.get());
                output.accept(ModItems.TALLOW.get());
                // --------- / MATERIALS / --------- //
                output.accept(ModItems.GRAY_CLAY_BALL.get());
                output.accept(ModItems.RED_CLAY_BALL.get());
                output.accept(ModItems.ASH.get());
                output.accept(ModItems.GRAY_BRICK.get());
                output.accept(ModItems.FILTER_COAL.get());
                output.accept(ModItems.LATEX.get());
                output.accept(ModItems.RAW_NIOBIUM.get());
                output.accept(ModItems.NIOBIUM_INGOT.get());
                output.accept(ModItems.NIOBIUM_NUGGET.get());
                output.accept(ModItems.RUBBER.get());
                output.accept(ModItems.SAPROPEL_BALL.get());
                output.accept(ModItems.SPONGE_FIBRE.get());
                output.accept(ModItems.CLEAR_SPONGE_FIBRE.get());
                output.accept(ModItems.SPONGE_SLIME.get());
                output.accept(ModItems.SPONGE_SPORE.get());
                output.accept(ModItems.SULFUR.get());
                output.accept(ModItems.SALTPETER.get());
                // --------- / TOOLS / --------- //
                output.accept(ModItems.CENTROMETER.get());
                output.accept(ModItems.GAS_ANALYZER.get());
                output.accept(ModItems.FLINT_AND_STONE.get());
                output.accept(ModItems.HYGROMETER.get());
                output.accept(ModItems.SOAP.get());
                output.accept(ModItems.MAP_UP.get());
                output.accept(ModItems.MAP_DOWN.get());
                // --- / NIOBIUM / --- //
                output.accept(ModItems.NIOBIUM_SWORD.get());
                output.accept(ModItems.NIOBIUM_SHOVEL.get());
                output.accept(ModItems.NIOBIUM_PICKAXE.get());
                output.accept(ModItems.NIOBIUM_AXE.get());
                output.accept(ModItems.NIOBIUM_HOE.get());
                output.accept(ModItems.NIOBIUM_CHISEL.get());
                // --------- / ARMOR / --------- //
                output.accept(ModItems.RESPIRATOR.get());
                // --- / NIOBIUM / --- //
                output.accept(ModItems.NIOBIUM_HELMET.get());
                output.accept(ModItems.NIOBIUM_CHESTPLATE.get());
                output.accept(ModItems.NIOBIUM_LEGGINGS.get());
                output.accept(ModItems.NIOBIUM_BOOTS.get());
                // --- / RUBBER / --- //
                output.accept(ModItems.RUBBER_HELMET.get());
                output.accept(ModItems.RUBBER_CHESTPLATE.get());
                output.accept(ModItems.RUBBER_LEGGINGS.get());
                output.accept(ModItems.RUBBER_BOOTS.get());
                // --- / FOOD ON A STICK / --- //
                output.accept(ModItems.CUP_MUSHROOM_ON_A_STICK.get());
                output.accept(ModItems.MARSH_MUSHROOM_ON_A_STICK.get());
                output.accept(ModItems.PINK_MUSHROOM_ON_A_STICK.get());
                output.accept(ModItems.SAND_MUSHROOM_ON_A_STICK.get());
                output.accept(ModItems.TAN_MUSHROOM_ON_A_STICK.get());
                // --------- / FOOD / --------- //
                output.accept(ModItems.NIGHTBERRY.get());
                output.accept(ModItems.BITTER_PILLS.get());
                output.accept(ModItems.SALT.get());
                output.accept(ModItems.SPONGE_MEAT.get());
                output.accept(ModItems.SWIM_BLADDER.get());
                // --- / MEAT / --- //
                
                output.accept(ModItems.BARVOG_MEAT.get());
                output.accept(ModItems.BARVOG_MEAT_COOKED.get());
                output.accept(ModItems.BRACHIODON_MEAT.get());
                output.accept(ModItems.BRACHIODON_MEAT_COOKED.get());
                output.accept(ModItems.CARAVAN_MEAT.get());
                output.accept(ModItems.CARAVAN_MEAT_COOKED.get());
                output.accept(ModItems.FOREST_RUNNER_MEAT.get());
                output.accept(ModItems.FOREST_RUNNER_MEAT_COOKED.get());
                output.accept(ModItems.GALAGA_MEAT.get());
                output.accept(ModItems.GALAGA_MEAT_COOKED.get());
                output.accept(ModItems.HORB_MEAT.get());
                output.accept(ModItems.HORB_MEAT_COOKED.get());
                output.accept(ModItems.HULTER_MEAT.get());
                output.accept(ModItems.HULTER_MEAT_COOKED.get());
                output.accept(ModItems.MOMO_MEAT.get());
                output.accept(ModItems.MOMO_MEAT_COOKED.get());
                output.accept(ModItems.MONK_MEAT.get());
                output.accept(ModItems.MONK_MEAT_COOKED.get());
                output.accept(ModItems.MOSSLING_MEAT.get());
                output.accept(ModItems.MOSSLING_MEAT_COOKED.get());
                output.accept(ModItems.PRICKLER_MEAT.get());
                output.accept(ModItems.PRICKLER_MEAT_COOKED.get());
                output.accept(ModItems.SLOTH_MEAT.get());
                output.accept(ModItems.SLOTH_MEAT_COOKED.get());
                output.accept(ModItems.SNIFF_MEAT.get());
                output.accept(ModItems.SNIFF_MEAT_COOKED.get());
                output.accept(ModItems.WULDER_MEAT.get());
                output.accept(ModItems.WULDER_MEAT_COOKED.get());
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
