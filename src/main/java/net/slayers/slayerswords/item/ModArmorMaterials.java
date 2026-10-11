package net.slayers.slayerswords.item;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.tags.ModTags;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final  ResourceKey<EquipmentAsset> SUN_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"sun_ingot"));

    public static final ArmorMaterial SUN_ARMOR_MATERIAL = new ArmorMaterial(200,
            ArmorMaterials.makeDefense(10,20,30,10,20),
            100, SoundEvents.ARMOR_EQUIP_CHAIN,10,0.5f,ModTags.Items.SUN_REPAIR, SUN_KEY);
}
