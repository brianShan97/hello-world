package com.brianShan974.tutorialmod.tabs;

import com.brianShan974.tutorialmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {
	
	public BlockTab() {
		
		super("block_tab");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(Item.getItemFromBlock(ModBlocks.CRYING_OBSIDIAN_BLOCK));

	}

}
