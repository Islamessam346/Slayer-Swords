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

        dropSelf(ModBlocks.BLOCK_OF_SUNORE);
        dropSelf(ModBlocks.SUNMETAL_BLOCK);
        dropSelf(ModBlocks.BLOCK_OF_SCARLETORE);
        dropSelf(ModBlocks.SCARLETMETAL_BLOCK);

        dropSelf(ModBlocks.WISTERIA_LOG);
        dropSelf(ModBlocks.WISTERIA_PLANKS);
        dropSelf(ModBlocks.WISTERIA_STAIRS);
        add(ModBlocks.WISTERIA_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BLUE_SPIDER_LILY);
        dropPottedContents(ModBlocks.POTTED_BLUE_SPIDER_LILY);
        dropSelf(ModBlocks.PEDESTAL_BLOCK);
        dropSelf(ModBlocks.DEMONIFIER_BLOCK);

        dropSelf(ModBlocks.SLAYER_PORTAL);
    }
}
