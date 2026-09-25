package net.slayers.slayerswords.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab SLAYERSWORDS_MOD_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "slayerswords_mod"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModItems.VORTEX_EMBER))
                    .title(Component.translatable("creativemodetab.slayerswords.slayerswords_mod"))
                    .displayItems((parameters, output) -> {
                      output.accept(ModItems.BLACK_NICHIRIN);
                      output.accept(ModItems.LIGHTNING_NICHIRIN);
                      output.accept(ModItems.LIGHTNING_WYVERN_FANG);
                      output.accept(ModItems.BLACK_THUNDER_NICHIRIN);
                      output.accept(ModItems.VORTEX_EMBER);
                      output.accept(ModItems.TOXIC_NICHIRIN);
                      output.accept(ModItems.NICHIRIN_HANDLE);
                      output.accept(ModItems.SCARLET_INGOT);
                      output.accept(ModItems.SCARLET_ORE);
                      output.accept(ModItems.SUN_ORE);
                      output.accept(ModItems.SUN_INGOT);
                      output.accept(ModItems.BEAST_FANG);
                      output.accept(ModItems.BEAST_NICHIRIN);
                      output.accept(ModItems.FLAME_NICHIRIN);
                      output.accept(ModItems.FLOWER_NICHIRIN);
                      output.accept(ModItems.MARINE_STONE);
                      output.accept(ModItems.METEORITE_CRYSTALS);
                      output.accept(ModItems.MOON_NICHIRIN);
                      output.accept(ModItems.RADIANT_PEONY_BLOSSOM);
                      output.accept(ModItems.SERPENT_NICHIRIN);
                      output.accept(ModItems.SERPENT_SCALES);
                      output.accept(ModItems.SHINY_METEORITE_DEBRIS);
                      output.accept(ModItems.UPPER_MOON_1_FLESH);
                      output.accept(ModItems.VOLCANIC_STONE);
                      output.accept(ModItems.WATER_NICHIRIN);
                      output.accept(ModItems.WISTERIA_FLOWER);


                    }).build());


    public static final CreativeModeTab SLAYER_SWORDS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "slayer_swords"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModItems.BLACK_NICHIRIN))
                    .title(Component.translatable("creativemodetab.slayerswords.slayer_swords"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BLACK_NICHIRIN);
                        output.accept(ModItems.SERPENT_NICHIRIN);
                        output.accept(ModItems.WATER_NICHIRIN);
                        output.accept(ModItems.MOON_NICHIRIN);
                        output.accept(ModItems.FLOWER_NICHIRIN);
                        output.accept(ModItems.FLAME_NICHIRIN);
                        output.accept(ModItems.BEAST_NICHIRIN);
                        output.accept(ModItems.TOXIC_NICHIRIN);
                        output.accept(ModItems.BLACK_THUNDER_NICHIRIN);
                        output.accept(ModItems.LIGHTNING_NICHIRIN);


                    }).build());

    public static final CreativeModeTab SLAYERSWORDS_MATERIALITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "slayerswords_materialitems"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModItems.VOLCANIC_STONE))
                    .title(Component.translatable("creativemodetab.slayerswords.slayerswords_materialitems"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.VOLCANIC_STONE);


                    }).build());


    public static void registerModCreativeModeTabs() {
        SlayerSwords.LOGGER.info("Registering Creative Mode Tabs for " + SlayerSwords.MOD_ID);
    }
}
