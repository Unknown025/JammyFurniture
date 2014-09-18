package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelTV
  extends ModelBase
{
  ModelRenderer TVBase;
  ModelRenderer AreialBig;
  ModelRenderer AreialSmall;
  ModelRenderer Button1;
  ModelRenderer Button2;
  ModelRenderer Button3;
  
  public jfm_ModelTV()
  {
    this.textureWidth = 64;
    this.textureHeight = 32;
    
    this.TVBase = new ModelRenderer(this, 0, 0);
    this.TVBase.addBox(0.0F, 0.0F, 0.0F, 16, 12, 9);
    this.TVBase.setRotationPoint(-8.0F, 12.0F, -4.0F);
    this.TVBase.setTextureSize(64, 32);
    this.TVBase.mirror = true;
    setRotation(this.TVBase, 0.0F, 0.0F, 0.0F);
    this.AreialBig = new ModelRenderer(this, 52, 0);
    this.AreialBig.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1);
    this.AreialBig.setRotationPoint(-2.0F, 4.0F, 0.0F);
    this.AreialBig.setTextureSize(64, 32);
    this.AreialBig.mirror = true;
    setRotation(this.AreialBig, 0.0F, 0.0F, -0.26025F);
    this.AreialSmall = new ModelRenderer(this, 52, 0);
    this.AreialSmall.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1);
    this.AreialSmall.setRotationPoint(4.0F, 6.0F, 0.0F);
    this.AreialSmall.setTextureSize(64, 32);
    this.AreialSmall.mirror = true;
    setRotation(this.AreialSmall, 0.0F, 0.0F, 0.4089647F);
    this.Button1 = new ModelRenderer(this, 0, 23);
    this.Button1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
    this.Button1.setRotationPoint(5.0F, 21.0F, -5.0F);
    this.Button1.setTextureSize(64, 32);
    this.Button1.mirror = true;
    setRotation(this.Button1, 0.0F, 0.0F, 0.0F);
    this.Button2 = new ModelRenderer(this, 0, 23);
    this.Button2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
    this.Button2.setRotationPoint(5.0F, 18.0F, -5.0F);
    this.Button2.setTextureSize(64, 32);
    this.Button2.mirror = true;
    setRotation(this.Button2, 0.0F, 0.0F, 0.0F);
    this.Button3 = new ModelRenderer(this, 10, 23);
    this.Button3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Button3.setRotationPoint(5.5F, 16.0F, -5.0F);
    this.Button3.setTextureSize(64, 32);
    this.Button3.mirror = true;
    setRotation(this.Button3, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.TVBase.render(f5);
    this.AreialBig.render(f5);
    this.AreialSmall.render(f5);
    this.Button1.render(f5);
    this.Button2.render(f5);
    this.Button3.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.TVBase.render(f5);
    this.AreialBig.render(f5);
    this.AreialSmall.render(f5);
    this.Button1.render(f5);
    this.Button2.render(f5);
    this.Button3.render(f5);
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
