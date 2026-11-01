package net.slayers.slayerswords.entity.client;

import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.entity.custom.WildBoarEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class WildBoarRenderer extends MobRenderer<WildBoarEntity, WildBoarRenderState, WildBoarModel> {
    public WildBoarRenderer(EntityRendererProvider.Context context) {
        super(context, new WildBoarModel(context.bakeLayer(ModModelLayerLocations.WILD_BOAR)), 0.45f);
    }

    @Override
    public Identifier getTextureLocation(WildBoarRenderState state) {
        return Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "textures/entity/wild_boar/wild_boar.png");
    }

    @Override
    public WildBoarRenderState createRenderState() {
        return new WildBoarRenderState();
    }

    @Override
    public void extractRenderState(WildBoarEntity entity, WildBoarRenderState state, float partialTicks) {
        super.extractRenderState(entity, state, partialTicks);

        state.idleAnimationState.copyFrom(entity.idleAnimationState);
    }
}
