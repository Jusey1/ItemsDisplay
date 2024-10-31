package net.freedinner.display.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SherdBlock extends AbstractItemBlock implements IDisplayBlock, IPillowBlock {
	public static final MapCodec<SherdBlock> CODEC = simpleCodec(SherdBlock::new);

	public SherdBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public MapCodec<SherdBlock> codec() {
		return CODEC;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(1, 0, 1, 15, 2, 15);
	}
}