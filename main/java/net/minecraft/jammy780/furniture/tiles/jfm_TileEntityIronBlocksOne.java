package net.minecraft.jammy780.furniture.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.gui.recipes.jfm_CookerRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class jfm_TileEntityIronBlocksOne extends TileEntity implements IInventory
{
	public static int md = 0;
	private ItemStack[] FriFreContents;
	private ItemStack[] cookerItemStacks;
	private ItemStack[] binContents;
	public int numUsingPlayers;
	public static int metadata;
	public int cookerBurnTime;
	public int currentItemBurnTime;
	public int cookerCookTime;
	public int cookerCookTime2;
	private int ticksSinceSync;
	long lastClearance = System.currentTimeMillis();
	public float lidAngle;
	public float prevLidAngle;
	public static boolean debug = false;

	public jfm_TileEntityIronBlocksOne()
	{
		this.FriFreContents = new ItemStack[9];
		this.cookerItemStacks = new ItemStack[5];
		this.binContents = new ItemStack[27];
		this.cookerBurnTime = 0;
		this.currentItemBurnTime = 0;
		this.cookerCookTime = 0;
		this.cookerCookTime2 = 0;
	}

	public jfm_TileEntityIronBlocksOne(int meta)
	{
		md = meta;
	}

	@Override
	public int getSizeInventory()
	{
		if (this.worldObj != null && this.worldObj.blockExists(this.xCoord, this.yCoord, this.zCoord))
		{
			int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
			if (meta <= 7)
			{
				return this.FriFreContents.length;
			}
			if (meta == 8 || meta == 9 || meta == 10 || meta == 11)
			{
				return this.cookerItemStacks.length;
			}
			if (meta == 12)
			{
				return this.binContents.length;
			}
			return 0;
		}
		return 0;
	}
/*
	public static boolean isItemFuel(ItemStack par0ItemStack)
	{
		return getItemBurnTime(par0ItemStack) > 0;
	}
*/
	@Override
	public ItemStack getStackInSlot(int par1)
	{
		if (this.worldObj != null && this.worldObj.blockExists(this.xCoord, this.yCoord, this.zCoord))
		{
			switch (this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord))
			{
			case 0: 
			case 1: 
			case 2: 
			case 3: 
				return this.FriFreContents[par1];
			case 4: 
			case 5: 
			case 6: 
			case 7: 
				return this.FriFreContents[par1];
			case 8: 
			case 9: 
			case 10: 
			case 11: 
				return this.cookerItemStacks[par1];
			case 12: 
				return this.binContents[par1];
			}
			return null;
		}
		return null;
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2)
	{
		if (this.binContents[par1] != null)
		{
			if (this.binContents[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.binContents[par1];
				this.binContents[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.binContents[par1].splitStack(par2);
			if (this.binContents[par1].stackSize == 0)
			{
				this.binContents[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		if (this.FriFreContents[par1] != null)
		{
			if (this.FriFreContents[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.FriFreContents[par1];
				this.FriFreContents[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.FriFreContents[par1].splitStack(par2);
			if (this.FriFreContents[par1].stackSize == 0)
			{
				this.FriFreContents[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		if (this.cookerItemStacks[par1] != null)
		{
			if (this.cookerItemStacks[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.cookerItemStacks[par1];
				this.cookerItemStacks[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.cookerItemStacks[par1].splitStack(par2);
			if (this.cookerItemStacks[par1].stackSize == 0)
			{
				this.cookerItemStacks[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1)
	{
		if (this.FriFreContents[par1] != null)
		{
			ItemStack itemstack = this.FriFreContents[par1];
			this.FriFreContents[par1] = null;
			return itemstack;
		}
		if (this.cookerItemStacks[par1] != null)
		{
			ItemStack itemstack = this.cookerItemStacks[par1];
			this.cookerItemStacks[par1] = null;
			return itemstack;
		}
		if (this.binContents[par1] != null)
		{
			ItemStack itemstack = this.binContents[par1];
			this.binContents[par1] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
	{
		int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
		if (meta <= 7)
		{
			this.FriFreContents[par1] = par2ItemStack;
		} else if ((meta == 8) || (meta == 9) || (meta == 10) || (meta == 11)) {
			this.cookerItemStacks[par1] = par2ItemStack;
		} else {
			this.binContents[par1] = par2ItemStack;
		}
		if (par2ItemStack != null && par2ItemStack.stackSize > getInventoryStackLimit())
		{
			par2ItemStack.stackSize = getInventoryStackLimit();
		}
		markDirty();
	}

	@Override
	public String getInventoryName()
	{
		switch (this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord))
		{
		case 0: 
		case 1: 
		case 2: 
		case 3: 
			return "Fridge";
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			return "Freezer";
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			return "Cooker";
		case 12: 
			return "Rubbish Bin";
		}
		return "ERROR";
	}

	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = par1NBTTagCompound.getTagList("FriFreItems", Constants.NBT.TAG_COMPOUND);
		NBTTagList nbttaglist2 = par1NBTTagCompound.getTagList("CookerItems", Constants.NBT.TAG_COMPOUND);
		NBTTagList nbttaglist3 = par1NBTTagCompound.getTagList("BinItems", Constants.NBT.TAG_COMPOUND);
		this.FriFreContents = new ItemStack[9];
		this.cookerItemStacks = new ItemStack[5];
		this.binContents = new ItemStack[27];
		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound.getByte("Slot") & 0xFF;
			if (j >= 0 && j < this.FriFreContents.length)
			{
				this.FriFreContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
			}
		}
		for (int i = 0; i < nbttaglist2.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound2 = (NBTTagCompound)nbttaglist2.getCompoundTagAt(i);
			byte byte0 = nbttagcompound2.getByte("Slot");
			if (byte0 >= 0 && byte0 < this.cookerItemStacks.length)
			{
				this.cookerItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound2);
			}
		}
		this.cookerBurnTime = par1NBTTagCompound.getShort("BurnTime");
		this.cookerCookTime = par1NBTTagCompound.getShort("CookTime");
		this.cookerCookTime2 = par1NBTTagCompound.getShort("CookTime2");
		this.currentItemBurnTime = getItemBurnTime(this.cookerItemStacks[1]);
		for (int i = 0; i < nbttaglist3.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound3 = (NBTTagCompound)nbttaglist3.getCompoundTagAt(i);
			int j = nbttagcompound3.getByte("Slot") & 0xFF;
			if (j >= 0 && j < this.binContents.length)
			{
				this.binContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound3);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeToNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = new NBTTagList();

		int meta = 1;
		if (this.worldObj != null && this.worldObj.blockExists(this.xCoord, this.yCoord, this.zCoord))
		{
			meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
		}
		if (meta <= 7)
		{
			for (int i = 0; i < this.FriFreContents.length; i++)
			{
				if (this.FriFreContents[i] != null)
				{
					NBTTagCompound nbttagcompound = new NBTTagCompound();
					nbttagcompound.setByte("Slot", (byte)i);
					this.FriFreContents[i].writeToNBT(nbttagcompound);
					nbttaglist.appendTag(nbttagcompound);
				}
			}
			par1NBTTagCompound.setTag("FriFreItems", nbttaglist);
		}
		else if (meta == 8 || meta == 9 || meta == 10 || meta == 11)
		{
			par1NBTTagCompound.setShort("BurnTime", (short)this.cookerBurnTime);
			par1NBTTagCompound.setShort("CookTime", (short)this.cookerCookTime);
			par1NBTTagCompound.setShort("CookTime2", (short)this.cookerCookTime2);
			for (int i = 0; i < this.cookerItemStacks.length; i++)
			{
				if (this.cookerItemStacks[i] != null)
				{
					NBTTagCompound nbttagcompound = new NBTTagCompound();
					nbttagcompound.setByte("Slot", (byte)i);
					this.cookerItemStacks[i].writeToNBT(nbttagcompound);
					nbttaglist.appendTag(nbttagcompound);
				}
			}
			par1NBTTagCompound.setTag("CookerItems", nbttaglist);
		}
		else if (meta == 12)
		{
			for (int i = 0; i < this.binContents.length; i++)
			{
				if (this.binContents[i] != null)
				{
					NBTTagCompound nbttagcompound = new NBTTagCompound();
					nbttagcompound.setByte("Slot", (byte)i);
					this.binContents[i].writeToNBT(nbttagcompound);
					nbttaglist.appendTag(nbttagcompound);
				}
			}
			par1NBTTagCompound.setTag("BinItems", nbttaglist);
		}
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
	public void updateContainingBlockInfo()
	{
		super.updateContainingBlockInfo();
	}

	public int getCookProgressScaled(int par1)
	{
		return this.cookerCookTime * par1 / 200;
	}

	public int getCookProgressScaled2(int par1)
	{
		return this.cookerCookTime2 * par1 / 200;
	}

	public int getBurnTimeRemainingScaled(int par1)
	{
		if (this.currentItemBurnTime == 0) {
			this.currentItemBurnTime = 200;
		}
		return this.cookerBurnTime * par1 / this.currentItemBurnTime;
	}

	public boolean isBurning()
	{
		return this.cookerBurnTime > 0;
	}

	public void removeItems(jfm_TileEntityIronBlocksOne te)
	{
		if (te != null)
		{
			if (te.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord) == 12)
			{
				for (int i = 0; i < te.getSizeInventory(); i++)
				{
					ItemStack itemstack = te.getStackInSlot(i);
					if (itemstack != null)
					{
						te.setInventorySlotContents(i, null);
					}
				}
			}
		}
	}

	@Override
	public void updateEntity()
	{
		if (debug)
		{
			System.out.println("World Obj = " + this.worldObj);
			System.out.println("X: " + this.xCoord);
			System.out.println("Y: " + this.yCoord);
			System.out.println("Z: " + this.zCoord);
			System.out.println("Meta: " + this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord));
			System.out.println("Bin - Time Left " + (int)Math.floor((300000L - (System.currentTimeMillis() - this.lastClearance)) / 1000L) / 60 + ":" + (300000L - (System.currentTimeMillis() - this.lastClearance)) / 1000L % 60L);
		}
		int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
		if (meta <= 7) // Fridge/Freezer 
		{
			this.prevLidAngle = this.lidAngle;
			float var1 = 0.1F;
			if (this.numUsingPlayers > 0 && this.lidAngle == 0.0F)
			{
				double var2 = this.xCoord + 0.5D;
				double var4 = this.zCoord + 0.5D;
				this.worldObj.playSoundEffect(var2, this.yCoord + 0.5D, var4, "random.chestopen", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
			}
			if ((this.numUsingPlayers == 0 && this.lidAngle > 0.0F) || (this.numUsingPlayers > 0 && this.lidAngle < 1.0F))
			{
				float var8 = this.lidAngle;
				if (this.numUsingPlayers > 0)
				{
					this.lidAngle += var1;
				}
				else
				{
					this.lidAngle -= var1;
				}
				if (this.lidAngle > 1.0F)
				{
					this.lidAngle = 1.0F;
				}
				float var3 = 0.5F;
				if (this.lidAngle < var3 && var8 >= var3)
				{
					double var4 = this.xCoord + 0.5D;
					double var6 = this.zCoord + 0.5D;

					this.worldObj.playSoundEffect(var4, this.yCoord + 0.5D, var6, "random.chestclosed", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
				}
				if (this.lidAngle < 0.0F)
				{
					this.lidAngle = 0.0F;
				}
			}
		}
		if (meta == 8 || meta == 9 || meta == 10 || meta == 11) // Cooker
		{
			boolean flag = this.cookerBurnTime > 0;
			boolean flag1 = false;
			if (this.cookerBurnTime > 0)
			{
				this.cookerBurnTime -= 1;
			}
			if (!this.worldObj.isRemote)
			{
				if (this.cookerBurnTime == 0 && canSmelt())
				{
					this.currentItemBurnTime = (this.cookerBurnTime = getItemBurnTime(this.cookerItemStacks[1]));
					if (this.cookerBurnTime > 0)
					{
						flag1 = true;
						if (this.cookerItemStacks[1] != null)
						{
							this.cookerItemStacks[1].stackSize -= 1;
							if (this.cookerItemStacks[1].stackSize == 0)
							{
								this.cookerItemStacks[1] = null;
							//	this.cookerItemStacks[1] = this.cookerItemStacks[1].getItem().getContainerItemStack(this.cookerItemStacks[1]);
							}
						}
					}
				}
				if (this.cookerBurnTime == 0 && canSmelt2())
				{
					this.currentItemBurnTime = (this.cookerBurnTime = getItemBurnTime(this.cookerItemStacks[1]));
					if (this.cookerBurnTime > 0)
					{
						flag1 = true;
						if (this.cookerItemStacks[1] != null)
						{
							this.cookerItemStacks[1].stackSize -= 1;
							if (this.cookerItemStacks[1].stackSize == 0)
							{
								this.cookerItemStacks[1] = null;
							//	this.cookerItemStacks[1] = this.cookerItemStacks[1].getItem().getContainerItemStack(this.cookerItemStacks[1]);
							}
						}
					}
				}
				if (isBurning() && canSmelt())
				{
					this.cookerCookTime += 1;
					if (this.cookerCookTime == 200)
					{
						this.cookerCookTime = 0;
						smeltItem();
						flag1 = true;
					}
				}
				else
				{
					this.cookerCookTime = 0;
				}
				if (isBurning() && canSmelt2())
				{
					this.cookerCookTime2 += 1;
					if (this.cookerCookTime2 == 200)
					{
						this.cookerCookTime2 = 0;
						smeltItem2();
						flag1 = true;
					}
				}
				else
				{
					this.cookerCookTime2 = 0;
				}
			}
			if (flag1)
			{
				markDirty();
			}
		}
		else if (meta == 12 && System.currentTimeMillis() - this.lastClearance >= 300000L)
		{
			removeItems(this);
			this.lastClearance = System.currentTimeMillis();
		}
	}

	private boolean canSmelt()
	{
		if (this.cookerItemStacks[0] == null)
		{
			return false;
		}
		ItemStack itemstack = jfm_CookerRecipes.smelting().getSmeltingResult(this.cookerItemStacks[0]);
		if (itemstack == null)
		{
			return false;
		}
		if (this.cookerItemStacks[2] == null)
		{
			return true;
		}
		if (!this.cookerItemStacks[2].isItemEqual(itemstack))
		{
			return false;
		}
		if ((this.cookerItemStacks[2].stackSize < getInventoryStackLimit()) && (this.cookerItemStacks[2].stackSize < this.cookerItemStacks[2].getMaxStackSize())) {
			return true;
		}
		return this.cookerItemStacks[2].stackSize < itemstack.getMaxStackSize();
	}

	private boolean canSmelt2()
	{
		if (this.cookerItemStacks[3] == null)
		{
			return false;
		}
		ItemStack itemstack = jfm_CookerRecipes.smelting().getSmeltingResult(this.cookerItemStacks[3]);
		if (itemstack == null)
		{
			return false;
		}
		if (this.cookerItemStacks[4] == null)
		{
			return true;
		}
		if (!this.cookerItemStacks[4].isItemEqual(itemstack))
		{
			return false;
		}
		if (this.cookerItemStacks[4].stackSize < getInventoryStackLimit() && this.cookerItemStacks[4].stackSize < this.cookerItemStacks[4].getMaxStackSize())
		{
			return true;
		}
		return this.cookerItemStacks[4].stackSize < itemstack.getMaxStackSize();
	}

	public void smeltItem()
	{
		if (!canSmelt())
		{
			return;
		}
		ItemStack itemstack = jfm_CookerRecipes.smelting().getSmeltingResult(this.cookerItemStacks[0]);
		if (this.cookerItemStacks[2] == null)
		{
			this.cookerItemStacks[2] = itemstack.copy();
		} 
		else if (this.cookerItemStacks[2].getItem() == itemstack.getItem())
		{
			this.cookerItemStacks[2].stackSize += itemstack.stackSize;
		}
		this.cookerItemStacks[0].stackSize -= 1;
		if (this.cookerItemStacks[0].stackSize <= 0)
		{
			this.cookerItemStacks[0] = null;
		}
	}

	public void smeltItem2()
	{
		if (!canSmelt2())
		{
			return;
		}
		ItemStack itemstack = jfm_CookerRecipes.smelting().getSmeltingResult(this.cookerItemStacks[3]);
		if (this.cookerItemStacks[4] == null)
		{
			this.cookerItemStacks[4] = itemstack.copy();
		}
		else if (this.cookerItemStacks[4].getItem() == itemstack.getItem())
		{
			this.cookerItemStacks[4].stackSize += itemstack.stackSize;
		}
		this.cookerItemStacks[3].stackSize -= 1;
		if (this.cookerItemStacks[3].stackSize <= 0)
		{
			this.cookerItemStacks[3] = null;
		}
	}

	private static int getItemBurnTime(ItemStack par1ItemStack)
	{
		if (par1ItemStack == null)
		{
			return 0;
		}
		Item i = par1ItemStack.getItem();
/*		if ((i < 256) && (Block.blocksList[i].field_72018_cp == Material.wood))
		{
			return 300;
		}*/
		if (i == Items.stick)
		{
			return 100;
		}
		if (i == Items.coal)
		{
			return 1600;
		}
		if (i == Items.lava_bucket)
		{
			return 20000;
		}
		if (i == Item.getItemFromBlock(Blocks.sapling))
		{
			return 100;
		}
		if (i == Items.blaze_rod)
		{
			return 2400;
		}
		return 0;//ModLoader.addAllFuel(par1ItemStack.itemID, par1ItemStack.getItemDamage());
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
}
