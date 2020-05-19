package com.brianShan974.tutorialmod;

import com.brianShan974.tutorialmod.init.ModRecipes;
import com.brianShan974.tutorialmod.proxy.CommonProxy;
import com.brianShan974.tutorialmod.tabs.BlockTab;
import com.brianShan974.tutorialmod.tabs.ItemTab;
import com.brianShan974.tutorialmod.util.Reference;
import com.brianShan974.tutorialmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs BLOCK_TAB = new BlockTab();
	public static CreativeTabs ITEM_TAB = new ItemTab();

}
