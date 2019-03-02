package com.dinoethan.theprimevalmod.init;

import java.util.ArrayList;
import java.util.List;

import com.dinoethan.theprimevalmod.items.ItemBase;
import com.dinoethan.theprimevalmod.items.armor.ArmorBase;
import com.dinoethan.theprimevalmod.items.food.FoodBase;
import com.dinoethan.theprimevalmod.items.tools.ToolAxe;
import com.dinoethan.theprimevalmod.items.tools.ToolHoe;
import com.dinoethan.theprimevalmod.items.tools.ToolPickaxe;
import com.dinoethan.theprimevalmod.items.tools.ToolSpade;
import com.dinoethan.theprimevalmod.items.tools.ToolSword;
import com.dinoethan.theprimevalmod.util.reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_AMBER = EnumHelper.addToolMaterial("material_amber", 4, 1800, 10.0F, 5.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_AMBER = EnumHelper.addArmorMaterial("armor_material_amber", reference.MOD_ID + ":amber", 15, new int [] {5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item AMBER = new ItemBase("amber");
	public static final Item PRECAMBRIAN_INGOT = new ItemBase("precambrian_ingot");
	public static final Item AVISAURUS_FEATHER = new ItemBase("avisaurus_feather");
	
	//Tools
	public static final ItemSword AMBER_SWORD = new ToolSword("amber_sword", MATERIAL_AMBER);
	public static final ItemSpade AMBER_SHOVEL = new ToolSpade ("amber_shovel", MATERIAL_AMBER);
	public static final ItemPickaxe AMBER_PICKAXE = new ToolPickaxe ("amber_pickaxe", MATERIAL_AMBER);
	public static final ItemAxe AMBER_AXE = new ToolAxe ("amber_axe", MATERIAL_AMBER);
	public static final ItemHoe AMBER_HOE = new ToolHoe ("amber_hoe", MATERIAL_AMBER);
	
	//Armor
	public static final Item AMBER_HELMET = new ArmorBase("amber_helmet", ARMOR_MATERIAL_AMBER, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMBER_CHESTPLATE = new ArmorBase("amber_chestplate", ARMOR_MATERIAL_AMBER, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMBER_LEGGINGS = new ArmorBase("amber_leggings", ARMOR_MATERIAL_AMBER, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMBER_BOOTS = new ArmorBase("amber_boots", ARMOR_MATERIAL_AMBER, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item HESPERORNIS_MEAT = new FoodBase("hesperornis_meat", 3, 5.4F, false);
	public static final Item HESPERORNIS_STEAK = new FoodBase("hesperornis_steak", 6, 5.4F, false);
	public static final Item MOSASAURUS_MEAT = new FoodBase("mosasaurus_meat", 5, 10.4F, false);
	public static final Item MOSASAURUS_STEAK = new FoodBase("mosasaurus_steak", 10, 10.4F, false);
	
}
