package net.minecraft.jammy780.furniture.tiles;

import net.minecraft.block.BlockChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

public class jfm_TileEntityWoodBlocks extends TileEntity implements IInventory
{
	public static int md;
	private ItemStack[] clockMiddleContents;
	public int numUsingPlayers;

	public jfm_TileEntityWoodBlocks()
	{
		this.clockMiddleContents = new ItemStack[getSizeInventory()];
	}

	public jfm_TileEntityWoodBlocks(int metadata)
	{
		md = metadata;
	}

	@Override
	public int getSizeInventory()
	{
		return 6;
	}

	@Override
	public ItemStack getStackInSlot(int par1)
	{
		return this.clockMiddleContents[par1];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2)
	{
		if (this.clockMiddleContents[par1] != null)
		{
			if (this.clockMiddleContents[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.clockMiddleContents[par1];
				this.clockMiddleContents[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.clockMiddleContents[par1].splitStack(par2);
			if (this.clockMiddleContents[par1].stackSize == 0) {
				this.clockMiddleContents[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1)
	{
		if (this.clockMiddleContents[par1] != null)
		{
			ItemStack itemstack = this.clockMiddleContents[par1];
			this.clockMiddleContents[par1] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
	{
		this.clockMiddleContents[par1] = par2ItemStack;
		if ((par2ItemStack != null) && (par2ItemStack.stackSize > getInventoryStackLimit())) {
			par2ItemStack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}

	@Override
	public String getInventoryName()
	{
		return "Hidey Hole";
	}

	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		this.clockMiddleContents = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound.getByte("Slot") & 0xFF;
			if ((j >= 0) && (j < this.clockMiddleContents.length)) {
				this.clockMiddleContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < this.clockMiddleContents.length; i++) {
			if (this.clockMiddleContents[i] != null)
			{
				NBTTagCompound nbttagcompound = new NBTTagCompound();
				nbttagcompound.setByte("Slot", (byte)i);
				this.clockMiddleContents[i].writeToNBT(nbttagcompound);
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
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this;
	}

	@Override
	public void updateContainingBlockInfo()
	{
		super.updateContainingBlockInfo();
	}

	public void onTileEntityPowered(int par1, int par2)
	{
		if (par1 == 1) {
			this.numUsingPlayers = par2;
		}
	}

	@Override
	public void openInventory()
	{
		this.numUsingPlayers += 1;
	}

	@Override
	public void closeInventory()
	{
		this.numUsingPlayers -= 1;
	}

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

	private int cachedChestType = -1;

	public int getChestType()
	{
		if (this.cachedChestType == -1)
		{
			if (this.worldObj == null || !(getBlockType() instanceof BlockChest))
			{
				return 0;
			}
			//this.cachedChestType = ((BlockChest)getBlockType()).chestType;
		}
		return this.cachedChestType;
	}

	@Override
	public boolean receiveClientEvent(int par1, int par2)
	{
		if (par1 == 1)
		{
			this.numUsingPlayers = par2;
			return true;
		}
		return super.receiveClientEvent(par1, par2);
	}
}
