package net.minecraft.jammy780.furniture.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class jfm_ItemSofaLeft extends ItemBlock
{
	public static Block theBlock;

	public jfm_ItemSofaLeft(Block block)
	{
		super(block);
		setHasSubtypes(true);
		theBlock = block;
	}

	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch (itemstack.getItemDamage())
		{
		case 0: 
		case 1: 
		case 2: 
		case 3: 
			name = "SofaLeftRed";
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			name = "SofaLeftBlue";
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			name = "SofaLeftGreen";
			break;
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			name = "SofaLeftGrey";
			break;
		default: 
			name = "SofaLeftRed";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
