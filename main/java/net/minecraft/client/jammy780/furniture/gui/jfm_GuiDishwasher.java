package net.minecraft.client.jammy780.furniture.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.jammy780.furniture.gui.containers.jfm_ContainerDishwasher;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityIronBlocksTwo;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class jfm_GuiDishwasher extends GuiContainer
{
	private jfm_TileEntityIronBlocksTwo dwInv;

	public jfm_GuiDishwasher(InventoryPlayer inventoryplayer, jfm_TileEntityIronBlocksTwo teDishwasher)
	{
		super(new jfm_ContainerDishwasher(inventoryplayer, teDishwasher));
		this.dwInv = teDishwasher;
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Dishwasher", 8, 6, 4210752);
		this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
	}

	protected static final ResourceLocation texture = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.GUI_PATH + "jammy_dishwasher.png");

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texture);
		int j1 = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		drawTexturedModalRect(j1, k, 0, 0, this.xSize, this.ySize);
		if (this.dwInv.dwIsBurning())
		{
			int l = this.dwInv.dwGetBurnTimeRemainingScaled(12);
			drawTexturedModalRect(j1 + 16, k + 48 - l, 176, 12 - l, 14, l + 2);
		}
		int m1 = this.dwInv.dwGetProgressSlot1(24);
		int m2 = this.dwInv.dwGetProgressSlot2(24);
		int m3 = this.dwInv.dwGetProgressSlot3(24);
		int m4 = this.dwInv.dwGetProgressSlot4(24);
		drawTexturedModalRect(j1 + 65 - m1, k + 27, 201 - m1, 31, 25, 16);
		drawTexturedModalRect(j1 + 145, k + 27, 176, 14, 1 + m2, 16);
		drawTexturedModalRect(j1 + 65 - m3, k + 58, 201 - m3, 31, 25, 16);
		drawTexturedModalRect(j1 + 145, k + 58, 176, 14, m4 + 1, 16);
	}
}
