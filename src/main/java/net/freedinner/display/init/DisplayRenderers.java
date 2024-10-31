package net.freedinner.display.init;

import net.freedinner.display.client.renderer.*;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DisplayRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DisplayMobs.DISPLAY.get(), ItemDisplayRenderer::new);
		event.registerEntityRenderer(DisplayMobs.WHITE_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.LG_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.GRAY_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.BLACK_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.RED_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.ORANGE_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.YELLOW_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.LIME_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.GREEN_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.LB_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.CYAN_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.BLUE_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.PURPLE_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.MAGE_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.PINK_PILLOW.get(), PillowRenderer::new);
		event.registerEntityRenderer(DisplayMobs.BROWN_PILLOW.get(), PillowRenderer::new);
	}
}