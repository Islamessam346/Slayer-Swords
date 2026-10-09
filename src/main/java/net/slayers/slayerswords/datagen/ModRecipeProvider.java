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

                shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_SUNORE)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.SUN_ORE)
                        .unlockedBy(getHasName(ModItems.SUN_ORE), has(ModItems.SUN_ORE))
                        .group("sun ores")
                        .save(output);



                shaped(RecipeCategory.MISC, ModBlocks.SUNMETAL_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.SUN_INGOT)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .group("sun ingots")
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_SCARLETORE)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.SCARLET_ORE)
                        .unlockedBy(getHasName(ModItems.SCARLET_ORE), has(ModItems.SCARLET_ORE))
                        .group("scarlet ores")
                        .save(output);



                shaped(RecipeCategory.MISC,ModItems.NICHIRIN_HANDLE)
                        .pattern("   ")
                        .pattern(" R ")
                        .pattern(" R ")
                        .define('R', ModItems.SCARLET_INGOT)
                        .unlockedBy(getHasName(ModItems.SCARLET_INGOT), has(ModItems.SCARLET_INGOT))
                        .group("nichirin handle")
                        .save(output);




                shaped(RecipeCategory.MISC, ModItems.BLACK_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.VORTEX_EMBER)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.VORTEX_EMBER), has(ModItems.VORTEX_EMBER))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("black nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.SERPENT_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.SERPENT_SCALES)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.SERPENT_SCALES), has(ModItems.SERPENT_SCALES))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("serpent nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.WATER_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.MARINE_STONE)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.MARINE_STONE), has(ModItems.MARINE_STONE))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("water nichirin")
                        .save(output);


                shaped(RecipeCategory.MISC, ModItems.MOON_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.UPPER_MOON_1_FLESH)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.UPPER_MOON_1_FLESH), has(ModItems.UPPER_MOON_1_FLESH))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("moon nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.FLOWER_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.RADIANT_PEONY_BLOSSOM)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.RADIANT_PEONY_BLOSSOM), has(ModItems.RADIANT_PEONY_BLOSSOM))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("flower nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.FLAME_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.VORTEX_EMBER)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.VORTEX_EMBER), has(ModItems.VORTEX_EMBER))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("flame nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.BEAST_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.BEAST_FANG)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.BEAST_FANG), has(ModItems.BEAST_FANG))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("beast nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.TOXIC_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.WISTERIA_FLOWER)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.WISTERIA_FLOWER), has(ModItems.WISTERIA_FLOWER))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("toxic nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.BLACK_THUNDER_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.LIGHTNING_WYVERN_FANG)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.LIGHTNING_WYVERN_FANG), has(ModItems.LIGHTNING_WYVERN_FANG))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("black thunder nichirin")
                        .save(output);


                shaped(RecipeCategory.MISC, ModBlocks.SCARLETMETAL_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.SCARLET_INGOT)
                        .unlockedBy(getHasName(ModItems.SCARLET_INGOT), has(ModItems.SCARLET_INGOT))
                        .group("scarlet ingots")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.LIGHTNING_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.METEORITE_CRYSTALS)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.METEORITE_CRYSTALS), has(ModItems.METEORITE_CRYSTALS))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("lightning nichirin")
                        .save(output);


                shaped(RecipeCategory.MISC, ModItems.MIST_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.MIST_CORE)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.MIST_CORE), has(ModItems.MIST_CORE))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("mist nichirin")
                        .save(output);
                shaped(RecipeCategory.MISC, ModItems.LOVE_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.LOVE_CRYSTAL)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.LOVE_CRYSTAL), has(ModItems.LOVE_CRYSTAL))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("mist nichirin")
                        .save(output);
                shaped(RecipeCategory.MISC, ModItems.SOUND_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.FLASHY_CORE)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.FLASHY_CORE), has(ModItems.FLASHY_CORE))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("sound nichirin")
                        .save(output);




                shapeless(RecipeCategory.MISC, ModItems.SHINY_METEORITE_DEBRIS, 9)
                        .requires(ModBlocks.METEORITE_ORE)
                        .unlockedBy(getHasName(ModBlocks.METEORITE_ORE), has(ModBlocks.METEORITE_ORE))
                        .group("meteorite")
                        .save(output);




                shapeless(RecipeCategory.MISC, ModItems.SUN_ORE, 9)
                        .requires(ModBlocks.BLOCK_OF_SUNORE)
                        .unlockedBy(getHasName(ModBlocks.BLOCK_OF_SUNORE), has(ModBlocks.BLOCK_OF_SUNORE))
                        .group("sun ores")
                        .save(output);




                shapeless(RecipeCategory.MISC, ModItems.SUN_INGOT, 9)
                        .requires(ModBlocks.SUNMETAL_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.SUNMETAL_BLOCK), has(ModBlocks.SUNMETAL_BLOCK))
                        .group("sun ingots")
                        .save(output);





                shapeless(RecipeCategory.MISC, ModItems.SCARLET_ORE, 9)
                        .requires(ModBlocks.BLOCK_OF_SCARLETORE)
                        .unlockedBy(getHasName(ModBlocks.BLOCK_OF_SCARLETORE), has(ModBlocks.BLOCK_OF_SCARLETORE))
                        .group("scarlet ores")
                        .save(output);







                shapeless(RecipeCategory.MISC, ModItems.SCARLET_INGOT, 9)
                        .requires(ModBlocks.SCARLETMETAL_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.SCARLETMETAL_BLOCK), has(ModBlocks.SCARLETMETAL_BLOCK))
                        .group("scarlet ingots")
                        .save(output);
















            }
        };
    }

    @Override
    public String getName() {
        return "SlayerSwords Recipes";
    }
}
