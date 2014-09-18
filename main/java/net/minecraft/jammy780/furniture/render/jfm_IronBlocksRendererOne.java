package net.minecraft.jammy780.furniture.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.jammy780.furniture.model.iron.jfm_ModelCoffeeTable;
import net.minecraft.jammy780.furniture.model.iron.jfm_ModelCooker;
import net.minecraft.jammy780.furniture.model.iron.jfm_ModelFridge;
import net.minecraft.jammy780.furniture.model.iron.jfm_ModelRubbishBin;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityIronBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocks;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class jfm_IronBlocksRendererOne extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private jfm_ModelFridge fridge;
	private jfm_ModelCooker cooker;
	private jfm_ModelRubbishBin bin;
	private jfm_ModelCoffeeTable ctable;

	protected static final ResourceLocation textureFridge = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_fridge.png");
	protected static final ResourceLocation textureFreezer = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_freezer.png");
	protected static final ResourceLocation textureCooker = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_cooker.png");
	protected static final ResourceLocation textureBin = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_rubbishbin.png");
	protected static final ResourceLocation textureTable = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_coffeetable.png");

	public jfm_IronBlocksRendererOne()
	{
		this.fridge = new jfm_ModelFridge();
		this.cooker = new jfm_ModelCooker();
		this.bin = new jfm_ModelRubbishBin();
		this.ctable = new jfm_ModelCoffeeTable();
	}

	public void renderAModel(jfm_TileEntityIronBlocksOne tileentity1, double d, double d1, double d2, float f)
	{
		int fri_rot = 0;
		int fre_rot = 0;
		int c_rot = 0;
		float var12 = 0.0F;
		int i;
		if (tileentity1 == null)
		{
			i = jfm_TileEntityIronBlocksOne.md;
		}
		else
		{
			Block block = tileentity1.getBlockType();
			i = tileentity1.getBlockMetadata();
			if (i == 0) {
				i = tileentity1.getBlockMetadata();
			}
			if (i == 0) {
				fri_rot = 180;
			}
			if (i == 1) {
				fri_rot = 90;
			}
			if (i == 2) {
				fri_rot = 0;
			}
			if (i == 3) {
				fri_rot = 270;
			}
			if (i == 4) {
				fre_rot = 180;
			}
			if (i == 5) {
				fre_rot = 90;
			}
			if (i == 6) {
				fre_rot = 0;
			}
			if (i == 7) {
				fre_rot = 270;
			}
			if (i == 8) {
				c_rot = 0;
			}
			if (i == 9) {
				c_rot = 270;
			}
			if (i == 10) {
				c_rot = 180;
			}
			if (i == 11) {
				c_rot = 90;
			}
			var12 = tileentity1.prevLidAngle + (tileentity1.lidAngle - tileentity1.prevLidAngle) * f;
			var12 = 1.0F - var12;
			var12 = 1.0F - var12 * var12 * var12;
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
				GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(fri_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureFridge);
			GL11.glPushMatrix();
			this.fridge.Door.rotateAngleY = (-(var12 * 3.141593F / 2.0F));
			this.fridge.renderModelFridge(0.0625F);
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
				GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(fre_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureFreezer);
			GL11.glPushMatrix();
			this.fridge.Door.rotateAngleY = (-(var12 * 3.141593F / 2.0F));
			this.fridge.renderModelFreezer(0.0625F);
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
				GL11.glRotatef(c_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureCooker);
			GL11.glPushMatrix();
			this.cooker.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 12: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureBin);
			GL11.glPushMatrix();
			this.bin.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 13: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureTable);
			GL11.glPushMatrix();
			this.ctable.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		default: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null) {
				GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(fri_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureFridge);
			GL11.glPushMatrix();
			this.fridge.renderModelFridge(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		if (tileentity.getWorldObj() == null) {
			renderAModel(null, d, d1, d2, f);
		} else {
			renderAModel((jfm_TileEntityIronBlocksOne)tileentity, d, d1, d2, f);
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderTileEntityAt(new jfm_TileEntityIronBlocksOne(metadata), 0.0D, -0.1D, 0.0D, 0.0F);
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
