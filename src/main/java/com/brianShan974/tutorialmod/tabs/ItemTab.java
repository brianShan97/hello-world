package com.brianShan974.tutorialmod.tabs;

import com.brianShan974.tutorialmod.init.ModBlocks;
import com.brianShan974.tutorialmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTab extends CreativeTabs {
	
	public ItemTab() {
		
		super("item_tab");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.OBSIDIAN_INGOT);

	}

}