package net.freedinner.display.events;

import net.freedinner.display.init.DisplayBlocks;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.util.BlockAssociations;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.TagsUpdatedEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import java.util.Optional;

@EventBusSubscriber
public class DisplayEvents {
	@SubscribeEvent
	public static void onCheck(PlayerInteractEvent.RightClickBlock event) {
		if (event.getEntity().isCrouching() && event.getItemStack().is(DisplayTags.DISPLAYABLE)) {
			DisplayManager.placeItem(event.getEntity(), event.getLevel(), event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
		}
	}

	@SubscribeEvent
	public static void onItemCheck(PlayerInteractEvent.RightClickItem event) {
		if (event.getEntity().isCrouching() && event.getItemStack().is(DisplayTags.DISPLAYABLE)) {
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void onTags(TagsUpdatedEvent event) {
		Optional<HolderSet.Named<Item>> items = event.getLookupProvider().lookupOrThrow(Registries.ITEM).get(DisplayTags.DISPLAYABLE);
		if (items.isPresent()) {
			for (Holder<Item> target : items.get()) {
				for (DeferredHolder<Block, ? extends Block> block : DisplayBlocks.REGISTRY.getEntries()) {
					if (target.getRegisteredName().contains(block.getId().getPath()) && BlockAssociations.getItemFor(block.get()) == Items.AIR) {
						BlockAssociations.addToMap(target.value(), block.get());
						break;
					}
				}
			}
		}
	}
}