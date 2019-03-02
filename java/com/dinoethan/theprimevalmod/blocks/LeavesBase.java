package com.dinoethan.theprimevalmod.blocks;

import java.util.List;

import javax.annotation.Nonnull;

import com.dinoethan.theprimevalmod.util.IHasModel;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LeavesBase extends BlockLeaves implements IHasModel {

	@Nonnull
	public
	List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world,
			BlockPos pos, int fortune) {
		return null;
	}

	public void registerModels() {
		
	}

	@Override
	public EnumType getWoodType(int meta) {
		return null;
	}

}
