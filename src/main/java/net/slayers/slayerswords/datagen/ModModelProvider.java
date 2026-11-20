package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.item.ModArmorMaterials;
import net.slayers.slayerswords.item.ModItems;
import net.slayers.slayerswords.sound.ModSounds;

import java.util.Map;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_SUNORE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_SCARLETORE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.METEORITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.WISTERIA_BUSH);
        blockModelGenerators.createTrivialCube(ModBlocks.BLOCK_OF_SUNORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SUNMETAL_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.BLOCK_OF_SCARLETORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SCARLETMETAL_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.VOLCANIC_CLUSTER);
        blockModelGenerators.createTrivialCube(ModBlocks.DRY_MAGMA);
        blockModelGenerators.createTrivialCube(ModBlocks.WISTERIA_LOG);
        blockModelGenerators.createTrivialCube(ModBlocks.WISTERIA_PLANKS);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.BLUE_SPIDER_LILY, ModBlocks.POTTED_BLUE_SPIDER_LILY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createNonTemplateModelBlock(ModBlocks.PEDESTAL_BLOCK);
        blockModelGenerators.createHorizontallyRotatedBlock(ModBlocks.DEMONIFIER_BLOCK, TexturedModel.ORIENTABLE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.SUN_ORE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SERPENT_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SERPENT_SCALES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SUN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SCARLET_ORE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SCARLET_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NICHIRIN_HANDLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WISTERIA_FLOWER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOXIC_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAME_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.VOLCANIC_STONE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.VORTEX_EMBER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WATER_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MARINE_STONE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLACK_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MOON_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BEAST_NICHIRIN,ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLOWER_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UPPER_MOON_1_FLESH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLACK_THUNDER_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LIGHTNING_WYVERN_FANG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LIGHTNING_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SHINY_METEORITE_DEBRIS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.METEORITE_CRYSTALS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RADIANT_PEONY_BLOSSOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BEAST_FANG, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SOUND_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MIST_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LOVE_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WIND_NICHIRIN, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMON_FLESH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GYUTARO_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_WATER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_FLAME, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_THUNDER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_WIND, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_STONE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MIST_CORE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LOVE_CRYSTAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLASHY_CORE,ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WIND_CORE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WILD_BOAR_SPAWN_EGG, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateTrimmableArmorSet(ModItems.SUN_HELMET, ModItems.SUN_CHESTPLATE, ModItems.SUN_LEGGINGS, ModItems.SUN_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.SOUND_HELMET, ModItems.SOUND_CHESTPLATE, ModItems.SOUND_LEGGINGS, ModItems.SOUND_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.WIND_HELMET, ModItems.WIND_CHESTPLATE, ModItems.WIND_LEGGINGS, ModItems.WIND_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.WATER_HELMET, ModItems.WATER_CHESTPLATE, ModItems.WATER_LEGGINGS, ModItems.WATER_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.MIST_HELMET, ModItems.MIST_CHESTPLATE, ModItems.MIST_LEGGINGS, ModItems.MIST_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.FLAME_HELMET, ModItems.FLAME_CHESTPLATE, ModItems.FLAME_LEGGINGS, ModItems.FLAME_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.LOVE_HELMET, ModItems.LOVE_CHESTPLATE, ModItems.LOVE_LEGGINGS, ModItems.LOVE_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.SERPENT_HELMET, ModItems.SERPENT_CHESTPLATE, ModItems.SERPENT_LEGGINGS, ModItems.SERPENT_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.LIGHTNING_HELMET, ModItems.LIGHTNING_CHESTPLATE, ModItems.LIGHTNING_LEGGINGS, ModItems.LIGHTNING_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.BLACK_THUNDER_HELMET, ModItems.BLACK_THUNDER_CHESTPLATE, ModItems.BLACK_THUNDER_LEGGINGS, ModItems.BLACK_THUNDER_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.FLOWER_HELMET, ModItems.FLOWER_CHESTPLATE, ModItems.FLOWER_LEGGINGS, ModItems.FLOWER_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.BEAST_HELMET, ModItems.BEAST_CHESTPLATE, ModItems.BEAST_LEGGINGS, ModItems.BEAST_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.MOON_HELMET, ModItems.MOON_CHESTPLATE, ModItems.MOON_LEGGINGS, ModItems.MOON_BOOTS, false, Map.of());
        itemModelGenerators.generateTrimmableArmorSet(ModItems.TOXIC_HELMET, ModItems.TOXIC_CHESTPLATE, ModItems.TOXIC_LEGGINGS, ModItems.TOXIC_BOOTS, false, Map.of());

        itemModelGenerators.generateFlatItem(ModItems.DEMON_SLAYER_1_MUSIC_DISC, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMON_SLAYER_2_MUSIC_DISC, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMON_SLAYER_3_MUSIC_DISC, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMON_SLAYER_4_MUSIC_DISC, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMON_SLAYER_OST_1_MUSIC_DISC, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DEMON_SLAYER_OST_2_MUSIC_DISC, ModelTemplates.FLAT_ITEM);
    }
}
