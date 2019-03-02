package com.dinoethan.theprimevalmod.tabs;

import com.dinoethan.theprimevalmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PrimevalTab extends CreativeTabs 
{
	public PrimevalTab (String label) { super("primevaltab");
	this.setBackgroundImageName("primeval.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.AMBER);}
	}

