package net.minecraft.jammy780.furniture.blocks.wood;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemWoodBlocksThree;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityWoodBlocksThree;
import net.minecraft.jammy780.furniture.util.BlockMountable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class jfm_WoodBlocksThree extends BlockContainer
{
	public static int rotation;

	public jfm_WoodBlocksThree(String name, int notsure, Class teClass)
	{
		super(Material.wood);
		setBlockName(name);
		setBlockTextureName("jammyfurniture:jammy_wood");
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemWoodBlocksThree.class, name);
	}

	@Override
	public Item getItemDropped(int i, Random random, int j)
	{
		if (i >= 8)
		{
			return Item.getItemFromBlock(JammyFurnitureModCore.woodBlocksOne);
		}
		return Item.getItemFromBlock(JammyFurnitureModCore.woodBlocksThree);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if ((b == 0) || (b == 1) || (b == 2) || (b == 3)) {
			return null;
		}
		if ((b == 4) || (b == 6)) {
			setBlockBounds(0.0F, 0.0F, 0.3F, 1.0F, 1.0F, 0.7F);
		} else if ((b == 5) || (b == 7)) {
			setBlockBounds(0.3F, 0.0F, 0.0F, 0.7F, 1.0F, 1.0F);
		} else if (b == 8) {
			setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
		} else if (b == 9) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.1F, 1.0F, 1.0F);
		} else if (b == 10) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);
		} else if (b == 11) {
			setBlockBounds(0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (b == 12) {
			setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
		} else if (b == 13) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.1F, 1.0F, 1.0F);
		} else if (b == 14) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);
		} else if (b == 15) {
			setBlockBounds(0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, i);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if ((b == 0) || (b == 1) || (b == 2) || (b == 3)) {
			setBlockBounds(0.15F, 0.0F, 0.15F, 0.85F, 1.0F, 0.85F);
		} else if ((b == 4) || (b == 6)) {
			setBlockBounds(0.0F, 0.0F, 0.3F, 1.0F, 1.0F, 0.7F);
		} else if ((b == 5) || (b == 7)) {
			setBlockBounds(0.3F, 0.0F, 0.0F, 0.7F, 1.0F, 1.0F);
		} else if (b == 8) {
			setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
		} else if (b == 9) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.1F, 1.0F, 1.0F);
		} else if (b == 10) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);
		} else if (b == 11) {
			setBlockBounds(0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else if (b == 12) {
			setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
		} else if (b == 13) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 0.1F, 1.0F, 1.0F);
		} else if (b == 14) {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);
		} else if (b == 15) {
			setBlockBounds(0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if (meta == 0 || meta == 4)
		{
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 0);
		}
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		int l = par1World.getBlockMetadata(par2, par3, par4);
		if (l == 0 || l == 1 || l == 2 || l == 3)
		{
			if (par1World.isRemote)
			{
				return true;
			}
			l %= 4;
			if (l == 0)
			{
				par5EntityPlayer.rotationYaw = 180.0F;
			}
			if (l == 1)
			{
				par5EntityPlayer.rotationYaw = -90.0F;
			}
			if (l == 2)
			{
				par5EntityPlayer.rotationYaw = 0.0F;
			}
			if (l == 3)
			{
				par5EntityPlayer.rotationYaw = 90.0F;
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
			return BlockMountable.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, x, y, z, 0, 0, 0, 0);
		}
		if (l == 4 || l == 5 || l == 6 || l == 7)
		{
			par1World.playSoundAtEntity(par5EntityPlayer, "jammyfurniture:radio", 1.0F, 1.0F);
			return true;
		}
		if (l == 8)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 12, 2);
			return true;
		}
		if (l == 9)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 13, 2);
			return true;
		}
		if (l == 10)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 14, 2);
			return true;
		}
		if (l == 11)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksThree, 15, 2);
			return true;
		}
		if (l == 12)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksOne, 9, 2);
			return true;
		}
		if (l == 13)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksOne, 10, 2);
			return true;
		}
		if (l == 14)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksOne, 11, 2);
			return true;
		}
		if (l == 15)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.woodBlocksOne, 12, 2);
			return true;
		}
		return false;
	}

	@Override
	public int getRenderType()
	{
		return JammyFurnitureModCore.woodBlocksThreeRenderID;
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
		return new jfm_TileEntityWoodBlocksThree();
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs ctabs, List list)
	{
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 4));
	}

	@Override
	public int damageDropped(int par1)
	{
		if (par1 == 1 || par1 == 2 || par1 == 3)
		{
			par1 = 0;
		}
		if (par1 == 5 || par1 == 6 || par1 == 7)
		{
			par1 = 4;
		}
		if (par1 >= 8)
		{
			par1 = 9;
		}
		return par1;
	}
}
