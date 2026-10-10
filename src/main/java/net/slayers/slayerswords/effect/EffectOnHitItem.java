package net.slayers.slayerswords.effect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class EffectOnHitItem extends Item {
    private final List<MobEffectInstance> effects;

    public EffectOnHitItem(Properties properties, List<MobEffectInstance> effects) {
        super(properties);
        this.effects = effects;
    }

    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        for (MobEffectInstance effect : effects) {
            target.addEffect(new MobEffectInstance(effect));
        }
        super.hurtEnemy(stack, target, attacker);
    }
}
