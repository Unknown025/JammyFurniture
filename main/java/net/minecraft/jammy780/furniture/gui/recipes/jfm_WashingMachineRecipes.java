package net.minecraft.jammy780.furniture.gui.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
