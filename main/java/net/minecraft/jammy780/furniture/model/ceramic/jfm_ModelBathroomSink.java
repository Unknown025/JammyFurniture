package net.minecraft.jammy780.furniture.model.ceramic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelBathroomSink extends ModelBase
{
	ModelRenderer SinkHolder;
	ModelRenderer SinkBase;
	ModelRenderer SinkBack;
	ModelRenderer SinkSideRight;
	ModelRenderer SinkSideLeft;
	ModelRenderer SinkSideFront;
	ModelRenderer TapBase1;
	ModelRenderer TapEnd1;
	ModelRenderer TapBase2;
	ModelRenderer TapEnd2;

	public jfm_ModelBathroomSink()
	{
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.SinkHolder = new ModelRenderer(this, 1, 28);
		this.SinkHolder.addBox(0.0F, 0.0F, 0.0F, 4, 10, 4);
		this.SinkHolder.setRotationPoint(0.0F, 14.0F, -2.0F);
		this.SinkHolder.setTextureSize(64, 32);
		this.SinkHolder.mirror = true;
		setRotation(this.SinkHolder, 0.0F, 0.0F, 0.0F);
		this.SinkBase = new ModelRenderer(this, 1, 14);
		this.SinkBase.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12);
		this.SinkBase.setRotationPoint(-4.0F, 13.0F, -6.0F);
		this.SinkBase.setTextureSize(64, 32);
		this.SinkBase.mirror = true;
		setRotation(this.SinkBase, 0.0F, 0.0F, 0.0F);
		this.SinkBack = new ModelRenderer(this, 18, 28);
		this.SinkBack.addBox(0.0F, 0.0F, 0.0F, 4, 3, 12);
		this.SinkBack.setRotationPoint(4.0F, 10.0F, -6.0F);
		this.SinkBack.setTextureSize(64, 32);
		this.SinkBack.mirror = true;
		setRotation(this.SinkBack, 0.0F, 0.0F, 0.0F);
		this.SinkSideRight = new ModelRenderer(this, 25, 7);
		this.SinkSideRight.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1);
		this.SinkSideRight.setRotationPoint(-4.0F, 11.0F, -6.0F);
		this.SinkSideRight.setTextureSize(64, 32);
		this.SinkSideRight.mirror = true;
		setRotation(this.SinkSideRight, 0.0F, 0.0F, 0.0F);
		this.SinkSideLeft = new ModelRenderer(this, 25, 2);
		this.SinkSideLeft.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1);
		this.SinkSideLeft.setRotationPoint(-4.0F, 11.0F, 5.0F);
		this.SinkSideLeft.setTextureSize(64, 32);
		this.SinkSideLeft.mirror = true;
		setRotation(this.SinkSideLeft, 0.0F, 0.0F, 0.0F);
		this.SinkSideFront = new ModelRenderer(this, 1, 1);
		this.SinkSideFront.addBox(0.0F, 0.0F, 0.0F, 1, 2, 10);
		this.SinkSideFront.setRotationPoint(-4.0F, 11.0F, -5.0F);
		this.SinkSideFront.setTextureSize(64, 32);
		this.SinkSideFront.mirror = true;
		setRotation(this.SinkSideFront, 0.0F, 0.0F, 0.0F);
		this.TapBase1 = new ModelRenderer(this, 1, 43);
		this.TapBase1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		this.TapBase1.setRotationPoint(4.0F, 8.0F, 2.0F);
		this.TapBase1.setTextureSize(64, 64);
		this.TapBase1.mirror = true;
		setRotation(this.TapBase1, 0.0F, 0.0F, 0.0F);
		this.TapEnd1 = new ModelRenderer(this, 1, 47);
		this.TapEnd1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.TapEnd1.setRotationPoint(3.0F, 8.0F, 2.0F);
		this.TapEnd1.setTextureSize(64, 64);
		this.TapEnd1.mirror = true;
		setRotation(this.TapEnd1, 0.0F, 0.0F, 0.0F);
		this.TapBase2 = new ModelRenderer(this, 6, 43);
		this.TapBase2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		this.TapBase2.setRotationPoint(4.0F, 8.0F, -3.0F);
		this.TapBase2.setTextureSize(64, 64);
		this.TapBase2.mirror = true;
		setRotation(this.TapBase2, 0.0F, 0.0F, 0.0F);
		this.TapEnd2 = new ModelRenderer(this, 6, 47);
		this.TapEnd2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
		this.TapEnd2.setRotationPoint(3.0F, 8.0F, -3.0F);
		this.TapEnd2.setTextureSize(64, 64);
		this.TapEnd2.mirror = true;
		setRotation(this.TapEnd2, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.SinkHolder.render(f5);
		this.SinkBase.render(f5);
		this.SinkBack.render(f5);
		this.SinkSideRight.render(f5);
		this.SinkSideLeft.render(f5);
		this.SinkSideFront.render(f5);
		this.TapBase1.render(f5);
		this.TapEnd1.render(f5);
		this.TapBase2.render(f5);
		this.TapEnd2.render(f5);
	}

	public void renderModel(float f5)
	{
		this.SinkHolder.render(f5);
		this.SinkBase.render(f5);
		this.SinkBack.render(f5);
		this.SinkSideRight.render(f5);
		this.SinkSideLeft.render(f5);
		this.SinkSideFront.render(f5);
		this.TapBase1.render(f5);
		this.TapEnd1.render(f5);
		this.TapBase2.render(f5);
		this.TapEnd2.render(f5);
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
