package net.slayers.slayerswords.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.block.ModBlocks;

import java.util.List;

public class ModFeatures {
    public static final ResourceKey<Feature> OVERWORLD_SUN_ORE_KEY = registerKey("overworld_sun_ore");
    public static final ResourceKey<Feature> NETHER_DRY_MAGMA_KEY = registerKey("nether_dry_magma");
    public static final ResourceKey<Feature> NETHER_VOLCANIC_CLUSTER_KEY = registerKey("nether_volcanic_cluster");
    public static final ResourceKey<Feature> END_SHINY_METEORITE_DEBRIS_KEY = registerKey("end_shiny_meteorite_debris");

    public static final ResourceKey<Feature> BLUE_SPIDER_LILY_KEY = registerKey("blue_spider_lily");

    public static void bootstrap(BootstrapContext<Feature> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        context.register(OVERWORLD_SUN_ORE_KEY, new OreFeature(
                List.of(
                        BlockReplacement.replace(stoneReplaceables, ModBlocks.RAW_SUNORE_BLOCK.defaultBlockState()),
                        BlockReplacement.replace(deepslateReplaceables, ModBlocks.RAW_SUNORE_BLOCK.defaultBlockState())
                ),
                9)
        );

        context.register(NETHER_DRY_MAGMA_KEY, new OreFeature(netherReplaceables,
                ModBlocks.DRY_MAGMA.defaultBlockState(), 10));
        context.register(NETHER_VOLCANIC_CLUSTER_KEY, new OreFeature(netherReplaceables,
                ModBlocks.VOLCANIC_CLUSTER.defaultBlockState(), 10));
        context.register(END_SHINY_METEORITE_DEBRIS_KEY, new OreFeature(endReplaceables,
                ModBlocks.METEORITE_ORE.defaultBlockState(), 5));

        context.register(BLUE_SPIDER_LILY_KEY, new SimpleRandomSelectorFeature(
                        HolderSet.direct(PlacementUtils.inlinePlaced(new SimpleBlockFeature(
                                BlockStateProvider.of(ModBlocks.BLUE_SPIDER_LILY))))));
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
    }
}
