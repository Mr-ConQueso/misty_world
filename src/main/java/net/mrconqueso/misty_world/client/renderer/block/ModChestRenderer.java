package net.mrconqueso.misty_world.client.renderer.block;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.mrconqueso.misty_world.block.custom.state.ChestVariants;
import net.mrconqueso.misty_world.api.block.IVariantChest;
import net.mrconqueso.misty_world.block.entity.ModChestBlockEntity;

public class ModChestRenderer extends ChestRenderer<ModChestBlockEntity> {
    public static ModChestRenderer INSTANCE;
    public static Block block = null;
    public boolean xmasTextures;

    public ModChestRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
        INSTANCE = this;
    }

    @Override
    public Material getMaterial(ModChestBlockEntity blockEntity, ChestType type) {
        if (this.xmasTextures) {
            return switch (type) {
                case RIGHT -> Sheets.CHEST_XMAS_LOCATION_RIGHT;
                case LEFT -> Sheets.CHEST_XMAS_LOCATION_LEFT;
                default -> Sheets.CHEST_XMAS_LOCATION;
            };
        } else {
            Block chestBlock = block;
            if (chestBlock == null)
                chestBlock = blockEntity.getBlockState().getBlock();
            ChestVariants chestVariant = ((IVariantChest) chestBlock).getVariant();

            if (chestVariant == null)
                return null;

            return switch (type) {
                case RIGHT -> getRenderMaterial(chestVariant.getRight());
                case LEFT -> getRenderMaterial(chestVariant.getLeft());
                default -> getRenderMaterial(chestVariant.getSingle());
            };
        }
    }

    private Material getRenderMaterial(ResourceLocation resource) {
        return new Material(Sheets.CHEST_SHEET, resource);
    }
}
