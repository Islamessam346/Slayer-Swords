package net.slayers.slayerswords.effect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class EffectOnHitItem extends Item {
    private final List<HitEffect> effects;

    public EffectOnHitItem(Properties properties, HitEffect... effects) {
        super(properties);
        this.effects = List.of(effects);
    }

    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.level() instanceof ServerLevel level) {
            for (HitEffect effect : effects) {
                effect.apply(level, stack, target, attacker);
            }
        }
        super.hurtEnemy(stack, target, attacker);
    }
}
