package net.mrconqueso.misty_world.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MistyWorld.MOD_ID);


    // --------- / ITEMS / --------- //
    public static final RegistryObject<SoundEvent> USE_GAS_ANALYZER = registerSoundEvents("use_gas_analyzer");

    // --------- / BLOCKS / --------- //
    public static final RegistryObject<SoundEvent> URN_OPEN = registerSoundEvents("urn_open");
    public static final RegistryObject<SoundEvent> URN_CLOSE = registerSoundEvents("urn_close");
    public static final RegistryObject<SoundEvent> URN_BREAK = registerSoundEvents("urn_break");
    public static final RegistryObject<SoundEvent> STONE_BREAK = registerSoundEvents("stone_break");
    public static final RegistryObject<SoundEvent> WOOD_CREAK = registerSoundEvents("wood_creak");


    // --------- / MUSIC / --------- //
    public static final RegistryObject<SoundEvent> UP_DAY_MUSIC = registerSoundEvents("up_day_music");
    public static final RegistryObject<SoundEvent> UP_NIGHT_MUSIC = registerSoundEvents("up_night_music");
    public static final RegistryObject<SoundEvent> SUNSET_UP_MUSIC = registerSoundEvents("sunset_up_music");
    public static final RegistryObject<SoundEvent> DOWN_MUSIC = registerSoundEvents("down_music");
    public static final RegistryObject<SoundEvent> SUNSET_DOWN_MUSIC = registerSoundEvents("sunset_down_music");


    // --------- / GENERAL AMBIENCE / --------- //
    public static final RegistryObject<SoundEvent> SKY_BOOM = registerSoundEvents("sky_boom");
    public static final RegistryObject<SoundEvent> SKY_SOUND = registerSoundEvents("sky_sound");


    // --------- / ANIMAL AMBIENCE / --------- //
    public static final RegistryObject<SoundEvent> FOREST_CRICKET = registerSoundEvents("forest_cricket");
    public static final RegistryObject<SoundEvent> DESERT_CRICKET = registerSoundEvents("desert_cricket");
    public static final RegistryObject<SoundEvent> SWAMP_FROG = registerSoundEvents("swamp_frog");
    public static final RegistryObject<SoundEvent> SWAMP_BIRD = registerSoundEvents("swamp_bird");
    public static final RegistryObject<SoundEvent> TROPIC_CICADA = registerSoundEvents("tropic_cicada");
    public static final RegistryObject<SoundEvent> TROPIC_HOPPER = registerSoundEvents("tropic_hopper");


    // --------- / ENTITIES / --------- //
    public static final RegistryObject<SoundEvent> CARAVAN_AMBIENT = registerSoundEvents("caravan_ambient");
    public static final RegistryObject<SoundEvent> CARAVAN_HURT = registerSoundEvents("caravan_hurt");
    public static final RegistryObject<SoundEvent> CARAVAN_DEATH = registerSoundEvents("caravan_death");

    public static final RegistryObject<SoundEvent> BARVOG_MEAT_AMBIENT = registerSoundEvents("barvog_meat_ambient");
    public static final RegistryObject<SoundEvent> BARVOG_MEAT_HURT = registerSoundEvents("barvog_meat_hurt");
    public static final RegistryObject<SoundEvent> BARVOG_MEAT_DEATH = registerSoundEvents("barvog_meat_death");

    public static final RegistryObject<SoundEvent> BRACHIODON_MEAT_AMBIENT = registerSoundEvents("brachiodon_meat_ambient");
    public static final RegistryObject<SoundEvent> BRACHIODON_MEAT_HURT = registerSoundEvents("brachiodon_meat_hurt");
    public static final RegistryObject<SoundEvent> BRACHIODON_MEAT_DEATH = registerSoundEvents("brachiodon_meat_death");

    public static final RegistryObject<SoundEvent> CARAVAN_MEAT_AMBIENT = registerSoundEvents("caravan_meat_ambient");
    public static final RegistryObject<SoundEvent> CARAVAN_MEAT_HURT = registerSoundEvents("caravan_meat_hurt");
    public static final RegistryObject<SoundEvent> CARAVAN_MEAT_DEATH = registerSoundEvents("caravan_meat_death");

    public static final RegistryObject<SoundEvent> FOREST_RUNNER_MEAT_AMBIENT = registerSoundEvents("forest_runner_meat_ambient");
    public static final RegistryObject<SoundEvent> FOREST_RUNNER_MEAT_HURT = registerSoundEvents("forest_runner_meat_hurt");
    public static final RegistryObject<SoundEvent> FOREST_RUNNER_MEAT_DEATH = registerSoundEvents("forest_runner_meat_death");

    public static final RegistryObject<SoundEvent> GALAGA_MEAT_AMBIENT = registerSoundEvents("galaga_meat_ambient");
    public static final RegistryObject<SoundEvent> GALAGA_MEAT_HURT = registerSoundEvents("galaga_meat_hurt");
    public static final RegistryObject<SoundEvent> GALAGA_MEAT_DEATH = registerSoundEvents("galaga_meat_death");

    public static final RegistryObject<SoundEvent> HORB_MEAT_AMBIENT = registerSoundEvents("horb_meat_ambient");
    public static final RegistryObject<SoundEvent> HORB_MEAT_HURT = registerSoundEvents("horb_meat_hurt");
    public static final RegistryObject<SoundEvent> HORB_MEAT_DEATH = registerSoundEvents("horb_meat_death");

    public static final RegistryObject<SoundEvent> HULTER_MEAT_AMBIENT = registerSoundEvents("hulter_meat_ambient");
    public static final RegistryObject<SoundEvent> HULTER_MEAT_HURT = registerSoundEvents("hulter_meat_hurt");
    public static final RegistryObject<SoundEvent> HULTER_MEAT_DEATH = registerSoundEvents("hulter_meat_death");

    public static final RegistryObject<SoundEvent> MOMO_MEAT_AMBIENT = registerSoundEvents("momo_meat_ambient");
    public static final RegistryObject<SoundEvent> MOMO_MEAT_HURT = registerSoundEvents("momo_meat_hurt");
    public static final RegistryObject<SoundEvent> MOMO_MEAT_DEATH = registerSoundEvents("momo_meat_death");

    public static final RegistryObject<SoundEvent> MONK_MEAT_AMBIENT = registerSoundEvents("monk_meat_ambient");
    public static final RegistryObject<SoundEvent> MONK_MEAT_HURT = registerSoundEvents("monk_meat_hurt");
    public static final RegistryObject<SoundEvent> MONK_MEAT_DEATH = registerSoundEvents("monk_meat_death");

    public static final RegistryObject<SoundEvent> MOSSLING_MEAT_AMBIENT = registerSoundEvents("mosslign_meat_ambient");
    public static final RegistryObject<SoundEvent> MOSSLING_MEAT_HURT = registerSoundEvents("mosslign_meat_hurt");
    public static final RegistryObject<SoundEvent> MOSSLING_MEAT_DEATH = registerSoundEvents("mosslign_meat_death");

    public static final RegistryObject<SoundEvent> PRICKLER_MEAT_AMBIENT = registerSoundEvents("prickler_meat_ambient");
    public static final RegistryObject<SoundEvent> PRICKLER_MEAT_HURT = registerSoundEvents("prickler_meat_hurt");
    public static final RegistryObject<SoundEvent> PRICKLER_MEAT_DEATH = registerSoundEvents("prickler_meat_death");

    public static final RegistryObject<SoundEvent> SLOTH_MEAT_AMBIENT = registerSoundEvents("sloth_meat_ambient");
    public static final RegistryObject<SoundEvent> SLOTH_MEAT_HURT = registerSoundEvents("sloth_meat_hurt");
    public static final RegistryObject<SoundEvent> SLOTH_MEAT_DEATH = registerSoundEvents("sloth_meat_death");

    public static final RegistryObject<SoundEvent> SNIFF_MEAT_AMBIENT = registerSoundEvents("sniff_meat_ambient");
    public static final RegistryObject<SoundEvent> SNIFF_MEAT_HURT = registerSoundEvents("sniff_meat_hurt");
    public static final RegistryObject<SoundEvent> SNIFF_MEAT_DEATH = registerSoundEvents("sniff_meat_death");

    public static final RegistryObject<SoundEvent> WULDER_MEAT_AMBIENT = registerSoundEvents("wulder_meat_ambient");
    public static final RegistryObject<SoundEvent> WULDER_MEAT_HURT = registerSoundEvents("wulder_meat_hurt");
    public static final RegistryObject<SoundEvent> WULDER_MEAT_DEATH = registerSoundEvents("wulder_meat_death");

    public static final RegistryObject<SoundEvent> SWAMP_CRAB_AMBIENT = registerSoundEvents("swamp_crab_ambient");
    public static final RegistryObject<SoundEvent> SWAMP_CRAB_HURT = registerSoundEvents("swamp_crab_hurt");
    public static final RegistryObject<SoundEvent> SWAMP_CRAB_DEATH = registerSoundEvents("swamp_crab_death");
    public static final RegistryObject<SoundEvent> SWAMP_CRAB_STEP = registerSoundEvents("swamp_crab_step");

    public static final RegistryObject<SoundEvent> GRAVE_BUG_AMBIENT = registerSoundEvents("grave_bug_ambient");
    public static final RegistryObject<SoundEvent> GRAVE_BUG_HURT = registerSoundEvents("grave_bug_hurt");
    public static final RegistryObject<SoundEvent> GRAVE_BUG_DEATH = registerSoundEvents("grave_bug_death");
    public static final RegistryObject<SoundEvent> GRAVE_BUG_STEP = registerSoundEvents("grave_bug_step");

    public static final RegistryObject<SoundEvent> FOREST_SPIDER_AMBIENT = registerSoundEvents("forest_spider_ambient");
    public static final RegistryObject<SoundEvent> FOREST_SPIDER_HURT = registerSoundEvents("forest_spider_hurt");
    public static final RegistryObject<SoundEvent> FOREST_SPIDER_DEATH = registerSoundEvents("forest_spider_death");
    public static final RegistryObject<SoundEvent> FOREST_SPIDER_STEP = registerSoundEvents("forest_spider_step");

    public static final RegistryObject<SoundEvent> WOODLOUSE_AMBIENT = registerSoundEvents("woodlouse_ambient");
    public static final RegistryObject<SoundEvent> WOODLOUSE_HURT = registerSoundEvents("woodlouse_hurt");
    public static final RegistryObject<SoundEvent> WOODLOUSE_DEATH = registerSoundEvents("woodlouse_death");

    public static final RegistryObject<SoundEvent> SNOW_FLEA_AMBIENT = registerSoundEvents("snow_flea_ambient");
    public static final RegistryObject<SoundEvent> SNOW_FLEA_HURT = registerSoundEvents("snow_flea_hurt");
    public static final RegistryObject<SoundEvent> SNOW_FLEA_DEATH = registerSoundEvents("snow_flea_death");
    public static final RegistryObject<SoundEvent> SNOW_FLEA_STEP = registerSoundEvents("snow_flea_step");
    public static final RegistryObject<SoundEvent> SNOW_FLEA_FLAY = registerSoundEvents("snow_flea_flay");

    public static final RegistryObject<SoundEvent> CYCLOPS_AMBIENT = registerSoundEvents("cyclops_ambient");
    public static final RegistryObject<SoundEvent> CYCLOPS_HURT = registerSoundEvents("cyclops_hurt");
    public static final RegistryObject<SoundEvent> CYCLOPS_DEATH = registerSoundEvents("cyclops_death");
    public static final RegistryObject<SoundEvent> CYCLOPS_STEP = registerSoundEvents("cyclops_step");

    public static final RegistryObject<SoundEvent> DESERT_FISH_AMBIENT = registerSoundEvents("desert_fish_ambient");
    public static final RegistryObject<SoundEvent> DESERT_FISH_HURT = registerSoundEvents("desert_fish_hurt");
    public static final RegistryObject<SoundEvent> DESERT_FISH_DEATH = registerSoundEvents("desert_fish_death");
    public static final RegistryObject<SoundEvent> DESERT_FISH_STEP = registerSoundEvents("desert_fish_step");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MistyWorld.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
