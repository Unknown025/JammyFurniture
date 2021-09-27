package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelClockMiddle
  extends ModelBase
{
  ModelRenderer Middle;
  
  public jfm_ModelClockMiddle()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.Middle = new ModelRenderer(this, 0, 0);
    this.Middle.addBox(0.0F, 0.0F, 0.0F, 8, 16, 8);
    this.Middle.setRotationPoint(-4.0F, 8.0F, -4.0F);
    this.Middle.setTextureSize(64, 64);
    this.Middle.mirror = true;
    setRotation(this.Middle, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Middle.render(f5);
  }
  
  public void renderModel(float f1)
  {
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
