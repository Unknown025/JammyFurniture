package net.minecraft.jammy780.furniture.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.jammy780.furniture.model.ceramic.jfm_ModelBathroomCupboard;
import net.minecraft.jammy780.furniture.model.ceramic.jfm_ModelBathroomSink;
import net.minecraft.jammy780.furniture.model.ceramic.jfm_ModelKitchenSink;
import net.minecraft.jammy780.furniture.model.ceramic.jfm_ModelToilet;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityCeramicBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocks;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class jfm_CeramicBlocksRendererOne extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private jfm_ModelBathroomCupboard bathroom_cupboard;
	private jfm_ModelBathroomSink bathroom_sink;
	private jfm_ModelKitchenSink kitchen_sink;
	private jfm_ModelToilet toilet;

	protected static final ResourceLocation textureCub = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_bathroomcupboard.png");
	protected static final ResourceLocation textureToilet = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_toilet.png");
	protected static final ResourceLocation textureKitchenSink = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_kitchensink.png");
	protected static final ResourceLocation textureSink = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.TEXTURE_PATH + "jammy_sink.png");

	public jfm_CeramicBlocksRendererOne()
	{
		this.bathroom_cupboard = new jfm_ModelBathroomCupboard();
		this.bathroom_sink = new jfm_ModelBathroomSink();
		this.kitchen_sink = new jfm_ModelKitchenSink();
		this.toilet = new jfm_ModelToilet();
	}

	public void renderAModel(jfm_TileEntityCeramicBlocksOne tileentity1, double d, double d1, double d2, float f)
	{
		int bc_rot = 0;
		int bs_rot = 0;
		int ks_rot = 0;
		int toi_rot = 0;
		int i;
		if (tileentity1 == null)
		{
			i = jfm_TileEntityCeramicBlocksOne.md;
		}
		else
		{
			Block block = tileentity1.getBlockType();
			i = tileentity1.getBlockMetadata();
			if (i == 0) {
				i = tileentity1.getBlockMetadata();
			}
			if (i == 0) {
				bc_rot = 0;
			}
			if (i == 1) {
				bc_rot = 270;
			}
			if (i == 2) {
				bc_rot = 180;
			}
			if (i == 3) {
				bc_rot = 90;
			}
			if (i == 4) {
				bs_rot = 90;
			}
			if (i == 5) {
				bs_rot = 0;
			}
			if (i == 6) {
				bs_rot = 270;
			}
			if (i == 7) {
				bs_rot = 180;
			}
			if (i == 8) {
				ks_rot = 0;
			}
			if (i == 9) {
				ks_rot = 270;
			}
			if (i == 10) {
				ks_rot = 180;
			}
			if (i == 11) {
				ks_rot = 90;
			}
			if (i == 12) {
				toi_rot = 0;
			}
			if (i == 13) {
				toi_rot = 270;
			}
			if (i == 14) {
				toi_rot = 180;
			}
			if (i == 15) {
				toi_rot = 90;
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
				GL11.glRotatef(bc_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureCub);
			GL11.glPushMatrix();
			this.bathroom_cupboard.renderModel(0.0625F);
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
				GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
			}
			if (tileentity1 != null) {
				GL11.glRotatef(bs_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureSink);
			GL11.glPushMatrix();
			this.bathroom_sink.renderModel(0.0625F);
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
				GL11.glRotatef(ks_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureKitchenSink);
			GL11.glPushMatrix();
			this.kitchen_sink.renderModel(0.0625F);
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
			if (tileentity1 != null) {
				GL11.glRotatef(toi_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureToilet);
			GL11.glPushMatrix();
			this.toilet.renderModel(0.0625F);
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
				GL11.glRotatef(bc_rot, 0.0F, 1.0F, 0.0F);
			}
			GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
			bindTexture(textureCub);
			GL11.glPushMatrix();
			this.bathroom_cupboard.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		if (tileentity.getWorldObj() == null) {
			renderAModel(null, d, d1, d2, f);
		} else {
			renderAModel((jfm_TileEntityCeramicBlocksOne)tileentity, d, d1, d2, f);
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
	{
		renderTileEntityAt(new jfm_TileEntityCeramicBlocksOne(metadata), 0.0D, -0.1D, 0.0D, 0.0F);
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
