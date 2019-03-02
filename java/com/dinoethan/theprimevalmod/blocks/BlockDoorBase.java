package com.dinoethan.theprimevalmod.blocks;

import java.util.List;
import java.util.Random;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.init.ModBlocks;
import com.dinoethan.theprimevalmod.init.ModItems;
import com.dinoethan.theprimevalmod.itemblocks.ItemBlockDoor;
import com.dinoethan.theprimevalmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDoorBase extends BlockDoor implements IHasModel
{
	public BlockDoorBase(String name, Material materialIn, CreativeTabs tab) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setSoundType(SoundType.WOOD);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlockDoor(this).setRegistryName(name));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(this);
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(this);
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}
