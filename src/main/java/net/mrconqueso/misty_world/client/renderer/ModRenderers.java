package net.mrconqueso.misty_world.client.renderer;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.api.blockentity.ModBlockEntityTypes;
import net.mrconqueso.misty_world.client.renderer.block.ModChestRenderer;

@Mod.EventBusSubscriber(modid = MistyWorld.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRenderers {
    @SubscribeEvent
    public static void rendererSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntityTypes.CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntityTypes.TRAPPED_CHEST.get(), ModChestRenderer::new);
    }
}
