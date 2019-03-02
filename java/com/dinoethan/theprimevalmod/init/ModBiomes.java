package com.dinoethan.theprimevalmod.init;


import com.dinoethan.theprimevalmod.util.ModConfiguration;
import com.dinoethan.theprimevalmod.world.biome.BiomeMonkeyPuzzle_Forest;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes 
{
	public static final Biome MONKEYPUZZLE_FOREST = new BiomeMonkeyPuzzle_Forest();
	
	public static void registerBiomes()
	{
		initBiome(MONKEYPUZZLE_FOREST, "MonkeyPuzzle_Forest", BiomeType.WARM, Type.FOREST, Type.CONIFEROUS);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		
		if(ModConfiguration.spawnCustomBiomesInOverworld) 
		{
			BiomeManager.addSpawnBiome(biome);
		}
		return biome;
	}
}
