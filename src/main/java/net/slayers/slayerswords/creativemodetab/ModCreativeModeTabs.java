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


                    }).build());


    public static final CreativeModeTab SLAYER_SWORDS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "slayer_swords"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModItems.BLACK_NICHIRIN))
                    .title(Component.translatable("creativemodetab.slayerswords.slayer_swords"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BLACK_NICHIRIN);


                    }).build());


    public static void registerModCreativeModeTabs() {
        SlayerSwords.LOGGER.info("Registering Creative Mode Tabs for " + SlayerSwords.MOD_ID);
    }
}
