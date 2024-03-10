package net.mrconqueso.misty_world.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.mrconqueso.misty_world.item.ModItems;

import java.util.List;

public class ToxicFoodItem extends Item {
    private final int toxic;
    public ToxicFoodItem(Properties pProperties, int toxic) {
        super(pProperties);
        this.toxic = toxic;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);

        LocalPlayer player = Minecraft.getInstance().player;/*
        if (player != null) {
            IFoodHandler mCapa = IFoodHandler.getHandler(player);
            if (mCapa.isFoodStudy(stack)) {
                tooltip.add(Component.translatable("item.mist.food_toxic.tooltip").withStyle(ChatFormatting.DARK_RED));
                tooltip.add(Component.translatable("item.mist.food_edible.tooltip").withStyle(ChatFormatting.DARK_GREEN));
            }
        }
        */
    }


    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entityLiving) {
        Player player = (Player) entityLiving;
        //int toxic = YourItemClass.getToxic(stack);
        //IMistCapaHandler.getHandler(player).addToxic(toxic);
        if (player instanceof ServerPlayer) {
            //ModAdvancements.CONSUME_TOXIC.trigger((ServerPlayer) player, stack, toxic);
        }
        //IFoodHandler.getHandler(player).setFoodStudy(stack);
        return super.finishUsingItem(stack, world, entityLiving);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return this == ModItems.BITTER_PILLS.get() ? Rarity.UNCOMMON : Rarity.COMMON;
    }

    public static boolean hasSalt(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("hasSalt");
    }
}
