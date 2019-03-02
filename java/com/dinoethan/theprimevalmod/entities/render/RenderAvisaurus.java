package com.dinoethan.theprimevalmod.entities.render;

import com.dinoethan.theprimevalmod.entities.EntityAvisaurus;
import com.dinoethan.theprimevalmod.model.ModelAvisaurus;
import com.dinoethan.theprimevalmod.util.reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAvisaurus extends RenderLiving<EntityAvisaurus>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(reference.MOD_ID + ":textures/entities/Avisaurus/avisaurus_male.png");
	
	public RenderAvisaurus(RenderManager manager) 
	{
		super(manager, new ModelAvisaurus(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityAvisaurus entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityAvisaurus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}