package com.brianShan974.tutorialmod.entity.render;

import com.brianShan974.tutorialmod.entity.EntityObsidianSlime;
import com.brianShan974.tutorialmod.entity.model.ModelObsidianSlime;
import com.brianShan974.tutorialmod.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObsidianSlime extends RenderLiving<EntityObsidianSlime>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/obsidian_slime.png");

	public RenderObsidianSlime(RenderManager manager) {
		super(manager, new ModelObsidianSlime(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityObsidianSlime entity)
	{
		return TEXTURES;
	}

}
