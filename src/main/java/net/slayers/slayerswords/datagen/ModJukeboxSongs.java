package net.slayers.slayerswords.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Util;
import net.minecraft.world.item.JukeboxSong;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.sound.ModSounds;

public class ModJukeboxSongs {
    public static final ResourceKey<JukeboxSong>    DEMON_SLAYER_1_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"demon_slayer_1"));

    public static final ResourceKey<JukeboxSong>    DEMON_SLAYER_2_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"demon_slayer_2"));

    public static final ResourceKey<JukeboxSong>    DEMON_SLAYER_3_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID,"demon_slayer_3"));


    public static void bootstrap(BootstrapContext<JukeboxSong> context) {
        register(context, DEMON_SLAYER_1_KEY, ModSounds.DEMON_SLAYER_1, 90, 15);
        register(context, DEMON_SLAYER_2_KEY, ModSounds.DEMON_SLAYER_2, 123,15);
        register(context, DEMON_SLAYER_3_KEY, ModSounds.DEMON_SLAYER_3, 125,15);
    }





    private static void register(BootstrapContext<JukeboxSong> context, ResourceKey<JukeboxSong> key,
                                 Holder.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput){
        context.register(key, new JukeboxSong(soundEvent,
                Component.translatable(Util.makeDescriptionId("jukebox_song", key.identifier())), lengthInSeconds, comparatorOutput));
    }

}
