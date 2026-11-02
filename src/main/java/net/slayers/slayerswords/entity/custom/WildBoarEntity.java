package net.slayers.slayerswords.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.slayers.slayerswords.entity.ModEntities;
import org.jspecify.annotations.Nullable;

public class WildBoarEntity extends Animal {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public WildBoarEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2f));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.2f));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2f, stack -> stack.is(Items.APPLE), false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.2f));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1f));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6f));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }

    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return PathfinderMob.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 15d)
                .add(Attributes.MOVEMENT_SPEED, 0.2d)
                .add(Attributes.TEMPT_RANGE, 16d)
                .add(Attributes.FOLLOW_RANGE, 24d)
                .add(Attributes.SCALE, 2d);
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        return SoundEvents.CAMEL_AMBIENT;
    }

    @Override
    protected @Nullable SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.CAMEL_HURT;
    }

    @Override
    protected @Nullable SoundEvent getDeathSound() {
        return SoundEvents.CAMEL_DEATH;
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return itemStack.is(Items.APPLE);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel level, AgeableMob partner) {
        WildBoarEntity baby = ModEntities.WILD_BOAR.create(level, EntitySpawnReason.BREEDING);
        return baby;
    }
}
