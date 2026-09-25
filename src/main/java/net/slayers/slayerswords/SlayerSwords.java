package net.slayers.slayerswords;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.slayers.slayerswords.creativemodetab.ModCreativeModeTabs;
import net.slayers.slayerswords.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Important comment
public class SlayerSwords implements ModInitializer {
	public static final String MOD_ID = "slayerswords";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();

	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
