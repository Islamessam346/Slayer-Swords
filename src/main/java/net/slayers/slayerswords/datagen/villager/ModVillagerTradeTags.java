package net.slayers.slayerswords.datagen.villager;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradeTags extends FabricTagsProvider<VillagerTrade> {
    public ModVillagerTradeTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.WEAPONSMITH_LEVEL_5)
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BLACK_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_FLAME_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_LIGHTNING_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BLACK_THUNDER_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_TOXIC_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BEAST_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_LOVE_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_MOON_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_FLOWER_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_NICHIRIN_HANDLE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_THUNDER.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_FLAME.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_STONE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WATER.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_BASIC_NICHIRIN_WIND.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_WATER_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_MIST_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_SERPENT_NICHIRIN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_GYUTARO_SCYTHE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.WEAPONSMITH_5_DIAMOND_SOUND_NICHIRIN.identifier()));



        getOrCreateRawBuilder(VillagerTradeTags.ARMORER_LEVEL_4)
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_SUN_BOOTS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_SUN_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_FLAME_BOOTS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_FLAME_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_LOVE_BOOTS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_LOVE_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_MIST_BOOTS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_MIST_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_LIGHTNING_BOOTS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_LIGHTNING_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_SERPENT_BOOTS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_SERPENT_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_WIND_LEGGINGS.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_4_DIAMOND_WIND_BOOTS.identifier()));

        getOrCreateRawBuilder(VillagerTradeTags.ARMORER_LEVEL_5)
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_SUN_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_SUN_CHESTPLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_FLAME_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_FLAME_CHESTPLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_LOVE_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_LOVE_CHESTPLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_MIST_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_MIST_CHESTPLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_LIGHTNING_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_LIGHTNING_CHESTPLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_SERPENT_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_SERPENT_CHESTPLATE.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_WIND_HELMET.identifier()))
                .add(TagEntry.element(ModVillagerTrades.ARMORER_5_DIAMOND_WIND_CHESTPLATE.identifier()));


    }
}
