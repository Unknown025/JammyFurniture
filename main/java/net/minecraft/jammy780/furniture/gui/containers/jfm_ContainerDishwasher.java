package net.minecraft.jammy780.furniture.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityIronBlocksTwo;

public class jfm_ContainerDishwasher extends Container
{
	private jfm_TileEntityIronBlocksTwo dishwasher;
	public int dwSlot1Time;
	public int dwSlot2Time;
	public int dwSlot3Time;
	public int dwSlot4Time;
	private int BurnTime;
	private int ItemBurnTime;

	public jfm_ContainerDishwasher(InventoryPlayer inventoryplayer, jfm_TileEntityIronBlocksTwo teDishwasher)
	{
		this.dwSlot1Time = 0;
		this.dwSlot2Time = 0;
		this.dwSlot3Time = 0;
		this.dwSlot4Time = 0;
		this.BurnTime = 0;
		this.ItemBurnTime = 0;
		this.dishwasher = teDishwasher;
		this.dishwasher.openInventory();
		addSlotToContainer(new Slot(teDishwasher, 0, 79, 27));
		addSlotToContainer(new Slot(teDishwasher, 1, 15, 52));		
		addSlotToContainer(new Slot(teDishwasher, 2, 113, 27));
		addSlotToContainer(new Slot(teDishwasher, 3, 79, 56));
		addSlotToContainer(new Slot(teDishwasher, 4, 113, 56));
		for (int i = 0; i < 3; i++)
		{
			for (int k = 0; k < 9; k++)
			{
				addSlotToContainer(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
			}
		}
		for (int j = 0; j < 9; j++)
		{
			addSlotToContainer(new Slot(inventoryplayer, j, 8 + j * 18, 142));
		}
	}

	@Override
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); i++)
		{
			ICrafting icrafting = (ICrafting)this.crafters.get(i);
			if (this.dwSlot1Time != this.dishwasher.dwSlot1Time)
			{
				icrafting.sendProgressBarUpdate(this, 0, this.dishwasher.dwSlot1Time);
			}
			if (this.dwSlot2Time != this.dishwasher.dwSlot2Time)
			{
				icrafting.sendProgressBarUpdate(this, 1, this.dishwasher.dwSlot2Time);
			}
			if (this.dwSlot3Time != this.dishwasher.dwSlot3Time)
			{
				icrafting.sendProgressBarUpdate(this, 2, this.dishwasher.dwSlot3Time);
			}
			if (this.dwSlot4Time != this.dishwasher.dwSlot4Time)
			{
				icrafting.sendProgressBarUpdate(this, 3, this.dishwasher.dwSlot4Time);
			}
			if (this.BurnTime != this.dishwasher.dwBurnTime)
			{
				icrafting.sendProgressBarUpdate(this, 4, this.dishwasher.dwBurnTime);
			}
			if (this.ItemBurnTime != this.dishwasher.currentItemBurnTime)
			{
				icrafting.sendProgressBarUpdate(this, 5, this.dishwasher.dwItemBurnTime);
			}
		}
		this.dwSlot1Time = this.dishwasher.dwSlot1Time;
		this.dwSlot2Time = this.dishwasher.dwSlot2Time;
		this.dwSlot3Time = this.dishwasher.dwSlot3Time;
		this.dwSlot4Time = this.dishwasher.dwSlot4Time;
		this.BurnTime = this.dishwasher.dwBurnTime;
		this.ItemBurnTime = this.dishwasher.dwItemBurnTime;
	}

	@Override
	public void updateProgressBar(int i, int j)
	{
		switch (i)
		{
		case 0:
			this.dishwasher.dwSlot1Time = j;
			break;
		case 1:
			this.dishwasher.dwSlot2Time = j;
			break;
		case 2:
			this.dishwasher.dwSlot3Time = j;
			break;			
		case 3:
			this.dishwasher.dwSlot4Time = j;
			break;			
		case 4:
			this.dishwasher.dwBurnTime = j;
			break;			
		case 5:
			this.dishwasher.dwItemBurnTime = j;
			break;			
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return this.dishwasher.isUseableByPlayer(entityplayer);
	}

	@Override
	public final ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(sourceSlotIndex);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (sourceSlotIndex < 5)
			{
				if (!this.mergeItemStack(itemstack1, 5, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(itemstack1, 0, 5, false))
			{
				return null;
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack(null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

	@Override
	public void onContainerClosed(EntityPlayer par1EntityPlayer)
	{
		super.onContainerClosed(par1EntityPlayer);
		this.dishwasher.closeInventory();
	}
}
