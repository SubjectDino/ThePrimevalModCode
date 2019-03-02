package com.dinoethan.theprimevalmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MonkeyPuzzlePlanks extends BlockBase 
{
	public MonkeyPuzzlePlanks(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(15.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 0);
	}

}
