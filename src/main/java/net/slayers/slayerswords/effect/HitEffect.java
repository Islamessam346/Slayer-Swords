package net.slayers.slayerswords.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

@FunctionalInterface
public interface HitEffect {
    void apply(ServerLevel level, ItemStack stack, LivingEntity target, LivingEntity attacker);

    static HitEffect potion(Holder<MobEffect> effect, int ticks, int amplifier) {
        return (level, stack, target, attacker) -> target.addEffect(new MobEffectInstance(effect, ticks, amplifier));
    }

    static HitEffect fire(int ticks) {
        return (level, stack, target, attacker) -> target.igniteForTicks(ticks);
    }

    static HitEffect freeze(int ticks) {
        return (level, stack, target, attacker) -> target.setTicksFrozen(ticks);
    }

    static HitEffect lifesteal(float amount) {
        return (level, stack, target, attacker) -> attacker.heal(amount);
    }

    static HitEffect launch(float velocity) {
        return (level, stack, target, attacker) -> target.push(0, velocity, 0);
    }

    static HitEffect lightning(int count) {
        return (level, stack, target, attacker) -> {
            for (int i = 0; i < count; i++) {
                LightningBolt bolt = EntityTypes.LIGHTNING_BOLT.create(level, EntitySpawnReason.TRIGGERED);
                if (bolt == null) continue;
                bolt.setPos(target.getX(), target.getY(), target.getZ());
                level.addFreshEntity(bolt);
            }
        };
    }

    static HitEffect explosion(float power) {
        return (level, stack, target, attacker) -> {
            Vec3 velocity = attacker.getDeltaMovement();
            ExplosionShield.run(attacker, () ->
                    level.explode(attacker, target.getX(), target.getY() + 1, target.getZ(),
                    power, Level.ExplosionInteraction.NONE));

            attacker.setDeltaMovement(velocity);
            attacker.hurtMarked = true;
        };
    }

    static HitEffect knockback(double power, double lift) {
        return (level, stack, target, attacker) -> {
            double dx = target.getX() - attacker.getX();
            double dz = target.getZ() - attacker.getZ();
            double length = Math.sqrt(dx*dx + dz*dz);
            target.push(dx / length * power, lift, dz / length * power);
            target.hurtMarked = true;
        };
    }

    static HitEffect particles(ParticleOptions particle, int count) {
        return (level, stack, target, attacker) ->level.sendParticles(
                particle, target.getX(), target.getY() + 1, target.getZ(),
                count, 0.3, 0.5, 0.3, 0.05);
    }
}
