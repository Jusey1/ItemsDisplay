package net.freedinner.display.init;

import net.freedinner.display.Display;
import net.freedinner.display.client.model.*;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.api.distmarker.Dist;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;

@EventBusSubscriber(value = Dist.CLIENT)
public class DisplayModels {
	public static final ModelLayerLocation DISPLAY = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Display.MODID, "display"), "main");
	public static final ModelLayerLocation PILLOW = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Display.MODID, "pillow"), "main");

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(DISPLAY, ItemDisplayModel::createBodyLayer);
		event.registerLayerDefinition(PILLOW, PillowModel::createBodyLayer);
	}
}