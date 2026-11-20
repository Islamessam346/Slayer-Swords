package net.slayers.slayerswords.datagen.villager;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.item.ModItems;

import java.util.List;
import java.util.Optional;

public class ModVillagerTrades {
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BLACK_NICHIRIN = createKey("weaponsmith/5/diamond_black_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_FLAME_NICHIRIN = createKey("weaponsmith/5/diamond_flame_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_LIGHTNING_NICHIRIN = createKey("weaponsmith/5/diamond_lightning_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BLACK_THUNDER_NICHIRIN = createKey("weaponsmith/5/diamond_black_thunder_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_TOXIC_NICHIRIN = createKey("weaponsmith/5/diamond_toxic_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BEAST_NICHIRIN = createKey("weaponsmith/5/diamond_beast_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_LOVE_NICHIRIN = createKey("weaponsmith/5/diamond_love_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_MOON_NICHIRIN = createKey("weaponsmith/5/diamond_moon_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_FLOWER_NICHIRIN = createKey("weaponsmith/5/diamond_flower_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_NICHIRIN_HANDLE = createKey("weaponsmith/5/diamond_nichirin_handle");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN = createKey("weaponsmith/5/diamond_basic_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_THUNDER = createKey("weaponsmith/5/diamond_basic_nichirin_thunder");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_FLAME = createKey("weaponsmith/5/diamond_basic_nichirin_flame");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_STONE = createKey("weaponsmith/5/diamond_basic_nichirin_stone");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WATER = createKey("weaponsmith/5/diamond_basic_nichirin_water");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WIND = createKey("weaponsmith/5/diamond_basic_nichirin_wind");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_WATER_NICHIRIN = createKey("weaponsmith/5/diamond_water_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_MIST_NICHIRIN = createKey("weaponsmith/5/diamond_mist_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_SERPENT_NICHIRIN = createKey("weaponsmith/5/diamond_serpent_nichirin");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_GYUTARO_SCYTHE = createKey("weaponsmith/5/diamond_gyutaro_scythe");
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_SOUND_NICHIRIN = createKey("weaponsmith/5/diamond_sound_nichirin");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_SUN_BOOTS = createKey("armorer/4/diamond_sun_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_SUN_LEGGINGS = createKey("armorer/4/diamond_sun_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_SUN_HELMET = createKey("armorer/5/diamond_sun_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_SUN_CHESTPLATE = createKey("armorer/5/diamond_sun_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_FLAME_HELMET = createKey("armorer/5/diamond_flame_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_FLAME_CHESTPLATE = createKey("armorer/5/diamond_flame_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_FLAME_BOOTS = createKey("armorer/4/diamond_flame_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_FLAME_LEGGINGS = createKey("armorer/4/diamond_flame_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_LOVE_BOOTS = createKey("armorer/4/diamond_love_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_LOVE_LEGGINGS = createKey("armorer/4/diamond_love_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_LOVE_HELMET = createKey("armor/5/diamond_love_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_LOVE_CHESTPLATE = createKey("armorer/5/diamond_love_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_MIST_HELMET = createKey("armorer/5/diamond_mist_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_MIST_CHESTPLATE = createKey("armorer/5/diamond_mist_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_MIST_BOOTS = createKey("armorer/4/diamond_mist_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_MIST_LEGGINGS = createKey("armorer/4/diamond_mist_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_LIGHTNING_BOOTS = createKey("armorer/4/diamond_lightning_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_LIGHTNING_LEGGINGS = createKey("armorer/4/diamond_lightning_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_LIGHTNING_HELMET = createKey("armor/5/diamond_lightning_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_LIGHTNING_CHESTPLATE = createKey("armorer/5/diamond_lightning_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_SERPENT_HELMET = createKey("armorer/5/diamond_serpent_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_SERPENT_CHESTPLATE = createKey("armorer/5/diamond_serpent_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_SERPENT_BOOTS = createKey("armorer/4/diamond_serpent_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_SERPENT_LEGGINGS = createKey("armorer/4/diamond_serpent_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_WIND_LEGGINGS = createKey("armorer/4/diamond_wind_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_WIND_BOOTS = createKey("armorer/4/diamond_wind_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_WIND_HELMET = createKey("armorer/5/diamond_wind_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_WIND_CHESTPLATE = createKey("armorer/5/diamond_wind_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_SOUND_HELMET = createKey("armorer/5/diamond_sound_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_SOUND_CHESTPLATE = createKey("armorer/5/diamond_sound_chestplate");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_SOUND_BOOTS = createKey("armorer/4/diamond_sound_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_SOUND_LEGGINGS = createKey("armorer/4/diamond_sound_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_WATER_BOOTS = createKey("armorer/4/diamond_water_boots");
    public static final ResourceKey<VillagerTrade> ARMORER_4_DIAMOND_WATER_LEGGINGS = createKey("armorer/4/diamond_water_leggings");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_WATER_HELMET = createKey("armorer/5/diamond_water_helmet");
    public static final ResourceKey<VillagerTrade> ARMORER_5_DIAMOND_WATER_CHESTPLATE = createKey("armorer/5/diamond_water_chestplate");


    public static void bootstrap(BootstrapContext<VillagerTrade> context){


        context.register(WEAPONSMITH_5_DIAMOND_BLACK_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.BLACK_NICHIRIN),
                5, 20, 0.1f).build());


        context.register(WEAPONSMITH_5_DIAMOND_LIGHTNING_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.LIGHTNING_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BLACK_THUNDER_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 60),
                new ItemStackTemplate(ModItems.BLACK_THUNDER_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_TOXIC_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.TOXIC_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BEAST_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.BEAST_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_MOON_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 64),
                new ItemStackTemplate(ModItems.MOON_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_LOVE_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LOVE_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_FLOWER_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.FLOWER_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_NICHIRIN_HANDLE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 10),
                new ItemStackTemplate(ModItems.NICHIRIN_HANDLE),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 15),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_THUNDER, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_THUNDER),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_FLAME, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_FLAME),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_STONE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_STONE),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WATER, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_WATER),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WIND, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_WIND),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_WATER_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 40),
                new ItemStackTemplate(ModItems.WATER_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_MIST_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.MIST_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_SERPENT_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.SERPENT_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_GYUTARO_SCYTHE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.GYUTARO_SCYTHE),
                5, 20, 0.1f).build());

        context.register(WEAPONSMITH_5_DIAMOND_SOUND_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.SOUND_NICHIRIN),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_SUN_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SUN_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_SUN_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SUN_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_SUN_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SUN_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_SUN_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SUN_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_FLAME_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.FLAME_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_FLAME_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.FLAME_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_FLAME_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.FLAME_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_FLAME_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.FLAME_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_LOVE_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LOVE_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_LOVE_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LOVE_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_LOVE_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LOVE_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_LOVE_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LOVE_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_MIST_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.MIST_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_MIST_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.MIST_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_MIST_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.MIST_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_MIST_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.MIST_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_LIGHTNING_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LIGHTNING_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_LIGHTNING_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LIGHTNING_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_LIGHTNING_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LIGHTNING_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_LIGHTNING_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LIGHTNING_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_SERPENT_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SERPENT_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_SERPENT_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SERPENT_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_SERPENT_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SERPENT_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_SERPENT_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SERPENT_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_WIND_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.WIND_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_WIND_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.WIND_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_WIND_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.WIND_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_WIND_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.WIND_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_SOUND_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SOUND_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_SOUND_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.SOUND_CHESTPLATE),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_SOUND_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SOUND_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_SOUND_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SOUND_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_WATER_BOOTS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.WATER_BOOTS),
                5, 20, 0.1f).build());

        context.register(ARMORER_4_DIAMOND_WATER_LEGGINGS, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.WATER_LEGGINGS),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_WATER_HELMET, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.WATER_HELMET),
                5, 20, 0.1f).build());

        context.register(ARMORER_5_DIAMOND_WATER_CHESTPLATE, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.WATER_CHESTPLATE),
                5, 20, 0.1f).build());


        context.register(WEAPONSMITH_5_DIAMOND_FLAME_NICHIRIN, VillagerTrade.builder(
                new TradeCost(Items.DIAMOND, 40),
                new ItemStackTemplate(ModItems.FLAME_NICHIRIN),
                5, 20, 0.1f).build());


    }





    private static final ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
    }
}
