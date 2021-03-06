package net.minecraft.jammy780.furniture.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.jammy780.furniture.model.wood.jfm_ModelBasket;
import net.minecraft.jammy780.furniture.model.wood.jfm_ModelKitchenCupboard;
import net.minecraft.jammy780.furniture.model.wood.jfm_ModelTV;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocks;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocksTwo;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class jfm_WoodBlocksRendererTwo extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private jfm_ModelKitchenCupboard kitchen_cupboard;
	private jfm_ModelTV tv;
	private jfm_ModelBasket basket;

	protected static final ResourceLocation textureCubNT = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_kitchencupboardnotop.png");
	protected static final ResourceLocation textureCub = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_kitchencupboard.png");
	protected static final ResourceLocation textureTV = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_tv.png");
	protected static final ResourceLocation textureBaskRed = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_basket_red.png");
	protected static final ResourceLocation textureBaskBlue = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_basket_blue.png");
	protected static final ResourceLocation textureBaskGreen = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_basket_green.png");
	protected static final ResourceLocation textureBaskGrey = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_basket_grey.png");

	public jfm_WoodBlocksRendererTwo()
	{
		this.kitchen_cupboard = new jfm_ModelKitchenCupboard();
		this.tv = new jfm_ModelTV();
		this.basket = new jfm_ModelBasket();
	}

	public void renderAModel(jfm_TileEntityWoodBlocksTwo tileentity1, double d, double d1, double d2, float f)
	{
		int kc_rot = 0;
		int kct_rot = 0;
		int tv_rot = 0;
		int i;
		if (tileentity1 == null)
		{
			i = jfm_TileEntityWoodBlocksTwo.md;
		}
		else
		{
			Block block = tileentity1.getBlockType();
			i = tileentity1.getBlockMetadata();
			if (i == 0) {
				i = tileentity1.getBlockMetadata();
			}
			if (i == 0) {
				kc_rot = 0;
			}
			if (i == 1) {
				kc_rot = 270;
			}
			if (i == 2) {
				kc_rot = 180;
			}
			if (i == 3) {
				kc_rot = 90;
			}
			if (i == 4) {
				kct_rot = 0;
			}
			if (i == 5) {
				kct_rot = 270;
			}
			if (i == 6) {
				kct_rot = 180;
			}
			if (i == 7) {
				kct_rot = 90;
			}
			if (i == 8) {
				tv_rot = 0;
			}
			if (i == 9) {
				tv_rot = 270;
			}
			if (i == 10) {
				tv_rot = 180;
			}
			if (i == 11) {
				tv_rot = 90;
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
				GL11.glRotatef(kc_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureCubNT);
			GL11.glPushMatrix();
			this.kitchen_cupboard.renderModel(0.0625F);
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
				GL11.glRotatef(kct_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureCub);
			GL11.glPushMatrix();
			this.kitchen_cupboard.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(tv_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureTV);
			GL11.glPushMatrix();
			this.tv.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			if (i == 12) {
				bindTexture(textureBaskRed);
			}
			if (i == 13) {
				bindTexture(textureBaskBlue);
			}
			if (i == 14) {
				bindTexture(textureBaskGreen);
			}
			if (i == 15) {
				bindTexture(textureBaskGrey);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			GL11.glPushMatrix();
			this.basket.renderModel(0.0625F);
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
				GL11.glRotatef(kc_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureCubNT);
			GL11.glPushMatrix();
			this.kitchen_cupboard.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		if (tileentity.getWorldObj() == null) {
			renderAModel(null, d, d1, d2, f);
		} else {
			renderAModel((jfm_TileEntityWoodBlocksTwo)tileentity, d, d1, d2, f);
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderTileEntityAt(new jfm_TileEntityWoodBlocksTwo(metadata), 0.0D, -0.1D, 0.0D, 0.0F);
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
