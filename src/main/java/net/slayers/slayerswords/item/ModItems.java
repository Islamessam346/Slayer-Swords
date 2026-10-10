package net.slayers.slayerswords.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.effect.EffectOnHitItem;
import net.slayers.slayerswords.food.ModFoods;

import java.util.List;
import java.util.function.Function;

public class ModItems {
    public  static final Item SUN_ORE = registerItem("sun_ore", Item::new);
    public  static final Item SERPENT_SCALES = registerItem("serpent_scales", Item::new);
    public  static final Item SUN_INGOT = registerItem("sun_ingot", Item::new);
    public  static final Item SCARLET_INGOT = registerItem("scarlet_ingot", Item::new);
    public  static final Item SCARLET_ORE = registerItem("scarlet_ore", Item::new);
    public static final Item WISTERIA_FLOWER = registerItem("wisteria_flower", Item::new);
    public static final Item VOLCANIC_STONE = registerItem("volcanic_stone", Item::new);
    public static final Item VORTEX_EMBER = registerItem("vortex_ember", Item::new);
    public static final Item MARINE_STONE = registerItem("marine_stone", Item::new);
    public static final Item UPPER_MOON_1_FLESH = registerItem("upper_moon_1_flesh", Item::new);
    public static final Item LIGHTNING_WYVERN_FANG = registerItem("lightning_wyvern_fang", Item::new);
    public static final Item SHINY_METEORITE_DEBRIS = registerItem("shiny_meteorite_debris", Item::new);
    public static final Item METEORITE_CRYSTALS = registerItem("meteorite_crystals", Item::new);
    public static final Item RADIANT_PEONY_BLOSSOM = registerItem("radiant_peony_blossom", Item::new);
    public static final Item BEAST_FANG = registerItem("beast_fang", Item::new);
    public static final Item MIST_CORE = registerItem("mist_core", Item::new);
    public static final Item LOVE_CRYSTAL = registerItem("love_crystal", Item::new);
    public  static final Item NICHIRIN_HANDLE = registerItem("nichirin_handle", Item::new);

    public static final Item BASIC_NICHIRIN_WATER = registerItem("basic_nichirin_water",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 3f, -2.5f)));
    public static final Item BASIC_NICHIRIN_FLAME = registerItem("basic_nichirin_flame",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 4f, -3f)));
    public static final Item BASIC_NICHIRIN_THUNDER = registerItem("basic_nichirin_thunder",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 2f, -2f)));
    public static final Item BASIC_NICHIRIN_WIND = registerItem("basic_nichirin_wind",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 2.3f, -2.7f)));
    public static final Item BASIC_NICHIRIN_STONE = registerItem("basic_nichirin_stone",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 4.5f, -3.5f)));
    public static final Item BASIC_NICHIRIN = registerItem("basic_nichirin",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 2f, -3f)));

    public static final Item FLAME_NICHIRIN = registerItem("flame_nichirin", Item::new);
    public static final Item WATER_NICHIRIN = registerItem("water_nichirin", Item::new);
    public static final Item SERPENT_NICHIRIN = registerItem( "serpent_nichirin", Item::new);
    public static final Item BLACK_NICHIRIN = registerItem("black_nichirin", Item::new);
    public static final Item BEAST_NICHIRIN = registerItem("beast_nichirin", Item::new);
    public static final Item FLOWER_NICHIRIN = registerItem("flower_nichirin", Item::new);
    public static final Item TOXIC_NICHIRIN = registerItem("toxic_nichirin", Item::new);
    public static final Item LIGHTNING_NICHIRIN = registerItem("lightning_nichirin", Item::new);
    public static final Item SOUND_NICHIRIN = registerItem("sound_nichirin", Item::new);
    public static final Item MIST_NICHIRIN = registerItem("mist_nichirin", Item::new);
    public static final Item LOVE_NICHIRIN = registerItem("love_nichirin", Item::new);
    public static final Item FLASHY_CORE = registerItem("flashy_core", Item::new);

    public static final Item MOON_NICHIRIN = registerItem("moon_nichirin",
            properties -> new Item(properties.sword(ModToolMaterials.DEMON, 5, -2)));
    public static final Item BLACK_THUNDER_NICHIRIN = registerItem("black_thunder_nichirin", Item::new);

    public static final Item GYUTARO_SCYTHE = registerItem("gyutaro_scythe",
            properties -> new EffectOnHitItem(
                    properties.pickaxe(ModToolMaterials.DEMON, 1, 0f),
                    List.of(new MobEffectInstance(MobEffects.POISON, 6 * 20, 1))));

    public static final Item DEMON_FLESH = registerItem("demon_flesh", properties -> new Item(properties
            .food(ModFoods.DEMON_FLESH, ModFoods.DEMON_FLESH_CONSUMABLE)));


    private static Item registerItem(String name, Function<Item.Properties,Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name)))));
    }

    public static void registerModItems() {
        SlayerSwords.LOGGER.info("Registering Mod Items for " + SlayerSwords.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SEARCH).register(output -> {
            output.accept(SERPENT_NICHIRIN);
            output.accept(SUN_ORE);
            output.accept(SERPENT_SCALES);
            output.accept(NICHIRIN_HANDLE);
            output.accept(SCARLET_INGOT);
            output.accept(SCARLET_ORE);
            output.accept(SUN_INGOT);
            output.accept(WISTERIA_FLOWER);
            output.accept(TOXIC_NICHIRIN);
            output.accept(FLAME_NICHIRIN);
            output.accept(VOLCANIC_STONE);
            output.accept(VORTEX_EMBER);
            output.accept(WATER_NICHIRIN);
            output.accept(MARINE_STONE);
            output.accept(BLACK_NICHIRIN);
            output.accept(MOON_NICHIRIN);
            output.accept(BEAST_NICHIRIN);
            output.accept(FLOWER_NICHIRIN);
            output.accept(UPPER_MOON_1_FLESH);
            output.accept(BLACK_THUNDER_NICHIRIN);
            output.accept(LIGHTNING_WYVERN_FANG);
            output.accept(LIGHTNING_NICHIRIN);
            output.accept(SHINY_METEORITE_DEBRIS);
            output.accept(METEORITE_CRYSTALS);
            output.accept(RADIANT_PEONY_BLOSSOM);
            output.accept(BEAST_FANG);
            output.accept(SOUND_NICHIRIN);
            output.accept(MIST_NICHIRIN);
            output.accept(LOVE_NICHIRIN);
            output.accept(MIST_CORE);
            output.accept(BASIC_NICHIRIN_WATER);
            output.accept(BASIC_NICHIRIN_FLAME);
            output.accept(BASIC_NICHIRIN_THUNDER);
            output.accept(BASIC_NICHIRIN_WIND);
            output.accept(BASIC_NICHIRIN_STONE);
            output.accept(LOVE_CRYSTAL);
            output.accept(BASIC_NICHIRIN);
            output.accept(FLASHY_CORE);
        });

    }
}
