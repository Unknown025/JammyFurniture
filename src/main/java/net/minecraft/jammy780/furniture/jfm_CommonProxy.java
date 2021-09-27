package net.minecraft.jammy780.furniture;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.jammy780.furniture.tiles.*;

public class jfm_CommonProxy
{
	public void initRendering() {}

	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(jfm_TileEntityWoodBlocks.class, "TileEntityWoodBlocks");
		GameRegistry.registerTileEntity(jfm_TileEntityWoodBlocksTwo.class, "TileEntityWoodBlocksTwo");
		GameRegistry.registerTileEntity(jfm_TileEntityWoodBlocksThree.class, "TileEntityWoodBlocksThree");
		GameRegistry.registerTileEntity(jfm_TileEntityBath.class, "TileEntityBath");
		GameRegistry.registerTileEntity(jfm_TileEntityIronBlocksOne.class, "TileEntityIronBlocksOne");
		GameRegistry.registerTileEntity(jfm_TileEntityIronBlocksTwo.class, "TileEntityIronBlocksTwo");
		GameRegistry.registerTileEntity(jfm_TileEntityCeramicBlocksOne.class, "TileEntityCeramicBlocksOne");
		GameRegistry.registerTileEntity(jfm_TileEntityRoofingBlocksOne.class, "TileEntityRoofingBlocksOne");
		GameRegistry.registerTileEntity(jfm_TileEntityMobHeadsOne.class, "TileEntityMobHeadsOne");
		GameRegistry.registerTileEntity(jfm_TileEntityMobHeadsTwo.class, "TileEntityMobHeadsTwo");
		GameRegistry.registerTileEntity(jfm_TileEntityMobHeadsThree.class, "TileEntityMobHeadsThree");
		GameRegistry.registerTileEntity(jfm_TileEntityMobHeadsFour.class, "TileEntityMobHeadsFour");
		GameRegistry.registerTileEntity(jfm_TileEntityArmChair.class, "TileEntityArmChair");
		GameRegistry.registerTileEntity(jfm_TileEntitySofaLeft.class, "TileEntitySofaLeft");
		GameRegistry.registerTileEntity(jfm_TileEntitySofaRight.class, "TileEntitySofaRight");
		GameRegistry.registerTileEntity(jfm_TileEntitySofaCenter.class, "TileEntitySofaCenter");
		GameRegistry.registerTileEntity(jfm_TileEntitySofaCorner.class, "TileEntitySofaCorner");
		GameRegistry.registerTileEntity(jfm_TileEntityMiscOne.class, "TileEntityMiscOne");
		GameRegistry.registerTileEntity(jfm_TileEntityLightsOn.class, "TileEntityLightsOn");
	}
}
