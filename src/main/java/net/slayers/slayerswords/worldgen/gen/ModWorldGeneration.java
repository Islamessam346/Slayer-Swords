package net.slayers.slayerswords.worldgen.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.slayers.slayerswords.worldgen.ModPlacedFeatures;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.CHERRY_GROVE),
                GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_SPIDER_LILY_PLACED_KEY);
    }
}
