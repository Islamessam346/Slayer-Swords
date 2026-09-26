package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> SUN_INGOT_SMELTABLES =  List.of(ModItems.SUN_ORE, ModBlocks.RAW_SUNORE_BLOCK);
                List<ItemLike> SCARLET_INGOT_SMELTABLES = List.of(ModItems.SCARLET_ORE, ModBlocks.RAW_SCARLETORE_BLOCK);
                List<ItemLike> METEORITE_CRYSTALS_SMELTABLES = List.of(ModItems.SHINY_METEORITE_DEBRIS, ModBlocks.METEORITE_ORE);




                oreSmelting(SUN_INGOT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SUN_INGOT, 0.25f, 200, "sun"  );
                oreBlasting(SUN_INGOT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SUN_INGOT, 0.25f, 100, "sun"  );
                oreSmelting(SCARLET_INGOT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SCARLET_INGOT, 0.25f, 200, "sun"  );
                oreBlasting(SCARLET_INGOT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SCARLET_INGOT, 0.25f, 100, "sun"  );
                oreSmelting(METEORITE_CRYSTALS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.METEORITE_CRYSTALS, 0.25f, 200, "sun"  );
                oreBlasting(METEORITE_CRYSTALS_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.METEORITE_CRYSTALS, 0.25f, 100, "sun"  );


                shaped(RecipeCategory.MISC, ModBlocks.METEORITE_ORE)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.SHINY_METEORITE_DEBRIS)
                        .unlockedBy(getHasName(ModItems.SHINY_METEORITE_DEBRIS), has(ModItems.SHINY_METEORITE_DEBRIS))
                        .group("meteorite")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SHINY_METEORITE_DEBRIS, 9)
                        .requires(ModBlocks.METEORITE_ORE)
                        .unlockedBy(getHasName(ModBlocks.METEORITE_ORE), has(ModBlocks.METEORITE_ORE))
                        .group("meteorite")
                        .save(output);
























            }
        };
    }

    @Override
    public String getName() {
        return "SlayerSwords Recipes";
    }
}
