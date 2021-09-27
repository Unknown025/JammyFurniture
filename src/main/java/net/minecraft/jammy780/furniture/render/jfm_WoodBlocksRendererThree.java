package net.minecraft.jammy780.furniture.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.jammy780.furniture.model.wood.jfm_ModelBlinds;
import net.minecraft.jammy780.furniture.model.wood.jfm_ModelChair;
import net.minecraft.jammy780.furniture.model.wood.jfm_ModelRadio;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocks;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocksThree;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class jfm_WoodBlocksRendererThree extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private jfm_ModelChair chair;
	private jfm_ModelRadio radio;
	private jfm_ModelBlinds blinds;

	protected static final ResourceLocation textureChair = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_chair.png");
	protected static final ResourceLocation textureRadio = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_radio.png");
	protected static final ResourceLocation textureBlinds = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_blinds.png");

	public jfm_WoodBlocksRendererThree()
	{
		this.chair = new jfm_ModelChair();
		this.radio = new jfm_ModelRadio();
		this.blinds = new jfm_ModelBlinds();
	}

	public void renderAModel(jfm_TileEntityWoodBlocksThree tileentity1, double d, double d1, double d2, float f)
	{
		int ch_rot = 0;
		int radio_rot = 0;
		int bl_rot = 0;
		int bl2_rot = 0;
		int i;
		if (tileentity1 == null)
		{
			i = jfm_TileEntityWoodBlocksThree.md;
		}
		else
		{
			Block block = tileentity1.getBlockType();
			i = tileentity1.getBlockMetadata();
			if (i == 0) {
				i = tileentity1.getBlockMetadata();
			}
			if (i == 0) {
				ch_rot = 0;
			}
			if (i == 1) {
				ch_rot = 270;
			}
			if (i == 2) {
				ch_rot = 180;
			}
			if (i == 3) {
				ch_rot = 90;
			}
			if (i == 4) {
				radio_rot = 0;
			}
			if (i == 5) {
				radio_rot = 270;
			}
			if (i == 6) {
				radio_rot = 180;
			}
			if (i == 7) {
				radio_rot = 90;
			}
			if (i == 8) {
				bl_rot = 0;
			}
			if (i == 11) {
				bl_rot = 90;
			}
			if (i == 10) {
				bl_rot = 180;
			}
			if (i == 9) {
				bl_rot = 270;
			}
			if (i == 12) {
				bl2_rot = 0;
			}
			if (i == 13) {
				bl2_rot = 270;
			}
			if (i == 14) {
				bl2_rot = 180;
			}
			if (i == 15) {
				bl2_rot = 90;
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
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(ch_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureChair);
			GL11.glPushMatrix();
			this.chair.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(radio_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureRadio);
			GL11.glPushMatrix();
			this.radio.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 != null) {
				GL11.glRotatef(bl_rot, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureBlinds);
			GL11.glPushMatrix();
			this.blinds.Shape1.rotateAngleX = 26.0F;
			this.blinds.Shape2.rotateAngleX = 26.0F;
			this.blinds.Shape3.rotateAngleX = 26.0F;
			this.blinds.Shape4.rotateAngleX = 26.0F;
			this.blinds.Shape5.rotateAngleX = 26.0F;
			this.blinds.Shape6.rotateAngleX = 26.0F;
			this.blinds.Shape7.rotateAngleX = 26.0F;
			this.blinds.Shape8.rotateAngleX = 26.0F;
			this.blinds.Shape9.rotateAngleX = 26.0F;
			this.blinds.Shape10.rotateAngleX = 26.0F;
			this.blinds.Shape11.rotateAngleX = 26.0F;
			this.blinds.Shape12.rotateAngleX = 26.0F;
			this.blinds.Shape13.rotateAngleX = 26.0F;
			this.blinds.Shape14.rotateAngleX = 26.0F;
			this.blinds.Shape15.rotateAngleX = 26.0F;
			this.blinds.Shape16.rotateAngleX = 26.0F;
			this.blinds.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 != null) {
				GL11.glRotatef(bl2_rot, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureBlinds);
			GL11.glPushMatrix();
			this.blinds.renderModelClosed(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		default: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(ch_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureChair);
			GL11.glPushMatrix();
			this.chair.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		if (tileentity.getWorldObj() == null) {
			renderAModel(null, d, d1, d2, f);
		} else {
			renderAModel((jfm_TileEntityWoodBlocksThree)tileentity, d, d1, d2, f);
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderTileEntityAt(new jfm_TileEntityWoodBlocksThree(metadata), 0.0D, -0.1D, 0.0D, 0.0F);
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
