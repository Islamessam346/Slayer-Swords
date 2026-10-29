package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.item.ModArmorMaterials;
import net.slayers.slayerswords.item.ModItems;

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


        itemModelGenerators.generateTrimmableItem(ModItems.SUN_HELMET, ModArmorMaterials.SUN_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SUN_CHESTPLATE, ModArmorMaterials.SUN_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SUN_LEGGINGS, ModArmorMaterials.SUN_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SUN_BOOTS, ModArmorMaterials.SUN_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.SOUND_HELMET, ModArmorMaterials.SOUND_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SOUND_CHESTPLATE, ModArmorMaterials.SOUND_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SOUND_LEGGINGS, ModArmorMaterials.SOUND_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SOUND_BOOTS, ModArmorMaterials.SOUND_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.WIND_HELMET, ModArmorMaterials.WIND_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.WIND_CHESTPLATE, ModArmorMaterials.WIND_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.WIND_LEGGINGS, ModArmorMaterials.WIND_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.WIND_BOOTS, ModArmorMaterials.WIND_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.WATER_HELMET, ModArmorMaterials.WATER_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.WATER_CHESTPLATE, ModArmorMaterials.WATER_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.WATER_LEGGINGS, ModArmorMaterials.WATER_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.WATER_BOOTS, ModArmorMaterials.WATER_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.MIST_HELMET, ModArmorMaterials.MIST_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.MIST_CHESTPLATE, ModArmorMaterials.MIST_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.MIST_LEGGINGS, ModArmorMaterials.MIST_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.MIST_BOOTS, ModArmorMaterials.MIST_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.FLAME_HELMET, ModArmorMaterials.FLAME_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLAME_CHESTPLATE, ModArmorMaterials.FLAME_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLAME_LEGGINGS, ModArmorMaterials.FLAME_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLAME_BOOTS, ModArmorMaterials.FLAME_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.LOVE_HELMET, ModArmorMaterials.LOVE_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.LOVE_CHESTPLATE, ModArmorMaterials.LOVE_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.LOVE_LEGGINGS, ModArmorMaterials.LOVE_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.LOVE_BOOTS, ModArmorMaterials.LOVE_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.SERPENT_HELMET, ModArmorMaterials.SERPENT_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SERPENT_CHESTPLATE, ModArmorMaterials.SERPENT_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SERPENT_LEGGINGS, ModArmorMaterials.SERPENT_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SERPENT_BOOTS, ModArmorMaterials.SERPENT_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.LIGHTNING_HELMET, ModArmorMaterials.LIGHTNING_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.LIGHTNING_CHESTPLATE, ModArmorMaterials.LIGHTNING_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.LIGHTNING_LEGGINGS, ModArmorMaterials.LIGHTNING_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.LIGHTNING_BOOTS, ModArmorMaterials.LIGHTNING_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.BLACK_THUNDER_HELMET, ModArmorMaterials.BLACK_THUNDER_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BLACK_THUNDER_CHESTPLATE, ModArmorMaterials.BLACK_THUNDER_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BLACK_THUNDER_LEGGINGS, ModArmorMaterials.BLACK_THUNDER_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BLACK_THUNDER_BOOTS, ModArmorMaterials.BLACK_THUNDER_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.FLOWER_HELMET, ModArmorMaterials.FLOWER_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLOWER_CHESTPLATE, ModArmorMaterials.FLOWER_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLOWER_LEGGINGS, ModArmorMaterials.FLOWER_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.FLOWER_BOOTS, ModArmorMaterials.FLOWER_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.BEAST_HELMET, ModArmorMaterials.BEAST_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BEAST_CHESTPLATE, ModArmorMaterials.BEAST_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BEAST_LEGGINGS, ModArmorMaterials.BEAST_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.BEAST_BOOTS, ModArmorMaterials.BEAST_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.MOON_HELMET, ModArmorMaterials.MOON_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.MOON_CHESTPLATE, ModArmorMaterials.MOON_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.MOON_LEGGINGS, ModArmorMaterials.MOON_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.MOON_BOOTS, ModArmorMaterials.MOON_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);


    }
}
