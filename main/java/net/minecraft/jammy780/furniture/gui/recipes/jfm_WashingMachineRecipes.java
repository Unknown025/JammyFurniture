package net.minecraft.jammy780.furniture.gui.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.Loader;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class jfm_WashingMachineRecipes
{
	private static final jfm_WashingMachineRecipes smeltingBase = new jfm_WashingMachineRecipes();

	private static final int LEATHER = 3000;
	private static final int IRON = 8000;
	private static final int GOLDEN = 9600;
	private static final int CHAIN = 12000;
	private static final int DIAMOND = 14400;

	private Map smeltingList = new HashMap();
	private Map smeltingTimeList = new HashMap();
	private Map metaSmeltingList = new HashMap();

	public static final jfm_WashingMachineRecipes smelting()
	{
		return smeltingBase;
	}

	private jfm_WashingMachineRecipes()
	{
		addSmelting(Items.diamond_boots.getUnlocalizedName(), new ItemStack(Items.diamond_boots), DIAMOND);
		addSmelting(Items.chainmail_boots.getUnlocalizedName(), new ItemStack(Items.chainmail_boots), CHAIN);
		addSmelting(Items.leather_boots.getUnlocalizedName(), new ItemStack(Items.leather_boots), LEATHER);
		addSmelting(Items.iron_boots.getUnlocalizedName(), new ItemStack(Items.iron_boots), IRON);
		addSmelting(Items.golden_boots.getUnlocalizedName(), new ItemStack(Items.golden_boots), GOLDEN);

		addSmelting(Items.diamond_helmet.getUnlocalizedName(), new ItemStack(Items.diamond_helmet), DIAMOND);
		addSmelting(Items.chainmail_helmet.getUnlocalizedName(), new ItemStack(Items.chainmail_helmet), CHAIN);
		addSmelting(Items.leather_helmet.getUnlocalizedName(), new ItemStack(Items.leather_helmet), LEATHER);
		addSmelting(Items.iron_helmet.getUnlocalizedName(), new ItemStack(Items.iron_helmet), IRON);
		addSmelting(Items.golden_helmet.getUnlocalizedName(), new ItemStack(Items.golden_helmet), GOLDEN);

		addSmelting(Items.diamond_chestplate.getUnlocalizedName(), new ItemStack(Items.diamond_chestplate), DIAMOND);
		addSmelting(Items.chainmail_chestplate.getUnlocalizedName(), new ItemStack(Items.chainmail_chestplate), CHAIN);
		addSmelting(Items.leather_chestplate.getUnlocalizedName(), new ItemStack(Items.leather_chestplate), LEATHER);
		addSmelting(Items.iron_chestplate.getUnlocalizedName(), new ItemStack(Items.iron_chestplate), IRON);
		addSmelting(Items.golden_chestplate.getUnlocalizedName(), new ItemStack(Items.golden_chestplate), GOLDEN);

		addSmelting(Items.diamond_leggings.getUnlocalizedName(), new ItemStack(Items.diamond_leggings), DIAMOND);
		addSmelting(Items.chainmail_leggings.getUnlocalizedName(), new ItemStack(Items.chainmail_leggings), CHAIN);
		addSmelting(Items.leather_leggings.getUnlocalizedName(), new ItemStack(Items.leather_leggings), LEATHER);
		addSmelting(Items.iron_leggings.getUnlocalizedName(), new ItemStack(Items.iron_leggings), IRON);
		addSmelting(Items.golden_leggings.getUnlocalizedName(), new ItemStack(Items.golden_leggings), GOLDEN);

		if (Loader.isModLoaded("Aquaculture"))
		{
			addSmelting("Aquaculture:item.NeptuniumHelmet", DIAMOND);
			addSmelting("Aquaculture:item.NeptuniumPlate", DIAMOND);
			addSmelting("Aquaculture:item:NeptuniumLegs", DIAMOND);
			addSmelting("Aquaculture:item:NeptuniumBoots", DIAMOND);
		}

		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			addSmelting("BiomesOPlenty:helmetAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:chestplateAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:leggingsAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:bootsAmethyst", DIAMOND);
		}

		if (Loader.isModLoaded("Oceancraft"))
		{
			addSmelting("Oceancraft:CoralHelmet", DIAMOND);
			addSmelting("Oceancraft:CoralBody", DIAMOND);
			addSmelting("Oceancraft:CoralPants", DIAMOND);
			addSmelting("Oceancraft:CoralBoots", DIAMOND);
		}

		if (Loader.isModLoaded("Thaumcraft"))
		{
			addSmelting("Thaumcraft:ItemHelmetThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemChestplateThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemLeggingsThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemBootsThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemHelmetVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemChestplateVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemLeggingsVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemBootsVoid", DIAMOND);
		}

		if (Loader.isModLoaded("Railcraft"))
		{
			addSmelting("Railcraft:armor.steel.helmet", DIAMOND);
			addSmelting("Railcraft:armor.steel.plate", DIAMOND);
			addSmelting("Railcraft:armor.steel.legs", DIAMOND);
			addSmelting("Railcraft:armor.steel.boots", DIAMOND);
			addSmelting("Railcraft:armor.overalls", DIAMOND);
		}

		if (Loader.isModLoaded("TwilightForest"))
		{
			addSmelting("TwilightForest:item.ironwoodHelm", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodPlate", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodLegs", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodBoots", DIAMOND);
			addSmelting("TwilightForest:item.fieryHelm", DIAMOND);
			addSmelting("TwilightForest:item.fieryPlate", DIAMOND);
			addSmelting("TwilightForest:item.fieryLegs", DIAMOND);
			addSmelting("TwilightForest:item.fieryBoots", DIAMOND);
			addSmelting("TwilightForest:item.steeleafHelm", DIAMOND);
			addSmelting("TwilightForest:item.steeleafPlate", DIAMOND);
			addSmelting("TwilightForest:item.steeleafLegs", DIAMOND);
			addSmelting("TwilightForest:item.steeleafBoots", DIAMOND);
			addSmelting("TwilightForest:item.knightlyHelm", DIAMOND);
			addSmelting("TwilightForest:item.knightlyPlate", DIAMOND);
			addSmelting("TwilightForest:item.knightlyLegs", DIAMOND);
			addSmelting("TwilightForest:item.knightlyBoots", DIAMOND);
			addSmelting("TwilightForest:item.yetiHelm", DIAMOND);
			addSmelting("TwilightForest:item.yetiPlate", DIAMOND);
			addSmelting("TwilightForest:item.yetiLegs", DIAMOND);
			addSmelting("TwilightForest:item.yetiBoots", DIAMOND);
			addSmelting("TwilightForest:item.arcticHelm", DIAMOND);
			addSmelting("TwilightForest:item.arcticPlate", DIAMOND);
			addSmelting("TwilightForest:item.arcticLegs", DIAMOND);
			addSmelting("TwilightForest:item.arcticBoots", DIAMOND);
		}

		if (Loader.isModLoaded("colorfularmor"))
		{
			addSmelting("colorfularmor:RedIronHelmet", IRON);
			addSmelting("colorfularmor:RedIronPlate", IRON);
			addSmelting("colorfularmor:RedIronLeggings", IRON);
			addSmelting("colorfularmor:RedIronBoots", IRON);
			addSmelting("colorfularmor:GreenIronHelmet", IRON);
			addSmelting("colorfularmor:GreenIronPlate", IRON);
			addSmelting("colorfularmor:GreenIronLeggings", IRON);
			addSmelting("colorfularmor:GreenIronBoots", IRON);
			addSmelting("colorfularmor:BlackIronHelmet", IRON);
			addSmelting("colorfularmor:BlackIronPlate", IRON);
			addSmelting("colorfularmor:BlackIronLeggings", IRON);
			addSmelting("colorfularmor:BlackIronBoots", IRON);
			addSmelting("colorfularmor:TurquoiseIronHelmet", IRON);
			addSmelting("colorfularmor:TurquoiseIronPlate", IRON);
			addSmelting("colorfularmor:TurquoiseIronLeggings", IRON);
			addSmelting("colorfularmor:TurquoiseIronBoots", IRON);
			addSmelting("colorfularmor:PinkIronHelmet", IRON);
			addSmelting("colorfularmor:PinkIronPlate", IRON);
			addSmelting("colorfularmor:PinkIronLeggings", IRON);
			addSmelting("colorfularmor:PinkIronBoots", IRON);
			addSmelting("colorfularmor:BlueIronHelmet", IRON);
			addSmelting("colorfularmor:BlueIronPlate", IRON);
			addSmelting("colorfularmor:BlueIronLeggings", IRON);
			addSmelting("colorfularmor:BlueIronBoots", IRON);
			addSmelting("colorfularmor:LightBlueIronHelmet", IRON);
			addSmelting("colorfularmor:LightBlueIronPlate", IRON);
			addSmelting("colorfularmor:LightBlueIronLeggings", IRON);
			addSmelting("colorfularmor:LightBlueIronBoots", IRON);
			addSmelting("colorfularmor:LightGreenIronHelmet", IRON);
			addSmelting("colorfularmor:LightGreenIronPlate", IRON);
			addSmelting("colorfularmor:LightGreenIronLeggings", IRON);
			addSmelting("colorfularmor:LightGreenIronBoots", IRON);
			addSmelting("colorfularmor:YellowIronHelmet", IRON);
			addSmelting("colorfularmor:YellowIronPlate", IRON);
			addSmelting("colorfularmor:YellowIronLeggings", IRON);
			addSmelting("colorfularmor:YellowIronBoots", IRON);
			addSmelting("colorfularmor:PurpleIronHelmet", IRON);
			addSmelting("colorfularmor:PurpleIronPlate", IRON);
			addSmelting("colorfularmor:PurpleIronLeggings", IRON);
			addSmelting("colorfularmor:PurpleIronBoots", IRON);
			addSmelting("colorfularmor:OrangeIronHelmet", IRON);
			addSmelting("colorfularmor:OrangeIronPlate", IRON);
			addSmelting("colorfularmor:OrangeIronLeggings", IRON);
			addSmelting("colorfularmor:OrangeIronBoots", IRON);
			addSmelting("colorfularmor:WhiteIronHelmet", IRON);
			addSmelting("colorfularmor:WhiteIronPlate", IRON);
			addSmelting("colorfularmor:WhiteIronLeggings", IRON);
			addSmelting("colorfularmor:WhiteIronBoots", IRON);
			addSmelting("colorfularmor:BrownIronHelmet", IRON);
			addSmelting("colorfularmor:BrownIronPlate", IRON);
			addSmelting("colorfularmor:BrownIronLeggings", IRON);
			addSmelting("colorfularmor:BrownIronBoots", IRON);
			addSmelting("colorfularmor:MagentaIronHelmet", IRON);
			addSmelting("colorfularmor:MagentaIronPlate", IRON);
			addSmelting("colorfularmor:MagentaIronLeggings", IRON);
			addSmelting("colorfularmor:MagentaIronBoots", IRON);
			addSmelting("colorfularmor:GrayIronHelmet", IRON);
			addSmelting("colorfularmor:GrayIronPlate", IRON);
			addSmelting("colorfularmor:GrayIronLeggings", IRON);
			addSmelting("colorfularmor:GrayIronBoots", IRON);
			addSmelting("colorfularmor:LightGrayIronHelmet", IRON);
			addSmelting("colorfularmor:LightGrayIronPlate", IRON);
			addSmelting("colorfularmor:LightGrayIronLeggings", IRON);
			addSmelting("colorfularmor:LightGrayIronBoots", IRON);
			addSmelting("colorfularmor:RedGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:RedGoldPlate", GOLDEN);
			addSmelting("colorfularmor:RedGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:RedGoldBoots", GOLDEN);
			addSmelting("colorfularmor:GreenGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:GreenGoldPlate", GOLDEN);
			addSmelting("colorfularmor:GreenGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:GreenGoldBoots", GOLDEN);
			addSmelting("colorfularmor:BlackGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:BlackGoldPlate", GOLDEN);
			addSmelting("colorfularmor:BlackGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:BlackGoldBoots", GOLDEN);
			addSmelting("colorfularmor:TurquoiseGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:TurquoiseGoldPlate", GOLDEN);
			addSmelting("colorfularmor:TurquoiseGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:TurquoiseGoldBoots", GOLDEN);
			addSmelting("colorfularmor:PinkGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:PinkGoldPlate", GOLDEN);
			addSmelting("colorfularmor:PinkGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:PinkGoldBoots", GOLDEN);
			addSmelting("colorfularmor:BlueGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:BlueGoldPlate", GOLDEN);
			addSmelting("colorfularmor:BlueGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:BlueGoldBoots", GOLDEN);
			addSmelting("colorfularmor:LightBlueGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:LightBlueGoldPlate", GOLDEN);
			addSmelting("colorfularmor:LightBlueGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:LightBlueGoldBoots", GOLDEN);
			addSmelting("colorfularmor:LightGreenGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:LightGreenGoldPlate", GOLDEN);
			addSmelting("colorfularmor:LightGreenGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:LightGreenGoldBoots", GOLDEN);
			addSmelting("colorfularmor:YellowGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:YellowGoldPlate", GOLDEN);
			addSmelting("colorfularmor:YellowGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:YellowGoldBoots", GOLDEN);
			addSmelting("colorfularmor:PurpleGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:PurpleGoldPlate", GOLDEN);
			addSmelting("colorfularmor:PurpleGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:PurpleGoldBoots", GOLDEN);
			addSmelting("colorfularmor:OrangeGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:OrangeGoldPlate", GOLDEN);
			addSmelting("colorfularmor:OrangeGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:OrangeGoldBoots", GOLDEN);
			addSmelting("colorfularmor:WhiteGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:WhiteGoldPlate", GOLDEN);
			addSmelting("colorfularmor:WhiteGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:WhiteGoldBoots", GOLDEN);
			addSmelting("colorfularmor:BrownGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:BrownGoldPlate", GOLDEN);
			addSmelting("colorfularmor:BrownGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:BrownGoldBoots", GOLDEN);
			addSmelting("colorfularmor:MagentaGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:MagentaGoldPlate", GOLDEN);
			addSmelting("colorfularmor:MagentaGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:MagentaGoldBoots", GOLDEN);
			addSmelting("colorfularmor:GrayGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:GrayGoldPlate", GOLDEN);
			addSmelting("colorfularmor:GrayGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:GrayGoldBoots", GOLDEN);
			addSmelting("colorfularmor:LightGrayGoldHelmet", GOLDEN);
			addSmelting("colorfularmor:LightGrayGoldPlate", GOLDEN);
			addSmelting("colorfularmor:LightGrayGoldLeggings", GOLDEN);
			addSmelting("colorfularmor:LightGrayGoldBoots", GOLDEN);
			addSmelting("colorfularmor:RedDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:RedDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:RedDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:RedDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:GreenDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:GreenDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:GreenDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:GreenDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:BlackDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:BlackDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:BlackDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:BlackDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:TurquoiseDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:TurquoiseDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:TurquoiseDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:TurquoiseDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:PinkDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:PinkDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:PinkDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:PinkDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:BlueDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:BlueDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:BlueDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:BlueDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:LightBlueDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:LightBlueDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:LightBlueDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:LightBlueDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:LightGreenDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:LightGreenDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:LightGreenDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:LightGreenDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:YellowDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:YellowDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:YellowDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:YellowDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:PurpleDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:PurpleDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:PurpleDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:PurpleDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:OrangeDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:OrangeDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:OrangeDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:OrangeDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:WhiteDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:WhiteDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:WhiteDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:WhiteDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:BrownDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:BrownDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:BrownDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:BrownDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:MagentaDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:MagentaDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:MagentaDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:MagentaDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:GrayDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:GrayDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:GrayDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:GrayDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:LightGrayDiamondHelmet", DIAMOND);
			addSmelting("colorfularmor:LightGrayDiamondPlate", DIAMOND);
			addSmelting("colorfularmor:LightGrayDiamondLeggings", DIAMOND);
			addSmelting("colorfularmor:LightGrayDiamondBoots", DIAMOND);
			addSmelting("colorfularmor:RedChainHelmet", CHAIN);
			addSmelting("colorfularmor:RedChainPlate", CHAIN);
			addSmelting("colorfularmor:RedChainLeggings", CHAIN);
			addSmelting("colorfularmor:RedChainBoots", CHAIN);
			addSmelting("colorfularmor:GreenChainHelmet", CHAIN);
			addSmelting("colorfularmor:GreenChainPlate", CHAIN);
			addSmelting("colorfularmor:GreenChainLeggings", CHAIN);
			addSmelting("colorfularmor:GreenChainBoots", CHAIN);
			addSmelting("colorfularmor:BlackChainHelmet", CHAIN);
			addSmelting("colorfularmor:BlackChainPlate", CHAIN);
			addSmelting("colorfularmor:BlackChainLeggings", CHAIN);
			addSmelting("colorfularmor:BlackChainBoots", CHAIN);
			addSmelting("colorfularmor:TurquoiseChainHelmet", CHAIN);
			addSmelting("colorfularmor:TurquoiseChainPlate", CHAIN);
			addSmelting("colorfularmor:TurquoiseChainLeggings", CHAIN);
			addSmelting("colorfularmor:TurquoiseChainBoots", CHAIN);
			addSmelting("colorfularmor:PinkChainHelmet", CHAIN);
			addSmelting("colorfularmor:PinkChainPlate", CHAIN);
			addSmelting("colorfularmor:PinkChainLeggings", CHAIN);
			addSmelting("colorfularmor:PinkChainBoots", CHAIN);
			addSmelting("colorfularmor:BlueChainHelmet", CHAIN);
			addSmelting("colorfularmor:BlueChainPlate", CHAIN);
			addSmelting("colorfularmor:BlueChainLeggings", CHAIN);
			addSmelting("colorfularmor:BlueChainBoots", CHAIN);
			addSmelting("colorfularmor:LightBlueChainHelmet", CHAIN);
			addSmelting("colorfularmor:LightBlueChainPlate", CHAIN);
			addSmelting("colorfularmor:LightBlueChainLeggings", CHAIN);
			addSmelting("colorfularmor:LightBlueChainBoots", CHAIN);
			addSmelting("colorfularmor:LightGreenChainHelmet", CHAIN);
			addSmelting("colorfularmor:LightGreenChainPlate", CHAIN);
			addSmelting("colorfularmor:LightGreenChainLeggings", CHAIN);
			addSmelting("colorfularmor:LightGreenChainBoots", CHAIN);
			addSmelting("colorfularmor:YellowChainHelmet", CHAIN);
			addSmelting("colorfularmor:YellowChainPlate", CHAIN);
			addSmelting("colorfularmor:YellowChainLeggings", CHAIN);
			addSmelting("colorfularmor:YellowChainBoots", CHAIN);
			addSmelting("colorfularmor:PurpleChainHelmet", CHAIN);
			addSmelting("colorfularmor:PurpleChainPlate", CHAIN);
			addSmelting("colorfularmor:PurpleChainLeggings", CHAIN);
			addSmelting("colorfularmor:PurpleChainBoots", CHAIN);
			addSmelting("colorfularmor:OrangeChainHelmet", CHAIN);
			addSmelting("colorfularmor:OrangeChainPlate", CHAIN);
			addSmelting("colorfularmor:OrangeChainLeggings", CHAIN);
			addSmelting("colorfularmor:OrangeChainBoots", CHAIN);
			addSmelting("colorfularmor:WhiteChainHelmet", CHAIN);
			addSmelting("colorfularmor:WhiteChainPlate", CHAIN);
			addSmelting("colorfularmor:WhiteChainLeggings", CHAIN);
			addSmelting("colorfularmor:WhiteChainBoots", CHAIN);
			addSmelting("colorfularmor:BrownChainHelmet", CHAIN);
			addSmelting("colorfularmor:BrownChainPlate", CHAIN);
			addSmelting("colorfularmor:BrownChainLeggings", CHAIN);
			addSmelting("colorfularmor:BrownChainBoots", CHAIN);
			addSmelting("colorfularmor:MagentaChainHelmet", CHAIN);
			addSmelting("colorfularmor:MagentaChainPlate", CHAIN);
			addSmelting("colorfularmor:MagentaChainLeggings", CHAIN);
			addSmelting("colorfularmor:MagentaChainBoots", CHAIN);
			addSmelting("colorfularmor:GrayChainHelmet", CHAIN);
			addSmelting("colorfularmor:GrayChainPlate", CHAIN);
			addSmelting("colorfularmor:GrayChainLeggings", CHAIN);
			addSmelting("colorfularmor:GrayChainBoots", CHAIN);
			addSmelting("colorfularmor:LightGrayChainHelmet", CHAIN);
			addSmelting("colorfularmor:LightGrayChainPlate", CHAIN);
			addSmelting("colorfularmor:LightGrayChainLeggings", CHAIN);
			addSmelting("colorfularmor:LightGrayChainBoots", CHAIN);

			if (Loader.isModLoaded("Paintball"))
			{
				addSmelting("Paintball:Shoes (C)", DIAMOND);
				addSmelting("Paintball:Helmet (C)", DIAMOND);
				addSmelting("Paintball:Pants (C)", DIAMOND);
				addSmelting("Paintball:Chest (C)", DIAMOND);
			}

			if (Loader.isModLoaded("ProjectZulu|Core"))
			{
				addSmelting("ProjectZulu|Core:ScaleHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:ScaleChest", DIAMOND);
				addSmelting("ProjectZulu|Core:ScaleLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:ScaleBoots", DIAMOND);
				addSmelting("ProjectZulu|Core:GoldScaleHelmet", GOLDEN);
				addSmelting("ProjectZulu|Core:GoldScaleChest", GOLDEN);
				addSmelting("ProjectZulu|Core:GoldScaleLegs", GOLDEN);
				addSmelting("ProjectZulu|Core:GoldScaleBoots", GOLDEN);
				addSmelting("ProjectZulu|Core:IronScaleHelmet", IRON);
				addSmelting("ProjectZulu|Core:IronScaleChest", IRON);
				addSmelting("ProjectZulu|Core:IronScaleLegs", IRON);
				addSmelting("ProjectZulu|Core:IronScaleBoots", IRON);
				addSmelting("ProjectZulu|Core:DiamondScaleHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:DiamondScaleChest", DIAMOND);
				addSmelting("ProjectZulu|Core:DiamondScaleBoots", DIAMOND);
				addSmelting("ProjectZulu|Core:DiamondScaleLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:RedClothHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:RedClothChest", DIAMOND);
				addSmelting("ProjectZulu|Core:RedClothLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:RedClothBoots", DIAMOND);
				addSmelting("ProjectZulu|Core:GreenClothHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:GreenClothChest", DIAMOND);
				addSmelting("ProjectZulu|Core:GreenClothLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:GreenClothBoots", DIAMOND);
				addSmelting("ProjectZulu|Core:BlueClothHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:BlueClothChest", DIAMOND);
				addSmelting("ProjectZulu|Core:BlueClothLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:BlueClothBoots", DIAMOND);
				addSmelting("ProjectZulu|Core:CactusHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:CactusChest", DIAMOND);
				addSmelting("ProjectZulu|Core:CactusLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:CactusBoots", DIAMOND);
				addSmelting("ProjectZulu|Core:FurHelmet", DIAMOND);
				addSmelting("ProjectZulu|Core:FurChest", DIAMOND);
				addSmelting("ProjectZulu|Core:FurLegs", DIAMOND);
				addSmelting("ProjectZulu|Core:FurBoots", DIAMOND);
			}
		}		
	}

	private void addSmelting(String name, int time)
	{
		Object obj = Item.itemRegistry.getObject(name);
		if (obj instanceof Item)
		{
			Item item = (Item)obj;
			addSmelting(item.getUnlocalizedName(), new ItemStack(item), time);
		}
	}

	public void addSmelting(String name, ItemStack par2ItemStack, int time)
	{
		this.smeltingList.put(name, par2ItemStack);
		this.smeltingTimeList.put(name, Integer.valueOf(time));
	}
	/*
	public Map getSmeltingList()
	{
		return this.smeltingList;
	}*/

	public void addSmelting(String name, int metadata, ItemStack itemstack)
	{
		this.metaSmeltingList.put(Arrays.asList(new String[] { name, String.valueOf(metadata) }), itemstack);
	}

	public ItemStack getSmeltingResult(ItemStack item)
	{
		if (item == null)
		{
			return null;
		}
		ItemStack ret = (ItemStack)this.metaSmeltingList.get(Arrays.asList(new String[] { item.getItem().getUnlocalizedName(), String.valueOf(item.getItemDamage()) }));
		if (ret != null)
		{
			return ret;
		}
		return (ItemStack)this.smeltingList.get(item.getItem().getUnlocalizedName());
	}

	public int getSmeltingTime(ItemStack item)
	{
		if (item == null)
		{
			return 1;
		}
		Integer time = (Integer)this.smeltingTimeList.get(item.getItem().getUnlocalizedName());
		if (time == null)
		{
			return 1;
		}
		return (int)time;
	}
}
