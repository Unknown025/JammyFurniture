package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelClockBase
  extends ModelBase
{
  ModelRenderer Base;
  ModelRenderer BaseTop;
  ModelRenderer Middle;
  
  public jfm_ModelClockBase()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.Base = new ModelRenderer(this, 3, 2);
    this.Base.addBox(0.0F, 0.0F, 0.0F, 12, 10, 12);
    this.Base.setRotationPoint(-6.0F, 14.0F, -6.0F);
    this.Base.setTextureSize(64, 32);
    this.Base.mirror = true;
    setRotation(this.Base, 0.0F, 0.0F, 0.0F);
    this.BaseTop = new ModelRenderer(this, 3, 28);
    this.BaseTop.addBox(0.0F, 0.0F, 0.0F, 10, 1, 10);
    this.BaseTop.setRotationPoint(-5.0F, 13.0F, -5.0F);
    this.BaseTop.setTextureSize(64, 32);
    this.BaseTop.mirror = true;
    setRotation(this.BaseTop, 0.0F, 0.0F, 0.0F);
    this.Middle = new ModelRenderer(this, 7, 41);
    this.Middle.addBox(0.0F, 0.0F, 0.0F, 8, 5, 8);
    this.Middle.setRotationPoint(-4.0F, 8.0F, -4.0F);
    this.Middle.setTextureSize(64, 64);
    this.Middle.mirror = true;
    setRotation(this.Middle, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Base.render(f5);
    this.BaseTop.render(f5);
    this.Middle.render(f5);
  }
  
  public void renderModel(float f1)
  {
    this.Base.render(f1);
    this.BaseTop.render(f1);
    this.Middle.render(f1);
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
