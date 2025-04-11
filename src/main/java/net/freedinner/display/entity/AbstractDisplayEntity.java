package net.freedinner.display.entity;

import net.freedinner.display.util.BlockAssociations;
import net.freedinner.display.init.DisplayTags;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

public class AbstractDisplayEntity extends LivingEntity {
	public long lastHit;

	public AbstractDisplayEntity(EntityType<? extends LivingEntity> type, Level world) {
		super(type, world);
	}

	@Override
	public InteractionResult interactAt(Player player, Vec3 v, InteractionHand hand) {
		BlockPos pos = BlockPos.containing(this.getX(), this.getY(), this.getZ());
		LevelAccessor world = this.level();
		if (world instanceof ServerLevel lvl && hand == InteractionHand.MAIN_HAND) {
			ItemStack stack = player.getItemInHand(hand);
			ItemStack current = this.getMainHandItem();
			if (current.isEmpty()) {
				Block target = BlockAssociations.getBlockFor(stack.getItem());
				if (stack.is(DisplayTags.DISPLAYABLE) && this.isCorrectBlock(target)) {
					ItemStack copy = stack.copy();
					copy.setCount(1);
					this.setItemInHand(InteractionHand.MAIN_HAND, copy);
					this.setItemInHand(InteractionHand.OFF_HAND, new ItemStack(target.asItem()));
					lvl.playSound(null, pos, target.defaultBlockState().getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
					if (!player.isCreative()) {
						stack.shrink(1);
					}
					player.swing(hand, true);
					return InteractionResult.SUCCESS;
				}
			} else if (player.getMainHandItem().isEmpty()) {
				Block target = BlockAssociations.getBlockFor(current.getItem());
				player.addItem(current);
				current.shrink(1);
				this.getOffhandItem().shrink(1);
				lvl.playSound(null, pos, target.defaultBlockState().getSoundType(world, pos, player).getBreakSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
				player.swing(hand, true);
				return InteractionResult.SUCCESS;
			}
		}
		return InteractionResult.FAIL;
	}

	@Override
	public boolean hurtServer(ServerLevel lvl, DamageSource source, float amount) {
		if (!this.isRemoved()) {
			if (source.getEntity() != null) {
				if (source.isCreativePlayer() || source.is(DamageTypeTags.BYPASSES_INVULNERABILITY) || source.is(DamageTypeTags.IS_EXPLOSION)) {
					this.die(source);
				} else {
					long i = this.level().getGameTime();
					if (i - this.lastHit > 5L) {
						this.level().broadcastEntityEvent(this, (byte) 32);
						this.gameEvent(GameEvent.ENTITY_DAMAGE, source.getEntity());
						this.lastHit = i;
					} else {
						this.die(source);
					}
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		boolean flag = (source.getEntity() instanceof Player player && player.isCreative());
		this.level().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ARMOR_STAND_BREAK, this.getSoundSource(), 1.0F, 1.0F);
		this.showBreakingParticles();
		if (!flag) {
			ItemEntity target = new ItemEntity(this.level(), this.getX(), this.getY(), this.getZ(), this.getPickResult());
			target.setPickUpDelay(10);
			this.level().addFreshEntity(target);
			if (!this.getMainHandItem().isEmpty()) {
				ItemEntity drop = new ItemEntity(this.level(), this.getX(), this.getY(), this.getZ(), this.getMainHandItem());
				drop.setPickUpDelay(10);
				this.level().addFreshEntity(drop);
			}
		}
		this.discard();
	}

	@Override
	public void handleEntityEvent(byte b) {
		if (b == 32) {
			if (this.level().isClientSide) {
				this.level().playLocalSound(this.getX(), this.getY(), this.getZ(), SoundEvents.ARMOR_STAND_HIT, this.getSoundSource(), 0.3F, 1.0F, false);
				this.lastHit = this.level().getGameTime();
			}
		} else {
			super.handleEntityEvent(b);
		}
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ARMOR_STAND_HIT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.ARMOR_STAND_BREAK;
	}

	@Override
	public void setYBodyRot(float f1) {
		this.yBodyRotO = this.yRotO = f1;
		this.yHeadRotO = this.yHeadRot = f1;
	}

	@Override
	public void setYHeadRot(float f1) {
		this.yBodyRotO = this.yRotO = f1;
		this.yHeadRotO = this.yHeadRot = f1;
	}

	@Override
	protected void tickHeadTurn(float f1) {
		this.yBodyRotO = this.yRotO;
		this.yBodyRot = this.getYRot();
	}

	@Override
	public boolean isAffectedByPotions() {
		return false;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity target) {
		//
	}

	@Override
	protected void pushEntities() {
		//
	}

	@Override
	public HumanoidArm getMainArm() {
		return HumanoidArm.RIGHT;
	}

	public boolean isCorrectBlock(Block target) {
		return false;
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0);
		builder = builder.add(Attributes.MAX_HEALTH, 1);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 0);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		return builder;
	}

	private void showBreakingParticles() {
		if (this.level() instanceof ServerLevel lvl) {
			lvl.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, Blocks.OAK_PLANKS.defaultBlockState()), this.getX(), this.getY(0.35D), this.getZ(), 10, this.getBbWidth() / 4.0F, this.getBbHeight() / 4.0F, this.getBbWidth() / 4.0F, 0.05D);
		}
	}
}