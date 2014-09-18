package net.minecraft.jammy780.furniture.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityIronBlocksTwo;

public class jfm_ContainerWashingMachine extends Container
{
	private jfm_TileEntityIronBlocksTwo washingMachine;
	public int wmSlot1Time;
	public int wmSlot2Time;
	public int wmSlot3Time;
	public int wmSlot4Time;
	private int BurnTime;
	private int ItemBurnTime;

	public jfm_ContainerWashingMachine(InventoryPlayer inventoryplayer, jfm_TileEntityIronBlocksTwo teWashingMachine)
	{
		this.wmSlot1Time = 0;
		this.wmSlot2Time = 0;
		this.wmSlot3Time = 0;
		this.wmSlot4Time = 0;
		this.BurnTime = 0;
		this.ItemBurnTime = 0;
		this.washingMachine = teWashingMachine;
		teWashingMachine.openInventory();
		addSlotToContainer(new Slot(teWashingMachine, 0, 79, 22));
		addSlotToContainer(new Slot(teWashingMachine, 1, 15, 52));
		addSlotToContainer(new Slot(teWashingMachine, 2, 113, 22));
		addSlotToContainer(new Slot(teWashingMachine, 3, 79, 56));
		addSlotToContainer(new Slot(teWashingMachine, 4, 113, 56));
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
			if (this.wmSlot1Time != this.washingMachine.wmSlot1Time)
			{
				icrafting.sendProgressBarUpdate(this, 0, this.washingMachine.wmSlot1Time);
			}
			if (this.wmSlot2Time != this.washingMachine.wmSlot2Time)
			{
				icrafting.sendProgressBarUpdate(this, 1, this.washingMachine.wmSlot2Time);
			}
			if (this.wmSlot3Time != this.washingMachine.wmSlot3Time)
			{
				icrafting.sendProgressBarUpdate(this, 2, this.washingMachine.wmSlot3Time);
			}
			if (this.wmSlot4Time != this.washingMachine.wmSlot4Time)
			{
				icrafting.sendProgressBarUpdate(this, 3, this.washingMachine.wmSlot4Time);
			}
			if (this.BurnTime != this.washingMachine.wmBurnTime)
			{
				icrafting.sendProgressBarUpdate(this, 4, this.washingMachine.wmBurnTime);
			}
			if (this.ItemBurnTime != this.washingMachine.currentItemBurnTime)
			{
				icrafting.sendProgressBarUpdate(this, 5, this.washingMachine.currentItemBurnTime);
			}
		}
		this.wmSlot1Time = this.washingMachine.wmSlot1Time;
		this.wmSlot2Time = this.washingMachine.wmSlot2Time;
		this.wmSlot3Time = this.washingMachine.wmSlot3Time;
		this.wmSlot4Time = this.washingMachine.wmSlot4Time;
		this.BurnTime = this.washingMachine.wmBurnTime;
		this.ItemBurnTime = this.washingMachine.currentItemBurnTime;
	}

	@Override
	public void updateProgressBar(int i, int j)
	{
		switch (i)
		{
		case 0:
			this.washingMachine.wmSlot1Time = j;
			break;
		case 1:
			this.washingMachine.wmSlot2Time = j;
			break;
		case 2:
			this.washingMachine.wmSlot3Time = j;
			break;			
		case 3:
			this.washingMachine.wmSlot4Time = j;
			break;			
		case 4:
			this.washingMachine.wmBurnTime = j;
			break;			
		case 5:
			this.washingMachine.currentItemBurnTime = j;
			break;			
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return this.washingMachine.isUseableByPlayer(entityplayer);
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
		this.washingMachine.closeInventory();
	}
}
