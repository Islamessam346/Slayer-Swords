package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.tags.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RAW_SUNORE_BLOCK,
                        ModBlocks.RAW_SCARLETORE_BLOCK,
                        ModBlocks.METEORITE_ORE,
                        ModBlocks.BLOCK_OF_SUNORE,
                        ModBlocks.SUNMETAL_BLOCK,
                        ModBlocks.BLOCK_OF_SCARLETORE,
                        ModBlocks.SCARLETMETAL_BLOCK,
                        ModBlocks.VOLCANIC_CLUSTER,
                        ModBlocks.DRY_MAGMA);


        valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.WISTERIA_BUSH);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.WISTERIA_LOG,
                        ModBlocks.WISTERIA_PLANKS
                        );



        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_SUNORE_BLOCK,
                        ModBlocks.RAW_SCARLETORE_BLOCK,
                        ModBlocks.METEORITE_ORE,
                        ModBlocks.BLOCK_OF_SUNORE,
                        ModBlocks.SUNMETAL_BLOCK,
                        ModBlocks.BLOCK_OF_SCARLETORE,
                        ModBlocks.SCARLETMETAL_BLOCK,
                        ModBlocks.DRY_MAGMA);

        valueLookupBuilder(ModTags.Blocks.NEEDS_DEMON_TOOL)
                .add(ModBlocks.VOLCANIC_CLUSTER);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_DEMON_TOOL);

        for (TagKey<Block> incorrectTag : List.of(
                BlockTags.INCORRECT_FOR_WOODEN_TOOL,
                BlockTags.INCORRECT_FOR_STONE_TOOL,
                BlockTags.INCORRECT_FOR_GOLD_TOOL,
                BlockTags.INCORRECT_FOR_COPPER_TOOL,
                BlockTags.INCORRECT_FOR_IRON_TOOL,
                BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                BlockTags.INCORRECT_FOR_NETHERITE_TOOL
        )) {
            valueLookupBuilder(incorrectTag).addTag(ModTags.Blocks.NEEDS_DEMON_TOOL);
        }
    }
}
