package net.minecraft.jammy780.furniture.model.roofing;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class jfm_ModelRoofingBlock
  extends ModelBase
{
  ModelRenderer RoofingBlock;
  
  public jfm_ModelRoofingBlock()
  {
    this.textureWidth = 128;
    this.textureHeight = 64;
    
    this.RoofingBlock = new ModelRenderer(this, 0, 0);
    this.RoofingBlock.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
    this.RoofingBlock.setRotationPoint(-8.0F, 8.0F, -8.0F);
    this.RoofingBlock.setTextureSize(128, 64);
    this.RoofingBlock.mirror = true;
    setRotation(this.RoofingBlock, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.RoofingBlock.render(f5);
  }
  
  public void renderModel(float f5)
  {
    this.RoofingBlock.render(f5);
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
