package com.dinoethan.theprimevalmod.util;

import java.io.File;

import com.dinoethan.theprimevalmod.main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration 
{
	public static Configuration config;
	
	public static int ENTITY_AVISAURUS_ID = 201;
	
	public static int DIMENSION_LATE_CRETACEOUS_NORTH_AMERICA_1_ID = 1;
	
	public static boolean spawnCustomBiomesInOverworld = true;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the entities to ensure that they don't clash with other mod's ids");
		ENTITY_AVISAURUS_ID = config.getInt("ENTITY_AVISAURUS_ID", category, 201, 201, 999, "Entity IDs below 201 are used by Minecraft");
		
		category = "GUI IDs";
		
		category = "Dimension IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the dimensions to ensure that they don't clash with other mod's ids");
		DIMENSION_LATE_CRETACEOUS_NORTH_AMERICA_1_ID = config.getInt("DIMENSION_COPPER_ID", category, 2, 2, 999, "Set the ID for the Copper Dimension");
		
		
		category = "Biomes";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");
	
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		main.config = new File(event.getModConfigurationDirectory() + "/" + reference.MOD_ID);
		main.config.mkdirs();
		init(new File(main.config.getPath(), reference.MOD_ID + ".cfg"));
	}
} 