package net.minecraft.jammy780.furniture.model.roofing;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelRoofingInverted
  extends ModelBase
{
  ModelRenderer RoofP5;
  ModelRenderer RoofP1;
  ModelRenderer RoofP3;
  ModelRenderer RoofP2;
  ModelRenderer RoofP4;
  ModelRenderer RoofP7;
  ModelRenderer RoofP6;
  
  public jfm_ModelRoofingInverted()
  {
    this.textureWidth = 128;
    this.textureHeight = 64;
    
    this.RoofP5 = new ModelRenderer(this, 0, 0);
    this.RoofP5.addBox(0.0F, 0.0F, 0.0F, 8, 4, 8);
    this.RoofP5.setRotationPoint(0.0F, 12.0F, 0.0F);
    this.RoofP5.setTextureSize(64, 32);
    this.RoofP5.mirror = true;
    setRotation(this.RoofP5, 0.0F, 0.0F, 0.0F);
    this.RoofP1 = new ModelRenderer(this, 0, 0);
    this.RoofP1.addBox(0.0F, 0.0F, 0.0F, 16, 4, 16);
    this.RoofP1.setRotationPoint(-8.0F, 20.0F, -8.0F);
    this.RoofP1.setTextureSize(64, 32);
    this.RoofP1.mirror = true;
    setRotation(this.RoofP1, 0.0F, 0.0F, 0.0F);
    this.RoofP3 = new ModelRenderer(this, 0, 0);
    this.RoofP3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 12);
    this.RoofP3.setRotationPoint(4.0F, 16.0F, -4.0F);
    this.RoofP3.setTextureSize(64, 32);
    this.RoofP3.mirror = true;
    setRotation(this.RoofP3, 0.0F, 0.0F, 0.0F);
    this.RoofP2 = new ModelRenderer(this, 0, 0);
    this.RoofP2.addBox(0.0F, 0.0F, 0.0F, 12, 4, 16);
    this.RoofP2.setRotationPoint(-8.0F, 16.0F, -8.0F);
    this.RoofP2.setTextureSize(64, 32);
    this.RoofP2.mirror = true;
    setRotation(this.RoofP2, 0.0F, 0.0F, 0.0F);
    this.RoofP4 = new ModelRenderer(this, 0, 0);
    this.RoofP4.addBox(0.0F, 0.0F, 0.0F, 8, 4, 16);
    this.RoofP4.setRotationPoint(-8.0F, 12.0F, -8.0F);
    this.RoofP4.setTextureSize(64, 32);
    this.RoofP4.mirror = true;
    setRotation(this.RoofP4, 0.0F, 0.0F, 0.0F);
    this.RoofP7 = new ModelRenderer(this, 0, 0);
    this.RoofP7.addBox(0.0F, 0.0F, 0.0F, 12, 4, 4);
    this.RoofP7.setRotationPoint(-4.0F, 8.0F, 4.0F);
    this.RoofP7.setTextureSize(64, 32);
    this.RoofP7.mirror = true;
    setRotation(this.RoofP7, 0.0F, 0.0F, 0.0F);
    this.RoofP6 = new ModelRenderer(this, 0, 0);
    this.RoofP6.addBox(0.0F, 0.0F, 0.0F, 4, 4, 16);
    this.RoofP6.setRotationPoint(-8.0F, 8.0F, -8.0F);
    this.RoofP6.setTextureSize(64, 32);
    this.RoofP6.mirror = true;
    setRotation(this.RoofP6, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.RoofP5.render(f5);
    this.RoofP1.render(f5);
    this.RoofP3.render(f5);
    this.RoofP2.render(f5);
    this.RoofP4.render(f5);
    this.RoofP7.render(f5);
    this.RoofP6.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.RoofP5.render(f5);
    this.RoofP1.render(f5);
    this.RoofP3.render(f5);
    this.RoofP2.render(f5);
    this.RoofP4.render(f5);
    this.RoofP7.render(f5);
    this.RoofP6.render(f5);
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
