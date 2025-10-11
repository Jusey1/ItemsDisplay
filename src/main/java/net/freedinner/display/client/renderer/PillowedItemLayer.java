package net.freedinner.display.client.renderer;

import net.freedinner.display.client.model.PillowModel;
import net.freedinner.display.block.GemBlock;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.BlockItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class PillowedItemLayer extends RenderLayer<AbstractDisplayState, PillowModel<AbstractDisplayState>> {
    public PillowedItemLayer(RenderLayerParent<AbstractDisplayState, PillowModel<AbstractDisplayState>> context) {
		super(context);
	}

	@Override
	public void submit(PoseStack pose, SubmitNodeCollector buffer, int light, AbstractDisplayState target, float f1, float f2) {
		if (target.getOffhandItem().getItem() instanceof BlockItem block) {
			this.renderItem(target, block, pose, buffer, light);
		}
	}

	protected void renderItem(AbstractDisplayState target, BlockItem block, PoseStack pose, SubmitNodeCollector buffer, int light) {
		pose.pushPose();
		this.getParentModel().translateToHand(target, HumanoidArm.RIGHT, pose);
		pose.mulPose(Axis.XP.rotationDegrees(-157.5F));
		pose.mulPose(Axis.YP.rotationDegrees(180.0F));
		pose.translate(0.0F, block.getBlock() instanceof GemBlock ? -0.602F : -0.596F, -0.51F);
		target.heldItem.submit(pose, buffer, light, OverlayTexture.NO_OVERLAY, target.outlineColor);
		pose.popPose();
	}
}