package net.minecraft.jammy780.furniture.blocks.wood;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemWoodBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class jfm_WoodBlocksOne extends BlockContainer
{
	private Class teClass;
	public Random random;
	private IIcon jfm_blockIcon;

	public jfm_WoodBlocksOne(String name, int notsure, Class c)
	{
		super(Material.wood);
		teClass = c;
		random = new Random();
		setBlockName(name);
		setBlockTextureName("jammyfurniture:jammy_wood");
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemWoodBlocksOne.class, name);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if (b == 0 || b == 2)
		{
			setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
		} else if (b == 1) {
			setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
		} else if (b == 9) {
			setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
		} else if (b == 10) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.1F, 1.0F, 1.0F);
		} else if (b == 11) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);
		} else if (b == 12) {
			setBlockBounds(0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (b == 13 || b == 14 || b == 15)
		{
			setBlockBounds(0.0F, 0.875F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, i);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if (b == 0) {
			setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
		} else if (b == 1 || b == 2 || b == 3 || b == 4) {
			setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
		} else if (b == 5 || b == 6 || b == 7 || b == 8) {
			setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
		} else if (b == 9) {
			setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
		} else if (b == 10) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.1F, 1.0F, 1.0F);
		} else if (b == 11) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);
		} else if (b == 12) {
			setBlockBounds(0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (b == 13 || b == 14) {
			setBlockBounds(0.0F, 0.875F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if (meta == 1 || meta == 5 || meta == 9)
		{
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 1);
		}
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		int l = (MathHelper.floor_double(entityplayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();
		if (1 <= meta && meta <= 4)
		{
			if ((itemstack != null && itemstack.getItemDamage() == 5) ||
				(itemstack != null && itemstack.getItemDamage() == 6) ||
				(itemstack != null && itemstack.getItemDamage() == 7) ||
				(itemstack != null && itemstack.getItemDamage() == 8))
			{
				return false;
			}
			jfm_TileEntityWoodBlocks teWoodBlocks = (jfm_TileEntityWoodBlocks)par1World.getTileEntity(par2, par3, par4);
			if (teWoodBlocks != null)
			{
				entityplayer.openGui(JammyFurnitureModCore.instance, 151, par1World, par2, par3, par4);
				return true;
			}
		}
		else
		{
			if (5 <= meta && meta <= 8)
			{
				if (par1World.isRemote)
				{
					return true;
				}
				float ftime = par1World.getCelestialAngle(1.0F) * 100.0F;
				int time = Math.round(ftime);
				String message = "";
				if (time == 0)
				{
					message = StatCollector.translateToLocal("info.midday");
				}
				if (time >= 90 && time <= 10)
				{
					message = StatCollector.translateToLocal("info.near_midday");
				}
				if (time >= 11 && time <= 21)
				{
					message = StatCollector.translateToLocal("info.near_sundown");
				}
				if (time == 22)
				{
					message = StatCollector.translateToLocal("info.sundown");
				}
				if (time >= 41 && time <= 49)
				{
					message = StatCollector.translateToLocal("info.to_midnight");
				}
				if (time == 50)
				{
					message = StatCollector.translateToLocal("info.midnight");
				}
				if (time >= 55 && time <= 69)
				{
					message = StatCollector.translateToLocal("info.near_morning");
				}
				if (time >= 70 && time <= 89)
				{
					message = StatCollector.translateToLocal("info.morning");
				}
				time = (int)((FMLClientHandler.instance().getClient().theWorld.getWorldTime() + 6000) % 24000);
				int hours = time / 1000;
				int minutes = (time % 1000) * 6 / 100;
				entityplayer.addChatMessage(new ChatComponentText(String.format(StatCollector.translateToLocal("info.time"), String.format("%02d:%02d", hours, minutes))));				
				if (message != "")
				{
					entityplayer.addChatMessage(new ChatComponentText(String.format(StatCollector.translateToLocal("info.it"), message)));
				}
				/*if (itemstack != null && itemstack.getItem() == Items.book)
				{
					entityplayer.addChatMessage(new ChatComponentText("---- Information ----"));
					entityplayer.addChatMessage(new ChatComponentText("There are 100 hours from midday to midnight."));
					entityplayer.addChatMessage(new ChatComponentText("The time resets to 0 at midday."));
					entityplayer.addChatMessage(new ChatComponentText("When the time is 50, it is midnight."));
					entityplayer.addChatMessage(new ChatComponentText("---- End Information ----"));
				}*/
				return true;
			}
			if (meta == 9)
			{
				par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 8, 2);
				return true;
			}
			if (meta == 10)
			{
				par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 9, 2);
				return true;
			}
			if (meta == 11)
			{
				par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 10, 2);
				return true;
			}
			if (meta == 12)
			{
				par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 11, 2);
				return true;
			}
			if (meta == 13)
			{
				jfm_TileEntityWoodBlocks teWoodBlocks = (jfm_TileEntityWoodBlocks)par1World.getTileEntity(par2, par3, par4);
				if (teWoodBlocks != null)
				{
					entityplayer.openGui(JammyFurnitureModCore.instance, 160, par1World, par2, par3, par4);
					return true;
				}
			}
		}
		return true;
	}

	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
	{
		super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
		jfm_TileEntityWoodBlocks te = (jfm_TileEntityWoodBlocks)par1World.getTileEntity(par2, par3, par4);
		if (te != null)
		{
			te.updateContainingBlockInfo();
		}
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6)
	{
		jfm_TileEntityWoodBlocks te = (jfm_TileEntityWoodBlocks)par1World.getTileEntity(par2, par3, par4);
		if (te != null)
		{
			for (int j1 = 0; j1 < te.getSizeInventory(); j1++)
			{
				ItemStack itemstack = te.getStackInSlot(j1);
				if (itemstack != null)
				{
					float f = this.random.nextFloat() * 0.8F + 0.1F;
					float f1 = this.random.nextFloat() * 0.8F + 0.1F;
					EntityItem entityitem;
					for (float f2 = this.random.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; par1World.spawnEntityInWorld(entityitem))
					{
						int k1 = this.random.nextInt(21) + 10;
						if (k1 > itemstack.stackSize)
						{
							k1 = itemstack.stackSize;
						}
						itemstack.stackSize -= k1;
						entityitem = new EntityItem(par1World, par2 + f, par3 + f1, par4 + f2, new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));
						float f3 = 0.05F;
						entityitem.motionX = ((float)this.random.nextGaussian() * f3);
						entityitem.motionY = ((float)this.random.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = ((float)this.random.nextGaussian() * f3);
						if (itemstack.hasTagCompound())
						{
							entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
						}
					}
				}
			}
			par1World.func_147453_f(par2, par3, par4, par5);
		}
		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}

	@Override
	public int getRenderType()
	{
		return JammyFurnitureModCore.woodBlocksOneRenderID;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata)
	{
		try
		{
			return (TileEntity)this.teClass.newInstance();
		}
		catch (Exception exception)
		{
			throw new RuntimeException(exception);
		}
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs ctabs, List list)
	{
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 1));
		list.add(new ItemStack(item, 1, 5));
		list.add(new ItemStack(item, 1, 9));
		list.add(new ItemStack(item, 1, 13));
		list.add(new ItemStack(item, 1, 14));
		list.add(new ItemStack(item, 1, 15));
	}

	@Override
	public int damageDropped(int par1)
	{
		if (par1 == 2 || par1 == 3 || par1 == 4)
		{
			par1 = 1;
		}
		if (par1 == 10 || par1 == 11 || par1 == 12)
		{
			par1 = 9;
		}
		return par1;
	}
}
