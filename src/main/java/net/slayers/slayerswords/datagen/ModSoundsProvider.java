package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.SoundType;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.sound.ModSounds;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.DEMON, SoundTypeBuilder.of(ModSounds.DEMON).subtitle("sounds.slayerswords.demon")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "demon"))));

        exporter.add(ModSounds.DEMON_SLAYER_1, SoundTypeBuilder.of(ModSounds.DEMON_SLAYER_1.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "demon_slayer_1")).stream(true)));

        exporter.add(ModSounds.DEMON_SLAYER_2, SoundTypeBuilder.of(ModSounds.DEMON_SLAYER_2.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "demon_slayer_2")).stream(true)));

        exporter.add(ModSounds.DEMON_SLAYER_3, SoundTypeBuilder.of(ModSounds.DEMON_SLAYER_3.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "demon_slayer_3")).stream(true)));

        exporter.add(ModSounds.DEMON_SLAYER_4, SoundTypeBuilder.of(ModSounds.DEMON_SLAYER_4.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "demon_slayer_4")).stream(true)));



    }

    @Override
    public String getName() {
        return "SlayerSwords Sounds";
    }
}
