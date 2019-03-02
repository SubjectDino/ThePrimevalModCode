package com.dinoethan.theprimevalmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.AMBER_ORE_BLOCK, new ItemStack(ModItems.AMBER, 1), 5F);
		GameRegistry.addSmelting(ModBlocks.PRECAMBRIAN_ORE, new ItemStack(ModItems.PRECAMBRIAN_INGOT, 1), 100F);
		GameRegistry.addSmelting(ModItems.HESPERORNIS_MEAT, new ItemStack(ModItems.HESPERORNIS_STEAK, 1), 5F);
		GameRegistry.addSmelting(ModItems.MOSASAURUS_MEAT, new ItemStack(ModItems.MOSASAURUS_STEAK, 1), 5F);
	}
}
