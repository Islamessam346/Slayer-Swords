package net.slayers.slayerswords.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
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
    }

    @Override
    public String getName() {
        return "SlayerSwords Sounds";
    }
}
