package net.minecraft.jammy780.furniture.util;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.World;

public class EntityMountableBlock extends Entity
{
	protected int orgBlockPosX;
	protected int orgBlockPosY;
	protected int orgBlockPosZ;
	protected Block orgBlock;

	public EntityMountableBlock(World world)
	{
		super(world);
		this.noClip = true;
		this.preventEntitySpawning = true;
		this.width = 0.0F;
		this.height = 0.0F;
	}

	public EntityMountableBlock(World world, double d, double d1, double d2)
	{
		super(world);
		this.noClip = true;
		this.preventEntitySpawning = true;
		this.width = 0.0F;
		this.height = 0.0F;
		setPosition(d, d1, d2);
	}

	public EntityMountableBlock(World world, EntityPlayer entityplayer, int i, int j, int k, float mountingX, float mountingY, float mountingZ)
	{
		super(world);
		this.noClip = true;
		this.preventEntitySpawning = true;
		this.width = 0.0F;
		this.height = 0.0F;

		this.orgBlockPosX = i;
		this.orgBlockPosY = j;
		this.orgBlockPosZ = k;
		this.orgBlock = world.getBlock(i, j, k);

		setPosition(mountingX, mountingY, mountingZ);
	}

	public boolean interact(EntityPlayer entityplayer)
	{
		if ((this.riddenByEntity != null) && ((this.riddenByEntity instanceof EntityPlayer)) && (this.riddenByEntity != entityplayer)) {
			return true;
		}
		if (!this.worldObj.isRemote)
		{
			entityplayer.mountEntity(this);
		}
		return true;
	}

	@Override
	public void onEntityUpdate()
	{
		this.worldObj.theProfiler.startSection("entityBaseTick");
		if (this.riddenByEntity == null || this.riddenByEntity.isDead)
		{
			setDead();
		}
		else if (this.worldObj.getBlock(this.orgBlockPosX, this.orgBlockPosY, this.orgBlockPosZ) != this.orgBlock)
		{
			interact((EntityPlayer)this.riddenByEntity);
		}
		this.ticksExisted += 1;
		this.worldObj.theProfiler.endSection();
	}

	@Override
	public void entityInit() {}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound) {}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound) {}
}
