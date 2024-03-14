package net.mrconqueso.misty_world.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MistyWorld.MOD_ID);


    public static final RegistryObject<MenuType<FoggyStoneFurnaceMenu>> FOGGY_STONE_FURNACE_MENU = registerMenuTypes("foggy_stone_furnace_menu", FoggyStoneFurnaceMenu::new);


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuTypes(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
