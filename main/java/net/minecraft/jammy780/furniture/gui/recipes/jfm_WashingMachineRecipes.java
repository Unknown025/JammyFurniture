package net.minecraft.jammy780.furniture.gui.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class jfm_WashingMachineRecipes
{
	private static final jfm_WashingMachineRecipes smeltingBase = new jfm_WashingMachineRecipes();
	private Map smeltingList = new HashMap();
	private Map metaSmeltingList = new HashMap();

	public static final jfm_WashingMachineRecipes smelting()
	{
		return smeltingBase;
	}

	private jfm_WashingMachineRecipes()
	{
		addSmelting(Items.diamond_boots.getUnlocalizedName(), new ItemStack(Items.diamond_boots));
		addSmelting(Items.chainmail_boots.getUnlocalizedName(), new ItemStack(Items.chainmail_boots));
		addSmelting(Items.leather_boots.getUnlocalizedName(), new ItemStack(Items.leather_boots));
		addSmelting(Items.iron_boots.getUnlocalizedName(), new ItemStack(Items.iron_boots));
		addSmelting(Items.golden_boots.getUnlocalizedName(), new ItemStack(Items.golden_boots));

		addSmelting(Items.diamond_helmet.getUnlocalizedName(), new ItemStack(Items.diamond_helmet));
		addSmelting(Items.chainmail_helmet.getUnlocalizedName(), new ItemStack(Items.chainmail_helmet));
		addSmelting(Items.leather_helmet.getUnlocalizedName(), new ItemStack(Items.leather_helmet));
		addSmelting(Items.iron_helmet.getUnlocalizedName(), new ItemStack(Items.iron_helmet));
		addSmelting(Items.golden_helmet.getUnlocalizedName(), new ItemStack(Items.golden_helmet));

		addSmelting(Items.diamond_chestplate.getUnlocalizedName(), new ItemStack(Items.diamond_chestplate));
		addSmelting(Items.chainmail_chestplate.getUnlocalizedName(), new ItemStack(Items.chainmail_chestplate));
		addSmelting(Items.leather_chestplate.getUnlocalizedName(), new ItemStack(Items.leather_chestplate));
		addSmelting(Items.iron_chestplate.getUnlocalizedName(), new ItemStack(Items.iron_chestplate));
		addSmelting(Items.golden_chestplate.getUnlocalizedName(), new ItemStack(Items.golden_chestplate));

		addSmelting(Items.diamond_leggings.getUnlocalizedName(), new ItemStack(Items.diamond_leggings));
		addSmelting(Items.chainmail_leggings.getUnlocalizedName(), new ItemStack(Items.chainmail_leggings));
		addSmelting(Items.leather_leggings.getUnlocalizedName(), new ItemStack(Items.leather_leggings));
		addSmelting(Items.iron_leggings.getUnlocalizedName(), new ItemStack(Items.iron_leggings));
		addSmelting(Items.golden_leggings.getUnlocalizedName(), new ItemStack(Items.golden_leggings));
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
