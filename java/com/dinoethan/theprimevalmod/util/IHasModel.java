package com.dinoethan.theprimevalmod.util;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public interface IHasModel 
{
	public void registerModels();
	
	//List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos,
	//		int fortune);
}
