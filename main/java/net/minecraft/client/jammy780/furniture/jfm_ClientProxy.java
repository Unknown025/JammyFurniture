package net.minecraft.client.jammy780.furniture;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;
import net.minecraft.jammy780.furniture.jfm_CommonProxy;
import net.minecraft.jammy780.furniture.render.*;
import net.minecraft.jammy780.furniture.tiles.*;

public class jfm_ClientProxy extends jfm_CommonProxy
{
	@Override
	public void initRendering()
	{
		JammyFurnitureModCore.woodBlocksOneRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_WoodBlocksRendererOne woodOne = new jfm_WoodBlocksRendererOne();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.woodBlocksOneRenderID, woodOne);

		JammyFurnitureModCore.woodBlocksTwoRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_WoodBlocksRendererTwo woodTwo = new jfm_WoodBlocksRendererTwo();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.woodBlocksTwoRenderID, woodTwo);

		JammyFurnitureModCore.woodBlocksThreeRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_WoodBlocksRendererThree woodThree = new jfm_WoodBlocksRendererThree();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.woodBlocksThreeRenderID, woodThree);

		JammyFurnitureModCore.bathTubRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_BathRenderer bath = new jfm_BathRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.bathTubRenderID, bath);

		JammyFurnitureModCore.ironBlocksOneRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_IronBlocksRendererOne ironOne = new jfm_IronBlocksRendererOne();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.ironBlocksOneRenderID, ironOne);

		JammyFurnitureModCore.ironBlocksTwoRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_IronBlocksRendererTwo ironTwo = new jfm_IronBlocksRendererTwo();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.ironBlocksTwoRenderID, ironTwo);

		JammyFurnitureModCore.ceramicBlocksOneRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_CeramicBlocksRendererOne ceramic = new jfm_CeramicBlocksRendererOne();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.ceramicBlocksOneRenderID, ceramic);

		JammyFurnitureModCore.roofingBlocksOneRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_RoofingBlocksRendererOne roof = new jfm_RoofingBlocksRendererOne();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.roofingBlocksOneRenderID, roof);

		JammyFurnitureModCore.mobHeadsOneRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_MobHeadsOneRenderer headOne = new jfm_MobHeadsOneRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.mobHeadsOneRenderID, headOne);

		JammyFurnitureModCore.mobHeadsTwoRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_MobHeadsTwoRenderer headTwo = new jfm_MobHeadsTwoRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.mobHeadsTwoRenderID, headTwo);

		JammyFurnitureModCore.mobHeadsThreeRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_MobHeadsThreeRenderer headThree = new jfm_MobHeadsThreeRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.mobHeadsThreeRenderID, headThree);

		JammyFurnitureModCore.mobHeadsFourRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_MobHeadsFourRenderer headFour = new jfm_MobHeadsFourRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.mobHeadsFourRenderID, headFour);

		JammyFurnitureModCore.armChairRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_ArmChairRenderer armChair = new jfm_ArmChairRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.armChairRenderID, armChair);

		JammyFurnitureModCore.sofaPartLeftRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_SofaLeftRenderer sofaLeft = new jfm_SofaLeftRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.sofaPartLeftRenderID, sofaLeft);

		JammyFurnitureModCore.sofaPartRightRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_SofaRightRenderer sofaRight = new jfm_SofaRightRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.sofaPartRightRenderID, sofaRight);

		JammyFurnitureModCore.sofaPartCenterRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_SofaCenterRenderer sofaCenter = new jfm_SofaCenterRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.sofaPartCenterRenderID, sofaCenter);

		JammyFurnitureModCore.sofaPartCornerRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_SofaCornerRenderer sofaCorner = new jfm_SofaCornerRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.sofaPartCornerRenderID, sofaCorner);

		JammyFurnitureModCore.miscBlocksOneRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_MiscOneRenderer miscOne = new jfm_MiscOneRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.miscBlocksOneRenderID, miscOne);

		JammyFurnitureModCore.lightsRenderID = RenderingRegistry.getNextAvailableRenderId();
		jfm_LightsRenderer light = new jfm_LightsRenderer();
		RenderingRegistry.registerBlockHandler(JammyFurnitureModCore.lightsRenderID, light);

		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityWoodBlocks.class, woodOne);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityWoodBlocksTwo.class, woodTwo);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityWoodBlocksThree.class, woodThree);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityBath.class, bath);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityIronBlocksOne.class, ironOne);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityIronBlocksTwo.class, ironTwo);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityCeramicBlocksOne.class, ceramic);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityRoofingBlocksOne.class, roof);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityMobHeadsOne.class, headOne);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityMobHeadsTwo.class, headTwo);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityMobHeadsThree.class, headThree);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityMobHeadsFour.class, headFour);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityArmChair.class, armChair);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntitySofaLeft.class, sofaLeft);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntitySofaRight.class, sofaRight);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntitySofaCenter.class, sofaCenter);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntitySofaCorner.class, sofaCorner);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityMiscOne.class, miscOne);
		ClientRegistry.bindTileEntitySpecialRenderer(jfm_TileEntityLightsOn.class, light);
	}
}
