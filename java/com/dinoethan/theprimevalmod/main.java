package com.dinoethan.theprimevalmod;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.dinoethan.theprimevalmod.init.ModBiomes;
import com.dinoethan.theprimevalmod.init.ModEntities;
import com.dinoethan.theprimevalmod.init.ModRecipes;
import com.dinoethan.theprimevalmod.proxy.CommonProxy;
import com.dinoethan.theprimevalmod.tabs.PrimevalTab;
import com.dinoethan.theprimevalmod.util.reference;
import com.dinoethan.theprimevalmod.world.ModWorldGen;

@Mod(modid = reference.MOD_ID, name = reference.NAME, version = reference.VERSION)
public class main {
	
	@Instance
	public static main instance;
	
	public static final CreativeTabs primevaltab = new PrimevalTab("primevaltab");
	
	public static File config;
	
	@SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	    ModEntities.registerEntities();
	    ModBiomes.registerBiomes();
	}

	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}

}
