package net.freedinner.display.client.renderer;

import net.freedinner.display.client.model.PillowModel;
import net.freedinner.display.block.GemBlock;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.BlockItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class PillowedItemLayer extends RenderLayer<AbstractDisplayState, PillowModel<AbstractDisplayState>> {
public PillowedItemLayer(RenderLayerParent<AbstractDisplayState, PillowModel<AbstractDisplayState>> context) {
		super(context);
	}

	@Override
	public void render(PoseStack pose, MultiBufferSource buffer, int light, AbstractDisplayState target, float f1, float f2) {
		if (target.getOffhandItem().getItem() instanceof BlockItem block) {
			this.renderItem(target.heldItem, block, pose, buffer, light);
		}
	}

	protected void renderItem(ItemStackRenderState target, BlockItem block, PoseStack pose, MultiBufferSource buffer, int light) {
		pose.pushPose();
		this.getParentModel().translateToHand(HumanoidArm.RIGHT, pose);
		pose.mulPose(Axis.XP.rotationDegrees(-157.5F));
		pose.mulPose(Axis.YP.rotationDegrees(180.0F));
		pose.translate(0.0F, block.getBlock() instanceof GemBlock ? -0.602F : -0.596F, -0.51F);
		target.render(pose, buffer, light, OverlayTexture.NO_OVERLAY);
		pose.popPose();
	}
}