package net.minecraft.jammy780.furniture.model.heads;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelCowHead extends ModelBase
{
	ModelRenderer head;

	public jfm_ModelCowHead()
	{
		this.textureWidth = 64;
		this.textureHeight = 32;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, 8.0F, 10.0F, 8, 8, 6, 0.0F);
		this.head.setRotationPoint(0.0F, 4.0F, -8.0F);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		setRotation(this.head, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.head.render(f5);
	}

	public void renderModel(float f1)
	{
		this.head.render(f1);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
