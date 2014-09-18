package net.minecraft.jammy780.furniture.model.roofing;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelRoofingCorner
  extends ModelBase
{
  ModelRenderer RoofBottom;
  ModelRenderer RoofBottom2;
  ModelRenderer Shape1;
  ModelRenderer Shape5;
  ModelRenderer Shape2;
  ModelRenderer Shape3;
  ModelRenderer Shape4;
  
  public jfm_ModelRoofingCorner()
  {
    this.textureWidth = 128;
    this.textureHeight = 64;
    
    this.RoofBottom = new ModelRenderer(this, 0, 2);
    this.RoofBottom.addBox(0.0F, 0.0F, 0.0F, 4, 4, 12);
    this.RoofBottom.setRotationPoint(4.0F, 20.0F, -4.0F);
    this.RoofBottom.setTextureSize(128, 64);
    this.RoofBottom.mirror = true;
    setRotation(this.RoofBottom, 0.0F, 0.0F, 0.0F);
    this.RoofBottom2 = new ModelRenderer(this, 44, 23);
    this.RoofBottom2.addBox(0.0F, 0.0F, 0.0F, 16, 4, 4);
    this.RoofBottom2.setRotationPoint(-8.0F, 20.0F, -8.0F);
    this.RoofBottom2.setTextureSize(128, 64);
    this.RoofBottom2.mirror = true;
    setRotation(this.RoofBottom2, 0.0F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 8, 8, 4);
    this.Shape1.setRotationPoint(-8.0F, 16.0F, -4.0F);
    this.Shape1.setTextureSize(128, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 4, 8, 12);
    this.Shape5.setRotationPoint(0.0F, 16.0F, -4.0F);
    this.Shape5.setTextureSize(128, 64);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 12, 8);
    this.Shape2.setRotationPoint(-4.0F, 12.0F, 0.0F);
    this.Shape2.setTextureSize(128, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4);
    this.Shape3.setRotationPoint(-8.0F, 12.0F, 0.0F);
    this.Shape3.setTextureSize(128, 64);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 4, 16, 4);
    this.Shape4.setRotationPoint(-8.0F, 8.0F, 4.0F);
    this.Shape4.setTextureSize(128, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.RoofBottom.render(f5);
    this.RoofBottom2.render(f5);
    this.Shape1.render(f5);
    this.Shape5.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.RoofBottom.render(f5);
    this.RoofBottom2.render(f5);
    this.Shape1.render(f5);
    this.Shape5.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
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
