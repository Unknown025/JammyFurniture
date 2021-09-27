package net.minecraft.jammy780.furniture.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class jfm_ContainerClockMiddle extends Container
{
	private IInventory clockMiddleInv;
	private int numRows;

	public jfm_ContainerClockMiddle(IInventory par1IInventory, IInventory par2IInventory)
	{
		this.clockMiddleInv = par2IInventory;
		this.numRows = (par2IInventory.getSizeInventory() / 3);
		par2IInventory.openInventory();
		int i = (this.numRows - 4) * 18;
		for (int j = 0; j < this.numRows; j++) {
			for (int i1 = 0; i1 < 3; i1++) {
				addSlotToContainer(new Slot(par2IInventory, i1 + j * 3, 61 + i1 * 18, 16 + j * 18));
			}
		}
		for (int k = 0; k < 3; k++) {
			for (int j1 = 0; j1 < 9; j1++) {
				addSlotToContainer(new Slot(par1IInventory, j1 + k * 9 + 9, 8 + j1 * 18, 103 + k * 18 + i));
			}
		}
		for (int l = 0; l < 9; l++) {
			addSlotToContainer(new Slot(par1IInventory, l, 8 + l * 18, 161 + i));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return this.clockMiddleInv.isUseableByPlayer(par1EntityPlayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack var3 = null;
		Slot var4 = (Slot)this.inventorySlots.get(par2);
		if ((var4 != null) && (var4.getHasStack()))
		{
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();
			if (par2 < this.numRows * 3)
			{
				if (!mergeItemStack(var5, this.numRows * 3, this.inventorySlots.size(), true)) {
					return null;
				}
			}
			else if (!mergeItemStack(var5, 0, this.numRows * 3, false)) {
				return null;
			}
			if (var5.stackSize == 0) {
				var4.putStack((ItemStack)null);
			} else {
				var4.onSlotChanged();
			}
		}
		return var3;
	}

	@Override
	public void onContainerClosed(EntityPlayer par1EntityPlayer)
	{
		super.onContainerClosed(par1EntityPlayer);
		this.clockMiddleInv.closeInventory();
	}
}
