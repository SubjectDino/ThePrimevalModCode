package com.dinoethan.theprimevalmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AmberLamp extends BlockBase
{
	public AmberLamp(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(0.3F);
		setResistance(1.5F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1.0F);
	}
}
