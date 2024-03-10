package net.mrconqueso.misty_world.api.item;

import net.minecraft.client.color.item.ItemColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface IColoredItem {

    @OnlyIn(Dist.CLIENT)
    public ItemColor getItemColor();
}
