package net.minecraft.jammy780.furniture;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.jammy780.furniture.blocks.jfm_BathBlock;
import net.minecraft.jammy780.furniture.blocks.jfm_BlockLightsOn;
import net.minecraft.jammy780.furniture.blocks.jfm_BlockMiscOne;
import net.minecraft.jammy780.furniture.blocks.ceramic.jfm_CeramicBlocksOne;
import net.minecraft.jammy780.furniture.blocks.heads.jfm_MobHeadsFour;
import net.minecraft.jammy780.furniture.blocks.heads.jfm_MobHeadsOne;
import net.minecraft.jammy780.furniture.blocks.heads.jfm_MobHeadsThree;
import net.minecraft.jammy780.furniture.blocks.heads.jfm_MobHeadsTwo;
import net.minecraft.jammy780.furniture.blocks.iron.jfm_IronBlocksOne;
import net.minecraft.jammy780.furniture.blocks.iron.jfm_IronBlocksTwo;
import net.minecraft.jammy780.furniture.blocks.roofing.jfm_RoofingBlocksOne;
import net.minecraft.jammy780.furniture.blocks.sofa.jfm_BlockArmChair;
import net.minecraft.jammy780.furniture.blocks.sofa.jfm_BlockSofaCenter;
import net.minecraft.jammy780.furniture.blocks.sofa.jfm_BlockSofaCorner;
import net.minecraft.jammy780.furniture.blocks.sofa.jfm_BlockSofaLeft;
import net.minecraft.jammy780.furniture.blocks.sofa.jfm_BlockSofaRight;
import net.minecraft.jammy780.furniture.blocks.wood.jfm_WoodBlocksOne;
import net.minecraft.jammy780.furniture.blocks.wood.jfm_WoodBlocksThree;
import net.minecraft.jammy780.furniture.blocks.wood.jfm_WoodBlocksTwo;
import net.minecraft.jammy780.furniture.item.jfm_Items;
import net.minecraft.jammy780.furniture.recipes.jfm_Recipes;
import net.minecraft.jammy780.furniture.tiles.*;
import net.minecraft.jammy780.furniture.util.EntityMountableBlock;
import net.minecraft.jammy780.furniture.util.jfm_ConfigDefault;
import net.minecraft.jammy780.furniture.util.jfm_GuiHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid="jammyfurniture", name="Jammy Furniture Mod", version="4.6")
public class JammyFurnitureModCore
{
	@Mod.Instance("jammyfurniture")
	public static JammyFurnitureModCore instance;
	@SidedProxy(clientSide="net.minecraft.client.jammy780.furniture.jfm_ClientProxy", serverSide="net.minecraft.jammy780.furniture.jfm_CommonProxy")
	public static jfm_CommonProxy proxy;
	public static jfm_ConfigDefault defaultConfig;
	public static CreativeTabs jfmCustomTab = new jfm_CreativeTabs("jfmCustomTab");
	public static Block woodBlocksOne;
	public static Block woodBlocksTwo;
	public static Block woodBlocksThree;
	public static Block bathTub;
	public static Block ironBlocksOne;
	public static Block ironBlocksTwo;
	public static Block ceramicBlocksOne;
	public static Block roofingBlocksOne;
	public static Block mobHeadsOne;
	public static Block mobHeadsTwo;
	public static Block mobHeadsThree;
	public static Block mobHeadsFour;
	public static Block armChair;
	public static Block sofaPartLeft;
	public static Block sofaPartRight;
	public static Block sofaPartCenter;
	public static Block sofaPartCorner;
	public static Block miscBlocksOne;
	public static Block lightsOn;
	public static Block lightsOff;
	public static Item itemLightBulb;
	public static Item itemMantlePieceUnf;
	public static Item itemCeramicPanelUnf;
	public static Item itemCeramicPanel;
	public static Item itemWMDrum;
	public static Item itemBlindPart;
	public static int woodBlocksOneRenderID;
	public static int woodBlocksTwoRenderID;
	public static int woodBlocksThreeRenderID;
	public static int bathTubRenderID;
	public static int ironBlocksOneRenderID;
	public static int ironBlocksTwoRenderID;
	public static int ceramicBlocksOneRenderID;
	public static int roofingBlocksOneRenderID;
	public static int mobHeadsOneRenderID;
	public static int mobHeadsTwoRenderID;
	public static int mobHeadsThreeRenderID;
	public static int mobHeadsFourRenderID;
	public static int armChairRenderID;
	public static int sofaPartLeftRenderID;
	public static int sofaPartRightRenderID;
	public static int sofaPartCenterRenderID;
	public static int sofaPartCornerRenderID;
	public static int miscBlocksOneRenderID;
	public static int lightsRenderID;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		itemLightBulb = new jfm_Items("itemLightBulb");
		itemMantlePieceUnf = new jfm_Items("mantlePieceUnf");
		itemCeramicPanelUnf = new jfm_Items("ceramicPanelUnf");
		itemCeramicPanel = new jfm_Items("itemCeramicPanel");
		itemWMDrum = new jfm_Items("itemWMDrum");
		itemBlindPart = new jfm_Items("itemBlindPart");

		woodBlocksOne = new jfm_WoodBlocksOne("woodBlocks", 0, jfm_TileEntityWoodBlocks.class).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundTypeWood);
		woodBlocksTwo = new jfm_WoodBlocksTwo("woodBlocksTwo", 0, jfm_TileEntityWoodBlocksTwo.class).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundTypeWood);
		woodBlocksThree = new jfm_WoodBlocksThree("woodBlocksThree", 0, jfm_TileEntityWoodBlocksThree.class).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundTypeWood);
		bathTub = new jfm_BathBlock("bathBlock", 0, jfm_TileEntityBath.class).setHardness(3.0F).setResistance(1.0F);
		ironBlocksOne = new jfm_IronBlocksOne("ironBlockOne", 0, jfm_TileEntityIronBlocksOne.class).setHardness(3.0F).setResistance(1.0F);
		ironBlocksTwo = new jfm_IronBlocksTwo("ironBlocksTwo", 0, jfm_TileEntityIronBlocksTwo.class).setHardness(3.0F).setResistance(1.0F);
		ceramicBlocksOne = new jfm_CeramicBlocksOne("ceramicBlockOne", 0, jfm_TileEntityCeramicBlocksOne.class).setHardness(3.0F).setResistance(1.0F);
		roofingBlocksOne = new jfm_RoofingBlocksOne("roofingBlocksOne", 0, jfm_TileEntityRoofingBlocksOne.class).setHardness(1.2F);
		mobHeadsOne = new jfm_MobHeadsOne("MobHeadsOne", 0, jfm_TileEntityMobHeadsOne.class).setHardness(0.8F);
		mobHeadsTwo = new jfm_MobHeadsTwo("MobHeadsTwo", 0, jfm_TileEntityMobHeadsTwo.class).setHardness(0.8F);
		mobHeadsThree = new jfm_MobHeadsThree("MobHeadsThree", 0, jfm_TileEntityMobHeadsThree.class).setHardness(0.8F);
		mobHeadsFour = new jfm_MobHeadsFour("MobHeadsFour", 0, jfm_TileEntityMobHeadsFour.class).setHardness(0.8F);
		armChair = new jfm_BlockArmChair("armChair", 0, jfm_TileEntityArmChair.class).setHardness(1.2F);
		sofaPartLeft = new jfm_BlockSofaLeft("sofaLeft", 0, jfm_TileEntitySofaLeft.class).setHardness(1.2F);
		sofaPartRight = new jfm_BlockSofaRight("sofaRight", 0, jfm_TileEntitySofaRight.class).setHardness(1.2F);
		sofaPartCenter = new jfm_BlockSofaCenter("sofaCenter", 0, jfm_TileEntitySofaCenter.class).setHardness(1.2F);
		sofaPartCorner = new jfm_BlockSofaCorner("sofaCorner", 0, jfm_TileEntitySofaCorner.class).setHardness(1.2F);
		miscBlocksOne = new jfm_BlockMiscOne("miscOne", 0, jfm_TileEntityMiscOne.class).setHardness(2.0F);
		lightsOn = new jfm_BlockLightsOn("lightsOn", 0, jfm_TileEntityLightsOn.class, true).setHardness(0.3F);
		//lightsOff = new jfm_BlockLightsOn("lightsOff", 0, jfm_TileEntityLightsOn.class, false).setHardness(0.3F);
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerTileEntities();
		proxy.initRendering();
		EntityRegistry.registerModEntity(EntityMountableBlock.class, "EntityMountableBlock", 1, this, 400, 5, false);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new jfm_GuiHandler());
		jfm_Recipes.initRecipes();
	}
}
