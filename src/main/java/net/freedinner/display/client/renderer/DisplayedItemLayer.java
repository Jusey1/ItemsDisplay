package net.freedinner.display.client.renderer;

import net.freedinner.display.client.model.ItemDisplayModel;
import net.freedinner.display.block.SherdBlock;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.BlockItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class DisplayedItemLayer extends RenderLayer<AbstractDisplayState, ItemDisplayModel<AbstractDisplayState>> {
	public DisplayedItemLayer(RenderLayerParent<AbstractDisplayState, ItemDisplayModel<AbstractDisplayState>> context) {
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
		pose.mulPose(Axis.XP.rotationDegrees(-120.0F));
		pose.mulPose(Axis.YP.rotationDegrees(180.0F));
		pose.translate(0.0F, -0.11F, block.getBlock() instanceof SherdBlock ? -0.94F : -1.01F);
		target.heldItem.submit(pose, buffer, light, OverlayTexture.NO_OVERLAY, target.outlineColor);
		pose.popPose();
	}
}