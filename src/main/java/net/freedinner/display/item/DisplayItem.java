package net.freedinner.display.item;

import net.freedinner.display.init.DisplayMobs;
import net.freedinner.display.init.DisplayConfig;
import net.freedinner.display.entity.AbstractDisplayEntity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import java.util.List;

public class DisplayItem extends AbstractEntityItem {
	public DisplayItem(Item.Properties props) {
		super(props);
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(stack, context, list, flag);
		if (DisplayConfig.DISPLAY.get()) {
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_1").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_2").withStyle(ChatFormatting.GRAY));
			list.add(Component.translatable("item.items_displayed.tooltip.item_display_0").withStyle(ChatFormatting.GRAY));
		}
	}

	@Override
	public EntityType<? extends AbstractDisplayEntity> getType() {
		return DisplayMobs.DISPLAY.get();
	}
}