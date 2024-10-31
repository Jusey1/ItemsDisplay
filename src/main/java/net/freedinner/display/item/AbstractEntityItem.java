package net.freedinner.display.item;

import net.freedinner.display.init.DisplayConfig;
import net.freedinner.display.entity.AbstractDisplayEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public abstract class AbstractEntityItem extends Item {
	public AbstractEntityItem(Item.Properties props) {
		super(props);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		if (context.getClickedFace() == Direction.DOWN) {
			return InteractionResult.FAIL;
		} else {
			Level world = context.getLevel();
			BlockPlaceContext place = new BlockPlaceContext(context);
			BlockPos pos = place.getClickedPos();
			ItemStack stack = context.getItemInHand();
			Vec3 v = Vec3.atBottomCenterOf(pos);
			AABB nums = this.getType().getDimensions().makeBoundingBox(v.x(), v.y(), v.z());
			if (world.noCollision(null, nums) && world.getEntities(null, nums).isEmpty()) {
				if (world instanceof ServerLevel lvl) {
					AbstractDisplayEntity target = this.getType().create(lvl, EntityType.createDefaultStackConfig(lvl, stack, context.getPlayer()), pos, EntitySpawnReason.SPAWN_ITEM_USE, true, true);
					if (target == null) {
						return InteractionResult.FAIL;
					}
					float r = ((float) DisplayConfig.ROTATION.get());
					float rot = (float) Mth.floor((Mth.wrapDegrees(context.getRotation() - 180.0F) + 22.5F) / r) * r;
					target.moveTo(target.getX(), target.getY(), target.getZ(), rot, 0.0F);
					lvl.addFreshEntityWithPassengers(target);
					world.playSound(null, target.getX(), target.getY(), target.getZ(), SoundEvents.ARMOR_STAND_PLACE, SoundSource.BLOCKS, 0.75F, 0.8F);
					target.gameEvent(GameEvent.ENTITY_PLACE, context.getPlayer());
				}
				stack.shrink(1);
				return InteractionResult.SUCCESS;
			} else {
				return InteractionResult.FAIL;
			}
		}
	}

	public abstract EntityType<? extends AbstractDisplayEntity> getType();
}