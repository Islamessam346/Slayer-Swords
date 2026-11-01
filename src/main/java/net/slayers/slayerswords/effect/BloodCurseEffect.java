package net.slayers.slayerswords.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;

import java.util.List;


public class BloodCurseEffect extends MobEffect {
    public BloodCurseEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {
        mob.hurtServer(serverLevel, mob.damageSources().magic(), 0.25f * (amplification + 1));
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplification) {
        int interval = 20 >> amplification;
        if (interval > 0) {
            return tickCount % interval == 0;
        }
        return true;
    }
}
