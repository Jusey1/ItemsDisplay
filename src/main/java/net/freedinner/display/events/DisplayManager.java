package net.freedinner.display.events;

import net.freedinner.display.init.DisplayBlocks;
import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.init.DisplayTags;
import net.freedinner.display.block.AbstractStackableBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import java.util.ArrayList;
import java.util.List;

public class DisplayManager {
	public static void placeItem(Player player, Level world, BlockHitResult rez, boolean check) {
		InteractionHand handy = (check ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND);
		ItemStack stack = player.getItemInHand(handy);
		if (player.isCrouching()) {
			if (stack.is(DisplayTags.DISPLAYABLE) && world instanceof ServerLevel lvl) {
				BlockPos pos = rez.getBlockPos();
				BlockState state = world.getBlockState(pos);
				if (state.getBlock() instanceof AbstractStackableBlock target) {
					if (stack.is(target.getStackFor().getItem()) && target.getStacks(state) < target.getMaxStackable()) {
						world.setBlock(pos, target.getState(state), 2);
						lvl.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
						if (!player.isCreative()) {
							stack.shrink(1);
						}
						player.swing(handy, true);
					}
				} else {
					Block target = BlockAssociations.getBlockFor(stack.getItem());
					if (target.asItem().useOn(new UseOnContext(player, handy, rez)) != InteractionResult.FAIL) {
						lvl.playSound(null, pos.above(), target.defaultBlockState().getSoundType(world, pos.above(), player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
						player.swing(handy, true);
					}
				}
			}
		}
	}

	public static Block[] getBlocks() {
		List<Block> blocks = new ArrayList<>();
		blocks.add(DisplayBlocks.ANGLER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.ARCHER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.ARMS_UP_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.BLADE_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.BREWER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.BURN_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.DANGER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.EXPLORER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.FLOW_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.FRIEND_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.GUSTER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.HEART_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.HEARTBREAK_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.HOWL_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.MINER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.MOURNER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.PLENTY_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.PRIZE_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.SCRAPE_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.SHEAF_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.SHELTER_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.SKULL_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.SNORT_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.DINOSAUR_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.FOOTPRINT_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.GUARDIAN_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.HERO_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.CROWN_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.SPADE_POTTERY_SHERD.get());
		blocks.add(DisplayBlocks.NETHERITE_UPGRADE.get());
		blocks.add(DisplayBlocks.GOTHIC_UPGRADE.get());
		blocks.add(DisplayBlocks.PRESERVED_UPGRADE.get());
		blocks.add(DisplayBlocks.SILVER_UPGRADE.get());
		blocks.add(DisplayBlocks.BOLT_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.COAST_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.DUNE_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.EYE_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.FLOW_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.HOST_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.RAISER_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.RIB_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.SENTRY_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.SHAPER_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.SILENCE_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.SNOUT_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.SPIRE_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.TIDE_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.VEX_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.WARD_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.WAYFINDER_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.WILD_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.KOBOLD_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.NECRO_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.POLAR_ARMOR_TRIM.get());
		blocks.add(DisplayBlocks.BRICK.get());
		blocks.add(DisplayBlocks.NETHER_BRICK.get());
		blocks.add(DisplayBlocks.ASH_BRICK.get());
		blocks.add(DisplayBlocks.IRON_INGOT.get());
		blocks.add(DisplayBlocks.COPPER_INGOT.get());
		blocks.add(DisplayBlocks.GOLD_INGOT.get());
		blocks.add(DisplayBlocks.NETHERITE_INGOT.get());
		blocks.add(DisplayBlocks.AZURE_INGOT.get());
		blocks.add(DisplayBlocks.SCARLET_INGOT.get());
		blocks.add(DisplayBlocks.BRASS_INGOT.get());
		blocks.add(DisplayBlocks.ZINC_INGOT.get());
		blocks.add(DisplayBlocks.SILVER_INGOT.get());
		blocks.add(DisplayBlocks.FRAGMENTS.get());
		blocks.add(DisplayBlocks.FUSIONS.get());
		blocks.add(DisplayBlocks.TASTYS.get());
		blocks.add(DisplayBlocks.COAL.get());
		blocks.add(DisplayBlocks.CHARCOAL.get());
		blocks.add(DisplayBlocks.AMETHYST.get());
		blocks.add(DisplayBlocks.DIAMOND.get());
		blocks.add(DisplayBlocks.EMERALD.get());
		blocks.add(DisplayBlocks.LAPIS.get());
		blocks.add(DisplayBlocks.ECHO.get());
		blocks.add(DisplayBlocks.ALLURITE.get());
		blocks.add(DisplayBlocks.LUMIERE.get());
		blocks.add(DisplayBlocks.MUSIC_FIVE.get());
		blocks.add(DisplayBlocks.MUSIC_ELE.get());
		blocks.add(DisplayBlocks.MUSIC_THREE.get());
		blocks.add(DisplayBlocks.MUSIC_BLOCKS.get());
		blocks.add(DisplayBlocks.MUSIC_CAT.get());
		blocks.add(DisplayBlocks.MUSIC_CHIRP.get());
		blocks.add(DisplayBlocks.MUSIC_CREATOR.get());
		blocks.add(DisplayBlocks.MUSIC_CREATOR_BOX.get());
		blocks.add(DisplayBlocks.MUSIC_FAR.get());
		blocks.add(DisplayBlocks.MUSIC_MALL.get());
		blocks.add(DisplayBlocks.MUSIC_MELLO.get());
		blocks.add(DisplayBlocks.MUSIC_OTHERSIDE.get());
		blocks.add(DisplayBlocks.MUSIC_PIG.get());
		blocks.add(DisplayBlocks.MUSIC_PRECIPICE.get());
		blocks.add(DisplayBlocks.MUSIC_RELIC.get());
		blocks.add(DisplayBlocks.MUSIC_STAL.get());
		blocks.add(DisplayBlocks.MUSIC_SRAD.get());
		blocks.add(DisplayBlocks.MUSIC_WAIT.get());
		blocks.add(DisplayBlocks.MUSIC_WARD.get());
		blocks.add(DisplayBlocks.MUSIC_FUSION.get());
		blocks.add(DisplayBlocks.MUSIC_TASTY.get());
		blocks.add(DisplayBlocks.MUSIC_DRIFT.get());
		blocks.add(DisplayBlocks.MUSIC_COCO.get());
		blocks.add(DisplayBlocks.MUSIC_KOBOLD.get());
		blocks.add(DisplayBlocks.MUSIC_ROT.get());
		return blocks.toArray(new Block[102]);
	}
}