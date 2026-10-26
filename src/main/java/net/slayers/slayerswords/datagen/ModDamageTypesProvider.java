package net.slayers.slayerswords.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.level.Level;
import net.slayers.slayerswords.SlayerSwords;

public class ModDamageTypesProvider {
    public static final ResourceKey<DamageType> BLOOD_CURSE = ResourceKey.create(Registries.DAMAGE_TYPE,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "blood_curse"));

    public static void bootstrap(BootstrapContext<DamageType> context) {
        context.register(BLOOD_CURSE, new DamageType("blood_curse", 0.5f, DamageEffects.HURT));
    }

    public static DamageSource create(Level level, ResourceKey<DamageType> key) {
        return new DamageSource(level.registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(key));
    }
}
