package net.freedinner.display.client.renderer;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.minecraft.client.renderer.entity.state.HoldingEntityRenderState;
import net.minecraft.world.item.ItemStack;

@OnlyIn(Dist.CLIENT)
public class AbstractDisplayState extends HoldingEntityRenderState {
	public ItemStack stack;
	public String getType;
	public float lastHit;
	public float yRot;

	public ItemStack getOffhandItem() {
		return stack;
	}
}