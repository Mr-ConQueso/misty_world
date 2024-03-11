package net.mrconqueso.misty_world;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.tabs.ModCreativeModeBlocksTab;
import net.mrconqueso.misty_world.item.tabs.ModCreativeModeItemsTab;
import net.mrconqueso.misty_world.item.ModItems;
import net.mrconqueso.misty_world.sound.ModSounds;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MistyWorld.MOD_ID)
public class MistyWorld {
    public static final String MOD_ID = "misty_world";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MistyWorld() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeBlocksTab.register(modEventBus);
        ModCreativeModeItemsTab.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLET_VEIL.getId(), ModBlocks.POTTED_VIOLET_VEIL);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
