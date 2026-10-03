package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        add(ModBlocks.RAW_SUNORE_BLOCK, createOreDrop(ModBlocks.RAW_SUNORE_BLOCK, ModItems.SUN_ORE));
        add(ModBlocks.RAW_SCARLETORE_BLOCK, createOreDrop(ModBlocks.RAW_SCARLETORE_BLOCK, ModItems.SCARLET_ORE));
        add(ModBlocks.METEORITE_ORE, createOreDrop(ModBlocks.METEORITE_ORE, ModItems.SHINY_METEORITE_DEBRIS));
        add(ModBlocks.WISTERIA_BUSH, createOreDrop(ModBlocks.WISTERIA_BUSH, ModItems.WISTERIA_FLOWER));
        add(ModBlocks.VOLCANIC_CLUSTER, createOreDrop(ModBlocks.VOLCANIC_CLUSTER, ModItems.VOLCANIC_STONE));
        add(ModBlocks.DRY_MAGMA, createOreDrop(ModBlocks.DRY_MAGMA, ModItems.VORTEX_EMBER));



        add(ModBlocks.BLOCK_OF_SUNORE, createOreDrop(ModBlocks.BLOCK_OF_SUNORE, ModBlocks.BLOCK_OF_SUNORE.asItem()));
        add(ModBlocks.SUNMETAL_BLOCK, createOreDrop(ModBlocks.SUNMETAL_BLOCK, ModBlocks.SUNMETAL_BLOCK.asItem()));
        add(ModBlocks.BLOCK_OF_SCARLETORE, createOreDrop(ModBlocks.BLOCK_OF_SCARLETORE, ModBlocks.BLOCK_OF_SCARLETORE.asItem()));
        add(ModBlocks.SCARLETMETAL_BLOCK, createOreDrop(ModBlocks.SCARLETMETAL_BLOCK, ModBlocks.SCARLETMETAL_BLOCK.asItem()));

    }
}
