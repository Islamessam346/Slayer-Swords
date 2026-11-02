package net.slayers.slayerswords.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.state.level.CameraRenderState;
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

    @Override
    public void submit(WildBoarRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        if(state.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.submit(state, poseStack, submitNodeCollector, camera);
    }
}
