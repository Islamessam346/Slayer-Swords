package net.slayers.slayerswords.entity.client;

import net.slayers.slayerswords.SlayerSwords;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModModelLayerLocations {
    public static final ModelLayerLocation WILD_BOAR =
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "wild_boar"), "main");
}
