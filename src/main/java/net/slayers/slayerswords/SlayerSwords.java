package net.slayers.slayerswords;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.creativemodetab.ModCreativeModeTabs;
import net.slayers.slayerswords.effect.ExplosionShield;
import net.slayers.slayerswords.item.ModItems;
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

		ExplosionShield.register();

		ModWorldGeneration.generateModWorldGen();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
