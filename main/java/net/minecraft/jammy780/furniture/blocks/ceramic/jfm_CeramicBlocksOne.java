package net.minecraft.jammy780.furniture.blocks.ceramic;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemCeramicBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityCeramicBlocksOne;
import net.minecraft.jammy780.furniture.util.BlockMountable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class jfm_CeramicBlocksOne extends BlockContainer
{
	public Random random;
	IIcon ceramic;

	public jfm_CeramicBlocksOne(String name, int notsure, Class teClass)
	{
		super(Material.glass);
		this.random = new Random();
		setBlockName(name);
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemCeramicBlocksOne.class, name);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if (b == 0) {
			setBlockBounds(0.1F, 0.0F, 0.6F, 0.9F, 1.0F, 1.0F);
		} else if (b == 1) {
			setBlockBounds(0.0F, 0.0F, 0.1F, 0.4F, 1.0F, 0.9F);
		} else if (b == 2) {
			setBlockBounds(0.1F, 0.0F, 0.0F, 0.9F, 1.0F, 0.4F);
		} else if (b == 3) {
			setBlockBounds(0.6F, 0.0F, 0.1F, 1.0F, 1.0F, 0.9F);
		} else if (b == 4) {
			setBlockBounds(0.1F, 0.0F, 0.2F, 0.9F, 1.0F, 1.0F);
		} else if (b == 5) {
			setBlockBounds(0.0F, 0.0F, 0.1F, 0.8F, 1.0F, 0.9F);
		} else if (b == 6) {
			setBlockBounds(0.1F, 0.0F, 0.0F, 0.9F, 1.0F, 0.8F);
		} else if (b == 7) {
			setBlockBounds(0.2F, 0.0F, 0.1F, 1.0F, 1.0F, 0.9F);
		} else if ((b == 8) || (b == 9) || (b == 10) || (b == 11)) {
			setBlockBounds(0.0F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (b == 12) {
			setBlockBounds(0.15F, 0.0F, 0.05F, 0.85F, 1.0F, 1.0F);
		} else if (b == 13) {
			setBlockBounds(0.05F, 0.0F, 0.15F, 1.0F, 1.0F, 0.85F);
		} else if (b == 14) {
			setBlockBounds(0.15F, 0.0F, 0.0F, 0.85F, 1.0F, 0.95F);
		} else if (b == 15) {
			setBlockBounds(0.0F, 0.0F, 0.15F, 0.95F, 1.0F, 0.85F);
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
			setBlockBounds(0.1F, 0.0F, 0.6F, 0.9F, 1.0F, 1.0F);
		} else if (b == 1) {
			setBlockBounds(0.0F, 0.0F, 0.1F, 0.4F, 1.0F, 0.9F);
		} else if (b == 2) {
			setBlockBounds(0.1F, 0.0F, 0.0F, 0.9F, 1.0F, 0.4F);
		} else if (b == 3) {
			setBlockBounds(0.6F, 0.0F, 0.1F, 1.0F, 1.0F, 0.9F);
		} else if (b == 4) {
			setBlockBounds(0.1F, 0.0F, 0.2F, 0.9F, 1.0F, 1.0F);
		} else if (b == 5) {
			setBlockBounds(0.0F, 0.0F, 0.1F, 0.8F, 1.0F, 0.9F);
		} else if (b == 6) {
			setBlockBounds(0.1F, 0.0F, 0.0F, 0.9F, 1.0F, 0.8F);
		} else if (b == 7) {
			setBlockBounds(0.2F, 0.0F, 0.1F, 1.0F, 1.0F, 0.9F);
		} else if ((b == 8) || (b == 9) || (b == 10) || (b == 11)) {
			setBlockBounds(0.0F, 0.4F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (b == 12) {
			setBlockBounds(0.15F, 0.0F, 0.05F, 0.85F, 1.0F, 1.0F);
		} else if (b == 13) {
			setBlockBounds(0.05F, 0.0F, 0.15F, 1.0F, 1.0F, 0.85F);
		} else if (b == 14) {
			setBlockBounds(0.15F, 0.0F, 0.0F, 0.85F, 1.0F, 0.95F);
		} else if (b == 15) {
			setBlockBounds(0.0F, 0.0F, 0.15F, 0.95F, 1.0F, 0.85F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if ((meta == 0) || (meta == 4) || (meta == 8) || (meta == 12)) {
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 0);
		}
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		int l = (MathHelper.floor_double(entityplayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if ((meta == 12) || (meta == 13) || (meta == 14) || (meta == 15))
		{
			par1World.playSoundAtEntity(entityplayer, "jammyfurniture:toilet", 1.0F, 1.0F);
			if (par1World.isRemote) {
				return true;
			}
			l %= 4;
			if (l == 0) {
				entityplayer.rotationYaw = 180.0F;
			}
			if (l == 1) {
				entityplayer.rotationYaw = -90.0F;
			}
			if (l == 2) {
				entityplayer.rotationYaw = 0.0F;
			}
			if (l == 3) {
				entityplayer.rotationYaw = 90.0F;
			}
			float x = 0.0F;float y = 0.0F;float z = 0.0F;
			if (l == 0)
			{
				x = 0.5F;
				y = 0.4F;
				z = 0.5F;
			}
			if (l == 1)
			{
				x = 0.5F;
				y = 0.4F;
				z = 0.5F;
			}
			if (l == 2)
			{
				x = 0.5F;
				y = 0.4F;
				z = 0.5F;
			}
			if (l == 3)
			{
				x = 0.5F;
				y = 0.4F;
				z = 0.5F;
			}
			return BlockMountable.onBlockActivated(par1World, par2, par3, par4, entityplayer, x, y, z, 0, 0, 0, 0);
		}
		if ((meta == 0) || (meta == 1) || (meta == 2) || (meta == 3))
		{
			jfm_TileEntityCeramicBlocksOne teCeramic = (jfm_TileEntityCeramicBlocksOne)par1World.getTileEntity(par2, par3, par4);
			if (teCeramic != null)
			{
				entityplayer.openGui(JammyFurnitureModCore.instance, 150, par1World, par2, par3, par4);
				return true;
			}
		}
		else if ((meta == 4) || (meta == 5) || (meta == 6) || (meta == 7) || (meta == 8) || (meta == 9) || (meta == 10) || (meta == 11))
		{
			if (par1World.isRemote) {
				return true;
			}
			ItemStack stack = entityplayer.inventory.getCurrentItem();
			if (stack == null)
			{
				return true;
			}
			if (stack.getItem() == Items.bucket)
			{
				ItemStack var12 = new ItemStack(Items.water_bucket, 1, 0);
				if (!entityplayer.inventory.addItemStackToInventory(var12))
				{
					par1World.spawnEntityInWorld(new EntityItem(par1World, par2 + 0.5D, par3 + 1.5D, par4 + 0.5D, var12));
				} else if ((entityplayer instanceof EntityPlayerMP))
				{
					((EntityPlayerMP)entityplayer).sendContainerToPlayer(entityplayer.inventoryContainer);
				}
				stack.stackSize -= 1;
				if (stack.stackSize <= 0) {
					entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, (ItemStack)null);
				}
				return true;
			}
			if (stack.getItem() == Items.glass_bottle)
			{
				ItemStack var12 = new ItemStack(Items.potionitem, 1, 0);
				if (!entityplayer.inventory.addItemStackToInventory(var12))
				{
					par1World.spawnEntityInWorld(new EntityItem(par1World, par2 + 0.5D, par3 + 1.5D, par4 + 0.5D, var12));
				} else if ((entityplayer instanceof EntityPlayerMP))
				{
					((EntityPlayerMP)entityplayer).sendContainerToPlayer(entityplayer.inventoryContainer);
				}
				stack.stackSize -= 1;
				if (stack.stackSize <= 0)
				{
					entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, null);
				}
			}
			return true;
		}
		return true;
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6)
	{
		jfm_TileEntityCeramicBlocksOne te = (jfm_TileEntityCeramicBlocksOne)par1World.getTileEntity(par2, par3, par4);
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
						if (k1 > itemstack.stackSize) {
							k1 = itemstack.stackSize;
						}
						itemstack.stackSize -= k1;
						entityitem = new EntityItem(par1World, par2 + f, par3 + f1, par4 + f2, new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));
						float f3 = 0.05F;
						entityitem.motionX = ((float)this.random.nextGaussian() * f3);
						entityitem.motionY = ((float)this.random.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = ((float)this.random.nextGaussian() * f3);
						if (itemstack.hasTagCompound()) {
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
		return JammyFurnitureModCore.ceramicBlocksOneRenderID;
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
	public TileEntity createNewTileEntity(World var1, int meta)
	{
		return new jfm_TileEntityCeramicBlocksOne();
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs ctabs, List list)
	{
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 4));
		list.add(new ItemStack(item, 1, 8));
		list.add(new ItemStack(item, 1, 12));
	}

	@Override
	public int damageDropped(int par1)
	{
		if ((par1 == 1) || (par1 == 2) || (par1 == 3)) {
			par1 = 0;
		}
		if ((par1 == 5) || (par1 == 6) || (par1 == 7)) {
			par1 = 4;
		}
		if ((par1 == 9) || (par1 == 10) || (par1 == 11)) {
			par1 = 8;
		}
		if ((par1 == 13) || (par1 == 14) || (par1 == 15)) {
			par1 = 12;
		}
		return par1;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1IIconRegister)
	{
		this.ceramic = par1IIconRegister.registerIcon("jammyfurniture:jammy_ceramic");
	}

	@Override
	public IIcon getIcon(int side, int metadata)
	{
		return this.ceramic;
	}
}
