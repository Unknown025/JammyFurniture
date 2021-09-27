package net.minecraft.jammy780.furniture.blocks.heads;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemMobHeadsFour;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityMobHeadsFour;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class jfm_MobHeadsFour extends BlockContainer
{
	public jfm_MobHeadsFour(String name, int notsure, Class teClass)
	{
		super(Material.cloth);
		setBlockName(name);
		setBlockTextureName("jammyfurniture:jammy_cloth");
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemMobHeadsFour.class, name);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack is)
	{
		int meta = world.getBlockMetadata(i, j, k);
		int l = (MathHelper.floor_double(entityliving.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if (meta == 0 || meta == 4 || meta == 8 || meta == 12)
		{
			world.setBlockMetadataWithNotify(i, j, k, meta + l, 0);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		int b = par1World.getBlockMetadata(par2, par3, i);
		if ((b == 0) || (b == 4) || (b == 8) || (b == 12)) {
			setBlockBounds(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
		} else if ((b == 1) || (b == 5) || (b == 9) || (b == 13)) {
			setBlockBounds(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
		} else if ((b == 2) || (b == 6) || (b == 10) || (b == 14)) {
			setBlockBounds(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
		} else if ((b == 3) || (b == 7) || (b == 11) || (b == 15)) {
			setBlockBounds(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, i);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int b = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		if ((b == 0) || (b == 4) || (b == 8) || (b == 12)) {
			setBlockBounds(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
		} else if ((b == 1) || (b == 5) || (b == 9) || (b == 13)) {
			setBlockBounds(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
		} else if ((b == 2) || (b == 6) || (b == 10) || (b == 14)) {
			setBlockBounds(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
		} else if ((b == 3) || (b == 7) || (b == 11) || (b == 15)) {
			setBlockBounds(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		int l = (MathHelper.floor_double(entityplayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
		if ((meta == 0) || (meta == 1) || (meta == 2) || (meta == 3))
		{
			par1World.playSound(par2, par3, par4, "mob.endermen.idle", 1.0F, 1.0F, true);
			return true;
		}
		if ((meta == 4) || (meta == 5) || (meta == 6) || (meta == 7))
		{
			par1World.playSound(par2, par3, par4, "mob.slime", 1.0F, 1.0F, true);
			return true;
		}
		if ((meta == 8) || (meta == 9) || (meta == 10) || (meta == 11))
		{
			par1World.playSound(par2, par3, par4, "mob.blaze.breathe", 1.0F, 1.0F, true);
			return true;
		}
		if ((meta == 12) || (meta == 13) || (meta == 14) || (meta == 15))
		{
			par1World.playSound(par2, par3, par4, "mob.zombiepig.zpig", 1.0F, 1.0F, true);
			return true;
		}
		return false;
	}

	@Override  
	public int getRenderType()
	{
		return JammyFurnitureModCore.mobHeadsFourRenderID;
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
	public TileEntity createNewTileEntity(World var1,int meta)
	{
		return new jfm_TileEntityMobHeadsFour();
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
