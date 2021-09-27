package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelStandTop
  extends ModelBase
{
  ModelRenderer Pole;
  ModelRenderer Deco1;
  ModelRenderer Deco2;
  ModelRenderer SpindelBottom4;
  ModelRenderer SpindelBottom3;
  ModelRenderer SpindelBottom1;
  ModelRenderer SpindelBottom2;
  ModelRenderer SpindelTop1;
  ModelRenderer SpindelTop4;
  ModelRenderer SpindelTop3;
  ModelRenderer SpindelTop2;
  
  public jfm_ModelStandTop()
  {
    this.textureWidth = 64;
    this.textureHeight = 32;
    
    this.Pole = new ModelRenderer(this, 13, 0);
    this.Pole.addBox(0.0F, 0.0F, 0.0F, 1, 13, 1);
    this.Pole.setRotationPoint(-0.5F, 11.0F, -0.5F);
    this.Pole.setTextureSize(64, 32);
    this.Pole.mirror = true;
    setRotation(this.Pole, 0.0F, 0.0F, 0.0F);
    this.Deco1 = new ModelRenderer(this, 0, 13);
    this.Deco1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.Deco1.setRotationPoint(-1.0F, 9.5F, -1.0F);
    this.Deco1.setTextureSize(64, 32);
    this.Deco1.mirror = true;
    setRotation(this.Deco1, 0.0F, 0.0F, 0.0F);
    this.Deco2 = new ModelRenderer(this, 10, 15);
    this.Deco2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Deco2.setRotationPoint(-0.5F, 9.0F, -0.5F);
    this.Deco2.setTextureSize(64, 32);
    this.Deco2.mirror = true;
    setRotation(this.Deco2, 0.0F, 0.0F, 0.0F);
    this.SpindelBottom4 = new ModelRenderer(this, 0, 8);
    this.SpindelBottom4.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.SpindelBottom4.setRotationPoint(0.0F, 18.0F, 0.5F);
    this.SpindelBottom4.setTextureSize(64, 32);
    this.SpindelBottom4.mirror = true;
    setRotation(this.SpindelBottom4, 0.0F, -3.141593F, -0.4363323F);
    this.SpindelBottom3 = new ModelRenderer(this, 0, 0);
    this.SpindelBottom3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
    this.SpindelBottom3.setRotationPoint(-0.5F, 18.0F, 0.0F);
    this.SpindelBottom3.setTextureSize(64, 32);
    this.SpindelBottom3.mirror = true;
    setRotation(this.SpindelBottom3, 0.4363323F, 0.0F, 0.0F);
    this.SpindelBottom1 = new ModelRenderer(this, 0, 0);
    this.SpindelBottom1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
    this.SpindelBottom1.setRotationPoint(0.5F, 18.0F, 0.0F);
    this.SpindelBottom1.setTextureSize(64, 32);
    this.SpindelBottom1.mirror = true;
    setRotation(this.SpindelBottom1, 0.4363323F, -3.141593F, 0.0F);
    this.SpindelBottom2 = new ModelRenderer(this, 0, 8);
    this.SpindelBottom2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.SpindelBottom2.setRotationPoint(0.0F, 18.0F, -0.5F);
    this.SpindelBottom2.setTextureSize(64, 32);
    this.SpindelBottom2.mirror = true;
    setRotation(this.SpindelBottom2, 0.0F, 0.0F, -0.4363323F);
    this.SpindelTop1 = new ModelRenderer(this, 0, 0);
    this.SpindelTop1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
    this.SpindelTop1.setRotationPoint(0.5F, 14.0F, 0.0F);
    this.SpindelTop1.setTextureSize(64, 32);
    this.SpindelTop1.mirror = true;
    setRotation(this.SpindelTop1, 0.4363323F, -3.141593F, 0.0F);
    this.SpindelTop4 = new ModelRenderer(this, 0, 8);
    this.SpindelTop4.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.SpindelTop4.setRotationPoint(0.0F, 14.0F, 0.5F);
    this.SpindelTop4.setTextureSize(64, 32);
    this.SpindelTop4.mirror = true;
    setRotation(this.SpindelTop4, 0.0F, -3.141593F, -0.4363323F);
    this.SpindelTop3 = new ModelRenderer(this, 0, 0);
    this.SpindelTop3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
    this.SpindelTop3.setRotationPoint(-0.5F, 14.0F, 0.0F);
    this.SpindelTop3.setTextureSize(64, 32);
    this.SpindelTop3.mirror = true;
    setRotation(this.SpindelTop3, 0.4363323F, 0.0F, 0.0F);
    this.SpindelTop2 = new ModelRenderer(this, 0, 8);
    this.SpindelTop2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.SpindelTop2.setRotationPoint(0.0F, 14.0F, -0.5F);
    this.SpindelTop2.setTextureSize(64, 32);
    this.SpindelTop2.mirror = true;
    setRotation(this.SpindelTop2, 0.0F, 0.0F, -0.4363323F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Pole.render(f5);
    this.Deco1.render(f5);
    this.Deco2.render(f5);
    this.SpindelBottom4.render(f5);
    this.SpindelBottom3.render(f5);
    this.SpindelBottom1.render(f5);
    this.SpindelBottom2.render(f5);
    this.SpindelTop1.render(f5);
    this.SpindelTop4.render(f5);
    this.SpindelTop3.render(f5);
    this.SpindelTop2.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.Pole.render(f5);
    this.Deco1.render(f5);
    this.Deco2.render(f5);
    this.SpindelBottom4.render(f5);
    this.SpindelBottom3.render(f5);
    this.SpindelBottom1.render(f5);
    this.SpindelBottom2.render(f5);
    this.SpindelTop1.render(f5);
    this.SpindelTop4.render(f5);
    this.SpindelTop3.render(f5);
    this.SpindelTop2.render(f5);
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
