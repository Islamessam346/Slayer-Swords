package net.slayers.slayerswords.effect;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.LivingEntity;

public class ExplosionShield {
    private static LivingEntity shielded;

    public static void run(LivingEntity entity, Runnable explosion) {
        shielded = entity;
        try { explosion.run(); }
        finally { shielded = null; }
    }

    public static void register() {
        ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) ->
                !(entity == shielded && source.is(DamageTypeTags.IS_EXPLOSION)));
    }
}
