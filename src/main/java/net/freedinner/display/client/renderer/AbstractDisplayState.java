package net.freedinner.display.client.renderer;

import net.minecraft.client.resources.model.BakedModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;

@OnlyIn(Dist.CLIENT)
public class AbstractDisplayState extends LivingEntityRenderState {
	public BakedModel itemModel;
	public ItemStack stack;
	public String getType;
	public float lastHit;
	public float yRot;

	public ItemStack getOffhandItem() {
		return stack;
	}

	public BakedModel getDisplayModel() {
		return itemModel;
	}
}