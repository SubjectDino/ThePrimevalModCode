package com.dinoethan.theprimevalmod.blocks;

import java.util.Random;

import com.dinoethan.theprimevalmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AmberOre extends BlockBase
{

	public AmberOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	    return ModItems.AMBER;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
