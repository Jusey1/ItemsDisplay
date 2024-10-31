package net.freedinner.display.init;

import net.neoforged.fml.config.IConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec;

public class DisplayConfig {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final IConfigSpec CONFIG;

	public static final ModConfigSpec.BooleanValue TOOLTIP;
	public static final ModConfigSpec.BooleanValue DISPLAY;
	public static final ModConfigSpec.IntValue ROTATION;
	
	static {
		BUILDER.push("Features");
		TOOLTIP = BUILDER.comment("Should placeable tooltips be enabled?").define("Tooltips", true);
		DISPLAY = BUILDER.comment("Should the item display tooltip be enabled?").define("Display-Tooltip", true);
		ROTATION = BUILDER.comment("The rotation of the item display.").defineInRange("Display-Rotation", 45, 5, 90);
		BUILDER.pop();
		CONFIG = BUILDER.build();
	}
}