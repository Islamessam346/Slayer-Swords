package net.slayers.slayerswords.entity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.MobCategory;
import net.slayers.slayerswords.SlayerSwords;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.slayers.slayerswords.entity.custom.WildBoarEntity;

public class ModEntities {
    public static final ResourceKey<EntityType<?>> WILD_BOAR_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "wild_boar"));

    public static final EntityType<WildBoarEntity> WILD_BOAR = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "wild_boar"),
            EntityType.Builder.of(WildBoarEntity::new, MobCategory.CREATURE).sized(1.5f, 1f).build(WILD_BOAR_KEY));

    public static void register() {
        SlayerSwords.LOGGER.info("Registering Mod Entities for " + SlayerSwords.MOD_ID);
    }
}
