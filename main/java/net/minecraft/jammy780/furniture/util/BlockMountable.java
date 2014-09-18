package net.minecraft.jammy780.furniture.util;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockMountable extends Block
{
	public BlockMountable(Material material)
	{
		super(material);
	}

	public BlockMountable(int y, Material material)
	{
		super(material);
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
	{
		return onBlockActivated(world, i, j, k, entityplayer, 0.5F, 1.0F, 0.5F, 0, 0, 0, 0);
	}

	public static boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, float y)
	{
		return onBlockActivated(world, i, j, k, entityplayer, 0.5F, y, 0.5F, 0, 0, 0, 0);
	}

	public static boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, float x, float y, float z, int north, int south, int east, int west)
	{
		if (!world.isRemote)
		{
			List<EntityMountableBlock> listEMB = world.getEntitiesWithinAABB(EntityMountableBlock.class, AxisAlignedBB.getBoundingBox(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D).expand(1.0D, 1.0D, 1.0D));
			for (EntityMountableBlock entitytocheck : listEMB) 
			{
				if (entitytocheck.orgBlockPosX == i && entitytocheck.orgBlockPosY == j && entitytocheck.orgBlockPosZ == k)
				{
					entitytocheck.interact(entityplayer);
					return true;
				}
			}
			float mountingX = i + x;
			float mountingY = j + y;
			float mountingZ = k + z;
			if (north != south)
			{
				int md = world.getBlockMetadata(i, j, k);
				if (md == east)
				{
					mountingX = i + 1 - z;
					mountingZ = k + x;
				}
				else if (md == south)
				{
					mountingX = i + 1 - x;
					mountingZ = k + 1 - z;
				}
				else if (md == west)
				{
					mountingX = i + z;
					mountingZ = k + 1 - x;
				}
			}
			EntityMountableBlock nemb = new EntityMountableBlock(world, entityplayer, i, j, k, mountingX, mountingY, mountingZ);
			world.spawnEntityInWorld(nemb);
			nemb.interact(entityplayer);
		}
		return true;
	}
}
