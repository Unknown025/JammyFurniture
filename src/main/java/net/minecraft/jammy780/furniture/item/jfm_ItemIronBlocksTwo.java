package net.minecraft.jammy780.furniture.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class jfm_ItemIronBlocksTwo extends ItemBlock
{
	public static Block theBlock;

	public jfm_ItemIronBlocksTwo(Block block)
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
			name = "Dishwasher";
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			name = "WashingMachine";
			break;
		default: 
			name = "Dishwasher";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
