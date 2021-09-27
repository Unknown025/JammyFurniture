package net.minecraft.jammy780.furniture.model.lights;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelOutsideLamp
  extends ModelBase
{
  ModelRenderer LampHolder;
  ModelRenderer LampOut;
  ModelRenderer LampDecoBottom;
  ModelRenderer LampMain;
  ModelRenderer LampDecoMid;
  ModelRenderer LampDecoTop;
  ModelRenderer LampUp;
  
  public jfm_ModelOutsideLamp()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.LampHolder = new ModelRenderer(this, 13, 0);
    this.LampHolder.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1);
    this.LampHolder.setRotationPoint(-1.0F, 17.0F, 7.0F);
    this.LampHolder.setTextureSize(64, 32);
    this.LampHolder.mirror = true;
    setRotation(this.LampHolder, 0.0F, 0.0F, 0.0F);
    this.LampOut = new ModelRenderer(this, 0, 0);
    this.LampOut.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
    this.LampOut.setRotationPoint(0.0F, 19.0F, 2.0F);
    this.LampOut.setTextureSize(64, 32);
    this.LampOut.mirror = true;
    setRotation(this.LampOut, 0.0F, 0.0F, 0.0F);
    this.LampDecoBottom = new ModelRenderer(this, 0, 7);
    this.LampDecoBottom.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3);
    this.LampDecoBottom.setRotationPoint(-1.0F, 17.0F, 1.0F);
    this.LampDecoBottom.setTextureSize(64, 32);
    this.LampDecoBottom.mirror = true;
    setRotation(this.LampDecoBottom, 0.0F, 0.0F, 0.0F);
    this.LampMain = new ModelRenderer(this, 0, 18);
    this.LampMain.addBox(0.0F, 0.0F, 0.0F, 5, 6, 5);
    this.LampMain.setRotationPoint(-2.0F, 11.0F, 0.0F);
    this.LampMain.setTextureSize(64, 32);
    this.LampMain.mirror = true;
    setRotation(this.LampMain, 0.0F, 0.0F, 0.0F);
    this.LampDecoMid = new ModelRenderer(this, 5, 13);
    this.LampDecoMid.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3);
    this.LampDecoMid.setRotationPoint(-1.0F, 10.0F, 1.0F);
    this.LampDecoMid.setTextureSize(64, 32);
    this.LampDecoMid.mirror = true;
    setRotation(this.LampDecoMid, 0.0F, 0.0F, 0.0F);
    this.LampDecoTop = new ModelRenderer(this, 0, 15);
    this.LampDecoTop.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.LampDecoTop.setRotationPoint(0.0F, 9.0F, 2.0F);
    this.LampDecoTop.setTextureSize(64, 32);
    this.LampDecoTop.mirror = true;
    setRotation(this.LampDecoTop, 0.0F, 0.0F, 0.0F);
    this.LampUp = new ModelRenderer(this, 0, 12);
    this.LampUp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.LampUp.setRotationPoint(0.0F, 18.0F, 2.0F);
    this.LampUp.setTextureSize(64, 32);
    this.LampUp.mirror = true;
    setRotation(this.LampUp, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.LampHolder.render(f5);
    this.LampOut.render(f5);
    this.LampDecoBottom.render(f5);
    this.LampMain.render(f5);
    this.LampDecoMid.render(f5);
    this.LampDecoTop.render(f5);
    this.LampUp.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.LampHolder.render(f5);
    this.LampOut.render(f5);
    this.LampDecoBottom.render(f5);
    this.LampMain.render(f5);
    this.LampDecoMid.render(f5);
    this.LampDecoTop.render(f5);
    this.LampUp.render(f5);
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
