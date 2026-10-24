package net.slayers.slayerswords.item;

import com.mojang.blaze3d.systems.GpuQueryPool;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.effect.EffectOnHitItem;
import net.slayers.slayerswords.food.ModFoods;

import java.util.function.Function;

import static net.slayers.slayerswords.effect.HitEffect.*;

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
    public static final Item FLASHY_CORE = registerItem("flashy_core", Item::new);
    public static final Item LOVE_CRYSTAL = registerItem("love_crystal", Item::new);
    public  static final Item NICHIRIN_HANDLE = registerItem("nichirin_handle", Item::new);
    public static final Item WIND_CORE = registerItem("wind_core", Item::new);

    public static final Item BASIC_NICHIRIN_WATER = registerItem("basic_nichirin_water",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.BASIC, 3f, -2.5f),
                    freeze(14 * 20),
                    particles(ParticleTypes.SNOWFLAKE, 15)
            ));

    public static final Item BASIC_NICHIRIN_FLAME = registerItem("basic_nichirin_flame",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.BASIC, 4f, -3f),
                    fire(4 * 20),
                    particles(ParticleTypes.FLAME, 15)
            ));

    public static final Item BASIC_NICHIRIN_THUNDER = registerItem("basic_nichirin_thunder",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.BASIC, 2f, -2f),
                    lightning(1)
            ));

    public static final Item BASIC_NICHIRIN_WIND = registerItem("basic_nichirin_wind",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.BASIC, 2.3f, -2.7f),
                    potion(MobEffects.LEVITATION, 20, 1)
            ));

    public static final Item BASIC_NICHIRIN_STONE = registerItem("basic_nichirin_stone",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.BASIC, 4.5f, -3.5f),
                    potion(MobEffects.WITHER, 5 * 20, 1)
            ));

    public static final Item BASIC_NICHIRIN = registerItem("basic_nichirin",
            properties -> new Item(properties.sword(ModToolMaterials.BASIC, 2f, -3f)));

    public static final Item BLACK_NICHIRIN = registerItem("black_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 4f, -3f),
                    lava(3),
                    explosion(30f)
            ));

    public static final Item WIND_NICHIRIN = registerItem("wind_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 5f, -1.5f),
                    launch(1f),
                    potion(MobEffects.LEVITATION, 3 * 20, 3)
            ));

    public static final Item FLAME_NICHIRIN = registerItem("flame_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 6f, -2f),
                    fire(10 * 20),
                    explosion(10f)
            ));

    public static final Item WATER_NICHIRIN = registerItem("water_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 5f, -1.5f),
                    freeze(20 * 20),
                    potion(MobEffects.SLOWNESS, 5 * 20, 6),
                    potion(MobEffects.JUMP_BOOST, 5 * 20, 128),
                    potion(MobEffects.MINING_FATIGUE, 5 * 20, 4),
                    potion(MobEffects.WEAKNESS, 5 * 20, 4)
            ));

    public static final Item SERPENT_NICHIRIN = registerItem( "serpent_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 3f, -1f),
                    potion(MobEffects.WITHER, 10 * 20, 2),
                    potion(MobEffects.POISON, 10 * 20, 2)
            ));

    public static final Item BEAST_NICHIRIN = registerItem("beast_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 5f, -2.5f),
                    knockback(2f, 1f)
            ));

    public static final Item FLOWER_NICHIRIN = registerItem("flower_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 4.5f, -1.5f),
                    potion(MobEffects.OOZING, 20 * 20, 1),
                    potion(MobEffects.INFESTED, 20 * 20, 1),
                    potion(MobEffects.WEAVING, 20 * 20, 1),
                    potion(MobEffects.WEAKNESS, 20 * 20, 1)
            ));

    public static final Item TOXIC_NICHIRIN = registerItem("toxic_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 1f, -1f),
                    potion(MobEffects.POISON, 15 * 20, 5)
            ));

    public static final Item LIGHTNING_NICHIRIN = registerItem("lightning_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 5f, -0.5f),
                    lightning(100)
            ));

    public static final Item SOUND_NICHIRIN = registerItem("sound_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 5f, -2f),
                    explosion(20f)
            ));

    public static final Item MIST_NICHIRIN = registerItem("mist_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 4f, -1.5f),
                    potion(MobEffects.INVISIBILITY, 3 * 20, 1)
            ));

    public static final Item LOVE_NICHIRIN = registerItem("love_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.HASHIRA, 3f, 0f),
                    potion(MobEffects.GLOWING, 10 * 20, 1),
                    lifesteal(1f)
            ));

    public static final Item MOON_NICHIRIN = registerItem("moon_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.DEMON, 5f, -2f),
                    lifesteal(2f)
            ));

    public static final Item GYUTARO_SCYTHE = registerItem("gyutaro_scythe",
            properties -> new EffectOnHitItem(
                    properties.pickaxe(ModToolMaterials.DEMON, 1f, 0f),
                    potion(MobEffects.POISON, 6 * 20, 1)
            ));

    public static final Item BLACK_THUNDER_NICHIRIN = registerItem("black_thunder_nichirin",
            properties -> new EffectOnHitItem(
                    properties.sword(ModToolMaterials.DEMON, 6f, -0.75f),
                    lightning(3),
                    explosion(10f)
            ));

    public static final Item DEMON_FLESH = registerItem("demon_flesh", properties -> new Item(properties
            .food(ModFoods.DEMON_FLESH, ModFoods.DEMON_FLESH_CONSUMABLE)));

    public static final Item SUN_HELMET = registerItem("sun_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SUN_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item SUN_CHESTPLATE = registerItem("sun_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SUN_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item SUN_BOOTS = registerItem("sun_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SUN_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item SUN_LEGGINGS = registerItem("sun_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SUN_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item SOUND_HELMET = registerItem("sound_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SOUND_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item SOUND_CHESTPLATE = registerItem("sound_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SOUND_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item SOUND_LEGGINGS = registerItem("sound_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SOUND_ARMOR_MATERIAL,ArmorType.LEGGINGS)));

    public static final Item SOUND_BOOTS = registerItem("sound_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SOUND_ARMOR_MATERIAL,ArmorType.BOOTS)));

    public static final Item WIND_HELMET = registerItem("wind_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WIND_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item WIND_CHESTPLATE = registerItem("wind_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WIND_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item WIND_LEGGINGS = registerItem("wind_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WIND_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item WIND_BOOTS = registerItem("wind_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WIND_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item WATER_HELMET = registerItem("water_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WATER_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item WATER_CHESTPLATE = registerItem("water_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WATER_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item WATER_LEGGINGS = registerItem("water_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WATER_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item WATER_BOOTS = registerItem("water_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.WATER_ARMOR_MATERIAL,ArmorType.BOOTS)));

    public static final Item MIST_HELMET = registerItem("mist_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MIST_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item MIST_CHESTPLATE = registerItem("mist_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MIST_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item MIST_LEGGINGS = registerItem("mist_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MIST_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item MIST_BOOTS = registerItem("mist_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MIST_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item FLAME_HELMET = registerItem("flame_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLAME_ARMOR_MATERIAL, ArmorType.HELMET)));

    public static final Item FLAME_CHESTPLATE = registerItem("flame_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLAME_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item FLAME_LEGGINGS = registerItem("flame_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLAME_ARMOR_MATERIAL, ArmorType.LEGGINGS)));

    public static final Item FLAME_BOOTS = registerItem("flame_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.FLAME_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item LOVE_HELMET = registerItem("love_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LOVE_ARMOR_MATERIAL,ArmorType.HELMET)));

    public static final Item LOVE_CHESTPLATE = registerItem("love_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LOVE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));

    public static final Item LOVE_LEGGINGS = registerItem("love_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LOVE_ARMOR_MATERIAL,ArmorType.LEGGINGS)));

    public static final Item LOVE_BOOTS = registerItem("love_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LOVE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item SERPENT_HELMET = registerItem("serpent_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SERPENT_ARMOR_MATERIAL,ArmorType.HELMET)));

    public static final Item SERPENT_CHESTPLATE = registerItem("serpent_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SERPENT_ARMOR_MATERIAL,ArmorType.CHESTPLATE)));

    public static final Item SERPENT_LEGGINGS = registerItem("serpent_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SERPENT_ARMOR_MATERIAL,ArmorType.LEGGINGS)));

    public static final Item SERPENT_BOOTS = registerItem("serpent_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SERPENT_ARMOR_MATERIAL,ArmorType.BOOTS)));

    public static final Item LIGHTNING_HELMET = registerItem("lightning_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LIGHTNING_ARMOR_MATERIAL,ArmorType.HELMET)));

    public static final Item LIGHTNING_CHESTPLATE = registerItem("lightning_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LIGHTNING_ARMOR_MATERIAL,ArmorType.CHESTPLATE)));

    public static final Item LIGHTNING_LEGGINGS = registerItem("lightning_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LIGHTNING_ARMOR_MATERIAL,ArmorType.LEGGINGS)));

    public static final Item LIGHTNING_BOOTS = registerItem("lightning_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.LIGHTNING_ARMOR_MATERIAL,ArmorType.BOOTS)));





    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    private static Item registerItem(String name, Function<Item.Properties,Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name)))));
    }

    public static void register() {
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
            output.accept(WIND_NICHIRIN);
            output.accept(MIST_CORE);
            output.accept(BASIC_NICHIRIN_WATER);
            output.accept(BASIC_NICHIRIN_FLAME);
            output.accept(BASIC_NICHIRIN_THUNDER);
            output.accept(BASIC_NICHIRIN_WIND);
            output.accept(BASIC_NICHIRIN_STONE);
            output.accept(LOVE_CRYSTAL);
            output.accept(BASIC_NICHIRIN);
            output.accept(FLASHY_CORE);
            output.accept(WIND_CORE);

        });

    }
}
