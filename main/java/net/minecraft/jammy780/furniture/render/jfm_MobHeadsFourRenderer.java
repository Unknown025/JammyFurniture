package net.minecraft.jammy780.furniture.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.jammy780.furniture.model.heads.jfm_ModelHead;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityMobHeadsFour;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityMobHeadsOne;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class jfm_MobHeadsFourRenderer extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private jfm_ModelHead model_head;

	protected static final ResourceLocation textureEnd = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_enderman.png");
	protected static final ResourceLocation textureSli = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_slime.png");
	protected static final ResourceLocation textureBla = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_blaze.png");
	protected static final ResourceLocation texturePig = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_pigman.png");

	public jfm_MobHeadsFourRenderer()
	{
		this.model_head = new jfm_ModelHead();
	}

	public void renderAModel(jfm_TileEntityMobHeadsFour tileentity1, double d, double d1, double d2, float f)
	{
		int h1_rot = 0;
		int h2_rot = 0;
		int h3_rot = 0;
		int h4_rot = 0;
		int i;
		if (tileentity1 == null)
		{
			i = jfm_TileEntityMobHeadsFour.md;
		}
		else
		{
			Block block = tileentity1.getBlockType();
			i = tileentity1.getBlockMetadata();
			if (i == 0) {
				i = tileentity1.getBlockMetadata();
			}
			if (i == 0) {
				h1_rot = 0;
			}
			if (i == 1) {
				h1_rot = 270;
			}
			if (i == 2) {
				h1_rot = 180;
			}
			if (i == 3) {
				h1_rot = 90;
			}
			if (i == 4) {
				h2_rot = 0;
			}
			if (i == 5) {
				h2_rot = 270;
			}
			if (i == 6) {
				h2_rot = 180;
			}
			if (i == 7) {
				h2_rot = 90;
			}
			if (i == 8) {
				h3_rot = 0;
			}
			if (i == 9) {
				h3_rot = 270;
			}
			if (i == 10) {
				h3_rot = 180;
			}
			if (i == 11) {
				h3_rot = 90;
			}
			if (i == 12) {
				h4_rot = 0;
			}
			if (i == 13) {
				h4_rot = 270;
			}
			if (i == 14) {
				h4_rot = 180;
			}
			if (i == 15) {
				h4_rot = 90;
			}
		}
		switch (i)
		{
		case 0: 
		case 1: 
		case 2: 
		case 3: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null)
			{
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(1.5F, 1.5F, 1.5F);
			}
			GL11.glRotatef(h1_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureEnd);
			GL11.glPushMatrix();
			this.model_head.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null)
			{
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(1.5F, 1.5F, 1.5F);
			}
			GL11.glRotatef(h2_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureSli);
			GL11.glPushMatrix();
			this.model_head.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null)
			{
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(1.5F, 1.5F, 1.5F);
			}
			GL11.glRotatef(h3_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureBla);
			GL11.glPushMatrix();
			this.model_head.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null)
			{
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(1.5F, 1.5F, 1.5F);
			}
			GL11.glRotatef(h4_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(texturePig);
			GL11.glPushMatrix();
			this.model_head.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		default: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null)
			{
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
				GL11.glScalef(1.5F, 1.5F, 1.5F);
			}
			GL11.glRotatef(h1_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureEnd);
			GL11.glPushMatrix();
			this.model_head.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		if (tileentity.getWorldObj() == null) {
			renderAModel(null, d, d1, d2, f);
		} else {
			renderAModel((jfm_TileEntityMobHeadsFour)tileentity, d, d1, d2, f);
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderTileEntityAt(new jfm_TileEntityMobHeadsFour(metadata), 0.0D, 0.4D, 0.2D, 0.0F);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
	{
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId)
	{
		return true;
	}

	@Override
	public int getRenderId()
	{
		return 0;
	}
}
