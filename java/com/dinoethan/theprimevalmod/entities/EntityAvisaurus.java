package com.dinoethan.theprimevalmod.entities;
import com.dinoethan.theprimevalmod.util.handlers.LootTableHandler;
import com.dinoethan.theprimevalmod.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollow;
import net.minecraft.entity.ai.EntityAIFollowOwnerFlying;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILandOnOwnersShoulder;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWanderAvoidWaterFlying;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityAvisaurus extends EntityParrot
{
	public EntityAvisaurus(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.5F, 0.9F);
	}
	
	@Override
	protected void initEntityAI()
	{
	     this.aiSit = new EntityAISit(this);
	        this.tasks.addTask(0, new EntityAIPanic(this, 1.25D));
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(2, this.aiSit);
	        this.tasks.addTask(2, new EntityAIFollowOwnerFlying(this, 1.0D, 5.0F, 1.0F));
	        this.tasks.addTask(2, new EntityAIWanderAvoidWaterFlying(this, 1.0D));
	        this.tasks.addTask(3, new EntityAILandOnOwnersShoulder(this));
	        this.tasks.addTask(3, new EntityAIFollow(this, 1.0D, 3.0F, 7.0F));
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.5D);
        this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.4000000059604645D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
	}
	
	  public float getEyeHeight()
	    {
	        return this.height * 0.6F;
	    }
	
	@Override
	public EntityParrot createChild(EntityAgeable ageable) 
	{
		return new EntityAvisaurus(world);
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.AVISAURUS;
	}
	
	@Override
	public SoundEvent getAmbientSound() 
	{
		return SoundsHandler.ENTITY_AVISAURUS_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		return SoundsHandler.ENTITY_AVISAURUS_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() 
	{
		return SoundsHandler.ENTITY_AVISAURUS_DEATH;
	}
}

