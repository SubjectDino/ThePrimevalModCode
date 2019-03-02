package com.dinoethan.theprimevalmod.util.handlers;


import com.dinoethan.theprimevalmod.util.reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_AVISAURUS_AMBIENT, ENTITY_AVISAURUS_HURT, ENTITY_AVISAURUS_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_AVISAURUS_AMBIENT = registerSound("entity.avisaurus.ambient");
		ENTITY_AVISAURUS_HURT = registerSound("entity.avisaurus.hurt");
		ENTITY_AVISAURUS_DEATH = registerSound("entity.avisaurus.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
