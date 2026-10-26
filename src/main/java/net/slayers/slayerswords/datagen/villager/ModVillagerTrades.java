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





    public static void bootstrap(BootstrapContext<VillagerTrade> context){


        context.register(WEAPONSMITH_5_DIAMOND_BLACK_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.BLACK_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));


        context.register(WEAPONSMITH_5_DIAMOND_LIGHTNING_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.LIGHTNING_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BLACK_THUNDER_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 60),
                new ItemStackTemplate(ModItems.BLACK_THUNDER_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_TOXIC_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.TOXIC_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BEAST_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.BEAST_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_MOON_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 64),
                new ItemStackTemplate(ModItems.MOON_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_LOVE_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LOVE_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_FLOWER_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.FLOWER_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_NICHIRIN_HANDLE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 10),
                new ItemStackTemplate(ModItems.NICHIRIN_HANDLE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 15),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_THUNDER, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_THUNDER),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_FLAME, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_FLAME),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_STONE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_STONE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WATER, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_WATER),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WIND, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 25),
                new ItemStackTemplate(ModItems.BASIC_NICHIRIN_WIND),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_WATER_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 40),
                new ItemStackTemplate(ModItems.WATER_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_MIST_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.MIST_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_SERPENT_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 35),
                new ItemStackTemplate(ModItems.SERPENT_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_GYUTARO_SCYTHE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.GYUTARO_SCYTHE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(WEAPONSMITH_5_DIAMOND_SOUND_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.SOUND_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_SUN_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SUN_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_SUN_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SUN_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_SUN_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SUN_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_SUN_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SUN_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_FLAME_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.FLAME_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_FLAME_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.FLAME_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_FLAME_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.FLAME_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_FLAME_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.FLAME_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_LOVE_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LOVE_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_LOVE_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LOVE_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_LOVE_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LOVE_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_LOVE_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LOVE_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_MIST_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.MIST_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_MIST_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.MIST_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_MIST_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.MIST_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_MIST_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.MIST_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_LIGHTNING_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LIGHTNING_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_LIGHTNING_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LIGHTNING_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_LIGHTNING_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.LIGHTNING_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_LIGHTNING_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.LIGHTNING_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_SERPENT_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SERPENT_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_SERPENT_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SERPENT_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_SERPENT_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.SERPENT_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_SERPENT_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.SERPENT_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_WIND_LEGGINGS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.WIND_LEGGINGS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_4_DIAMOND_WIND_BOOTS, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.WIND_BOOTS),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_WIND_HELMET, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 20),
                new ItemStackTemplate(ModItems.WIND_HELMET),
                5, 20, 0.1f,
                Optional.empty(), List.of()));

        context.register(ARMORER_5_DIAMOND_WIND_CHESTPLATE, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 30),
                new ItemStackTemplate(ModItems.WIND_CHESTPLATE),
                5, 20, 0.1f,
                Optional.empty(), List.of()));


        context.register(WEAPONSMITH_5_DIAMOND_FLAME_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 40),
                new ItemStackTemplate(ModItems.FLAME_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));


    }





    private static final ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
    }
}
