package net.minecraft.jammy780.furniture.model.iron;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelDishwasher
  extends ModelBase
{
  ModelRenderer DishwasherMain;
  public ModelRenderer DishwasherDoor;
  ModelRenderer ControlPanel;
  ModelRenderer Dialp1;
  ModelRenderer Button4;
  ModelRenderer Dialp2;
  ModelRenderer Button1;
  ModelRenderer Button2;
  ModelRenderer Button3;
  
  public jfm_ModelDishwasher()
  {
    this.textureWidth = 128;
    this.textureHeight = 64;
    
    this.DishwasherMain = new ModelRenderer(this, 0, 0);
    this.DishwasherMain.addBox(0.0F, 0.0F, 0.0F, 16, 16, 14);
    this.DishwasherMain.setRotationPoint(-8.0F, 8.0F, -6.0F);
    this.DishwasherMain.setTextureSize(128, 64);
    this.DishwasherMain.mirror = true;
    setRotation(this.DishwasherMain, 0.0F, 0.0F, 0.0F);
    this.DishwasherDoor = new ModelRenderer(this, 0, 32);
    this.DishwasherDoor.addBox(-8.0F, -13.0F, -1.0F, 16, 13, 1);
    this.DishwasherDoor.setRotationPoint(0.0F, 24.0F, -6.0F);
    this.DishwasherDoor.setTextureSize(128, 64);
    this.DishwasherDoor.mirror = true;
    setRotation(this.DishwasherDoor, 0.0F, 0.0F, 0.0F);
    this.ControlPanel = new ModelRenderer(this, 0, 49);
    this.ControlPanel.addBox(0.0F, 0.0F, 0.0F, 16, 3, 1);
    this.ControlPanel.setRotationPoint(-8.0F, 8.0F, -7.0F);
    this.ControlPanel.setTextureSize(128, 64);
    this.ControlPanel.mirror = true;
    setRotation(this.ControlPanel, 0.0F, 0.0F, 0.0F);
    this.Dialp1 = new ModelRenderer(this, 37, 33);
    this.Dialp1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
    this.Dialp1.setRotationPoint(5.0F, 8.5F, -7.5F);
    this.Dialp1.setTextureSize(128, 64);
    this.Dialp1.mirror = true;
    setRotation(this.Dialp1, 0.0F, 0.0F, 0.0F);
    this.Button4 = new ModelRenderer(this, 37, 37);
    this.Button4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Button4.setRotationPoint(-2.6F, 9.0F, -7.8F);
    this.Button4.setTextureSize(128, 64);
    this.Button4.mirror = true;
    setRotation(this.Button4, 0.0F, 0.0F, 0.0F);
    this.Dialp2 = new ModelRenderer(this, 37, 37);
    this.Dialp2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Dialp2.setRotationPoint(5.5F, 9.0F, -7.8F);
    this.Dialp2.setTextureSize(128, 64);
    this.Dialp2.mirror = true;
    setRotation(this.Dialp2, 0.0F, 0.0F, 0.0F);
    this.Button1 = new ModelRenderer(this, 37, 37);
    this.Button1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Button1.setRotationPoint(-6.5F, 9.0F, -7.8F);
    this.Button1.setTextureSize(128, 64);
    this.Button1.mirror = true;
    setRotation(this.Button1, 0.0F, 0.0F, 0.0F);
    this.Button2 = new ModelRenderer(this, 37, 37);
    this.Button2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Button2.setRotationPoint(-5.2F, 9.0F, -7.8F);
    this.Button2.setTextureSize(128, 64);
    this.Button2.mirror = true;
    setRotation(this.Button2, 0.0F, 0.0F, 0.0F);
    this.Button3 = new ModelRenderer(this, 37, 37);
    this.Button3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Button3.setRotationPoint(-3.9F, 9.0F, -7.8F);
    this.Button3.setTextureSize(128, 64);
    this.Button3.mirror = true;
    setRotation(this.Button3, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.DishwasherMain.render(f5);
    this.DishwasherDoor.render(f5);
    this.ControlPanel.render(f5);
    this.Dialp1.render(f5);
    this.Button4.render(f5);
    this.Dialp2.render(f5);
    this.Button1.render(f5);
    this.Button2.render(f5);
    this.Button3.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.DishwasherMain.render(f5);
    this.DishwasherDoor.render(f5);
    this.ControlPanel.render(f5);
    this.Dialp1.render(f5);
    this.Button4.render(f5);
    this.Dialp2.render(f5);
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
