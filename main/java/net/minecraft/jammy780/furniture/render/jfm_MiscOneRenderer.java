package net.minecraft.jammy780.furniture.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.jammy780.furniture.model.jfm_ModelChimney;
import net.minecraft.jammy780.furniture.model.jfm_ModelChristmasTree;
import net.minecraft.jammy780.furniture.model.jfm_ModelMantlePiece;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityMiscOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocks;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class jfm_MiscOneRenderer extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private jfm_ModelChimney chimney;
	private jfm_ModelMantlePiece mantle_piece;
	private jfm_ModelChristmasTree christmas_tree;

	protected static final ResourceLocation textureChim = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_chimney.png");
	protected static final ResourceLocation textureMantle = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_mantlepiece.png");
	protected static final ResourceLocation textureTree = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_tree.png");

	public jfm_MiscOneRenderer()
	{
		this.chimney = new jfm_ModelChimney();
		this.mantle_piece = new jfm_ModelMantlePiece();
		this.christmas_tree = new jfm_ModelChristmasTree();
	}

	public void renderAModel(jfm_TileEntityMiscOne tileentity1, double d, double d1, double d2, float f)
	{
		int h1_rot = 0;
		int h2_rot = 0;
		int i;
		if (tileentity1 == null)
		{
			i = jfm_TileEntityMiscOne.md;
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
			GL11.glRotatef(h1_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureChim);
			GL11.glPushMatrix();
			this.chimney.renderModel(0.0625F);
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
			GL11.glRotatef(h2_rot, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureMantle);
			GL11.glPushMatrix();
			this.mantle_piece.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
			break;
		case 8: 
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
			if (tileentity1 == null) {
				GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureTree);
			GL11.glPushMatrix();
			this.christmas_tree.renderModel(0.0625F);
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
			bindTexture(textureChim);
			GL11.glPushMatrix();
			this.chimney.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		if (tileentity.getWorldObj() == null) {
			renderAModel(null, d, d1, d2, f);
		} else {
			renderAModel((jfm_TileEntityMiscOne)tileentity, d, d1, d2, f);
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderTileEntityAt(new jfm_TileEntityMiscOne(metadata), 0.0D, -0.1D, 0.0D, 0.0F);
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
