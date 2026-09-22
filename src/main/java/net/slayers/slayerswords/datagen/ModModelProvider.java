package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.slayers.slayerswords.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.SUN_ORE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SERPENT_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SERPENT_SCALES, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SUN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SCARLET_ORE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SCARLET_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NICHIRIN_HANDLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WISTERIA_FLOWER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOXIC_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAME_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.VOLCANIC_STONE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.VORTEX_EMBER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WATER_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MARINE_STONE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BLACK_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MOON_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BEAST_NICHIRIN,ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLOWER_NICHIRIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.UPPER_MOON_1_FLESH, ModelTemplates.FLAT_ITEM);



    }
}
