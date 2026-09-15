package net.slayers.slayerswords.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.slayers.slayerswords.SlayerSwords;

import java.util.function.Function;

public class ModItems {
    public static final Item SERPENT_NICHIRIN = registerItem( "serpent_nichirin", Item::new);
    public  static final Item SUN_ORE = registerItem("sun_ore", Item::new);




    private static Item registerItem(String name, Function<Item.Properties,Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name)))));
    }

    public static void registerModItems() {
        SlayerSwords.LOGGER.info("Registering Mod Items for " + SlayerSwords.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(SERPENT_NICHIRIN);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(SUN_ORE);
        });
    }
}
