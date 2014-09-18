package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelClockTop
  extends ModelBase
{
  ModelRenderer MiddleTop;
  ModelRenderer ClockFace;
  ModelRenderer Top1;
  ModelRenderer Top4;
  ModelRenderer Top3;
  ModelRenderer Top2;
  
  public jfm_ModelClockTop()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.MiddleTop = new ModelRenderer(this, 0, 53);
    this.MiddleTop.addBox(0.0F, 0.0F, 0.0F, 8, 3, 8);
    this.MiddleTop.setRotationPoint(-4.0F, 21.0F, -4.0F);
    this.MiddleTop.setTextureSize(64, 64);
    this.MiddleTop.mirror = true;
    setRotation(this.MiddleTop, 0.0F, 0.0F, 0.0F);
    this.ClockFace = new ModelRenderer(this, 0, 34);
    this.ClockFace.addBox(0.0F, 0.0F, 0.0F, 10, 9, 10);
    this.ClockFace.setRotationPoint(-5.0F, 12.0F, -5.0F);
    this.ClockFace.setTextureSize(64, 64);
    this.ClockFace.mirror = true;
    setRotation(this.ClockFace, 0.0F, 0.0F, 0.0F);
    this.Top1 = new ModelRenderer(this, 0, 0);
    this.Top1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 6);
    this.Top1.setRotationPoint(-3.0F, 8.0F, -3.0F);
    this.Top1.setTextureSize(64, 64);
    this.Top1.mirror = true;
    setRotation(this.Top1, 0.0F, 0.0F, 0.0F);
    this.Top4 = new ModelRenderer(this, 0, 21);
    this.Top4.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12);
    this.Top4.setRotationPoint(-6.0F, 11.0F, -6.0F);
    this.Top4.setTextureSize(64, 64);
    this.Top4.mirror = true;
    setRotation(this.Top4, 0.0F, 0.0F, 0.0F);
    this.Top3 = new ModelRenderer(this, 0, 10);
    this.Top3.addBox(0.0F, 0.0F, 0.0F, 10, 1, 10);
    this.Top3.setRotationPoint(-5.0F, 10.0F, -5.0F);
    this.Top3.setTextureSize(64, 64);
    this.Top3.mirror = true;
    setRotation(this.Top3, 0.0F, 0.0F, 0.0F);
    this.Top2 = new ModelRenderer(this, 31, 0);
    this.Top2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8);
    this.Top2.setRotationPoint(-4.0F, 9.0F, -4.0F);
    this.Top2.setTextureSize(64, 64);
    this.Top2.mirror = true;
    setRotation(this.Top2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.MiddleTop.render(f5);
    this.ClockFace.render(f5);
    this.Top1.render(f5);
    this.Top4.render(f5);
    this.Top3.render(f5);
    this.Top2.render(f5);
  }
  
  public void renderModel(float f1)
  {
    this.MiddleTop.render(f1);
    this.ClockFace.render(f1);
    this.Top1.render(f1);
    this.Top4.render(f1);
    this.Top3.render(f1);
    this.Top2.render(f1);
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
