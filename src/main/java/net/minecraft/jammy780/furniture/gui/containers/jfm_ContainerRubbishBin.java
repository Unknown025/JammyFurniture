package net.minecraft.jammy780.furniture.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class jfm_ContainerRubbishBin extends Container
{
	private IInventory rubbishBinInv;
	private int numRows;

	public jfm_ContainerRubbishBin(IInventory par1IInventory, IInventory par2IInventory)
	{
		this.rubbishBinInv = par2IInventory;
		this.numRows = (par2IInventory.getSizeInventory() / 9);
		par2IInventory.openInventory();
		int i = (this.numRows - 4) * 18;
		for (int j = 0; j < this.numRows; j++) {
			for (int i1 = 0; i1 < 9; i1++) {
				addSlotToContainer(new Slot(par2IInventory, i1 + j * 9, 8 + i1 * 18, 16 + j * 18));
			}
		}
		for (int k = 0; k < 3; k++) {
			for (int j1 = 0; j1 < 9; j1++) {
				addSlotToContainer(new Slot(par1IInventory, j1 + k * 9 + 9, 8 + j1 * 18, 122 + k * 18 + i));
			}
		}
		for (int l = 0; l < 9; l++) {
			addSlotToContainer(new Slot(par1IInventory, l, 8 + l * 18, 180 + i));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return this.rubbishBinInv.isUseableByPlayer(par1EntityPlayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer ep, int par1)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(par1);
		if ((slot != null) && (slot.getHasStack()))
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (par1 < this.numRows * 9)
			{
				if (!mergeItemStack(itemstack1, this.numRows * 9, this.inventorySlots.size(), true)) {
					return null;
				}
			}
			else if (!mergeItemStack(itemstack1, 0, this.numRows * 9, false)) {
				return null;
			}
			if (itemstack1.stackSize == 0) {
				slot.putStack(null);
			} else {
				slot.onSlotChanged();
			}
		}
		return itemstack;
	}

	@Override
	public void onContainerClosed(EntityPlayer par1EntityPlayer)
	{
		super.onContainerClosed(par1EntityPlayer);
		this.rubbishBinInv.closeInventory();
	}
}
