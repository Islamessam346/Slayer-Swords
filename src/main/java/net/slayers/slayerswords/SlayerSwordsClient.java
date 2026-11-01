package net.slayers.slayerswords;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.slayers.slayerswords.block.entity.ModBlockEntities;
import net.slayers.slayerswords.block.entity.renderer.PedestalBlockEntityRenderer;
import net.slayers.slayerswords.entity.ModEntities;
import net.slayers.slayerswords.entity.client.ModModelLayerLocations;
import net.slayers.slayerswords.entity.client.WildBoarModel;
import net.slayers.slayerswords.entity.client.WildBoarRenderer;
import net.slayers.slayerswords.menu.ModMenuTypes;
import net.slayers.slayerswords.menu.custom.PedestalScreen;

public class SlayerSwordsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(ModBlockEntities.PEDESTAL_BLOCK_ENTITY, PedestalBlockEntityRenderer::new);

        MenuScreens.register(ModMenuTypes.PEDESTAL_MENU, PedestalScreen::new);

        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.WILD_BOAR, WildBoarModel::createBodyLayer);
        EntityRenderers.register(ModEntities.WILD_BOAR, WildBoarRenderer::new);
    }
}
