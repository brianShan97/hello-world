package com.brianShan974.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.brianShan974.tutorialmod.Main;
import com.brianShan974.tutorialmod.blocks.BlockBase;

import com.brianShan974.tutorialmod.blocks.CryingObsidianBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block CRYING_OBSIDIAN_BLOCK = new CryingObsidianBlock("crying_obsidian_block", Material.IRON, Main.BLOCK_TAB);

}
