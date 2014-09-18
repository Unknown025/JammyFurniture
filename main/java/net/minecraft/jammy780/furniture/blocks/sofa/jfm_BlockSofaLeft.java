package net.minecraft.jammy780.furniture.blocks.sofa;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemSofaLeft;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntitySofaLeft;
import net.minecraft.jammy780.furniture.util.BlockMountable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class jfm_BlockSofaLeft extends BlockContainer
{
	private IIcon jfm_blockIconRed;
	private IIcon jfm_blockIconBlue;
	private IIcon jfm_blockIconGreen;
	private IIcon jfm_blockIconGrey;

	public jfm_BlockSofaLeft(String name, int notsure, Class teClass)
	{
		super(Material.wood);
		setBlockName(name);
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemSofaLeft.class, name);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if ((b == 0) || (b == 2) || (b == 4) || (b == 6)) {
			setBlockBounds(0.05F, 0.0F, 0.1F, 0.95F, 1.0F, 0.9F);
		} else if ((b == 1) || (b == 3) || (b == 5) || (b == 7)) {
			setBlockBounds(0.1F, 0.0F, 0.05F, 0.9F, 1.0F, 0.95F);
		} else if (b == 12) {
			setBlockBounds(0.05F, 0.0F, 0.05F, 0.95F, 1.0F, 0.95F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, i);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if ((b == 0) || (b == 2) || (b == 4) || (b == 6)) {
			setBlockBounds(0.05F, 0.0F, 0.1F, 0.95F, 1.0F, 0.9F);
		} else if ((b == 1) || (b == 3) || (b == 5) || (b == 7)) {
			setBlockBounds(0.1F, 0.0F, 0.05F, 0.9F, 1.0F, 0.95F);
		} else if (b == 12) {
			setBlockBounds(0.05F, 0.0F, 0.05F, 0.95F, 1.0F, 0.95F);
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
		int l = par1World.getBlockMetadata(par2, par3, par4);
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

	@Override
	public int getRenderType()
	{
		return JammyFurnitureModCore.sofaPartLeftRenderID;
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
		return new jfm_TileEntitySofaLeft();
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
		this.jfm_blockIconRed = par1IIconRegister.registerIcon("jammyfurniture:jammy_sofa_red");
		this.jfm_blockIconGreen = par1IIconRegister.registerIcon("jammyfurniture:jammy_sofa_green");
		this.jfm_blockIconGrey = par1IIconRegister.registerIcon("jammyfurniture:jammy_sofa_grey");
		this.jfm_blockIconBlue = par1IIconRegister.registerIcon("jammyfurniture:jammy_sofa_blue");
	}

	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if (metadata <= 3) {
			return this.jfm_blockIconRed;
		}
		if ((metadata >= 4) && (metadata <= 7)) {
			return this.jfm_blockIconBlue;
		}
		if ((metadata >= 8) && (metadata <= 11)) {
			return this.jfm_blockIconGrey;
		}
		return this.jfm_blockIconGreen;
	}
}
