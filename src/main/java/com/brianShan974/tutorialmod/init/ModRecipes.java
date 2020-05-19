package com.brianShan974.tutorialmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.CRYING_OBSIDIAN_BLOCK, new ItemStack(Blocks.OBSIDIAN, 1), 0.7f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT, 5), 0.7f);
		
	}

}

// vanilla blocks:      Blocks.BLOCKNAME
// vanilla items:       Items.ITEMNAME
// mod blocks:          ModBlocks.BLOCKNAME
// mod items:           ModItems.ITEMNAME

// F3+H minecraft:......