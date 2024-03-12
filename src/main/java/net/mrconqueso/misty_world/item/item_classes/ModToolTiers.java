package net.mrconqueso.misty_world.item.item_classes;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.item.ModItems;
import net.mrconqueso.misty_world.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier NIOBIUM = TierSortingRegistry.registerTier(
            new ForgeTier(2, 150, 8.0f, 3.0f, 12,
                    ModTags.Blocks.NEEDS_NIOBIUM_TOOL, () -> Ingredient.of(ModItems.NIOBIUM_INGOT.get())),
                    new ResourceLocation(MistyWorld.MOD_ID, "niobium"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
