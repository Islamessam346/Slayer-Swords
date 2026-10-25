package net.slayers.slayerswords.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.resources.Identifier;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.block.ModBlocks;
import net.slayers.slayerswords.block.entity.custom.PedestalBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BLOCK_ENTITY = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "pedestal_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL_BLOCK).build()
    );

    public static void registerBlockEntities() {
        SlayerSwords.LOGGER.info("Registering ModBlockEntities for " + SlayerSwords.MOD_ID);
    }
}
