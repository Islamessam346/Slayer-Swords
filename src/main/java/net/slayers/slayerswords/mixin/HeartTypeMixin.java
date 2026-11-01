package net.slayers.slayerswords.mixin;

import net.minecraft.world.entity.player.Player;
import net.slayers.slayerswords.effect.ModEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.client.gui.Hud$HeartType")
public class HeartTypeMixin {
    @Inject(method = "forPlayer", at = @At("RETURN"), cancellable = true)
    private static void slayerswords$blackHearts(Player player, CallbackInfoReturnable<Object> cir) {
        if (!player.hasEffect(ModEffects.BLOOD_CURSE)) return;

        Enum<?> current = (Enum<?>) cir.getReturnValue();
        for (Object constant : current.getDeclaringClass().getEnumConstants()) {
            if (((Enum<?>) constant).name().equals("WITHERED")) {
                cir.setReturnValue(constant);
                return;
            }
        }
    }
}
