package net.freedinner.display.client.renderer;

import net.freedinner.display.Display;
import net.freedinner.display.init.DisplayModels;
import net.freedinner.display.entity.ItemPillow;
import net.freedinner.display.client.model.PillowModel;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

public class PillowRenderer extends LivingEntityRenderer<ItemPillow, AbstractDisplayState, PillowModel<AbstractDisplayState>> {
	public PillowRenderer(EntityRendererProvider.Context context) {
		super(context, new PillowModel(context.bakeLayer(DisplayModels.PILLOW)), 0.0f);
		this.addLayer(new PillowedItemLayer(this, context.getItemRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(AbstractDisplayState target) {
		return ResourceLocation.fromNamespaceAndPath(Display.MODID,"textures/entity/jewelry_pillow/" + target.getType + "_jewelry_pillow.png");
	}

	@Override
	public AbstractDisplayState createRenderState() {
		return new AbstractDisplayState();
	}

	@Override
	public void extractRenderState(ItemPillow display, AbstractDisplayState state, float f1) {
		state.yRot = Mth.rotLerp(f1, display.yRotO, display.getYRot());
		state.itemModel = this.itemRenderer.resolveItemModel(display.getOffhandItem(), display, ItemDisplayContext.THIRD_PERSON_RIGHT_HAND);
		state.lastHit = (float) (display.level().getGameTime() - display.lastHit) + f1;
		state.stack = display.getOffhandItem();
		state.getType = display.getColor();
	}

	@Override
	protected boolean shouldShowName(ItemPillow target, double d) {
		return false;
	}

	@Override
	protected void setupRotations(AbstractDisplayState target, PoseStack pose, float f1, float f2) {
		pose.mulPose(Axis.YP.rotationDegrees(180.0F - f1));
		if (target.lastHit < 5.0F) {
			pose.mulPose(Axis.YP.rotationDegrees(Mth.sin(target.lastHit / 1.5F * (float) Math.PI) * 3.0F));
		}
	}
}