package net.minecraft.jammy780.furniture.model.ceramic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelBathroomCupboard extends ModelBase
{
	ModelRenderer CupboardMain;
	ModelRenderer CupboardDoorRight;

	public jfm_ModelBathroomCupboard()
	{
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.CupboardMain = new ModelRenderer(this, 0, 0);
		this.CupboardMain.addBox(0.0F, 0.0F, 0.0F, 12, 12, 5);
		this.CupboardMain.setRotationPoint(-6.0F, 10.0F, 3.0F);
		this.CupboardMain.setTextureSize(64, 64);
		this.CupboardMain.mirror = true;
		setRotation(this.CupboardMain, 0.0F, 0.0F, 0.0F);
		this.CupboardDoorRight = new ModelRenderer(this, 0, 20);
		this.CupboardDoorRight.addBox(0.0F, 0.0F, 0.0F, 12, 12, 1);
		this.CupboardDoorRight.setRotationPoint(-6.0F, 10.0F, 2.0F);
		this.CupboardDoorRight.setTextureSize(64, 64);
		this.CupboardDoorRight.mirror = true;
		setRotation(this.CupboardDoorRight, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.CupboardMain.render(f5);
		this.CupboardDoorRight.render(f5);
	}

	public void renderModel(float f5)
	{
		this.CupboardMain.render(f5);
		this.CupboardDoorRight.render(f5);
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
