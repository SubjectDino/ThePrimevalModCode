package com.dinoethan.theprimevalmod.entities.render;

import com.dinoethan.theprimevalmod.entities.EntityAvisaurus;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityAvisaurus.class, new IRenderFactory<EntityAvisaurus>()
		{
			@Override
			public Render<? super EntityAvisaurus> createRenderFor(RenderManager manager) 
			{
				return new RenderAvisaurus(manager);
			}
		});
	}
}