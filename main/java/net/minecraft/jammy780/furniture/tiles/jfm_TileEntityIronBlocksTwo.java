package net.minecraft.jammy780.furniture.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.gui.recipes.jfm_DishwasherRecipes;
import net.minecraft.jammy780.furniture.gui.recipes.jfm_WashingMachineRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class jfm_TileEntityIronBlocksTwo extends TileEntity implements IInventory
{
	public ItemStack[] dwItemStacks;
	public int dwItemBurnTime;
	public int dwSlot1Time;
	public int dwSlot2Time;
	public int dwSlot3Time;
	public int dwSlot4Time;
	public int dwBurnTime;
	public ItemStack[] wmItemStacks;
	public int currentItemBurnTime;
	public int wmSlot1Time;
	public int wmSlot2Time;
	public int wmSlot3Time;
	public int wmSlot4Time;
	public int wmBurnTime;
	public static int md = 0;
	public float lidAngle;
	public float prevLidAngle;
	public int numUsingPlayers;
	
	public static String[] woodTools = { "item.pickaxeWood", "item.shovelWood", "item.hatchetWood", "item.hoeWood", "item.swordWood" };
	public static String[] stoneTools = { "item.pickaxeStone", "item.shovelStone", "item.hatchetStone", "item.hoeStone", "item.swordStone" };
	public static String[] ironTools = { "item.pickaxeIron", "item.shovelIron", "item.hatchetIron", "item.hoeIron", "item.swordIron" };
	public static String[] goldTools = { "item.pickaxeGold", "item.shovelGold", "item.hatchetGold", "item.hoeGold", "item.swordGold" };
	public static String[] diamondTools = { "item.pickaxeDiamond", "item.shovelDiamond", "item.hatchetDiamond", "item.hoeDiamond", "item.swordDiamond" };
	
	public static String[] diamondArmour = { "item.helmetDiamond", "item.chestplate", "item.leggings", "item.boots" };
	public static String[] chainArmour = { "item.helmetChain", "item.chestplateChain", "item.leggingsChain", "item.bootsChain" };
	public static String[] goldenArmour = { "item.helmetGold", "item.chestplateGold", "item.leggingsGold", "item.bootsGold" };
	public static String[] ironArmour = { "item.helmetIron", "item.chestplateIron", "item.leggingsIron", "item.bootsIron" };
	public static String[] leatherArmour = { "item.helmetCloth", "item.chestplateCloth", "item.leggingsCloth", "item.bootsCloth" };

	public jfm_TileEntityIronBlocksTwo()
	{
		this.wmItemStacks = new ItemStack[5];
		this.wmBurnTime = 0;
		this.currentItemBurnTime = 0;
		this.wmSlot1Time = 0;
		this.wmSlot2Time = 0;
		this.wmSlot3Time = 0;
		this.wmSlot4Time = 0;

		this.dwItemStacks = new ItemStack[5];
		this.dwBurnTime = 0;
		this.dwItemBurnTime = 0;
		this.dwSlot1Time = 0;
		this.dwSlot2Time = 0;
		this.dwSlot3Time = 0;
		this.dwSlot4Time = 0;
	}

	public jfm_TileEntityIronBlocksTwo(int meta)
	{
		md = meta;
	}

	@Override
	public int getSizeInventory()
	{
		if (this.worldObj != null && this.worldObj.blockExists(this.xCoord, this.yCoord, this.zCoord))
		{
			int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
			if (meta <= 3)
			{
				return this.dwItemStacks.length;
			}
			if (4 <= meta && meta <= 7)
			{
				return this.wmItemStacks.length;
			}
			return 0;
		}
		return 0;
	}

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
				return this.dwItemStacks[par1];
			case 4: 
			case 5: 
			case 6: 
			case 7: 
				return this.wmItemStacks[par1];
			}
			return null;
		}
		return null;
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2)
	{
		if (this.dwItemStacks[par1] != null)
		{
			if (this.dwItemStacks[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.dwItemStacks[par1];
				this.dwItemStacks[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.dwItemStacks[par1].splitStack(par2);
			if (this.dwItemStacks[par1].stackSize == 0)
			{
				this.dwItemStacks[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		if (this.wmItemStacks[par1] != null)
		{
			if (this.wmItemStacks[par1].stackSize <= par2)
			{
				ItemStack itemstack = this.wmItemStacks[par1];
				this.wmItemStacks[par1] = null;
				markDirty();
				return itemstack;
			}
			ItemStack itemstack1 = this.wmItemStacks[par1].splitStack(par2);
			if (this.wmItemStacks[par1].stackSize == 0)
			{
				this.wmItemStacks[par1] = null;
			}
			markDirty();
			return itemstack1;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1)
	{
		if (this.dwItemStacks[par1] != null)
		{
			ItemStack itemstack = this.dwItemStacks[par1];
			this.dwItemStacks[par1] = null;
			return itemstack;
		}
		if (this.wmItemStacks[par1] != null)
		{
			ItemStack itemstack = this.wmItemStacks[par1];
			this.wmItemStacks[par1] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
	{
		int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
		if (meta <= 3)
		{
			this.dwItemStacks[par1] = par2ItemStack;
		}
		else if (4 <= meta && meta <= 7)
		{
			this.wmItemStacks[par1] = par2ItemStack;
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
			return "Dishwasher";
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			return "Washing Machine";
		}
		return "ERROR";
	}

	@Override
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readFromNBT(par1NBTTagCompound);
		NBTTagList nbttaglist = par1NBTTagCompound.getTagList("dwItems", Constants.NBT.TAG_COMPOUND);
		NBTTagList nbttaglist2 = par1NBTTagCompound.getTagList("wmItems", Constants.NBT.TAG_COMPOUND);
		this.dwItemStacks = new ItemStack[5];
		this.wmItemStacks = new ItemStack[5];
		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound.getByte("Slot") & 0xFF;
			if (j >= 0 && j < this.dwItemStacks.length)
			{
				this.dwItemStacks[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
			}
		}
		this.dwBurnTime = par1NBTTagCompound.getShort("dwBurnTime");
		this.dwSlot1Time = par1NBTTagCompound.getShort("dwSlot1Time");
		this.dwSlot2Time = par1NBTTagCompound.getShort("dwSlot2Time");
		this.dwSlot3Time = par1NBTTagCompound.getShort("dwSlot3Time");
		this.dwSlot4Time = par1NBTTagCompound.getShort("dwSlot4Time");
		this.dwItemBurnTime = getItemBurnTime(this.dwItemStacks[1]);
		for (int i = 0; i < nbttaglist2.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound2 = (NBTTagCompound)nbttaglist2.getCompoundTagAt(i);
			byte byte0 = nbttagcompound2.getByte("Slot");
			if (byte0 >= 0 && byte0 < this.wmItemStacks.length)
			{
				this.wmItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound2);
			}
		}
		this.wmBurnTime = par1NBTTagCompound.getShort("wmBurnTime");
		this.wmSlot1Time = par1NBTTagCompound.getShort("wmSlot1Time");
		this.wmSlot2Time = par1NBTTagCompound.getShort("wmSlot2Time");
		this.wmSlot3Time = par1NBTTagCompound.getShort("wmSlot3Time");
		this.wmSlot4Time = par1NBTTagCompound.getShort("wmSlot4Time");
		this.currentItemBurnTime = getItemBurnTime(this.wmItemStacks[1]);
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
		if (meta <= 3)
		{
			par1NBTTagCompound.setShort("dwBurnTime", (short)this.dwBurnTime);
			par1NBTTagCompound.setShort("dwSlot1Time", (short)this.dwSlot1Time);
			par1NBTTagCompound.setShort("dwSlot2Time", (short)this.dwSlot2Time);
			par1NBTTagCompound.setShort("dwSlot3Time", (short)this.dwSlot3Time);
			par1NBTTagCompound.setShort("dwSlot4Time", (short)this.dwSlot4Time);
			for (int i = 0; i < this.dwItemStacks.length; i++)
			{
				if (this.dwItemStacks[i] != null)
				{
					NBTTagCompound nbttagcompound = new NBTTagCompound();
					nbttagcompound.setByte("Slot", (byte)i);
					this.dwItemStacks[i].writeToNBT(nbttagcompound);
					nbttaglist.appendTag(nbttagcompound);
				}
			}
			par1NBTTagCompound.setTag("dwItems", nbttaglist);
		}
		else if (4 <= meta && meta <= 7)
		{
			par1NBTTagCompound.setShort("wmBurnTime", (short)this.wmBurnTime);
			par1NBTTagCompound.setShort("wmSlot1Time", (short)this.wmSlot1Time);
			par1NBTTagCompound.setShort("wmSlot2Time", (short)this.wmSlot2Time);
			par1NBTTagCompound.setShort("wmSlot3Time", (short)this.wmSlot3Time);
			par1NBTTagCompound.setShort("wmSlot4Time", (short)this.wmSlot4Time);
			for (int i = 0; i < this.wmItemStacks.length; i++)
			{
				if (this.wmItemStacks[i] != null)
				{
					NBTTagCompound nbttagcompound = new NBTTagCompound();
					nbttagcompound.setByte("Slot", (byte)i);
					this.wmItemStacks[i].writeToNBT(nbttagcompound);
					nbttaglist.appendTag(nbttagcompound);
				}
			}
			par1NBTTagCompound.setTag("wmItems", nbttaglist);
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

	public int getProgressSlot1(int par1)
	{
		return this.wmSlot1Time * par1 / getSmeltTime(0);
	}

	public int getProgressSlot2(int par1)
	{
		return this.wmSlot2Time * par1 / getSmeltTime(2);
	}

	public int getProgressSlot3(int par1)
	{
		return this.wmSlot3Time * par1 / getSmeltTime(3);
	}

	public int getProgressSlot4(int par1)
	{
		return this.wmSlot4Time * par1 / getSmeltTime(4);
	}

	public int dwGetProgressSlot1(int par1)
	{
		return this.dwSlot1Time * par1 / dwGetSmeltTime(0);
	}

	public int dwGetProgressSlot2(int par1)
	{
		return this.dwSlot2Time * par1 / dwGetSmeltTime(2);
	}

	public int dwGetProgressSlot3(int par1)
	{
		return this.dwSlot3Time * par1 / dwGetSmeltTime(3);
	}

	public int dwGetProgressSlot4(int par1)
	{
		return this.dwSlot4Time * par1 / dwGetSmeltTime(4);
	}

	public int getBurnTimeRemainingScaled(int par1)
	{
		if (this.currentItemBurnTime == 0)
		{
			this.currentItemBurnTime = 200;
		}
		return this.wmBurnTime * par1 / this.currentItemBurnTime;
	}

	public int dwGetBurnTimeRemainingScaled(int par1)
	{
		if (this.dwItemBurnTime == 0)
		{
			this.dwItemBurnTime = 200;
		}
		return this.dwBurnTime * par1 / this.dwItemBurnTime;
	}

	public boolean isBurning()
	{
		return this.wmBurnTime > 0;
	}

	public boolean dwIsBurning()
	{
		return this.dwBurnTime > 0;
	}

	@Override
	public void updateEntity()
	{
		int meta = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
		if (meta <= 3)
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
			boolean flag2 = this.dwBurnTime > 0;
			boolean flag3 = false;
			if (this.dwBurnTime > 0)
			{
				this.dwBurnTime -= 1;
			}
			if (!this.worldObj.isRemote)
			{
				if (this.dwBurnTime == 0 && (dwCanSmeltSlot(0) || dwCanSmeltSlot(2) || dwCanSmeltSlot(3) || dwCanSmeltSlot(4)))
				{
					this.dwItemBurnTime = (this.dwBurnTime = getItemBurnTime(this.dwItemStacks[1]));
					if (this.dwBurnTime > 0)
					{
						flag3 = true;
						if (this.dwItemStacks[1] != null)
						{
							this.dwItemStacks[1].stackSize -= 1;
							if (this.dwItemStacks[1].stackSize == 0)
							{
								this.dwItemStacks[1] = null;
							//	this.dwItemStacks[1] = this.dwItemStacks[1].getItem().getContainerItemStack(this.dwItemStacks[1]);
							}
						}
					}
				}
				boolean playing = false;
				if (dwIsBurning() && !playing)
				{
					playing = true;
					if (playing)
					{
						this.worldObj.playSoundEffect(this.xCoord, this.yCoord, this.zCoord, "jammyfurniture:washingmachine", 0.2F, 1.0F);
					}
				}
				else if (!dwIsBurning())
				{
					playing = false;
				}
				if (dwCanSmeltSlot(0) && dwIsBurning())
				{
					this.dwSlot1Time += 1;
					if (this.dwSlot1Time == dwGetSmeltTime(0))
					{
						this.dwSlot1Time = 0;
						dwFixArmourSlot(0);
						flag3 = true;
					}
				}
				else
				{
					this.dwSlot1Time = 0;
				}
				if (dwCanSmeltSlot(2) && dwIsBurning())
				{
					this.dwSlot2Time += 1;
					if (this.dwSlot2Time == dwGetSmeltTime(2))
					{
						this.dwSlot2Time = 0;
						dwFixArmourSlot(2);
						flag3 = true;
					}
				}
				else
				{
					this.dwSlot2Time = 0;
				}
				if (dwCanSmeltSlot(3) && dwIsBurning())
				{
					this.dwSlot3Time += 1;
					if (this.dwSlot3Time == dwGetSmeltTime(3))
					{
						this.dwSlot3Time = 0;
						dwFixArmourSlot(3);
						flag3 = true;
					}
				}
				else
				{
					this.dwSlot3Time = 0;
				}
				if (dwCanSmeltSlot(4) && dwIsBurning())
				{
					this.dwSlot4Time += 1;
					if (this.dwSlot4Time == dwGetSmeltTime(4))
					{
						this.dwSlot4Time = 0;
						dwFixArmourSlot(4);
						flag3 = true;
					}
				}
				else
				{
					this.dwSlot4Time = 0;
				}
			}
			if (flag3)
			{
				markDirty();
			}
		}
		if (4 <= meta && meta <= 7)
		{
			boolean flag = this.wmBurnTime > 0;
			boolean flag1 = false;
			if (this.wmBurnTime > 0)
			{
				this.wmBurnTime -= 1;
			}
			if (!this.worldObj.isRemote)
			{
				if (this.wmBurnTime == 0 && (canSmeltSlot(0) || canSmeltSlot(2) || canSmeltSlot(3) || canSmeltSlot(4)))
				{
					this.currentItemBurnTime = (this.wmBurnTime = getItemBurnTime(this.wmItemStacks[1]));
					if (this.wmBurnTime > 0)
					{
						flag1 = true;
						if (this.wmItemStacks[1] != null)
						{
							this.wmItemStacks[1].stackSize -= 1;
							if (this.wmItemStacks[1].stackSize == 0)
							{
								this.wmItemStacks[1] = null;
							//	this.wmItemStacks[1] = this.wmItemStacks[1].getItem().getContainerItemStack(this.wmItemStacks[1]);
							}
						}
					}
				}
				boolean playing = false;
				if (isBurning() && !playing)
				{
					playing = true;
					if (playing)
					{
						this.worldObj.playSoundEffect(this.xCoord, this.yCoord, this.zCoord, "jammyfurniture:washingmachine", 1.0F, 0.2F);
					}
				}
				else if (!isBurning())
				{
					playing = false;
				}
				if (canSmeltSlot(0) && isBurning())
				{
					this.wmSlot1Time += 1;
					if (this.wmSlot1Time == getSmeltTime(0))
					{
						this.wmSlot1Time = 0;
						fixArmourSlot(0);
						flag1 = true;
					}
				}
				else
				{
					this.wmSlot1Time = 0;
				}
				if (canSmeltSlot(2) && isBurning())
				{
					this.wmSlot2Time += 1;
					if (this.wmSlot2Time == getSmeltTime(2))
					{
						this.wmSlot2Time = 0;
						fixArmourSlot(2);
						flag1 = true;
					}
				}
				else
				{
					this.wmSlot2Time = 0;
				}
				if (canSmeltSlot(3) && isBurning())
				{
					this.wmSlot3Time += 1;
					if (this.wmSlot3Time == getSmeltTime(3))
					{
						this.wmSlot3Time = 0;
						fixArmourSlot(3);
						flag1 = true;
					}
				}
				else
				{
					this.wmSlot3Time = 0;
				}
				if (canSmeltSlot(4) && isBurning())
				{
					this.wmSlot4Time += 1;
					if (this.wmSlot4Time == getSmeltTime(4))
					{
						this.wmSlot4Time = 0;
						fixArmourSlot(4);
						flag1 = true;
					}
				}
				else
				{
					this.wmSlot4Time = 0;
				}
			}
			if (flag1)
			{
				markDirty();
			}
		}
	}

	public int dwGetSmeltTime(int slot)
	{
		int time = 10000;
		if (this.dwItemStacks[slot] == null)
		{
			return time;
		}
		for (int i = 0; i < diamondTools.length; i++)
		{
			if (this.dwItemStacks[slot].getItem().getUnlocalizedName().equals(diamondTools[i]))
			{
				time = 7200;
			}
		}
		for (int i = 0; i < goldTools.length; i++)
		{
			if (this.dwItemStacks[slot].getItem().getUnlocalizedName().equals(goldTools[i]))
			{
				time = 6000;
			}
		}
		for (int i = 0; i < ironTools.length; i++)
		{
			if (this.dwItemStacks[slot].getItem().getUnlocalizedName().equals(ironTools[i]))
			{
				time = 4800;
			}
		}
		for (int i = 0; i < stoneTools.length; i++)
		{
			if (this.dwItemStacks[slot].getItem().getUnlocalizedName().equals(stoneTools[i]))
			{
				time = 4000;
			}
		}
		for (int i = 0; i < woodTools.length; i++)
		{
			if (this.dwItemStacks[slot].getItem().getUnlocalizedName().equals(woodTools[i]))
			{
				time = 1500;
			}
		}
		return time;
	}

	private boolean dwCanSmeltSlot(int slot)
	{
		if (this.dwItemStacks[slot] == null)
		{
			return false;
		}
		ItemStack itemstack = jfm_DishwasherRecipes.smelting().getSmeltingResult(this.dwItemStacks[slot]);
		if (this.dwItemStacks[slot].getItemDamageForDisplay() == 0)
		{
			return false;
		}
		if (itemstack == null)
		{
			return false;
		}
		return true;
	}

	public void dwFixArmourSlot(int slot)
	{
		if (!dwCanSmeltSlot(slot))
		{
			return;
		}
		if (this.dwItemStacks[slot].stackSize <= 0) 
		{
			this.dwItemStacks[slot] = null;
		}
		if (this.dwItemStacks[slot].getItemDamageForDisplay() != 0)
		{
			this.dwItemStacks[slot].setItemDamage(0);
		}
	}

	public int getSmeltTime(int slot)
	{
		int time = 10000;
		if (this.wmItemStacks[slot] == null)
		{
			return time;
		}
		for (int i = 0; i < diamondArmour.length; i++)
		{
			if (this.wmItemStacks[slot].getItem().getUnlocalizedName().equals(diamondArmour[i]))
			{
				time = 7200;
			}
		}
		for (int i = 0; i < chainArmour.length; i++)
		{
			if (this.wmItemStacks[slot].getItem().getUnlocalizedName().equals(chainArmour[i]))
			{
				time = 6000;
			}
		}
		for (int i = 0; i < goldenArmour.length; i++)
		{
			if (this.wmItemStacks[slot].getItem().getUnlocalizedName().equals(goldenArmour[i]))
			{
				time = 4800;
			}
		}
		for (int i = 0; i < ironArmour.length; i++)
		{
			if (this.wmItemStacks[slot].getItem().getUnlocalizedName().equals(ironArmour[i]))
			{
				time = 4000;
			}
		}
		for (int i = 0; i < leatherArmour.length; i++)
		{
			if (this.wmItemStacks[slot].getItem().getUnlocalizedName().equals(leatherArmour[i]))
			{
				time = 1500;
			}
		}
		return time;
	}

	private boolean canSmeltSlot(int slot)
	{
		if (this.wmItemStacks[slot] == null)
		{
			return false;
		}
		ItemStack itemstack = jfm_WashingMachineRecipes.smelting().getSmeltingResult(this.wmItemStacks[slot]);
		if (this.wmItemStacks[slot].getItemDamageForDisplay() == 0)
		{
			return false;
		}
		if (itemstack == null)
		{
			return false;
		}
		return true;
	}

	public void fixArmourSlot(int slot)
	{
		if (!canSmeltSlot(slot))
		{
			return;
		}
		if (this.wmItemStacks[slot].stackSize <= 0)
		{
			this.wmItemStacks[slot] = null;
		}
		if (this.wmItemStacks[slot].getItemDamageForDisplay() != 0)
		{
			this.wmItemStacks[slot].setItemDamage(0);
		}
	}

	private static int getItemBurnTime(ItemStack par1ItemStack)
	{
		if (par1ItemStack == null)
		{
			return 0;
		}
		Item i = par1ItemStack.getItem();
/*		if ((i < 256) && (Block.blocksList[i].field_72018_cp == Material.wood)) {
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
