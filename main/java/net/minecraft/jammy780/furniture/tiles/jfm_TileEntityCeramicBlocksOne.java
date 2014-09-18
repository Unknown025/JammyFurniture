package net.minecraft.jammy780.furniture.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

public class jfm_TileEntityCeramicBlocksOne extends TileEntity implements IInventory
{
	public static int md = 0;
	private ItemStack[] bathroomCupboardContents;

	public jfm_TileEntityCeramicBlocksOne()
	{
		this.bathroomCupboardContents = new ItemStack[8];
	}

	public jfm_TileEntityCeramicBlocksOne(int meta)
	{
		md = meta;
	}

	@Override
	public int getSizeInventory()
	{
		return 8;
	}

	@Override
	public ItemStack getStackInSlot(int par1)
	{
		return this.bathroomCupboardContents[par1];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2)
	{
		if (this.bathroomCupboardContents[par1] != null)
		{
			if (this.bathroomCupboardContents[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.bathroomCupboardContents[par1];
				this.bathroomCupboardContents[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.bathroomCupboardContents[par1].splitStack(par2);
			if (this.bathroomCupboardContents[par1].stackSize == 0)
			{
				this.bathroomCupboardContents[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1)
	{
		if (this.bathroomCupboardContents[par1] != null)
		{
			ItemStack itemstack = this.bathroomCupboardContents[par1];
			this.bathroomCupboardContents[par1] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
	{
		this.bathroomCupboardContents[par1] = par2ItemStack;
		if (par2ItemStack != null && par2ItemStack.stackSize > getInventoryStackLimit())
		{
			par2ItemStack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}

	@Override
	public String getInventoryName()
	{
		return "Cupboard";
	}

	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		this.bathroomCupboardContents = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound.getByte("Slot") & 0xFF;
			if (j >= 0 && j < this.bathroomCupboardContents.length)
			{
				this.bathroomCupboardContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < this.bathroomCupboardContents.length; i++)
		{
			if (this.bathroomCupboardContents[i] != null)
			{
				NBTTagCompound nbttagcompound = new NBTTagCompound();
				nbttagcompound.setByte("Slot", (byte)i);
				this.bathroomCupboardContents[i].writeToNBT(nbttagcompound);
				nbttaglist.appendTag(nbttagcompound);
			}
		}
		par1NBTTagCompound.setTag("Items", nbttaglist);
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
	{
		if (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this)
		{
			return false;
		}
		return par1EntityPlayer.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public void invalidate()
	{
		updateContainingBlockInfo();
		super.invalidate();
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack)
	{
		return false;
	}
}
