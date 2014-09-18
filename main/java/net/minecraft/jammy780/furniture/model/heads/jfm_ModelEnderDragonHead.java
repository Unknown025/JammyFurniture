package net.minecraft.jammy780.furniture.model.heads;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelEnderDragonHead extends ModelBase
{
	ModelRenderer JawTop;
	ModelRenderer HeadMain;
	ModelRenderer Ear2;
	ModelRenderer Nostril2;
	ModelRenderer JawBottom;
	ModelRenderer Nostril1;
	ModelRenderer Ear1;

	public jfm_ModelEnderDragonHead()
	{
		this.textureWidth = 64;
		this.textureHeight = 32;

		this.JawTop = new ModelRenderer(this, 0, 18);
		this.JawTop.addBox(0.0F, 0.0F, 0.0F, 6, 3, 8);
		this.JawTop.setRotationPoint(-3.0F, 17.0F, -6.0F);
		this.JawTop.setTextureSize(64, 32);
		this.JawTop.mirror = true;
		setRotation(this.JawTop, 0.0F, 0.0F, 0.0F);
		this.HeadMain = new ModelRenderer(this, 0, 0);
		this.HeadMain.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8);
		this.HeadMain.setRotationPoint(-4.0F, 14.0F, 0.0F);
		this.HeadMain.setTextureSize(64, 32);
		this.HeadMain.mirror = true;
		setRotation(this.HeadMain, 0.0F, 0.0F, 0.0F);
		this.Ear2 = new ModelRenderer(this, 35, 0);
		this.Ear2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3);
		this.Ear2.setRotationPoint(2.0F, 12.0F, 4.0F);
		this.Ear2.setTextureSize(64, 32);
		this.Ear2.mirror = true;
		setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
		this.Nostril2 = new ModelRenderer(this, 35, 7);
		this.Nostril2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.Nostril2.setRotationPoint(1.0F, 16.0F, -5.0F);
		this.Nostril2.setTextureSize(64, 32);
		this.Nostril2.mirror = true;
		setRotation(this.Nostril2, 0.0F, 0.0F, 0.0F);
		this.JawBottom = new ModelRenderer(this, 30, 18);
		this.JawBottom.addBox(0.0F, 0.0F, 0.0F, 6, 2, 8);
		this.JawBottom.setRotationPoint(-3.0F, 21.0F, -6.0F);
		this.JawBottom.setTextureSize(64, 32);
		this.JawBottom.mirror = true;
		setRotation(this.JawBottom, 0.1487144F, 0.0F, 0.0F);
		this.Nostril1 = new ModelRenderer(this, 35, 7);
		this.Nostril1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
		this.Nostril1.setRotationPoint(-2.0F, 16.0F, -5.0F);
		this.Nostril1.setTextureSize(64, 32);
		this.Nostril1.mirror = true;
		setRotation(this.Nostril1, 0.0F, 0.0F, 0.0F);
		this.Ear1 = new ModelRenderer(this, 35, 0);
		this.Ear1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3);
		this.Ear1.setRotationPoint(-3.0F, 12.0F, 4.0F);
		this.Ear1.setTextureSize(64, 32);
		this.Ear1.mirror = true;
		setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.JawTop.render(f5);
		this.HeadMain.render(f5);
		this.Ear2.render(f5);
		this.Nostril2.render(f5);
		this.JawBottom.render(f5);
		this.Nostril1.render(f5);
		this.Ear1.render(f5);
	}

	public void renderModel(float f5)
	{
		this.JawTop.render(f5);
		this.HeadMain.render(f5);
		this.Ear2.render(f5);
		this.Nostril2.render(f5);
		this.JawBottom.render(f5);
		this.Nostril1.render(f5);
		this.Ear1.render(f5);
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
