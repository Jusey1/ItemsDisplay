package net.freedinner.display;

import net.freedinner.display.init.*;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;

@Mod("items_displayed")
public class Display {
	public static final String MODID = "items_displayed";

	public Display(ModContainer mod, IEventBus bus) {
		DisplayMobs.REGISTRY.register(bus);
		DisplayBlocks.REGISTRY.register(bus);
		DisplayItems.REGISTRY.register(bus);
		DisplayTabs.REGISTRY.register(bus);
		mod.registerConfig(ModConfig.Type.COMMON, DisplayConfig.CONFIG, "items-displayed-common.toml");
	}
}