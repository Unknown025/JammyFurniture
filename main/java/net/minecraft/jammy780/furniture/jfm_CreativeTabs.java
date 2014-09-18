package net.minecraft.jammy780.furniture;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class jfm_CreativeTabs extends CreativeTabs
{
	public jfm_CreativeTabs(String label)
	{
		super(label);
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(JammyFurnitureModCore.armChair);
	}

	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(JammyFurnitureModCore.armChair);
	}
}
