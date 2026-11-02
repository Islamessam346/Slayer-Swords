package net.slayers.slayerswords;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.resources.Identifier;

import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.block.entity.ModBlockEntities;
import net.slayers.slayerswords.creativemodetab.ModCreativeModeTabs;
import net.slayers.slayerswords.effect.ExplosionShield;
import net.slayers.slayerswords.effect.ModEffects;
import net.slayers.slayerswords.entity.ModEntities;
import net.slayers.slayerswords.entity.custom.WildBoarEntity;
import net.slayers.slayerswords.item.ModItems;
import net.slayers.slayerswords.sound.ModSounds;
import net.slayers.slayerswords.tooltips.ModTooltips;
import net.slayers.slayerswords.worldgen.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Important comment
public class SlayerSwords implements ModInitializer {
	public static final String MOD_ID = "slayerswords";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.register();

		ModItems.register();
		ModBlocks.register();
		ModTooltips.register();

		ModSounds.register();

		ModBlockEntities.registerBlockEntities();

		ExplosionShield.register();
		ModEffects.register();

		ModWorldGeneration.generateModWorldGen();

		ModEntities.register();

		SpawnPlacements.register(ModEntities.WILD_BOAR, SpawnPlacementTypes.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

		FabricDefaultAttributeRegistry.register(ModEntities.WILD_BOAR, WildBoarEntity.createAttributes());
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
