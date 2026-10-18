package net.slayers.slayerswords.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.CompositeFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SUN_ORE_KEY = registerKey("overworld_sun_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DRY_MAGMA_KEY = registerKey("nether_dry_magma");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_VOLCANIC_CLUSTER_KEY = registerKey("nether_volcanic_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SHINY_METEORITE_DEBRIS_KEY = registerKey("end_shiny_meteorite_debris");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_SPIDER_LILY_KEY = registerKey("blue_spider_lily");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        register(context, OVERWORLD_SUN_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(stoneReplaceables, ModBlocks.RAW_SUNORE_BLOCK.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.RAW_SUNORE_BLOCK.defaultBlockState())
                ),
                9)
        );

        register(context, NETHER_DRY_MAGMA_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                ModBlocks.DRY_MAGMA.defaultBlockState(), 10));
        register(context, NETHER_VOLCANIC_CLUSTER_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                ModBlocks.VOLCANIC_CLUSTER.defaultBlockState(), 10));
        register(context, END_SHINY_METEORITE_DEBRIS_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.METEORITE_ORE.defaultBlockState(), 5));

        register(context, BLUE_SPIDER_LILY_KEY, Feature.SIMPLE_RANDOM_SELECTOR,
                new CompositeFeatureConfiguration(
                        HolderSet.direct(PlacementUtils.inlinePlaced(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_SPIDER_LILY))))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
