package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.slayers.slayerswords.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RAW_SUNORE_BLOCK, ModBlocks.RAW_SCARLETORE_BLOCK, ModBlocks.METEORITE_ORE);


        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_SUNORE_BLOCK, ModBlocks.RAW_SCARLETORE_BLOCK, ModBlocks.METEORITE_ORE);


    }
}
