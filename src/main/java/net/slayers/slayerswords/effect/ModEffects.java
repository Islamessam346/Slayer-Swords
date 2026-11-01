package net.slayers.slayerswords.effect;

import net.slayers.slayerswords.SlayerSwords;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ModEffects {
    public static final Holder<MobEffect> BLOOD_CURSE = registerMobEffect("blood_curse",
            new BloodCurseEffect(MobEffectCategory.HARMFUL, 0xff0000));

    private static Holder<MobEffect> registerMobEffect(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name), effect);
    }

    public static void register() {
        SlayerSwords.LOGGER.info("Registering effects for " + SlayerSwords.MOD_ID);
    }
}
