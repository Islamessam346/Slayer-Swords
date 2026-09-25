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

                oreSmelting(SUN_INGOT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SUN_INGOT, 0.25f, 200, "sun"  );
                oreBlasting(SUN_INGOT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SUN_INGOT, 0.25f, 100, "sun"  );




















            }
        };
    }

    @Override
    public String getName() {
        return "SlayerSwords Recipes";
    }
}
