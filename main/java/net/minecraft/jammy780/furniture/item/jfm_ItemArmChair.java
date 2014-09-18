package net.minecraft.jammy780.furniture.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class jfm_ItemArmChair extends ItemBlock
{
	public static Block theBlock;

	public jfm_ItemArmChair(Block block)
	{
		super(block);
		setHasSubtypes(true);
		theBlock = block;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch (itemstack.getItemDamage())
		{
		case 0: 
		case 1: 
		case 2: 
		case 3: 
			name = "ArmChairRed";
			break;
		case 4: 
		case 5: 
		case 6: 
		case 7: 
			name = "ArmChairBlue";
			break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			name = "ArmChairGreen";
			break;
		case 12: 
		case 13: 
		case 14: 
		case 15: 
			name = "ArmChairGrey";
			break;
		default: 
			name = "ArmChairRed";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}
}
