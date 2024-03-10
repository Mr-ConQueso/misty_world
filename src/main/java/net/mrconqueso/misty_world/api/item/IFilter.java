package net.mrconqueso.misty_world.api.item;

import net.minecraft.world.item.ItemStack;

public interface IFilter {
    public default float getFilteringDepth() {
        return 85;
    }

    public static float getDepthOfFilteration(ItemStack stack) {
        if (stack.getItem() instanceof IFilter) return ((IFilter)stack.getItem()).getFilteringDepth();
        return 0;
    }
}
