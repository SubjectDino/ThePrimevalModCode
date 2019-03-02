package com.dinoethan.theprimevalmod.blocks;

import com.dinoethan.theprimevalmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AmberBlock extends BlockBase
{
		public AmberBlock(String name, Material material) 
		{
			super(name, material);
			
			setSoundType(SoundType.METAL);
			setHardness(15.0F);
			setResistance(15.0F);
			setHarvestLevel("pickaxe", 2);
		}
		
	}
