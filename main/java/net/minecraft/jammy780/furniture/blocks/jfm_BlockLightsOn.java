package net.minecraft.jammy780.furniture.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemLightsOn;
import net.minecraft.jammy780.furniture.item.jfm_ItemWoodBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityLightsOn;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class jfm_BlockLightsOn extends BlockContainer
{
	IIcon lightone;
	IIcon lighttwo;
	IIcon lightthree;

	public jfm_BlockLightsOn(String name, int notsure, Class teClass, boolean active)
	{
		super(Material.glass);
		if (active)
		{
			setLightLevel(1.0F);
		}
		setBlockName(name);
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemLightsOn.class, name);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if (meta == 4)
		{
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 0);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if (b == 0 || b == 2 || b == 4 || b == 6)
		{
			setBlockBounds(0.05F, 0.0F, 0.1F, 0.95F, 1.0F, 0.9F);
		}
		else if (b == 1 || b == 3 || b == 5 || b == 7)
		{
			setBlockBounds(0.1F, 0.0F, 0.05F, 0.9F, 1.0F, 0.95F);
		}
		else if (b == 12)
		{
			setBlockBounds(0.05F, 0.0F, 0.05F, 0.95F, 1.0F, 0.95F);
		}
		else
		{
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, i);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if (b == 0) {
			setBlockBounds(0.25F, 0.385F, 0.315F, 0.685F, 1.0F, 0.75F);
		} else if (b == 4) {
			setBlockBounds(0.315F, 0.125F, 0.5F, 0.625F, 0.925F, 1.0F);
		} else if (b == 5) {
			setBlockBounds(0.0F, 0.125F, 0.315F, 0.5F, 0.925F, 0.625F);
		} else if (b == 6) {
			setBlockBounds(0.375F, 0.125F, 0.0F, 0.685F, 0.925F, 0.5F);
		} else if (b == 7) {
			setBlockBounds(0.5F, 0.125F, 0.375F, 1.0F, 0.925F, 0.685F);
		} else if (b == 8) {
			setBlockBounds(0.315F, 0.0F, 0.315F, 0.685F, 0.875F, 0.685F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		int l = par1World.getBlockMetadata(par2, par3, par4);
		if (par1World.getBlock(par2, par3, par4) == JammyFurnitureModCore.lightsOn)
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.lightsOff, l, 0);
		}
		else
		{
			par1World.setBlock(par2, par3, par4, JammyFurnitureModCore.lightsOn, l, 0);
		}
		return true;
	}

	@Override
	public int getRenderType()
	{
		return JammyFurnitureModCore.lightsRenderID;
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
		return new jfm_TileEntityLightsOn();
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs ctabs, List list)
	{
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 4));
		list.add(new ItemStack(item, 1, 8));
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

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1IIconRegister)
	{
		this.lightone = par1IIconRegister.registerIcon("jammyfurniture:jammy_sofa_red");
		this.lighttwo = par1IIconRegister.registerIcon("jammyfurniture:jammy_outlight");
		this.lightthree = par1IIconRegister.registerIcon("jammyfurniture:jammy_tablelight");
	}

	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if (metadata <= 3)
		{
			return this.lightone;
		}
		if (metadata >= 4 && metadata <= 7)
		{
			return this.lighttwo;
		}
		return this.lightthree;
	}
}
