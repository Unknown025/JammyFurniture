package net.minecraft.client.jammy780.furniture.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.jammy780.furniture.gui.containers.jfm_ContainerFriFre;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class jfm_GuiFriFre extends GuiContainer
{
	private IInventory upperChestInventory;
	private IInventory lowerChestInventory;
	private int inventoryRows;

	public jfm_GuiFriFre(IInventory par1IInventory, IInventory par2IInventory)
	{
		super(new jfm_ContainerFriFre(par1IInventory, par2IInventory));
		this.inventoryRows = 0;
		this.upperChestInventory = par1IInventory;
		this.lowerChestInventory = par2IInventory;
		this.allowUserInput = false;
		char c = 222;
		int i = c - 'l';
		this.inventoryRows = (par2IInventory.getSizeInventory() / 3);
		this.ySize = (i + this.inventoryRows * 18);
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString(StatCollector.translateToLocal(this.lowerChestInventory.getInventoryName()), 54, 5, 4210752);
		this.fontRendererObj.drawString(StatCollector.translateToLocal(this.upperChestInventory.getInventoryName()), 8, this.ySize - 96 + 3, 4210752);
	}

	protected static final ResourceLocation texture = new ResourceLocation("jammyfurniture:" + jfm_ConfigDefault.GUI_PATH + "jammy_kitchencupboard.png");

	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texture);
		int j = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		drawTexturedModalRect(j, k - 2, 0, 0, this.xSize, 170);
	}
}
