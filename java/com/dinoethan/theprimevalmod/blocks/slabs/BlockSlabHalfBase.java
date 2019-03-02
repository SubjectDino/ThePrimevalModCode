package com.dinoethan.theprimevalmod.blocks.slabs;

import java.util.List;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.init.ModItems;
import com.dinoethan.theprimevalmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSlabHalfBase extends BlockSlabBase implements IHasModel
{
	public BlockSlabHalfBase(String name, Material materialIn, CreativeTabs tab, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, materialIn, tab, half);
		
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

	@Override
	public void registerModels() 
	{
		main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}
