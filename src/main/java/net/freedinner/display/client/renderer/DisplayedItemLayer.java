package net.freedinner.display.client.renderer;

import net.freedinner.display.client.model.ItemDisplayModel;
import net.freedinner.display.block.SherdBlock;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.BlockItem;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class DisplayedItemLayer extends RenderLayer<AbstractDisplayState, ItemDisplayModel<AbstractDisplayState>> {
	private final ItemRenderer item;

	public DisplayedItemLayer(RenderLayerParent<AbstractDisplayState, ItemDisplayModel<AbstractDisplayState>> context, ItemRenderer target) {
		super(context);
		this.item = target;
	}

	@Override
	public void render(PoseStack pose, MultiBufferSource buffer, int light, AbstractDisplayState target, float f1, float f2) {
		ItemStack stack = target.getOffhandItem();
		if (stack.getItem() instanceof BlockItem block) {
			this.renderItem(target, stack, block, pose, buffer, light);
		}
	}

	protected void renderItem(AbstractDisplayState target, ItemStack stack, BlockItem block, PoseStack pose, MultiBufferSource buffer, int light) {
		pose.pushPose();
		this.getParentModel().translateToHand(HumanoidArm.RIGHT, pose);
		pose.mulPose(Axis.XP.rotationDegrees(-120.0F));
		pose.mulPose(Axis.YP.rotationDegrees(180.0F));
		pose.translate(0.0F, -0.11F, block.getBlock() instanceof SherdBlock ? -0.94F : -1.01F);
		this.item.render(stack, ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, false, pose, buffer, light, OverlayTexture.NO_OVERLAY,target.getDisplayModel());
		pose.popPose();
	}
}