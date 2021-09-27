package net.minecraft.jammy780.furniture.gui.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class jfm_CookerRecipes
{
	private static final jfm_CookerRecipes smeltingBase = new jfm_CookerRecipes();
	private Map smeltingList = new HashMap();
	private Map metaSmeltingList = new HashMap();

	public static final jfm_CookerRecipes smelting()
	{
		return smeltingBase;
	}

	private jfm_CookerRecipes()
	{
		addSmelting(Items.porkchop.getUnlocalizedName(), new ItemStack(Items.cooked_porkchop));
		addSmelting(Items.beef.getUnlocalizedName(), new ItemStack(Items.cooked_beef));
		addSmelting(Items.chicken.getUnlocalizedName(), new ItemStack(Items.cooked_chicken));
		addSmelting(Items.fish.getUnlocalizedName(), new ItemStack(Items.cooked_fished));
		addSmelting(Items.potato.getUnlocalizedName(), new ItemStack(Items.baked_potato));
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
