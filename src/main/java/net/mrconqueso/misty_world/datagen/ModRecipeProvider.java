package net.mrconqueso.misty_world.datagen;

import net.minecraft.client.resources.model.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.IShapedRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SALT_SMELTABLES = List.of(ModBlocks.SALT_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        // --------------- / CRAFTING / --------------- //

        // --------- / VANILLA / --------- //

        // --------- / COMPATIBILITIES / --------- //

        // --------- / WOODS / --------- //
        woodTypeCrafting(ModBlocks.ASPEN_PLANKS.get().asItem(), ModBlocks.ASPEN_LOG.get().asItem(), ModBlocks.ASPEN_WOOD.get().asItem(), ModBlocks.STRIPPED_ASPEN_LOG.get().asItem(), ModBlocks.STRIPPED_ASPEN_WOOD.get().asItem(), ModBlocks.ASPEN_STAIRS.get().asItem(), ModBlocks.ASPEN_SLAB.get().asItem(), ModBlocks.ASPEN_BUTTON.get().asItem(), ModBlocks.ASPEN_PRESSURE_PLATE.get().asItem(), ModBlocks.ASPEN_FENCE.get().asItem(), ModBlocks.ASPEN_FENCE_GATE.get().asItem(), ModBlocks.ASPEN_DOOR.get().asItem(), ModBlocks.ASPEN_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.WILLOW_PLANKS.get().asItem(), ModBlocks.WILLOW_LOG.get().asItem(), ModBlocks.WILLOW_WOOD.get().asItem(), ModBlocks.STRIPPED_WILLOW_LOG.get().asItem(), ModBlocks.STRIPPED_WILLOW_WOOD.get().asItem(), ModBlocks.WILLOW_STAIRS.get().asItem(), ModBlocks.WILLOW_SLAB.get().asItem(), ModBlocks.WILLOW_BUTTON.get().asItem(), ModBlocks.WILLOW_PRESSURE_PLATE.get().asItem(), ModBlocks.WILLOW_FENCE.get().asItem(), ModBlocks.WILLOW_FENCE_GATE.get().asItem(), ModBlocks.WILLOW_DOOR.get().asItem(), ModBlocks.WILLOW_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.ARAUCARIA_PLANKS.get().asItem(), ModBlocks.ARAUCARIA_LOG.get().asItem(), ModBlocks.ARAUCARIA_WOOD.get().asItem(), ModBlocks.STRIPPED_ARAUCARIA_LOG.get().asItem(), ModBlocks.STRIPPED_ARAUCARIA_WOOD.get().asItem(), ModBlocks.ARAUCARIA_STAIRS.get().asItem(), ModBlocks.ARAUCARIA_SLAB.get().asItem(), ModBlocks.ARAUCARIA_BUTTON.get().asItem(), ModBlocks.ARAUCARIA_PRESSURE_PLATE.get().asItem(), ModBlocks.ARAUCARIA_FENCE.get().asItem(), ModBlocks.ARAUCARIA_FENCE_GATE.get().asItem(), ModBlocks.ARAUCARIA_DOOR.get().asItem(), ModBlocks.ARAUCARIA_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.FOGGY_OAK_PLANKS.get().asItem(), ModBlocks.FOGGY_OAK_LOG.get().asItem(), ModBlocks.FOGGY_OAK_WOOD.get().asItem(), ModBlocks.STRIPPED_FOGGY_OAK_LOG.get().asItem(), ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get().asItem(), ModBlocks.FOGGY_OAK_STAIRS.get().asItem(), ModBlocks.FOGGY_OAK_SLAB.get().asItem(), ModBlocks.FOGGY_OAK_BUTTON.get().asItem(), ModBlocks.FOGGY_OAK_PRESSURE_PLATE.get().asItem(), ModBlocks.FOGGY_OAK_FENCE.get().asItem(), ModBlocks.FOGGY_OAK_FENCE_GATE.get().asItem(), ModBlocks.FOGGY_OAK_DOOR.get().asItem(), ModBlocks.FOGGY_OAK_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.FOGGY_PINE_PLANKS.get().asItem(), ModBlocks.FOGGY_PINE_LOG.get().asItem(), ModBlocks.FOGGY_PINE_WOOD.get().asItem(), ModBlocks.STRIPPED_FOGGY_PINE_LOG.get().asItem(), ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get().asItem(), ModBlocks.FOGGY_PINE_STAIRS.get().asItem(), ModBlocks.FOGGY_PINE_SLAB.get().asItem(), ModBlocks.FOGGY_PINE_BUTTON.get().asItem(), ModBlocks.FOGGY_PINE_PRESSURE_PLATE.get().asItem(), ModBlocks.FOGGY_PINE_FENCE.get().asItem(), ModBlocks.FOGGY_PINE_FENCE_GATE.get().asItem(), ModBlocks.FOGGY_PINE_DOOR.get().asItem(), ModBlocks.FOGGY_PINE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.SNOWY_TREE_PLANKS.get().asItem(), ModBlocks.SNOWY_TREE_LOG.get().asItem(), ModBlocks.SNOWY_TREE_WOOD.get().asItem(), ModBlocks.STRIPPED_SNOWY_TREE_LOG.get().asItem(), ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get().asItem(), ModBlocks.SNOWY_TREE_STAIRS.get().asItem(), ModBlocks.SNOWY_TREE_SLAB.get().asItem(), ModBlocks.SNOWY_TREE_BUTTON.get().asItem(), ModBlocks.SNOWY_TREE_PRESSURE_PLATE.get().asItem(), ModBlocks.SNOWY_TREE_FENCE.get().asItem(), ModBlocks.SNOWY_TREE_FENCE_GATE.get().asItem(), ModBlocks.SNOWY_TREE_DOOR.get().asItem(), ModBlocks.SNOWY_TREE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.STONE_TREE_PLANKS.get().asItem(), ModBlocks.STONE_TREE_LOG.get().asItem(), ModBlocks.STONE_TREE_WOOD.get().asItem(), ModBlocks.STRIPPED_STONE_TREE_LOG.get().asItem(), ModBlocks.STRIPPED_STONE_TREE_WOOD.get().asItem(), ModBlocks.STONE_TREE_STAIRS.get().asItem(), ModBlocks.STONE_TREE_SLAB.get().asItem(), ModBlocks.STONE_TREE_BUTTON.get().asItem(), ModBlocks.STONE_TREE_PRESSURE_PLATE.get().asItem(), ModBlocks.STONE_TREE_FENCE.get().asItem(), ModBlocks.STONE_TREE_FENCE_GATE.get().asItem(), ModBlocks.STONE_TREE_DOOR.get().asItem(), ModBlocks.STONE_TREE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.RUBBER_TREE_PLANKS.get().asItem(), ModBlocks.RUBBER_TREE_LOG.get().asItem(), ModBlocks.RUBBER_TREE_WOOD.get().asItem(), ModBlocks.STRIPPED_RUBBER_TREE_LOG.get().asItem(), ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get().asItem(), ModBlocks.RUBBER_TREE_STAIRS.get().asItem(), ModBlocks.RUBBER_TREE_SLAB.get().asItem(), ModBlocks.RUBBER_TREE_BUTTON.get().asItem(), ModBlocks.RUBBER_TREE_PRESSURE_PLATE.get().asItem(), ModBlocks.RUBBER_TREE_FENCE.get().asItem(), ModBlocks.RUBBER_TREE_FENCE_GATE.get().asItem(), ModBlocks.RUBBER_TREE_DOOR.get().asItem(), ModBlocks.RUBBER_TREE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.TROPIC_TREE_PLANKS.get().asItem(), ModBlocks.TROPIC_TREE_LOG.get().asItem(), ModBlocks.TROPIC_TREE_WOOD.get().asItem(), ModBlocks.STRIPPED_TROPIC_TREE_LOG.get().asItem(), ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get().asItem(), ModBlocks.TROPIC_TREE_STAIRS.get().asItem(), ModBlocks.TROPIC_TREE_SLAB.get().asItem(), ModBlocks.TROPIC_TREE_BUTTON.get().asItem(), ModBlocks.TROPIC_TREE_PRESSURE_PLATE.get().asItem(), ModBlocks.TROPIC_TREE_FENCE.get().asItem(), ModBlocks.TROPIC_TREE_FENCE_GATE.get().asItem(), ModBlocks.TROPIC_TREE_DOOR.get().asItem(), ModBlocks.TROPIC_TREE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.PRICKLY_TREE_PLANKS.get().asItem(), ModBlocks.PRICKLY_TREE_LOG.get().asItem(), ModBlocks.PRICKLY_TREE_WOOD.get().asItem(), ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get().asItem(), ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get().asItem(), ModBlocks.PRICKLY_TREE_STAIRS.get().asItem(), ModBlocks.PRICKLY_TREE_SLAB.get().asItem(), ModBlocks.PRICKLY_TREE_BUTTON.get().asItem(), ModBlocks.PRICKLY_TREE_PRESSURE_PLATE.get().asItem(), ModBlocks.PRICKLY_TREE_FENCE.get().asItem(), ModBlocks.PRICKLY_TREE_FENCE_GATE.get().asItem(), ModBlocks.PRICKLY_TREE_DOOR.get().asItem(), ModBlocks.PRICKLY_TREE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.SWAMPY_POPLAR_PLANKS.get().asItem(), ModBlocks.SWAMPY_POPLAR_LOG.get().asItem(), ModBlocks.SWAMPY_POPLAR_WOOD.get().asItem(), ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get().asItem(), ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get().asItem(), ModBlocks.SWAMPY_POPLAR_STAIRS.get().asItem(), ModBlocks.SWAMPY_POPLAR_SLAB.get().asItem(), ModBlocks.SWAMPY_POPLAR_BUTTON.get().asItem(), ModBlocks.SWAMPY_POPLAR_PRESSURE_PLATE.get().asItem(), ModBlocks.SWAMPY_POPLAR_FENCE.get().asItem(), ModBlocks.SWAMPY_POPLAR_FENCE_GATE.get().asItem(), ModBlocks.SWAMPY_POPLAR_DOOR.get().asItem(), ModBlocks.SWAMPY_POPLAR_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.UMBRELLA_TREE_PLANKS.get().asItem(), ModBlocks.UMBRELLA_TREE_LOG.get().asItem(), ModBlocks.UMBRELLA_TREE_WOOD.get().asItem(), ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get().asItem(), ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get().asItem(), ModBlocks.UMBRELLA_TREE_STAIRS.get().asItem(), ModBlocks.UMBRELLA_TREE_SLAB.get().asItem(), ModBlocks.UMBRELLA_TREE_BUTTON.get().asItem(), ModBlocks.UMBRELLA_TREE_PRESSURE_PLATE.get().asItem(), ModBlocks.UMBRELLA_TREE_FENCE.get().asItem(), ModBlocks.UMBRELLA_TREE_FENCE_GATE.get().asItem(), ModBlocks.UMBRELLA_TREE_DOOR.get().asItem(), ModBlocks.UMBRELLA_TREE_TRAPDOOR.get().asItem(), consumer);
        woodTypeCrafting(ModBlocks.FOREST_DECEIVER_PLANKS.get().asItem(), ModBlocks.FOREST_DECEIVER_LOG.get().asItem(), ModBlocks.FOREST_DECEIVER_WOOD.get().asItem(), ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get().asItem(), ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get().asItem(), ModBlocks.FOREST_DECEIVER_STAIRS.get().asItem(), ModBlocks.FOREST_DECEIVER_SLAB.get().asItem(), ModBlocks.FOREST_DECEIVER_BUTTON.get().asItem(), ModBlocks.FOREST_DECEIVER_PRESSURE_PLATE.get().asItem(), ModBlocks.FOREST_DECEIVER_FENCE.get().asItem(), ModBlocks.FOREST_DECEIVER_FENCE_GATE.get().asItem(), ModBlocks.FOREST_DECEIVER_DOOR.get().asItem(), ModBlocks.FOREST_DECEIVER_TRAPDOOR.get().asItem(), consumer);

        // --------- / ORE BLOCKS / --------- //
        smallBlockCrafting(ModBlocks.SALT_BLOCK.get(), ModItems.SALT_FOOD.get(), consumer);
        fullBlockCrafting(ModBlocks.SULFUR_BLOCK.get(), ModItems.SULFUR.get(), consumer);
        fullBlockCrafting(ModBlocks.RAW_NIOBIUM_BLOCK.get(), ModItems.RAW_NIOBIUM.get(), consumer);
        fullBlockCrafting(ModBlocks.NIOBIUM_BLOCK.get(), ModItems.NIOBIUM_INGOT.get(), consumer);
        fullBlockCrafting(ModBlocks.BIO_SHALE_BLOCK.get(), ModItems.BIO_SHALE.get(), consumer);
        fullBlockCrafting(ModBlocks.SALTPETER_BLOCK.get(), ModItems.SALTPETER.get(), consumer);
        fullBlockCrafting(ModBlocks.CLEAN_FILTER_COAL_BLOCK.get(), ModItems.FILTER_COAL.get(), consumer);

        // --------- / MATERIALS / --------- //

        // --------- / TOOLS / --------- //

        // --------------- / SMELTING / --------------- //

        // --------- / ORES / --------- //
        oreCooking(consumer, List.of(ModBlocks.GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 200, "gold_ingot");
        oreCooking(consumer, List.of(ModBlocks.IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 200, "iron_ingot");
        oreCooking(consumer, List.of(ModBlocks.SALT_ORE.get()), RecipeCategory.MISC, ModItems.SALT_FOOD.get(), 0.25f, 200, "salt");
        oreCooking(consumer, List.of(ModBlocks.LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 200, "lapis_lazuli");
        oreCooking(consumer, List.of(ModBlocks.SULFUR_ORE.get()), RecipeCategory.MISC, ModItems.SULFUR.get(), 0.35f, 200, "sulfur");
        oreCooking(consumer, List.of(ModBlocks.NIOBIUM_ORE.get()), RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 0.8f, 200, "niobium_ingot");
        oreCooking(consumer, List.of(ModItems.RAW_NIOBIUM.get()), RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 0.8f, 200, "niobium_ingot");
        oreCooking(consumer, List.of(ModBlocks.BIO_SHALE_ORE.get()), RecipeCategory.MISC, ModItems.BIO_SHALE.get(), 1.0f, 200, "bio_shale");
        oreCooking(consumer, List.of(ModBlocks.SALTPETER_ORE.get()), RecipeCategory.MISC, ModItems.SALTPETER.get(), 0.2f, 200, "saltpeter");
        oreCooking(consumer, List.of(ModBlocks.FILTER_COAL_ORE.get()), RecipeCategory.MISC, ModItems.FILTER_COAL.get(), 1.2f, 200, "filter_coal");

        //oreCooking(consumer, SALT_SMELTABLES, RecipeCategory.MISC, ModItems.SALT_FOOD.get(), 0.25f, 200, "salt");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme / 2, pGroup, "_from_blasting");
    }

    protected static void smelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void blasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).
                    save(pFinishedRecipeConsumer, MistyWorld.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void woodTypeCrafting(Item planksItem, Item logItem, Item woodItem, Item strippedLogItem, Item strippedWoodItem, Item stairsItem, Item slabItem, Item buttonItem, Item pressurePlateItem, Item fenceItem, Item fenceGateItem, Item doorItem, Item trapdoorItem, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        smallBlockCraftingNoUncrafting(planksItem, logItem, pFinishedRecipeConsumer);
        smallBlockCraftingNoUncrafting(woodItem, logItem, pFinishedRecipeConsumer);
        //smallBlockCraftingNoUncrafting(planksItem, strippedLogItem, pFinishedRecipeConsumer);
        smallBlockCraftingNoUncrafting(strippedWoodItem, strippedLogItem, pFinishedRecipeConsumer);

        stairBuilder(stairsItem, Ingredient.of(planksItem));
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, slabItem, Ingredient.of(planksItem));
        buttonBuilder(buttonItem, Ingredient.of(planksItem));
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, pressurePlateItem, Ingredient.of(planksItem));
        fenceBuilder(fenceItem, Ingredient.of(planksItem));
        fenceGateBuilder(fenceGateItem, Ingredient.of(planksItem));
        doorBuilder(doorItem, Ingredient.of(planksItem));
        trapdoorBuilder(trapdoorItem, Ingredient.of(planksItem));
    }

    protected static void fullBlockCrafting(ItemLike result, Item craftingItem, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftingItem, 9)
                .requires(result)
                .unlockedBy(getHasName(result), has(result))
                .save(pFinishedRecipeConsumer);
    }

    protected static void smallBlockCrafting(ItemLike result, Item craftingItem, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("SS")
                .pattern("SS")
                .define('S', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftingItem, 4)
                .requires(result)
                .unlockedBy(getHasName(result), has(result))
                .save(pFinishedRecipeConsumer);
    }

    protected static void smallBlockCraftingNoUncrafting(ItemLike result, Item craftingItem, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("SS")
                .pattern("SS")
                .define('S', craftingItem)
                .unlockedBy(getHasName(craftingItem), has(craftingItem))
                .save(pFinishedRecipeConsumer);
    }
}
