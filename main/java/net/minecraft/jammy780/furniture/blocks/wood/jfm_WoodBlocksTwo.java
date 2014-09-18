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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemWoodBlocksTwo;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocksTwo;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class jfm_WoodBlocksTwo extends BlockContainer
{
	private Class teClass;
	public static int rotation;
	public Random random;

	public jfm_WoodBlocksTwo(String name, int notsure, Class c)
	{
		super(Material.wood);
		teClass = c;
		random = new Random();
		setBlockName(name);
		setBlockTextureName("jammyfurniture:jammy_wood");
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemWoodBlocksTwo.class, name);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if (meta == 0 || meta == 4 || meta == 8)
		{
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 0);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if (b == 8 || b == 10)
		{
			setBlockBounds(0.0F, 0.0F, 0.4F, 1.0F, 1.0F, 0.8F);
		}
		else if (b == 9 || b == 11)
		{
			setBlockBounds(0.2F, 0.0F, 0.0F, 0.8F, 1.0F, 1.0F);
		}
		else
		{
			if (b == 12 || b == 13 || b == 14 || b == 15)
			{
				return null;
			}
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, i);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if (b == 8 || b == 10)
		{
			setBlockBounds(0.0F, 0.0F, 0.2F, 1.0F, 1.0F, 0.8F);
		} else if (b == 9 || b == 11)
		{
			setBlockBounds(0.2F, 0.0F, 0.0F, 0.8F, 1.0F, 1.0F);
		} else if (b == 12 || b == 13 || b == 14 || b == 15)
		{
			setBlockBounds(0.05F, 0.0F, 0.05F, 0.95F, 0.4F, 0.95F);
		}
		else
		{
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		if (meta == 0 || meta == 1 || meta == 2 || meta == 3)
		{
			jfm_TileEntityWoodBlocksTwo teWoodBlocksTwo = (jfm_TileEntityWoodBlocksTwo)par1World.getTileEntity(par2, par3, par4);
			if (teWoodBlocksTwo != null)
			{
				entityplayer.openGui(JammyFurnitureModCore.instance, 153, par1World, par2, par3, par4);
				return true;
			}
		}
		else if (meta == 4 || meta == 5 || meta == 6 || meta == 7)
		{
			jfm_TileEntityWoodBlocksTwo teWoodBlocksTwo = (jfm_TileEntityWoodBlocksTwo)par1World.getTileEntity(par2, par3, par4);
			if (teWoodBlocksTwo != null)
			{
				entityplayer.openGui(JammyFurnitureModCore.instance, 154, par1World, par2, par3, par4);
				return true;
			}
		}
		return false;
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6)
	{
		jfm_TileEntityWoodBlocksTwo te = (jfm_TileEntityWoodBlocksTwo)par1World.getTileEntity(par2, par3, par4);
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
		return JammyFurnitureModCore.woodBlocksTwoRenderID;
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
	public TileEntity createNewTileEntity(World var1, int metadata)
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
		list.add(new ItemStack(item, 1, 4));
		list.add(new ItemStack(item, 1, 8));
		list.add(new ItemStack(item, 1, 12));
		list.add(new ItemStack(item, 1, 13));
		list.add(new ItemStack(item, 1, 14));
		list.add(new ItemStack(item, 1, 15));
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
		return par1;
	}
}
