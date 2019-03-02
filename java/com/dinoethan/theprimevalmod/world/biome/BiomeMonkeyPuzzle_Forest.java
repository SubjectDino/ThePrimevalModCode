package com.dinoethan.theprimevalmod.world.biome;


import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.dinoethan.theprimevalmod.entities.EntityAvisaurus;
import com.dinoethan.theprimevalmod.init.ModBlocks;

public class BiomeMonkeyPuzzle_Forest extends Biome {

    public BiomeMonkeyPuzzle_Forest() 
	{
		super(new BiomeProperties("MonkeyPuzzle_Forest").setBaseHeight(0.2F).setHeightVariation(0.15F).setRainfall(0.6F).setTemperature(1.0F));

		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();	
		

		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityAvisaurus.class, 5, 1, 5));
		//this.spawnableCreatureList.add(new SpawnListEntry(EntityObamadon.class, 5, 1, 5));
	    }		
	
	    @SideOnly(Side.CLIENT)
	    public int getGrassColorAtPos(BlockPos pos)
	    {
	    	int i = super.getGrassColorAtPos(pos);
	    	return getModdedBiomeGrassColor(ColorizerGrass.getGrassColor(4102237, i));
	    }
}
