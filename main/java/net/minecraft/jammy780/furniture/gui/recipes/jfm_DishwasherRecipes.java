package net.minecraft.jammy780.furniture.gui.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.Loader;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class jfm_DishwasherRecipes
{
	private static final jfm_DishwasherRecipes smeltingBase = new jfm_DishwasherRecipes();
	private static final int WOODEN = 3000;
	private static final int STONE = 8000;
	private static final int IRON = 9600;
	private static final int GOLDEN = 12000;
	private static final int DIAMOND = 14400;

	private Map smeltingList = new HashMap();
	private Map metaSmeltingList = new HashMap();

	private Map smeltingTimeList = new HashMap();

	public static final jfm_DishwasherRecipes smelting()
	{
		return smeltingBase;
	}

	private jfm_DishwasherRecipes()
	{
		addSmelting(Items.bow.getUnlocalizedName(), new ItemStack(Items.bow), WOODEN);
		addSmelting(Items.fishing_rod.getUnlocalizedName(), new ItemStack(Items.fishing_rod), WOODEN);
		addSmelting(Items.shears.getUnlocalizedName(), new ItemStack(Items.shears), IRON);

		addSmelting(Items.wooden_pickaxe.getUnlocalizedName(), new ItemStack(Items.wooden_pickaxe), WOODEN);
		addSmelting(Items.stone_pickaxe.getUnlocalizedName(), new ItemStack(Items.stone_pickaxe), STONE);
		addSmelting(Items.iron_pickaxe.getUnlocalizedName(), new ItemStack(Items.iron_pickaxe), IRON);
		addSmelting(Items.golden_pickaxe.getUnlocalizedName(), new ItemStack(Items.golden_pickaxe), GOLDEN);
		addSmelting(Items.diamond_pickaxe.getUnlocalizedName(), new ItemStack(Items.diamond_pickaxe), DIAMOND);

		addSmelting(Items.wooden_shovel.getUnlocalizedName(), new ItemStack(Items.wooden_shovel), WOODEN);
		addSmelting(Items.stone_shovel.getUnlocalizedName(), new ItemStack(Items.stone_shovel), STONE);
		addSmelting(Items.iron_shovel.getUnlocalizedName(), new ItemStack(Items.iron_shovel), IRON);
		addSmelting(Items.golden_shovel.getUnlocalizedName(), new ItemStack(Items.golden_shovel), GOLDEN);
		addSmelting(Items.diamond_shovel.getUnlocalizedName(), new ItemStack(Items.diamond_shovel), DIAMOND);

		addSmelting(Items.wooden_axe.getUnlocalizedName(), new ItemStack(Items.wooden_axe), WOODEN);
		addSmelting(Items.stone_axe.getUnlocalizedName(), new ItemStack(Items.stone_axe), STONE);
		addSmelting(Items.iron_axe.getUnlocalizedName(), new ItemStack(Items.iron_axe), IRON);
		addSmelting(Items.golden_axe.getUnlocalizedName(), new ItemStack(Items.golden_axe), GOLDEN);
		addSmelting(Items.diamond_axe.getUnlocalizedName(), new ItemStack(Items.diamond_axe), DIAMOND);

		addSmelting(Items.wooden_hoe.getUnlocalizedName(), new ItemStack(Items.wooden_hoe), WOODEN);
		addSmelting(Items.stone_hoe.getUnlocalizedName(), new ItemStack(Items.stone_hoe), STONE);
		addSmelting(Items.iron_hoe.getUnlocalizedName(), new ItemStack(Items.iron_hoe), IRON);
		addSmelting(Items.golden_hoe.getUnlocalizedName(), new ItemStack(Items.golden_hoe), GOLDEN);
		addSmelting(Items.diamond_hoe.getUnlocalizedName(), new ItemStack(Items.diamond_hoe), DIAMOND);

		addSmelting(Items.wooden_sword.getUnlocalizedName(), new ItemStack(Items.wooden_sword), WOODEN);
		addSmelting(Items.stone_sword.getUnlocalizedName(), new ItemStack(Items.stone_sword), STONE);
		addSmelting(Items.iron_sword.getUnlocalizedName(), new ItemStack(Items.iron_sword), IRON);
		addSmelting(Items.golden_sword.getUnlocalizedName(), new ItemStack(Items.golden_sword), GOLDEN);
		addSmelting(Items.diamond_sword.getUnlocalizedName(), new ItemStack(Items.diamond_sword), DIAMOND);

		if (Loader.isModLoaded("Aquaculture"))
		{
			addSmelting("Aquaculture:item.IronFishingRod", IRON);
			addSmelting("Aquaculture:item.GoldFishingRod", GOLDEN);
			addSmelting("Aquaculture:item.DiamondFishingRod", DIAMOND);
			addSmelting("Aquaculture:item.NeptuniumPickaxe", DIAMOND);
			addSmelting("Aquaculture:item.NeptuniumShovel", DIAMOND);
			addSmelting("Aquaculture:item.NeptuniumAxe", DIAMOND);
			addSmelting("Aquaculture:item.NeptuniumHoe", DIAMOND);
			addSmelting("Aquaculture:item.NeptuniumSword", DIAMOND);
		}

		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			addSmelting("BiomesOPlenty:scytheWood", WOODEN);
			addSmelting("BiomesOPlenty:scytheStone", STONE);
			addSmelting("BiomesOPlenty:scytheIron", IRON);
			addSmelting("BiomesOPlenty:scytheGold", GOLDEN);
			addSmelting("BiomesOPlenty:scytheDiamond", DIAMOND);
			addSmelting("BiomesOPlenty:scytheMud", WOODEN);
			addSmelting("BiomesOPlenty:scytheAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:swordAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:shovelAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:pickaxeAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:axeAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:hoeAmethyst", DIAMOND);
			addSmelting("BiomesOPlenty:swordMud", DIAMOND);
			addSmelting("BiomesOPlenty:shovelMud", DIAMOND);
			addSmelting("BiomesOPlenty:pickaxeMud", DIAMOND);
			addSmelting("BiomesOPlenty:axeMud", DIAMOND);
			addSmelting("BiomesOPlenty:hoeMud", DIAMOND);			
		}

		if (Loader.isModLoaded("Oceancraft"))
		{
			addSmelting("Oceancraft:CoralHoe", DIAMOND);
			addSmelting("Oceancraft:CoralSword", DIAMOND);
			addSmelting("Oceancraft:CoralPickaxe", DIAMOND);
			addSmelting("Oceancraft:CoralAxe", DIAMOND);
			addSmelting("Oceancraft:CoralShovel", DIAMOND);
		}

		if (Loader.isModLoaded("Thaumcraft"))
		{
			addSmelting("Thaumcraft:ItemShovelThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemPickThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemAxeThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemSwordThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemHoeThaumium", DIAMOND);
			addSmelting("Thaumcraft:ItemSwordElemental", DIAMOND);
			addSmelting("Thaumcraft:ItemShovelElemental", DIAMOND);
			addSmelting("Thaumcraft:ItemPickaxeElemental", DIAMOND);
			addSmelting("Thaumcraft:ItemAxeElemental", DIAMOND);
			addSmelting("Thaumcraft:ItemHoeElemental", DIAMOND);			
			/*			addSmelting("Thaumcraft:ItemShovelVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemPickVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemAxeVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemSwordVoid", DIAMOND);
			addSmelting("Thaumcraft:ItemHoeVoid", DIAMOND);*/
		}

		if (Loader.isModLoaded("Railcraft"))
		{
			/*addSmelting("tool.crowbar", DIAMOND);
			addSmelting("tool.crowbar.reinforced", DIAMOND);
			addSmelting("tool.crowbar.magic", DIAMOND);
			addSmelting("tool.magnifying.glass", DIAMOND);
			addSmelting("tool.surveyor", DIAMOND);
			addSmelting("tool.signal.tuner", DIAMOND);
			addSmelting("tool.electric.meter", DIAMOND);
			addSmelting("tool.whistle.tuner", DIAMOND);*/

			addSmelting("Railcraft:tool.steel.shears", DIAMOND);
			addSmelting("Railcraft:tool.steel.sword", DIAMOND);
			addSmelting("Railcraft:tool.steel.shovel", DIAMOND);
			addSmelting("Railcraft:tool.steel.pickaxe", DIAMOND);
			addSmelting("Railcraft:tool.steel.axe", DIAMOND);
			addSmelting("Railcraft:tool.steel.hoe", DIAMOND);			
		}

		if (Loader.isModLoaded("TwilightForest"))
		{
			addSmelting("TwilightForest:item.ironwoodSword", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodShovel", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodPick", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodAxe", DIAMOND);
			addSmelting("TwilightForest:item.ironwoodHoe", DIAMOND);
			addSmelting("TwilightForest:item.fierySword", DIAMOND);
			addSmelting("TwilightForest:item.fieryPick", DIAMOND);
			addSmelting("TwilightForest:item.steeleafSword", DIAMOND);
			addSmelting("TwilightForest:item.steeleafShovel", DIAMOND);
			addSmelting("TwilightForest:item.steeleafPick", DIAMOND);
			addSmelting("TwilightForest:item.steeleafAxe", DIAMOND);
			addSmelting("TwilightForest:item.steeleafHoe", DIAMOND);
			addSmelting("TwilightForest:item.knightlySword", DIAMOND);
			addSmelting("TwilightForest:item.knightlyPick", DIAMOND);
			addSmelting("TwilightForest:item.knightlyAxe", DIAMOND);
		}
		if (Loader.isModLoaded("weaponmod"))
		{
			addSmelting("weaponmod:spear.wood", WOODEN);
			addSmelting("weaponmod:spear.stone", STONE);
			addSmelting("weaponmod:spear.iron", IRON);
			addSmelting("weaponmod:spear.gold", GOLDEN);
			addSmelting("weaponmod:spear.diamond", DIAMOND);
			addSmelting("weaponmod:halberd.wood", WOODEN);
			addSmelting("weaponmod:halberd.stone", STONE);
			addSmelting("weaponmod:halberd.iron", IRON);
			addSmelting("weaponmod:halberd.gold", GOLDEN);
			addSmelting("weaponmod:halberd.diamond", DIAMOND);
			addSmelting("weaponmod:battleaxe.wood", WOODEN);
			addSmelting("weaponmod:battleaxe.stone", STONE);
			addSmelting("weaponmod:battleaxe.iron", IRON);
			addSmelting("weaponmod:battleaxe.gold", GOLDEN);
			addSmelting("weaponmod:battleaxe.diamond", DIAMOND);
			addSmelting("weaponmod:knife.wood", WOODEN);
			addSmelting("weaponmod:knife.stone", STONE);
			addSmelting("weaponmod:knife.iron", IRON);
			addSmelting("weaponmod:knife.gold", GOLDEN);
			addSmelting("weaponmod:knife.diamond", DIAMOND);
			addSmelting("weaponmod:warhammer.wood", WOODEN);
			addSmelting("weaponmod:warhammer.stone", STONE);
			addSmelting("weaponmod:warhammer.iron", IRON);
			addSmelting("weaponmod:warhammer.gold", GOLDEN);
			addSmelting("weaponmod:warhammer.diamond", DIAMOND);
			addSmelting("weaponmod:flail.wood", WOODEN);
			addSmelting("weaponmod:flail.stone", STONE);
			addSmelting("weaponmod:flail.iron", IRON);
			addSmelting("weaponmod:flail.gold", GOLDEN);
			addSmelting("weaponmod:flail.diamond", DIAMOND);
			addSmelting("weaponmod:katana.wood", WOODEN);
			addSmelting("weaponmod:katana.stone", STONE);
			addSmelting("weaponmod:katana.iron", IRON);
			addSmelting("weaponmod:katana.gold", GOLDEN);
			addSmelting("weaponmod:katana.diamond", DIAMOND);
			addSmelting("weaponmod:boomerang.wood", WOODEN);
			addSmelting("weaponmod:boomerang.stone", STONE);
			addSmelting("weaponmod:boomerang.iron", IRON);
			addSmelting("weaponmod:boomerang.gold", GOLDEN);
			addSmelting("weaponmod:boomerang.diamond", DIAMOND);
			addSmelting("weaponmod:crossbow", DIAMOND);
			addSmelting("weaponmod:musket", DIAMOND);
			addSmelting("weaponmod:musketbayonet.wood", WOODEN);
			addSmelting("weaponmod:musketbayonet.stone", STONE);
			addSmelting("weaponmod:musketbayonet.iron", IRON);
			addSmelting("weaponmod:musketbayonet.gold", GOLDEN);
			addSmelting("weaponmod:musketbayonet.diamond", DIAMOND);
			addSmelting("weaponmod:flintlock", DIAMOND);
			addSmelting("weaponmod:cannon", DIAMOND);
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
