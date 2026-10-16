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
            ArmorMaterials.makeDefense(12,24,35,12,24),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,10,0.5f,ModTags.Items.SUN_REPAIR, SUN_KEY);


    public static final ResourceKey<EquipmentAsset> SOUND_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "flashy_core"));

    public static final ArmorMaterial SOUND_ARMOR_MATERIAL = new ArmorMaterial(275,
            ArmorMaterials.makeDefense(14,28,42,14,28),
            100,SoundEvents.ARMOR_EQUIP_CHAIN,12,0.6f,ModTags.Items.SOUND_REPAIR, SOUND_KEY);
}