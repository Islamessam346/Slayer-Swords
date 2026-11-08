package net.slayers.slayerswords.sound;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.slayers.slayerswords.SlayerSwords;


public class ModSounds {
    public static final SoundEvent DEMON = registerSoundEvent("demon");

    public static final Holder.Reference<SoundEvent> DEMON_SLAYER_1 = registerJukeBoxSong("demon_slayer_1");

    public static final Holder.Reference<SoundEvent> DEMON_SLAYER_2 = registerJukeBoxSong("demon_slayer_2");

    public static final Holder.Reference<SoundEvent> DEMON_SLAYER_3 = registerJukeBoxSong("demon_slayer_3");

    public static final Holder.Reference<SoundEvent> DEMON_SLAYER_4 = registerJukeBoxSong("demon_slayer_4");

    public static final Holder.Reference<SoundEvent> DEMON_SLAYER_OST_1 = registerJukeBoxSong("demon_slayer_ost_1");

    public static final Holder.Reference<SoundEvent> DEMON_SLAYER_OST_2 = registerJukeBoxSong("demon_slayer_ost_2");

    private static Holder.Reference<SoundEvent> registerJukeBoxSong(String name){
        Identifier id = Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void register() {
        SlayerSwords.LOGGER.info("Registering ModSounds for " + SlayerSwords.MOD_ID);
    }
}
