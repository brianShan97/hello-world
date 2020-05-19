package com.brianShan974.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.brianShan974.tutorialmod.Main;
import com.brianShan974.tutorialmod.items.ItemBase;
import com.brianShan974.tutorialmod.items.armor.ArmorBase;
import com.brianShan974.tutorialmod.items.food.EffectFoodBase;
import com.brianShan974.tutorialmod.items.food.FoodBase;
import com.brianShan974.tutorialmod.items.tools.ToolAxe;
import com.brianShan974.tutorialmod.items.tools.ToolHoe;
import com.brianShan974.tutorialmod.items.tools.ToolPickaxe;
import com.brianShan974.tutorialmod.items.tools.ToolSpade;
import com.brianShan974.tutorialmod.items.tools.ToolSword;
import com.brianShan974.tutorialmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 2500, 12.0f, 3.0f, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian", Reference.MOD_ID + ":obsidian", 40, new int[] {3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot", Main.ITEM_TAB);
	
	//tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", Main.ITEM_TAB, MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", Main.ITEM_TAB, MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", Main.ITEM_TAB, MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SPADE = new ToolSpade("obsidian_spade", Main.ITEM_TAB, MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", Main.ITEM_TAB, MATERIAL_OBSIDIAN);
	
	//foods
	//public static final ItemFood OBSIDIAN_CHOCOLATE = new FoodBase("obsidian_chocolate", 2, 0.5f, false, CreativeTabs.FOOD);
	public static final ItemFood OBSIDIAN_CHOCOLATE = new EffectFoodBase("obsidian_chocolate", 2, 0.5f, false, CreativeTabs.FOOD, new PotionEffect(MobEffects.POISON, 60*20, 3, false, true));
	
	//armors
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD, CreativeTabs.COMBAT);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST, CreativeTabs.COMBAT);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS, CreativeTabs.COMBAT);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET, CreativeTabs.COMBAT);
	
}