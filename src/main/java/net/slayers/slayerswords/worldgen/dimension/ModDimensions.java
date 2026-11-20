package net.slayers.slayerswords.worldgen.dimension;


import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TimelineTags;
import net.minecraft.util.ARGB;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.attribute.*;
import net.minecraft.world.clock.WorldClock;
import net.minecraft.world.clock.WorldClocks;
import net.minecraft.world.level.CardinalLighting;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.slayers.slayerswords.SlayerSwords;

import java.util.List;
import java.util.Optional;


public class ModDimensions {
    public static final ResourceKey<LevelStem> SLAYERDIM_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "slayerdim"));
    public static final ResourceKey<Level>  SLAYER_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"slayerdim"));
    public static final  ResourceKey<DimensionType> SLAYER_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"slayerdim_type"));

    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        var timelines = context.lookup(Registries.TIMELINE);
        var clocks = context.lookup(Registries.WORLD_CLOCK);
        var blocks = context.lookup(Registries.BLOCK);

        context.register(SLAYER_DIM_TYPE, new DimensionType(
                false,
                false,
                false,
                false,
                1.0,
                0,
                256,
                256,
                blocks.getOrThrow(BlockTags.INFINIBURN_END),
                1.0f,
                new DimensionType.MonsterSettings(ConstantInt.of(0),0),
                DimensionType.Skybox.OVERWORLD,
                CardinalLighting.Type.DEFAULT,
                EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.FOG_COLOR, ARGB.vector3fFromRGB24(-6164153))
                        .set(EnvironmentAttributes.SKY_COLOR, ARGB.vector3fFromRGB24(OverworldBiomes.calculateSkyColor(2.8F)))
                        .set(EnvironmentAttributes.AMBIENT_LIGHT_COLOR, ARGB.vector3fFromRGB24(-4129186))
                        .set(EnvironmentAttributes.CLOUD_COLOR, ARGB.vector4fFromARGB32(ARGB.red(50)))
                        .set(EnvironmentAttributes.CLOUD_HEIGHT, 123F)
                        .set(EnvironmentAttributes.BACKGROUND_MUSIC, BackgroundMusic.OVERWORLD)
                        .set(EnvironmentAttributes.BED_RULE, BedRule.CAN_SLEEP_WHEN_DARK)
                        .set(EnvironmentAttributes.RESPAWN_ANCHOR_WORKS, false)
                        .set(EnvironmentAttributes.NETHER_PORTAL_SPAWNS_PIGLINS, true)
                        .set(EnvironmentAttributes.AMBIENT_SOUNDS, AmbientSounds.LEGACY_CAVE_SETTINGS)
                        .build(),
                timelines.getOrThrow(TimelineTags.IN_OVERWORLD),
                Optional.of(clocks.getOrThrow(WorldClocks.OVERWORLD))));
    }

    public static void bootstrapStem(BootstrapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(Biomes.CHERRY_GROVE)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0.0F,0.0F,0.0F,0.0F,0.0F,0.0F,0.0F), biomeRegistry.getOrThrow(Biomes.CHERRY_GROVE)),
                                Pair.of(Climate.parameters(0.1F,0.2F,0.0F,0.0F,0.0F,0.0F,0.0F), biomeRegistry.getOrThrow(Biomes.BIRCH_FOREST)),
                                Pair.of(Climate.parameters(0.3F,0.6F,0.1F,0.0F,0.0F,0.0F,0.0F), biomeRegistry.getOrThrow(Biomes.OCEAN)),
                                Pair.of(Climate.parameters(0.4F,0.3F,0.2F,0.0F,0.0F,0.0F,0.0F), biomeRegistry.getOrThrow(Biomes.DARK_FOREST))
                        ))),



                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));
        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.SLAYER_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(SLAYERDIM_KEY, stem);
    }
}
