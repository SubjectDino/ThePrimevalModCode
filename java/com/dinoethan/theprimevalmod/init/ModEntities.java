package com.dinoethan.theprimevalmod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.entities.EntityAvisaurus;
import com.dinoethan.theprimevalmod.util.ModConfiguration;
import com.dinoethan.theprimevalmod.util.reference;

public class ModEntities 
{
	public static void registerEntities()
	{
		registerEntity("avisaurus", EntityAvisaurus.class, ModConfiguration.ENTITY_AVISAURUS_ID, 50, 7096367, 5145034);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(reference.MOD_ID + ":" + name), entity, name, id, main.instance, range, 1, true, color1, color2);
	}
}
//5145034
//11899729