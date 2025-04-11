package net.freedinner.display.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.init.DisplayConfig;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.ChatFormatting;
import java.util.function.Consumer;

@Mixin(Item.class)
public abstract class ItemMixin {
	@Inject(method = "appendHoverText", at = @At("TAIL"))
	private void applyTooltip(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> list, TooltipFlag flag, CallbackInfo ci) {
		if (DisplayConfig.TOOLTIP.get() && stack.is(DisplayTags.DISPLAYABLE)) {
			list.accept(Component.translatable("item.items_displayed.tooltip.shift_place").withStyle(ChatFormatting.GRAY));
		}
	}
}