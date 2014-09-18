package net.minecraft.jammy780.furniture.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class jfm_ItemIronBlocksOne extends ItemBlock
{
	public static Block theBlock;

	public jfm_ItemIronBlocksOne(Block block)
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
			name = "Fridge";
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			name = "Freezer";
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			name = "Cooker";
			break;
		case 12: 
			name = "RubbishBin";
			break;
		case 13: 
			name = "CoffeeTable";
			break;
		default: 
			name = "Fridge";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
