package net.mrconqueso.misty_world.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MistyWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ICON);
        // --------- / NATURAL / --------- //
        simpleItem(ModItems.BIO_SHALE);
        simpleItem(ModItems.COMPOST);
        simpleItem(ModItems.DESERT_COTTON_FLOWER);
        simpleItem(ModItems.DESERT_COTTON_SEED);
        simpleItem(ModItems.HUMUS);
        simpleItem(ModItems.MULCH);
        simpleItem(ModItems.REMAINS);
        simpleItem(ModItems.ROCKS);
        simpleItem(ModItems.TINDER_FUNGUS);
        // --- / SEEDS / --- //
        simpleItem(ModItems.ACACIA_SEED);
        simpleItem(ModItems.ASPEN_SEED);
        simpleItem(ModItems.BIRCH_SEED);
        simpleItem(ModItems.OAK_SEED);
        simpleItem(ModItems.PINE_SEED);
        simpleItem(ModItems.POPLAR_SEED);
        simpleItem(ModItems.SPRUCE_SEED);
        simpleItem(ModItems.WILLOW_SEED);
        // --------- / MOB DROPS / --------- //
        simpleItem(ModItems.WING);
        simpleItem(ModItems.TALLOW);
        simpleItem(ModItems.SWIM_BLADDER);
        // --------- / MATERIALS / --------- //
        simpleItem(ModItems.GRAY_CLAY_BALL);
        simpleItem(ModItems.RED_CLAY_BALL);
        simpleItem(ModItems.ASH);
        simpleItem(ModItems.GRAY_BRICK);
        simpleItem(ModItems.FILTER_COAL);
        simpleItem(ModItems.LATEX);
        simpleItem(ModItems.NIOBIUM_NUGGET);
        simpleItem(ModItems.NIOBIUM_INGOT);
        simpleItem(ModItems.RUBBER);
        simpleItem(ModItems.SAPROPEL_BALL);
        simpleItem(ModItems.SPONGE_FIBRE);
        simpleItem(ModItems.CLEAR_SPONGE_FIBRE);
        simpleItem(ModItems.SPONGE_SLIME);
        simpleItem(ModItems.SPONGE_SPORE);
        simpleItem(ModItems.SULFUR);
        // --------- / TOOLS / --------- //
        simpleItem(ModItems.CENTROMETER);
        simpleItem(ModItems.GAS_ANALYZER);
        simpleItem(ModItems.FLINT_AND_STONE);
        simpleItem(ModItems.HYGROMETER);
        simpleItem(ModItems.SOAP);
        simpleItem(ModItems.MAP_UP);
        simpleItem(ModItems.MAP_DOWN);
        // --- / NIOBIUM / --- //
        simpleItem(ModItems.NIOBIUM_AXE);
        simpleItem(ModItems.NIOBIUM_PICKAXE);
        simpleItem(ModItems.NIOBIUM_CHISEL);
        simpleItem(ModItems.NIOBIUM_SWORD);
        simpleItem(ModItems.NIOBIUM_SHOVEL);
        simpleItem(ModItems.NIOBIUM_HOE);
        // --------- / ARMOR / --------- //
        simpleItem(ModItems.RESPIRATOR);
        // --- / NIOBIUM / --- //
        simpleItem(ModItems.NIOBIUM_BOOTS);
        simpleItem(ModItems.NIOBIUM_LEGGINGS);
        simpleItem(ModItems.NIOBIUM_CHESTPLATE);
        simpleItem(ModItems.NIOBIUM_HELMET);
        // --- / RUBBER / --- //
        simpleItem(ModItems.RUBBER_BOOTS);
        simpleItem(ModItems.RUBBER_LEGGINGS);
        simpleItem(ModItems.RUBBER_CHESTPLATE);
        simpleItem(ModItems.RUBBER_HELMET);
        // --------- / FOOD / --------- //
        simpleItem(ModItems.NIGHTBERRY);
        simpleItem(ModItems.BITTER_PILLS);
        simpleItem(ModItems.SALTPETER);
        simpleItem(ModItems.SPONGE_MEAT);
        // --- / FOOD ON A STICK / --- //
        simpleItem(ModItems.CUP_ON_A_STICK);
        simpleItem(ModItems.MARSH_ON_A_STICK);
        simpleItem(ModItems.PINK_ON_A_STICK);
        simpleItem(ModItems.SAND_ON_A_STICK);
        simpleItem(ModItems.TAN_ON_A_STICK);
        // --- / MEAT / --- //
        simpleItem(ModItems.TAN_ON_A_STICK);
        
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MistyWorld.MOD_ID, "item/" + item.getId().getPath()));
    }
}
