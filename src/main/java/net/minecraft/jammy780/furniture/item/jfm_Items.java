package net.minecraft.jammy780.furniture.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.jammy780.furniture.JammyFurnitureModCore;

public class jfm_Items extends Item
{
	public jfm_Items(String name)
	{
		super();
		setUnlocalizedName(name);
		setTextureName("jammyfurniture:" + name);
		setCreativeTab(JammyFurnitureModCore.jfmCustomTab);
		GameRegistry.registerItem(this, name);
	}
}
