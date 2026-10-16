package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.item.ModItems;
import net.slayers.slayerswords.tags.ModTags;

import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.MOON_NICHIRIN));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.GYUTARO_SCYTHE));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.SUN_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.SUN_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.SUN_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.SUN_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.SOUND_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.SOUND_CHESPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.SOUND_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.SOUND_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.WIND_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.WIND_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.WIND_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.WIND_BOOTS));


    }
}
