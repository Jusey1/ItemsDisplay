package net.freedinner.display.events;

import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.init.DisplayTags;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.level.LevelEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import java.util.List;

@EventBusSubscriber
public class DisplayEvents {
	@SubscribeEvent
	public static void onCheck(PlayerInteractEvent.RightClickBlock event) {
		if (event.getEntity().isCrouching() && event.getItemStack().is(DisplayTags.DISPLAYABLE)) {
			DisplayManager.placeItem(event.getEntity(), event.getLevel(), event.getHitVec(), event.getHand() == InteractionHand.MAIN_HAND);
		}
	}

	@SubscribeEvent
	public static void onWorldLoad(LevelEvent.Load event) {
		if (event.getLevel() instanceof ServerLevel lvl) {
			Block[] array = DisplayManager.getBlocks();
			for (Block target : array) {
				List<ItemStack> drops = target.getDrops(target.defaultBlockState(), lvl, BlockPos.containing(0, 256, 0), null);
				if (!drops.isEmpty() && drops.get(0).is(DisplayTags.DISPLAYABLE)) {
					BlockAssociations.addToMap(drops.get(0).getItem(), target);
				}
			}
		}
	}
}