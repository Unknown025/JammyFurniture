package net.minecraft.jammy780.furniture.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class jfm_ItemCeramicBlocksOne extends ItemBlock
{
	public static Block theBlock;

	public jfm_ItemCeramicBlocksOne(Block block)
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
			name = "BathroomCupboard";
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			name = "BathroomSink";
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			name = "KitchenSink";
			break;
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			name = "Toilet";
			break;
		default: 
			name = "BathroomCupboard";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
