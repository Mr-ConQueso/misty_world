package net.mrconqueso.misty_world.item.item_classes;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties NIGHTBERRY = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200), 1.0f).build();
    public static final FoodProperties BITTER_PILLS = new FoodProperties.Builder().nutrition(1).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1.0f).build();
    public static final FoodProperties SALT_FOOD = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200), 0.8f).build();
    public static final FoodProperties SPONGE_MEAT = new FoodProperties.Builder().nutrition(1).saturationMod(0.6f).build();
    public static final FoodProperties SWIM_BLADDER = new FoodProperties.Builder().nutrition(2).saturationMod(0.6f).build();

    // --------- / MEAT / --------- //
    public static final FoodProperties BARVOG_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties BARVOG_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties BRACHIDON_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties BRACHIDON_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties CARAVAN_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties CARAVAN_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties FOREST_RUNNER_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties FOREST_RUNNER_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties GALAGA_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties GALAGA_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties HORB_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties HORB_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties HULTER_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties HULTER_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties MOMO_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties MOMO_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties MONK_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties MONK_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties MOSSLING_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties MOSSLING_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties PRICKLER_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties PRICKLER_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties SLOTH_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties SLOTH_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties SNIFF_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties SNIFF_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
    public static final FoodProperties WULDER_MEAT = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties WULDER_MEAT_COOKED = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f).build();
}
