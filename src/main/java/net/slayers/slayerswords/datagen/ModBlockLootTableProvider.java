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

    }
}
