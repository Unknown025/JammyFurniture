package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelBasket
  extends ModelBase
{
  ModelRenderer SideFront;
  ModelRenderer SideRight;
  ModelRenderer SideLeft;
  ModelRenderer Base;
  ModelRenderer SideBack;
  
  public jfm_ModelBasket()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.SideFront = new ModelRenderer(this, 11, 38);
    this.SideFront.addBox(0.0F, 0.0F, 0.0F, 14, 6, 1);
    this.SideFront.setRotationPoint(-7.0F, 18.0F, -7.0F);
    this.SideFront.setTextureSize(64, 64);
    this.SideFront.mirror = true;
    setRotation(this.SideFront, 0.0F, 0.0F, 0.0F);
    this.SideRight = new ModelRenderer(this, 0, 0);
    this.SideRight.addBox(0.0F, 0.0F, 0.0F, 1, 6, 12);
    this.SideRight.setRotationPoint(6.0F, 18.0F, -6.0F);
    this.SideRight.setTextureSize(64, 64);
    this.SideRight.mirror = true;
    setRotation(this.SideRight, 0.0F, 0.0F, 0.0F);
    this.SideLeft = new ModelRenderer(this, 0, 0);
    this.SideLeft.addBox(0.0F, 0.0F, 0.0F, 1, 6, 12);
    this.SideLeft.setRotationPoint(-7.0F, 18.0F, -6.0F);
    this.SideLeft.setTextureSize(64, 64);
    this.SideLeft.mirror = true;
    setRotation(this.SideLeft, 0.0F, 0.0F, 0.0F);
    this.Base = new ModelRenderer(this, 0, 48);
    this.Base.addBox(0.0F, 0.0F, 0.0F, 12, 2, 12);
    this.Base.setRotationPoint(-6.0F, 22.0F, -6.0F);
    this.Base.setTextureSize(64, 64);
    this.Base.mirror = true;
    setRotation(this.Base, 0.0F, 0.0F, 0.0F);
    this.SideBack = new ModelRenderer(this, 11, 38);
    this.SideBack.addBox(0.0F, 0.0F, 0.0F, 14, 6, 1);
    this.SideBack.setRotationPoint(-7.0F, 18.0F, 6.0F);
    this.SideBack.setTextureSize(64, 64);
    this.SideBack.mirror = true;
    setRotation(this.SideBack, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.SideFront.render(f5);
    this.SideRight.render(f5);
    this.SideLeft.render(f5);
    this.Base.render(f5);
    this.SideBack.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.SideFront.render(f5);
    this.SideRight.render(f5);
    this.SideLeft.render(f5);
    this.Base.render(f5);
    this.SideBack.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }
}
