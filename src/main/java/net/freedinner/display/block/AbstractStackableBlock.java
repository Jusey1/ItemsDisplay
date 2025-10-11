package net.freedinner.display.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.redstone.Orientation;

public abstract class AbstractStackableBlock extends AbstractItemBlock {
	public static final IntegerProperty STACKS = IntegerProperty.create("stacks", 1, 4);

	public AbstractStackableBlock(BlockBehaviour.Properties props) {
		super(props);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false).setValue(STACKS, 1));
	}

	@Override
	public void neighborChanged(BlockState state, Level world, BlockPos pos, Block blok, Orientation ori, boolean bool) {
		if (!world.isClientSide() && !canSurvive(state, world, pos)) {
			if (getStacks(state) > 1) {
				for (int i = 1; i < getStacks(state); i++) {
					Block.popResource(world, pos, this.getStackFor());
				}
			}
		}
		super.neighborChanged(state, world, pos, blok, ori, bool);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState state, Level world, BlockPos pos, Player player, ItemStack stack, boolean check, FluidState fluid) {
		if (getStacks(state) > 1) {
			for (int i = 1; i < getStacks(state); i++) {
				Block.popResource(world, pos, this.getStackFor());
			}
		}
		return super.onDestroyedByPlayer(state, world, pos, player, stack, check, fluid);
	}

	@Override
	public void onDestroyedByPushReaction(BlockState state, Level world, BlockPos pos, Direction dir, FluidState fluid) {
		if (getStacks(state) > 1) {
			for (int i = 1; i < getStacks(state); i++) {
				Block.popResource(world, pos, this.getStackFor());
			}
		}
		super.onDestroyedByPushReaction(state, world, pos, dir, fluid);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(STACKS);
	}

	public int getStacks(BlockState state) {
		return state.getValue(STACKS);
	}

	public BlockState getState(BlockState state) {
		return state.setValue(STACKS, this.getStacks(state) + 1);
	}

	public abstract int getMaxStackable();
}