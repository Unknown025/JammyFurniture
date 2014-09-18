package net.minecraft.jammy780.furniture.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityIronBlocksOne;

public class jfm_ContainerCooker extends Container
{
	private jfm_TileEntityIronBlocksOne oven;
	private int CookTime;
	private int CookTime2;
	private int BurnTime;
	private int ItemBurnTime;

	public jfm_ContainerCooker(InventoryPlayer inventoryplayer, jfm_TileEntityIronBlocksOne teCooker)
	{
		this.CookTime = 0;
		this.CookTime2 = 0;
		this.BurnTime = 0;
		this.ItemBurnTime = 0;
		this.oven = teCooker;
		addSlotToContainer(new Slot(teCooker, 0, 77, 20));
		addSlotToContainer(new Slot(teCooker, 1, 20, 44));
		addSlotToContainer(new SlotFurnace(inventoryplayer.player, teCooker, 2, 143, 22));
		addSlotToContainer(new Slot(teCooker, 3, 77, 49));
		addSlotToContainer(new SlotFurnace(inventoryplayer.player, teCooker, 4, 143, 49));
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 9; k++) {
				addSlotToContainer(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
			}
		}
		for (int j = 0; j < 9; j++) {
			addSlotToContainer(new Slot(inventoryplayer, j, 8 + j * 18, 142));
		}
	}

	@Override
	public void updateProgressBar(int par1, int par2)
	{
		if (par1 == 0) {
			this.oven.cookerCookTime = par2;
		}
		if (par1 == 1) {
			this.oven.cookerCookTime2 = par2;
		}
		if (par1 == 2) {
			this.oven.cookerBurnTime = par2;
		}
		if (par1 == 3) {
			this.oven.currentItemBurnTime = par2;
		}
	}

	@Override
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); i++)
		{
			ICrafting icrafting = (ICrafting)this.crafters.get(i);
			if (this.CookTime != this.oven.cookerCookTime) {
				icrafting.sendProgressBarUpdate(this, 0, this.oven.cookerCookTime);
			}
			if (this.CookTime2 != this.oven.cookerCookTime2) {
				icrafting.sendProgressBarUpdate(this, 1, this.oven.cookerCookTime2);
			}
			if (this.BurnTime != this.oven.cookerBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, this.oven.cookerBurnTime);
			}
			if (this.ItemBurnTime != this.oven.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 3, this.oven.currentItemBurnTime);
			}
		}
		this.CookTime = this.oven.cookerCookTime;
		this.CookTime2 = this.oven.cookerCookTime2;
		this.BurnTime = this.oven.cookerBurnTime;
		this.ItemBurnTime = this.oven.currentItemBurnTime;
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return this.oven.isUseableByPlayer(entityplayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer pl, int i)
	{
		return null;
	}
}
