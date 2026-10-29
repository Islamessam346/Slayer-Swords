package net.slayers.slayerswords.datagen;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.item.ModArmorMaterials;
import net.slayers.slayerswords.item.ModItems;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private  final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(ModArmorMaterials.SUN_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"sun_ingot"))
                        .build());

        consumer.accept(ModArmorMaterials.SOUND_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"flashy_core"))
                        .build());

        consumer.accept(ModArmorMaterials.WIND_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"wind_core"))
                        .build());

        consumer.accept(ModArmorMaterials.WATER_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"marine_stone"))
                        .build());

        consumer.accept(ModArmorMaterials.MIST_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"mist_core"))
                        .build());

        consumer.accept(ModArmorMaterials.FLAME_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"volcanic_stone"))
                        .build());

        consumer.accept(ModArmorMaterials.LOVE_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "love_crystal"))
                        .build());

        consumer.accept(ModArmorMaterials.SERPENT_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"serpent_scales"))
                        .build());

        consumer.accept(ModArmorMaterials.LIGHTNING_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"meteorite_crystals"))
                        .build());

        consumer.accept(ModArmorMaterials.BLACK_THUNDER_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"lightning_wyvern_fang"))
                        .build());

        consumer.accept(ModArmorMaterials.FLOWER_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "radiant_peony_blossom"))
                        .build());

        consumer.accept(ModArmorMaterials.BEAST_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"beast_fang"))
                        .build());
        consumer.accept(ModArmorMaterials.MOON_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"upper_moon_1_flesh"))
                        .build());
    }


    @Override
    public CompletableFuture<?> run(final CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + String.valueOf(id));
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
    }

    @Override
    public String getName() {
        return "Slayer Swords Equipment Asset Definitions";
    }
}
