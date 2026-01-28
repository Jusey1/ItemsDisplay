package net.freedinner.display.init;

import net.freedinner.display.Display;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.Identifier;

public class DisplayTags {
	public static final TagKey<Item> DISPLAYABLE = ItemTags.create(Identifier.fromNamespaceAndPath(Display.MODID, "displayable"));
}