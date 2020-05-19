package com.brianShan974.tutorialmod.util.handlers;

import com.brianShan974.tutorialmod.entity.EntityObsidianSlime;
import com.brianShan974.tutorialmod.entity.render.RenderObsidianSlime;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityObsidianSlime.class, new IRenderFactory<EntityObsidianSlime>()
		{
			@Override
			public Render<? super EntityObsidianSlime> createRenderFor(RenderManager manager)
			{
				return new RenderObsidianSlime(manager);
			}
		});
	}
}
