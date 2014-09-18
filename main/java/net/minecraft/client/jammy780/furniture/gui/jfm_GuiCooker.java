package net.minecraft.client.jammy780.furniture.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.jammy780.furniture.gui.containers.jfm_ContainerCooker;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityIronBlocksOne;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class jfm_GuiCooker extends GuiContainer
{
	private jfm_TileEntityIronBlocksOne cookerInventory;

	public jfm_GuiCooker(InventoryPlayer inventoryplayer, jfm_TileEntityIronBlocksOne teCooker)
	{
		super(new jfm_ContainerCooker(inventoryplayer, teCooker));
		this.cookerInventory = teCooker;
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString("Cooker", 8, 6, 4210752);
		this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
	}

	protected static final ResourceLocation texture = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.GUI_PATH + "jammy_cooker.png");

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texture);
		int j1 = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		drawTexturedModalRect(j1, k, 0, 0, this.xSize, this.ySize);
		if (this.cookerInventory.isBurning())
		{
			int l = this.cookerInventory.getBurnTimeRemainingScaled(12);
			drawTexturedModalRect(j1 + 20, k + 36 + 4 - l, 176, 12 - l, 14, l + 2);
		}
		int i11 = this.cookerInventory.getCookProgressScaled(24);
		int m = this.cookerInventory.getCookProgressScaled2(24);
		drawTexturedModalRect(j1 + 118, k + 22, 176, 14, i11 + 1, 16);
		drawTexturedModalRect(j1 + 118, k + 50, 176, 14, m + 1, 16);
	}
}
