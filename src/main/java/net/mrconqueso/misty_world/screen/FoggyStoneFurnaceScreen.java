package net.mrconqueso.misty_world.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.mrconqueso.misty_world.MistyWorld;

public class FoggyStoneFurnaceScreen extends AbstractContainerScreen<FoggyStoneFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MistyWorld.MOD_ID, "textures/gui/container/foggy_stone_furnace.png");
    private boolean close = false;
    private static final int[] xTempCoord = new int[] { 56, 58, 62, 67, 74, 81, 96, 102, 106, 110, 111 };
    private static final int[] yTempCoord = new int[] { 38, 31, 25, 21, 18, 16, 18, 21, 25, 31, 38 };
    private static final int[] xTexCoord = new int[] { 1, 1, 1, 1, 1, 4, 15, 14, 13, 13, 12 };
    private static final int[] yTexCoord = new int[] { 203, 196, 188, 181, 174, 167, 174, 181, 188, 196, 203 };
    private static final int[] xTempSize = new int[] { 9, 8, 8, 7, 6, 14, 6, 7, 8, 8, 9 };
    private static final int[] yTempSize = new int[] { 5, 6, 7, 6, 6, 6, 6, 6, 7, 6, 5 };
    public FoggyStoneFurnaceScreen(FoggyStoneFurnaceMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        //this.inventoryLabelX = 10000;
        //this.titleLabelY = 10000;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressArrow(guiGraphics, x, y);
    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
        if(menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + 85, y + 30, 176, 0, 8, menu.getScaledProgress()); //TODO: Set the moving Texture HERE!!
        }
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
