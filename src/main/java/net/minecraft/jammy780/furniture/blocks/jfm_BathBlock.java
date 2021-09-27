package net.minecraft.jammy780.furniture.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.item.jfm_ItemBath;
import net.minecraft.jammy780.furniture.item.jfm_ItemWoodBlocksOne;
import net.minecraft.jammy780.furniture.tiles.jfm_TileEntityBath;
import net.minecraft.jammy780.furniture.util.BlockMountable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class jfm_BathBlock extends BlockContainer
{
	public static final int[][] footBlockToHeadBlockMap = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };

	public jfm_BathBlock(String name, int notsure, Class teClass)
	{
		super(Material.iron);
		setBounds();
		setBlockName(name);
		setBlockTextureName("jammyfurniture:jammy_ceramic");
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerBlock(this, jfm_ItemBath.class, name);
	}

	// BlockDirectional class
	public static int getDirection(int par0)
	{
		return par0 & 0x3;
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (par1World.isRemote)
		{
			return true;
		}
		
		float x = 0.0F;
		float y = 0.0F;
		float z = 0.0F;
		
		int l = par1World.getBlockMetadata(par2, par3, par4);
		l %= 4;
		switch (l)
		{
		case 0:
			par5EntityPlayer.rotationYaw = 180.0F;
			x = 0.5F;
			y = 0.4F;
			z = 0.5F;
			break;
		case 1:
			par5EntityPlayer.rotationYaw = -90.0F;
			x = 0.5F;
			y = 0.4F;
			z = 0.5F;
			break;
		case 2:
			par5EntityPlayer.rotationYaw = 0.0F;
			x = 0.5F;
			y = 0.4F;
			z = 0.5F;
			break;
		case 3:
			par5EntityPlayer.rotationYaw = 90.0F;
			x = 0.5F;
			y = 0.4F;
			z = 0.5F;
			break;
		}
		
		return BlockMountable.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, x, y, z, 0, 0, 0, 0);
	}

	@Override
	public int getRenderType()
	{
		return JammyFurnitureModCore.bathTubRenderID;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		setBounds();
	}

	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
	{
		int var6 = par1World.getBlockMetadata(par2, par3, par4);
		int var7 = getDirection(var6);
		if (isBlockHeadOfBed(var6))
		{
			if (par1World.getBlock(par2 - footBlockToHeadBlockMap[var7][0], par3, par4 - footBlockToHeadBlockMap[var7][1]) != this)
			{
				par1World.setBlockToAir(par2, par3, par4);
			}
		}
		else if (par1World.getBlock(par2 + footBlockToHeadBlockMap[var7][0], par3, par4 + footBlockToHeadBlockMap[var7][1]) != this)
		{
			par1World.setBlockToAir(par2, par3, par4);
			if (!par1World.isRemote)
			{
				dropBlockAsItem(par1World, par2, par3, par4, var6, 0);
			}
		}
	}

	private void setBounds()
	{
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8F, 1.0F);
	}

	public static boolean isBlockHeadOfBed(int par0)
	{
		return (par0 & 0x8) != 0;
	}

	public static ChunkCoordinates getNearestEmptyChunkCoordinates(World par0World, int par1, int par2, int par3, int par4)
	{
		int var5 = par0World.getBlockMetadata(par1, par2, par3);
		int var6 = getDirection(var5);
		for (int var7 = 0; var7 <= 1; var7++)
		{
			int var8 = par1 - footBlockToHeadBlockMap[var6][0] * var7 - 1;
			int var9 = par3 - footBlockToHeadBlockMap[var6][1] * var7 - 1;
			int var10 = var8 + 2;
			int var11 = var9 + 2;
			for (int var12 = var8; var12 <= var10; var12++)
			{
				for (int var13 = var9; var13 <= var11; var13++)
				{
					if (World.doesBlockHaveSolidTopSurface(par0World, var12, par2 - 1, var13) && !par0World.getBlock(var12, par2, var13).getMaterial().isOpaque() && !par0World.getBlock(var12, par2 + 1, var13).getMaterial().isOpaque())
					{
						if (par4 <= 0)
						{
							return new ChunkCoordinates(var12, par2, var13);
						}
						--par4;
					}
				}
			}
		}
		return null;
	}
/*
	@SideOnly(Side.CLIENT)
	@Override
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return JammyFurnitureModCore.bathTub.blockID;
	}
*/
	@Override
	public TileEntity createNewTileEntity(World var1, int metadata)
	{
		return new jfm_TileEntityBath();
	}
}
