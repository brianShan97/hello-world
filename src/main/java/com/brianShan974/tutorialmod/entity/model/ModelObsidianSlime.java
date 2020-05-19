package com.brianShan974.tutorialmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSlime - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelObsidianSlime extends ModelBase {
    public ModelRenderer body;

    public ModelObsidianSlime() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new ModelRenderer(this, 0, 16);
        this.body.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body.addBox(-3.0F, 17.0F, -3.0F, 6, 6, 6, 5.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
