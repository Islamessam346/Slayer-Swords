package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;

import net.fabricmc.fabric.impl.datagen.TagAliasGenerator;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.item.ModArmorMaterials;
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
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.SOUND_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.SOUND_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.SOUND_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.WIND_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.WIND_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.WIND_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.WIND_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.WATER_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.WATER_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.WATER_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.WATER_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.MIST_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.MIST_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.MIST_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.MIST_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.FLAME_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.FLAME_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.FLAME_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.FLAME_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.LOVE_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.LOVE_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.LOVE_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.LOVE_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.SERPENT_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.SERPENT_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.SERPENT_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.SERPENT_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.LIGHTNING_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.LIGHTNING_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.LIGHTNING_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.LIGHTNING_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.BLACK_THUNDER_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.BLACK_THUNDER_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.BLACK_THUNDER_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.BLACK_THUNDER_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.FLOWER_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.FLOWER_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.FLOWER_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.FLOWER_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.BEAST_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.BEAST_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.BEAST_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.BEAST_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.MOON_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.MOON_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.MOON_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.MOON_BOOTS));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.TOXIC_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.TOXIC_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.TOXIC_LEGGINGS));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.TOXIC_BOOTS));

        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.DEMON_SLAYER_1_MUSIC_DISC));
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.DEMON_SLAYER_2_MUSIC_DISC));
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.DEMON_SLAYER_3_MUSIC_DISC));
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.DEMON_SLAYER_4_MUSIC_DISC));
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.DEMON_SLAYER_OST_1_MUSIC_DISC));
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.DEMON_SLAYER_OST_2_MUSIC_DISC));

        tag(ModTags.Items.MEATS)
                .add(ModItems.getRK(Items.BEEF),
                        ModItems.getRK(Items.PORKCHOP),
                        ModItems.getRK(Items.CHICKEN),
                        ModItems.getRK(Items.MUTTON),
                        ModItems.getRK(Items.RABBIT),
                        ModItems.getRK(Items.ROTTEN_FLESH));



        tag(BlockItemTags.SMALL_FLOWERS.item()).add(ModItems.getRK(ModBlocks.BLUE_SPIDER_LILY.asItem()));
    }
}
