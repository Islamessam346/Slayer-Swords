package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;

import net.minecraft.tags.ItemTags;
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
        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.MOON_NICHIRIN);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.GYUTARO_SCYTHE);

        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.SUN_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.SUN_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.SUN_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.SUN_BOOTS);

    }
}
