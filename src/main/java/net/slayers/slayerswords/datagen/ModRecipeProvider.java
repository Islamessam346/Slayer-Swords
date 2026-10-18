package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
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

                shaped(RecipeCategory.MISC,ModItems.WIND_NICHIRIN)
                        .pattern(" R ")
                        .pattern("ARA")
                        .pattern(" H ")
                        .define('R', ModItems.SUN_INGOT)
                        .define('A', ModItems.WIND_CORE)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.WIND_CORE), has(ModItems.WIND_CORE))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("wind nihcirin")
                        .save(output);


                shaped(RecipeCategory.MISC, ModItems.BASIC_NICHIRIN)
                        .pattern(" S ")
                        .pattern(" S ")
                        .pattern(" H ")
                        .define('S', ModItems.SUN_INGOT)
                        .define('H', ModItems.NICHIRIN_HANDLE)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .unlockedBy(getHasName(ModItems.NICHIRIN_HANDLE), has(ModItems.NICHIRIN_HANDLE))
                        .group("basic nichirin")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.CRAFTING_TABLE)
                        .pattern("   ")
                        .pattern("RR ")
                        .pattern("RR ")
                                .define('R', ModBlocks.WISTERIA_PLANKS)
                                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                                                .group("crafting table")
                                                        .save(output);

                shaped(RecipeCategory.MISC, Items.OAK_BUTTON)
                        .pattern("   ")
                        .pattern(" R ")
                        .pattern("   ")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("button")
                        .save(output);

                shaped(RecipeCategory.MISC, Items.OAK_BOAT)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("boat")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.CHEST)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("chest")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.OAK_SIGN)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern(" S ")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("sign")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BOOKSHELF)
                        .pattern("RRR")
                        .pattern("BBB")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('B', Items.BOOK)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                        .group("bookshelf")
                        .save(output);

                shaped(RecipeCategory.MISC, Items.SHIELD)
                        .pattern("RIR")
                        .pattern("RRR")
                        .pattern(" R ")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .group("shield")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.OAK_PRESSURE_PLATE)
                        .pattern("RR ")
                        .pattern("   ")
                        .pattern("   ")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("pressure plate")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.white())
                        .pattern("   ")
                        .pattern("WWW")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('W', Blocks.WOOL.white())
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.white()), has(Blocks.WOOL.white()))
                        .group("white bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.black())
                        .pattern("   ")
                        .pattern("BBB")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('B', Blocks.WOOL.black())
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.black()), has(Blocks.WOOL.black()))
                        .group("black bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.blue())
                        .pattern("   ")
                        .pattern("BBB")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('B', Blocks.WOOL.blue())
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.blue()), has(Blocks.WOOL.blue()))
                        .group("blue bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.brown())
                        .pattern("   ")
                        .pattern("BBB")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('B', Blocks.WOOL.brown())
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.brown()), has(Blocks.WOOL.brown()))
                        .group("brown bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.cyan())
                        .pattern("   ")
                        .pattern("CCC")
                        .pattern("RRR")
                        .define('C', Blocks.WOOL.cyan())
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.cyan()), has(Blocks.WOOL.cyan()))
                        .group("cyan bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.gray())
                        .pattern("   ")
                        .pattern("GGG")
                        .pattern("RRR")
                        .define('G', Blocks.WOOL.gray())
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.gray()), has(Blocks.WOOL.gray()))
                        .group("gray bed")
                                .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.green())
                        .pattern("   ")
                        .pattern("GGG")
                        .pattern("RRR")
                        .define('G', Blocks.WOOL.green())
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.green()), has(Blocks.WOOL.green()))
                        .group("green bed")
                                .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.lightBlue())
                        .pattern("   ")
                        .pattern("LLL")
                        .pattern("RRR")
                        .define('L', Blocks.WOOL.lightBlue())
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(Blocks.WOOL.lightBlue()), has(Blocks.WOOL.lightBlue()))
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("light blue bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.lightGray())
                        .pattern("   ")
                        .pattern("LLL")
                        .pattern("RRR")
                        .define('L', Blocks.WOOL.lightGray())
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(Blocks.BED.lightGray()), has(Blocks.BED.lightGray()))
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("light gray bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.lime())
                        .pattern("   ")
                        .pattern("LLL")
                        .pattern("RRR")
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .define('L', Blocks.BED.lime())
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .unlockedBy(getHasName(Blocks.WOOL.lime()), has(Blocks.WOOL.lime()))
                        .group("lime bed")
                        .save(output);

                shaped(RecipeCategory.MISC, Blocks.BED.magenta())
                        .pattern("   ")
                        .pattern("MMM")
                        .pattern("RRR")
                        .define('M', Blocks.WOOL.magenta())
                        .define('R', ModBlocks.WISTERIA_PLANKS)
                        .unlockedBy(getHasName(Blocks.WOOL.magenta()), has(Blocks.WOOL.magenta()))
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_PLANKS), has(ModBlocks.WISTERIA_PLANKS))
                        .group("magenta bed")
                        .save(output);

                





                shaped(RecipeCategory.COMBAT, ModItems.SUN_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .define('R', ModItems.SUN_INGOT)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .group("sun armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SOUND_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .define('R', ModItems.FLASHY_CORE)
                        .unlockedBy(getHasName(ModItems.FLASHY_CORE), has(ModItems.FLASHY_CORE))
                        .group("sound armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WIND_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .define('R', ModItems.WIND_CORE)
                        .unlockedBy(getHasName(ModItems.WIND_CORE), has(ModItems.WIND_CORE))
                        .group("wind armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WATER_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .define('R', ModItems.MARINE_STONE)
                        .unlockedBy(getHasName(ModItems.MARINE_STONE), has(ModItems.MARINE_STONE))
                        .group("water armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.MIST_HELMET)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("   ")
                        .define('R', ModItems.MIST_CORE)
                        .unlockedBy(getHasName(ModItems.MIST_CORE), has(ModItems.MIST_CORE))
                        .group("mist armor")
                        .save(output);



                shaped(RecipeCategory.COMBAT, ModItems.SUN_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.SUN_INGOT)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .group("sun armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WIND_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.WIND_CORE)
                        .unlockedBy(getHasName(ModItems.WIND_CORE), has(ModItems.WIND_CORE))
                        .group("wind armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SOUND_CHESPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.FLASHY_CORE)
                        .unlockedBy(getHasName(ModItems.FLASHY_CORE), has(ModItems.FLASHY_CORE))
                        .group("sound armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WATER_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.MARINE_STONE)
                        .unlockedBy(getHasName(ModItems.MARINE_STONE), has(ModItems.MARINE_STONE))
                        .group("water armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.MIST_CHESTPLATE)
                        .pattern("R R")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.MIST_CORE)
                        .unlockedBy(getHasName(ModItems.MIST_CORE), has(ModItems.MIST_CORE))
                        .group("mist armor")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.SUN_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.SUN_INGOT)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .group("sun armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SOUND_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.FLASHY_CORE)
                        .unlockedBy(getHasName(ModItems.FLASHY_CORE), has(ModItems.FLASHY_CORE))
                        .group("sound armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WIND_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.WIND_CORE)
                        .unlockedBy(getHasName(ModItems.WIND_CORE), has(ModItems.WIND_CORE))
                        .group("wind armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WATER_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.MARINE_STONE)
                        .unlockedBy(getHasName(ModItems.MARINE_STONE), has(ModItems.MARINE_STONE))
                        .group("water armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT,ModItems.MIST_LEGGINGS)
                        .pattern("RRR")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.MIST_CORE)
                        .unlockedBy(getHasName(ModItems.MIST_CORE), has(ModItems.MIST_CORE))
                        .group("mist armor")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.SUN_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.SUN_INGOT)
                        .unlockedBy(getHasName(ModItems.SUN_INGOT), has(ModItems.SUN_INGOT))
                        .group("sun armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.SOUND_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.FLASHY_CORE)
                        .unlockedBy(getHasName(ModItems.FLASHY_CORE), has(ModItems.FLASHY_CORE))
                        .group("sound armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WIND_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.WIND_CORE)
                        .unlockedBy(getHasName(ModItems.WIND_CORE), has(ModItems.WIND_CORE))
                        .group("wind armor")
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.WATER_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.MARINE_STONE)
                        .unlockedBy(getHasName(ModItems.MARINE_STONE), has(ModItems.MARINE_STONE))
                        .group("water armor")
                        .save(output);


                shaped(RecipeCategory.COMBAT, ModItems.MIST_BOOTS)
                        .pattern("   ")
                        .pattern("R R")
                        .pattern("R R")
                        .define('R', ModItems.MIST_CORE)
                        .unlockedBy(getHasName(ModItems.MIST_CORE), has(ModItems.MIST_CORE))
                        .group("mist armor")
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


                shapeless(RecipeCategory.MISC, ModBlocks.WISTERIA_PLANKS, 4)
                        .requires(ModBlocks.WISTERIA_LOG)
                        .unlockedBy(getHasName(ModBlocks.WISTERIA_LOG), has(ModBlocks.WISTERIA_LOG))
                        .group("wisteria planks")
                        .save(output);
















            }
        };
    }

    @Override
    public String getName() {
        return "SlayerSwords Recipes";
    }
}
