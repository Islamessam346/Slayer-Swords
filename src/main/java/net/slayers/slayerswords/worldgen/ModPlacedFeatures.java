package net.slayers.slayerswords.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.slayers.slayerswords.SlayerSwords;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> OVERWORLD_SUN_ORE_PLACED_KEY = registerKey("overworld_sun_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_DRY_MAGMA_PLACED_KEY = registerKey("nether_dry_magma_placed");
    public static final ResourceKey<PlacedFeature> NETHER_VOLCANIC_CLUSTER_PLACED_KEY = registerKey("nether_volcanic_cluster_placed");
    public static final ResourceKey<PlacedFeature> END_SHINY_METEORITE_DEBRIS_PLACED_KEY = registerKey("end_shiny_meteorite_debris_placed");

    public static final ResourceKey<PlacedFeature> BLUE_SPIDER_LILY_PLACED_KEY = registerKey("blue_spider_lily_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVERWORLD_SUN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SUN_ORE_KEY),
                OrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(20), VerticalAnchor.absolute(320))));

        register(context, NETHER_DRY_MAGMA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_DRY_MAGMA_KEY),
                OrePlacements.commonOrePlacement(5,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(10), VerticalAnchor.absolute(60))));

        register(context, NETHER_VOLCANIC_CLUSTER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_VOLCANIC_CLUSTER_KEY),
                OrePlacements.commonOrePlacement(5,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(68), VerticalAnchor.absolute(120))));

        register(context, END_SHINY_METEORITE_DEBRIS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SHINY_METEORITE_DEBRIS_KEY),
                OrePlacements.commonOrePlacement(25,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70))));

        register(context, BLUE_SPIDER_LILY_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_SPIDER_LILY_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(128),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                        BiomeFilter.biome(),
                        CountPlacement.of(12),
                        RandomOffsetPlacement.ofTriangle(4, 2),
                        BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)
                )
        );
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
