package com.dinoethan.theprimevalmod.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import com.dinoethan.theprimevalmod.init.ModItems;

public class PrecambrianOre extends BlockBase {

	
	public PrecambrianOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(200.0F);
		setResistance(50.0F);
		setHarvestLevel("pickaxe", 4);
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}

