package net.minecraft.jammy780.furniture.model.wood;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelKitchenCupboard
  extends ModelBase
{
  ModelRenderer Main;
  ModelRenderer Handle;
  
  public jfm_ModelKitchenCupboard()
  {
    this.textureWidth = 64;
    this.textureHeight = 32;
    
    this.Main = new ModelRenderer(this, 0, 0);
    this.Main.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
    this.Main.setRotationPoint(-8.0F, 8.0F, -8.0F);
    this.Main.setTextureSize(64, 32);
    this.Main.mirror = true;
    setRotation(this.Main, 0.0F, 0.0F, 0.0F);
    this.Handle = new ModelRenderer(this, 0, 0);
    this.Handle.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
    this.Handle.setRotationPoint(-6.0F, 15.0F, -9.0F);
    this.Handle.setTextureSize(64, 32);
    this.Handle.mirror = true;
    setRotation(this.Handle, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Main.render(f5);
    this.Handle.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.Main.render(f5);
    this.Handle.render(f5);
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
