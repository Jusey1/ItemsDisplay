package net.freedinner.display.block;

import net.freedinner.display.init.DisplayProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Direction;

public abstract class AbstractStackableBlock extends AbstractItemBlock {
	public static final IntegerProperty STACKS = DisplayProperties.STACKS;

	public AbstractStackableBlock(BlockBehaviour.Properties props) {
		super(props);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false).setValue(STACKS, 1));
	}

	@Override
	protected void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean check) {
		super.onRemove(state, world, pos, newState, check);
		if (state.getBlock() != newState.getBlock() && getStacks(state) > 1) {
			for (int i = 1; i < getStacks(state); i++) {
				Block.popResource(world, pos, this.getStackFor());
			}
		}
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