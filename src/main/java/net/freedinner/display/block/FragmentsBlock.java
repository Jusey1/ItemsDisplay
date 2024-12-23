package net.freedinner.display.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class FragmentsBlock extends AbstractStackableBlock {
	public static final MapCodec<FragmentsBlock> CODEC = simpleCodec(FragmentsBlock::new);

	public FragmentsBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public MapCodec<FragmentsBlock> codec() {
		return CODEC;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(2, 0, 2, 14, 1, 14);
	}

	@Override
	public int getMaxStackable() {
		return 9;
	}
}