package com.dinoethan.theprimevalmod.items.food;

import java.util.List;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.init.ModItems;
import com.dinoethan.theprimevalmod.util.IHasModel;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FoodBase extends ItemFood implements IHasModel 
{
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(main.primevaltab);
		
		ModItems.ITEMS.add(this);
	}

	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
