package net.mrconqueso.misty_world.block.custom.state;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public enum CampfireCookingTool implements StringRepresentable {
    NONE("none", ItemStack.EMPTY),
    POT("pot", new ItemStack(Items.CAULDRON)),
    GRILL("grill", new ItemStack(Blocks.IRON_BARS));

    private final String name;
    private final ItemStack item;
    CampfireCookingTool(String name, ItemStack item) {
        this.name = name;
        this.item = item;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    @Override
    public @NotNull String getSerializedName() {
        return this.name;
    }
    public ItemStack getItem() {
        return this.item.copy();
    }
}
