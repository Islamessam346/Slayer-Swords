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
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.RAW_SUNORE_BLOCK),
                        ModBlocks.getRK(ModBlocks.RAW_SCARLETORE_BLOCK),
                        ModBlocks.getRK(ModBlocks.METEORITE_ORE),
                        ModBlocks.getRK(ModBlocks.BLOCK_OF_SUNORE),
                        ModBlocks.getRK(ModBlocks.SUNMETAL_BLOCK),
                        ModBlocks.getRK(ModBlocks.BLOCK_OF_SCARLETORE),
                        ModBlocks.getRK(ModBlocks.SCARLETMETAL_BLOCK),
                        ModBlocks.getRK(ModBlocks.VOLCANIC_CLUSTER),
                        ModBlocks.getRK(ModBlocks.DRY_MAGMA),
                        ModBlocks.getRK(ModBlocks.PEDESTAL_BLOCK)
                );


        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.getRK(ModBlocks.WISTERIA_BUSH));

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getRK(ModBlocks.WISTERIA_LOG),
                        ModBlocks.getRK(ModBlocks.WISTERIA_PLANKS)
                        );


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.RAW_SUNORE_BLOCK),
                        ModBlocks.getRK(ModBlocks.RAW_SCARLETORE_BLOCK),
                        ModBlocks.getRK(ModBlocks.METEORITE_ORE),
                        ModBlocks.getRK(ModBlocks.BLOCK_OF_SUNORE),
                        ModBlocks.getRK(ModBlocks.SUNMETAL_BLOCK),
                        ModBlocks.getRK(ModBlocks.BLOCK_OF_SCARLETORE),
                        ModBlocks.getRK(ModBlocks.SCARLETMETAL_BLOCK),
                        ModBlocks.getRK(ModBlocks.DRY_MAGMA));

        tag(ModTags.Blocks.NEEDS_DEMON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.VOLCANIC_CLUSTER));

        tag(ModTags.Blocks.INCORRECT_FOR_DEMON_TOOL);

        for (TagKey<Block> incorrectTag : List.of(
                BlockTags.INCORRECT_FOR_WOODEN_TOOL,
                BlockTags.INCORRECT_FOR_STONE_TOOL,
                BlockTags.INCORRECT_FOR_GOLD_TOOL,
                BlockTags.INCORRECT_FOR_COPPER_TOOL,
                BlockTags.INCORRECT_FOR_IRON_TOOL,
                BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                BlockTags.INCORRECT_FOR_NETHERITE_TOOL
        )) {
            tag(incorrectTag).addTag(ModTags.Blocks.NEEDS_DEMON_TOOL);
        }

        tag(BlockTags.SMALL_FLOWERS).add(ModBlocks.getRK(ModBlocks.BLUE_SPIDER_LILY));
        tag(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.getRK(ModBlocks.BLUE_SPIDER_LILY));
    }
}
