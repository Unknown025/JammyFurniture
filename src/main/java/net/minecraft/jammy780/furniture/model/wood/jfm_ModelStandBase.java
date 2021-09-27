package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelStandBase
  extends ModelBase
{
  ModelRenderer Pole;
  ModelRenderer Leg1;
  ModelRenderer Leg3;
  ModelRenderer Leg4;
  ModelRenderer Leg2;
  
  public jfm_ModelStandBase()
  {
    this.textureWidth = 64;
    this.textureHeight = 32;
    
    this.Pole = new ModelRenderer(this, 0, 11);
    this.Pole.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.Pole.setRotationPoint(-0.5F, 8.0F, -0.5F);
    this.Pole.setTextureSize(64, 32);
    this.Pole.mirror = true;
    setRotation(this.Pole, 0.0F, 0.0F, 0.0F);
    this.Leg1 = new ModelRenderer(this, 0, 0);
    this.Leg1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.Leg1.setRotationPoint(0.5F, 17.0F, -0.5F);
    this.Leg1.setTextureSize(64, 32);
    this.Leg1.mirror = true;
    setRotation(this.Leg1, -0.9599311F, 3.141593F, 0.0F);
    this.Leg3 = new ModelRenderer(this, 0, 0);
    this.Leg3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
    this.Leg3.setRotationPoint(-0.5F, 17.0F, 0.5F);
    this.Leg3.setTextureSize(64, 32);
    this.Leg3.mirror = true;
    setRotation(this.Leg3, -0.9599311F, 0.0F, 0.0F);
    this.Leg4 = new ModelRenderer(this, 6, 13);
    this.Leg4.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1);
    this.Leg4.setRotationPoint(-0.5F, 17.0F, 0.5F);
    this.Leg4.setTextureSize(64, 32);
    this.Leg4.mirror = true;
    setRotation(this.Leg4, 0.0F, 3.141593F, 0.9599311F);
    this.Leg2 = new ModelRenderer(this, 6, 13);
    this.Leg2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1);
    this.Leg2.setRotationPoint(0.5F, 17.0F, -0.5F);
    this.Leg2.setTextureSize(64, 32);
    this.Leg2.mirror = true;
    setRotation(this.Leg2, 0.0F, 0.0F, 0.9599311F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Pole.render(f5);
    this.Leg1.render(f5);
    this.Leg3.render(f5);
    this.Leg4.render(f5);
    this.Leg2.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.Pole.render(f5);
    this.Leg1.render(f5);
    this.Leg3.render(f5);
    this.Leg4.render(f5);
    this.Leg2.render(f5);
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
