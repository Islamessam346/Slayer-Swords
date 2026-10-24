package net.slayers.slayerswords.item;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.tags.ModTags;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final  ResourceKey<EquipmentAsset> SUN_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"sun_ingot"));

    public static final ArmorMaterial SUN_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,30,0.5f,ModTags.Items.SUN_REPAIR, SUN_KEY);


    public static final ResourceKey<EquipmentAsset> SOUND_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "flashy_core"));

    public static final ArmorMaterial SOUND_ARMOR_MATERIAL = new ArmorMaterial(275,
            ArmorMaterials.makeDefense(14,28,42,14,28),
            100,SoundEvents.ARMOR_EQUIP_CHAIN,35,0.6f,ModTags.Items.SOUND_REPAIR, SOUND_KEY);

    public static final  ResourceKey<EquipmentAsset> WIND_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"wind_core"));

    public static final ArmorMaterial WIND_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,30,0.5f,ModTags.Items.WIND_REPAIR, WIND_KEY);

    public static final ResourceKey<EquipmentAsset> WATER_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"marine_stone"));

    public static final ArmorMaterial WATER_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,30,0.5f,ModTags.Items.WATER_REPAIR, WATER_KEY);

    public static final ResourceKey<EquipmentAsset> MIST_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"mist_core"));

    public static final ArmorMaterial MIST_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,10,0.5f,ModTags.Items.MIST_REPAIR, MIST_KEY);

    public static final ResourceKey<EquipmentAsset> FLAME_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"volcanic_stone"));

    public static final ArmorMaterial FLAME_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,10,0.5f,ModTags.Items.FLAME_REPAIR, FLAME_KEY);

    public static final ResourceKey<EquipmentAsset> LOVE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"love_crystal"));

    public static final ArmorMaterial LOVE_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100,SoundEvents.ARMOR_EQUIP_CHAIN,10, 0.5f,ModTags.Items.LOVE_REPAIR, LOVE_KEY);


    public static final ResourceKey<EquipmentAsset> SERPENT_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "serpent_scales"));

    public static final ArmorMaterial SERPENT_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,10,0.5f,ModTags.Items.SERPENT_REPAIR, SERPENT_KEY);

    public static final ResourceKey<EquipmentAsset> LIGHTNING_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"meteorite_crystals"));

    public static final ArmorMaterial LIGHTNING_ARMOR_MATERIAL = new ArmorMaterial(250,
            ArmorMaterials.makeDefense(18,36,53,18,36),
            100,SoundEvents.ARMOR_EQUIP_CHAIN,10,0.5f,ModTags.Items.LIGHTNING_REPAIR, LIGHTNING_KEY);
}