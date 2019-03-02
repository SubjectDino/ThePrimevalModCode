package com.dinoethan.theprimevalmod.blocks;

import java.util.List;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.init.ModBlocks;
import com.dinoethan.theprimevalmod.init.ModItems;
import com.dinoethan.theprimevalmod.util.IHasModel;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockStairsBase extends BlockStairs implements IHasModel {

	public BlockStairsBase(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.primevaltab);
		setSoundType(SoundType.WOOD);
		this.useNeighborBrightness = true;
		
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	public void registerModels() 
	{
		main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}

