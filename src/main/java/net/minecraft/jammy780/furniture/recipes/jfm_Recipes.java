package net.minecraft.jammy780.furniture.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;

public class jfm_Recipes extends JammyFurnitureModCore
{
	public static void initRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(woodBlocksOne, 1, 0), new Object[] { " W ", "WWW", "WWW", Character.valueOf('W'), Blocks.planks });
		GameRegistry.addRecipe(new ItemStack(woodBlocksOne, 1, 4), new Object[] { " WW", "IWW", " WW", Character.valueOf('W'), Blocks.planks, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(woodBlocksOne, 1, 5), new Object[] { " W ", "WCW", "WWW", Character.valueOf('W'), Blocks.planks, Character.valueOf('C'), Items.clock });
		GameRegistry.addRecipe(new ItemStack(woodBlocksOne, 1, 9), new Object[] { "BBB", "BBB", Character.valueOf('B'), itemBlindPart });
		GameRegistry.addShapelessRecipe(new ItemStack(woodBlocksOne, 2, 13), new Object[] { Blocks.crafting_table });
		GameRegistry.addShapelessRecipe(new ItemStack(woodBlocksOne, 2, 14), new Object[] { Blocks.wooden_slab });
		GameRegistry.addRecipe(new ItemStack(woodBlocksOne, 1, 15), new Object[] { "PPP", "S S", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick });

		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 0), new Object[] { "PPP", "I P", "PPP", Character.valueOf('P'), Blocks.planks, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 4), new Object[] { "SSS", "I P", "PPP", Character.valueOf('S'), new ItemStack(woodBlocksOne, 1, 14), Character.valueOf('I'), Items.iron_ingot, Character.valueOf('P'), Blocks.planks });
		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 8), new Object[] { "WIW", "WGW", "WWB", Character.valueOf('W'), Blocks.log, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('G'), Blocks.glass, Character.valueOf('B'), Blocks.stone_button });
		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 12), new Object[] { "PWP", "PPP", Character.valueOf('P'), Blocks.planks, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 13), new Object[] { "PWP", "PPP", Character.valueOf('P'), Blocks.planks, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 14), new Object[] { "PWP", "PPP", Character.valueOf('P'), Blocks.planks, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(woodBlocksTwo, 1, 15), new Object[] { "PWP", "PPP", Character.valueOf('P'), Blocks.planks, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(woodBlocksThree, 1, 0), new Object[] { "P  ", "PP ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(woodBlocksThree, 1, 4), new Object[] { "I  ", "PPB", "PPP", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('P'), Blocks.planks, Character.valueOf('B'), Blocks.stone_button });

		GameRegistry.addRecipe(new ItemStack(bathTub, 1, 0), new Object[] { "I I", "III", Character.valueOf('I'), Blocks.iron_block });

		GameRegistry.addRecipe(new ItemStack(ironBlocksOne, 1, 0), new Object[] { "III", "ISI", "III", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('S'), itemLightBulb });
		GameRegistry.addRecipe(new ItemStack(ironBlocksOne, 1, 4), new Object[] { "III", "ISI", "III", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('S'), Blocks.snow });
		GameRegistry.addRecipe(new ItemStack(ironBlocksOne, 1, 8), new Object[] { "I I", "IFI", "III", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('F'), Blocks.furnace });
		GameRegistry.addRecipe(new ItemStack(ironBlocksOne, 1, 12), new Object[] { " I ", "IBI", "III", Character.valueOf('B'), Items.lava_bucket, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(ironBlocksOne, 1, 13), new Object[] { "IGI", "I I", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('I'), Items.iron_ingot });

		GameRegistry.addRecipe(new ItemStack(ironBlocksTwo, 1, 0), new Object[] { "BBI", "I I", "III", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('B'), Blocks.stone_button });
		GameRegistry.addRecipe(new ItemStack(ironBlocksTwo, 1, 4), new Object[] { "BBB", "IDI", "III", Character.valueOf('B'), Blocks.stone_button, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('D'), itemWMDrum });

		GameRegistry.addRecipe(new ItemStack(ceramicBlocksOne, 1, 0), new Object[] { "CCC", "I C", "CCC", Character.valueOf('C'), itemCeramicPanel, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(ceramicBlocksOne, 1, 4), new Object[] { "CIC", " C ", " C ", Character.valueOf('C'), itemCeramicPanel, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(ceramicBlocksOne, 1, 8), new Object[] { " I ", "C C", "CCC", Character.valueOf('C'), itemCeramicPanel, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(ceramicBlocksOne, 1, 12), new Object[] { "CI ", "C C", "CCC", Character.valueOf('C'), itemCeramicPanel, Character.valueOf('I'), Items.iron_ingot });

		GameRegistry.addRecipe(new ItemStack(roofingBlocksOne, 6, 0), new Object[] { "  B", " BB", "BBB", Character.valueOf('B'), new ItemStack(roofingBlocksOne, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(roofingBlocksOne, 6, 4), new Object[] { " B ", " B ", "BBB", Character.valueOf('B'), new ItemStack(roofingBlocksOne, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(roofingBlocksOne, 6, 8), new Object[] { "B B", "BBB", "BBB", Character.valueOf('B'), new ItemStack(roofingBlocksOne, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(roofingBlocksOne, 6, 12), new Object[] { "S", "I", Character.valueOf('S'), Blocks.stone, Character.valueOf('I'), new ItemStack(Items.dye, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(mobHeadsOne, 1, 0), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 0), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.egg });
		GameRegistry.addRecipe(new ItemStack(mobHeadsOne, 1, 4), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 12), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.leather });
		GameRegistry.addRecipe(new ItemStack(mobHeadsOne, 1, 8), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.gunpowder });
		GameRegistry.addRecipe(new ItemStack(mobHeadsOne, 1, 12), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 15), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.ender_eye });

		GameRegistry.addRecipe(new ItemStack(mobHeadsTwo, 1, 0), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 6), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.porkchop });
		GameRegistry.addRecipe(new ItemStack(mobHeadsTwo, 1, 4), new Object[] { "WWW", "WWW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 0), Character.valueOf('R'), Items.redstone });
		GameRegistry.addRecipe(new ItemStack(mobHeadsTwo, 1, 8), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 8), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.bone });
		GameRegistry.addRecipe(new ItemStack(mobHeadsTwo, 1, 12), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 15), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.spider_eye });

		GameRegistry.addRecipe(new ItemStack(mobHeadsThree, 1, 0), new Object[] { "WWW", "ASA", "ARA", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 12), Character.valueOf('A'), new ItemStack(Blocks.wool, 1, 6), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.wooden_pickaxe });
		GameRegistry.addRecipe(new ItemStack(mobHeadsThree, 1, 4), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 0), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.bone });
		GameRegistry.addRecipe(new ItemStack(mobHeadsThree, 1, 8), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 13), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.rotten_flesh });
		GameRegistry.addRecipe(new ItemStack(mobHeadsThree, 1, 12), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 15), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), new ItemStack(Items.dye, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(mobHeadsFour, 1, 0), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 15), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.ender_pearl });
		GameRegistry.addRecipe(new ItemStack(mobHeadsFour, 1, 4), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.slime_ball });
		GameRegistry.addRecipe(new ItemStack(mobHeadsFour, 1, 8), new Object[] { "WWW", "WSW", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 1), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.blaze_rod });
		GameRegistry.addRecipe(new ItemStack(mobHeadsFour, 1, 12), new Object[] { "WAA", "WSA", "WRW", Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 6), Character.valueOf('A'), new ItemStack(Blocks.wool, 1, 13), Character.valueOf('R'), Items.redstone, Character.valueOf('S'), Items.ender_eye });

		GameRegistry.addRecipe(new ItemStack(armChair, 1, 0), new Object[] { "P P", "PWP", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(armChair, 1, 4), new Object[] { "P P", "PWP", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(armChair, 1, 8), new Object[] { "P P", "PWP", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(armChair, 1, 12), new Object[] { "P P", "PWP", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(sofaPartLeft, 1, 0), new Object[] { "P  ", "PW ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(sofaPartLeft, 1, 4), new Object[] { "P  ", "PW ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(sofaPartLeft, 1, 8), new Object[] { "P  ", "PW ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(sofaPartLeft, 1, 12), new Object[] { "P  ", "PW ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(sofaPartRight, 1, 0), new Object[] { " P ", "WP ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(sofaPartRight, 1, 4), new Object[] { " P ", "WP ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(sofaPartRight, 1, 8), new Object[] { " P ", "WP ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(sofaPartRight, 1, 12), new Object[] { " P ", "WP ", "SS ", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(sofaPartCenter, 1, 0), new Object[] { "   ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(sofaPartCenter, 1, 4), new Object[] { "   ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(sofaPartCenter, 1, 8), new Object[] { "   ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(sofaPartCenter, 1, 12), new Object[] { "   ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(sofaPartCorner, 1, 0), new Object[] { " W ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(sofaPartCorner, 1, 4), new Object[] { " W ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(sofaPartCorner, 1, 8), new Object[] { " W ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(sofaPartCorner, 1, 12), new Object[] { " W ", "WWW", "S S", Character.valueOf('P'), Blocks.planks, Character.valueOf('S'), Items.stick, Character.valueOf('W'), new ItemStack(Blocks.wool, 1, 7) });

		GameRegistry.addRecipe(new ItemStack(miscBlocksOne, 1, 0), new Object[] { "CBC", "BBB", "BBB", Character.valueOf('B'), Blocks.brick_block, Character.valueOf('C'), Items.clay_ball });
		GameRegistry.addSmelting(itemMantlePieceUnf, new ItemStack(miscBlocksOne, 1, 4), 0.5F);
		GameRegistry.addRecipe(new ItemStack(miscBlocksOne, 1, 8), new Object[] { "ABC", "GDR", "SWS", Character.valueOf('W'), Blocks.log, Character.valueOf('S'), Blocks.stone, Character.valueOf('R'), Items.redstone, Character.valueOf('G'), Items.glowstone_dust, Character.valueOf('A'), new ItemStack(Blocks.wool, 1, 14), Character.valueOf('B'), new ItemStack(Blocks.wool, 1, 3), Character.valueOf('C'), new ItemStack(Blocks.wool, 1, 1), Character.valueOf('D'), new ItemStack(Blocks.wool, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(lightsOn, 1, 0), new Object[] { " S ", "WLW", Character.valueOf('S'), Items.string, Character.valueOf('L'), itemLightBulb, Character.valueOf('W'), Blocks.wool });
		GameRegistry.addRecipe(new ItemStack(lightsOn, 1, 4), new Object[] { " I ", "GLG", " II", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('L'), itemLightBulb, Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(lightsOn, 1, 8), new Object[] { "WBW", "WSW", "SSS", Character.valueOf('S'), Items.stick, Character.valueOf('B'), itemLightBulb, Character.valueOf('W'), Blocks.wool });

		GameRegistry.addRecipe(new ItemStack(itemLightBulb, 1), new Object[] { " G ", "GTG", " G ", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch });
		GameRegistry.addRecipe(new ItemStack(itemMantlePieceUnf, 1), new Object[] { "CCC", "C C", "C C", Character.valueOf('C'), Items.clay_ball });
		GameRegistry.addRecipe(new ItemStack(itemCeramicPanelUnf, 1), new Object[] { "CCC", "CCC", Character.valueOf('C'), Items.clay_ball });
		GameRegistry.addRecipe(new ItemStack(itemWMDrum, 1), new Object[] { " I ", "I I", " I ", Character.valueOf('I'), Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(itemBlindPart, 6), new Object[] { "WWW", Character.valueOf('W'), Blocks.wooden_slab });

		GameRegistry.addSmelting(itemCeramicPanelUnf, new ItemStack(itemCeramicPanel, 1, 0), 0.5F);
	}
}
