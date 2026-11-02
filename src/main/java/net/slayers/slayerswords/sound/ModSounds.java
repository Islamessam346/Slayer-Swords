package net.slayers.slayerswords.sound;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.slayers.slayerswords.SlayerSwords;

public class ModSounds {
    public static final SoundEvent DEMON = registerSoundEvent("demon");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void register() {
        SlayerSwords.LOGGER.info("Registering ModSounds for " + SlayerSwords.MOD_ID);
    }
}
