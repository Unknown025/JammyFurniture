package net.minecraft.jammy780.furniture.gui.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class jfm_DishwasherRecipes
{
	private static final jfm_DishwasherRecipes smeltingBase = new jfm_DishwasherRecipes();
	private Map smeltingList = new HashMap();
	private Map metaSmeltingList = new HashMap();

	public static final jfm_DishwasherRecipes smelting()
	{
		return smeltingBase;
	}

	private jfm_DishwasherRecipes()
	{
		addSmelting(Items.wooden_pickaxe.getUnlocalizedName(), new ItemStack(Items.wooden_pickaxe));
		addSmelting(Items.stone_pickaxe.getUnlocalizedName(), new ItemStack(Items.stone_pickaxe));
		addSmelting(Items.iron_pickaxe.getUnlocalizedName(), new ItemStack(Items.iron_pickaxe));
		addSmelting(Items.golden_pickaxe.getUnlocalizedName(), new ItemStack(Items.golden_pickaxe));
		addSmelting(Items.diamond_pickaxe.getUnlocalizedName(), new ItemStack(Items.diamond_pickaxe));

		addSmelting(Items.wooden_shovel.getUnlocalizedName(), new ItemStack(Items.wooden_shovel));
		addSmelting(Items.stone_shovel.getUnlocalizedName(), new ItemStack(Items.stone_shovel));
		addSmelting(Items.iron_shovel.getUnlocalizedName(), new ItemStack(Items.iron_shovel));
		addSmelting(Items.golden_shovel.getUnlocalizedName(), new ItemStack(Items.golden_shovel));
		addSmelting(Items.diamond_shovel.getUnlocalizedName(), new ItemStack(Items.diamond_shovel));

		addSmelting(Items.wooden_axe.getUnlocalizedName(), new ItemStack(Items.wooden_axe));
		addSmelting(Items.stone_axe.getUnlocalizedName(), new ItemStack(Items.stone_axe));
		addSmelting(Items.iron_axe.getUnlocalizedName(), new ItemStack(Items.iron_axe));
		addSmelting(Items.golden_axe.getUnlocalizedName(), new ItemStack(Items.golden_axe));
		addSmelting(Items.diamond_axe.getUnlocalizedName(), new ItemStack(Items.diamond_axe));

		addSmelting(Items.wooden_hoe.getUnlocalizedName(), new ItemStack(Items.wooden_hoe));
		addSmelting(Items.stone_hoe.getUnlocalizedName(), new ItemStack(Items.stone_hoe));
		addSmelting(Items.iron_hoe.getUnlocalizedName(), new ItemStack(Items.iron_hoe));
		addSmelting(Items.golden_hoe.getUnlocalizedName(), new ItemStack(Items.golden_hoe));
		addSmelting(Items.diamond_hoe.getUnlocalizedName(), new ItemStack(Items.diamond_hoe));

		addSmelting(Items.wooden_sword.getUnlocalizedName(), new ItemStack(Items.wooden_sword));
		addSmelting(Items.stone_sword.getUnlocalizedName(), new ItemStack(Items.stone_sword));
		addSmelting(Items.iron_sword.getUnlocalizedName(), new ItemStack(Items.iron_sword));
		addSmelting(Items.golden_sword.getUnlocalizedName(), new ItemStack(Items.golden_sword));
		addSmelting(Items.diamond_sword.getUnlocalizedName(), new ItemStack(Items.diamond_sword));
	}

	public void addSmelting(String par1, ItemStack par2ItemStack)
	{
		this.smeltingList.put(par1, par2ItemStack);
	}

	public Map getSmeltingList()
	{
		return this.smeltingList;
	}

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
}
