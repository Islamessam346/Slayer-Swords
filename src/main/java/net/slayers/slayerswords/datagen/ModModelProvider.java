package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.slayers.slayerswords.block.ModBlocks;
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
        itemModelGenerators.generateFlatItem(ModItems.DEMON_FLESH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GYUTARO_SCYTHE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_WATER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_FLAME, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_THUNDER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_WIND, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BASIC_NICHIRIN_STONE, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
