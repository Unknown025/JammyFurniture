package net.minecraft.jammy780.furniture.blocks.roofing;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemRoofingBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityRoofingBlocksOne;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class jfm_RoofingBlocksOne extends BlockContainer
{
	public jfm_RoofingBlocksOne(String name, int notsure, Class teClass)
	{
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName("jammyfurniture:jammy_roof");
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemRoofingBlocksOne.class, name);
	}

	@Override  
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if ((meta == 0) || (meta == 4) || (meta == 8)) {
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 0);
		}
	}

	@Override
	public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	{
		int var8 = par1World.getBlockMetadata(par2, par3, par4);
		int var9 = var8 & 0x3;
		float var10 = 0.0F;
		float var11 = 0.5F;
		float var12 = 0.5F;
		float var13 = 1.0F;
		if ((var8 & 0x4) != 0)
		{
			var10 = 0.5F;
			var11 = 1.0F;
			var12 = 0.0F;
			var13 = 0.5F;
		}
		setBlockBounds(0.0F, var10, 0.0F, 1.0F, var11, 1.0F);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		if (var9 == 0)
		{
			setBlockBounds(0.0F, var12, 0.5F, 1.0F, var13, 1.0F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else if (var9 == 1)
		{
			setBlockBounds(0.0F, var12, 0.0F, 0.5F, var13, 1.0F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else if (var9 == 2)
		{
			setBlockBounds(0.0F, var12, 0.0F, 1.0F, var13, 0.5F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else if (var9 == 3)
		{
			setBlockBounds(0.5F, var12, 0.0F, 1.0F, var13, 1.0F);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		int l = (MathHelper.floor_double(entityplayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		return false;
	}

	@Override  
	public int getRenderType()
	{
		return JammyFurnitureModCore.roofingBlocksOneRenderID;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int meta)
	{
		return new jfm_TileEntityRoofingBlocksOne();
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
}
