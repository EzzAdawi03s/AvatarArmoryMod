package com.ezzadawi.avataraddonmod.tabs;

import com.ezzadawi.avataraddonmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EarthKingdomArmory extends CreativeTabs
{
	public EarthKingdomArmory(String name) 
	{
		super("earthkingdomarmory");
		this.setBackgroundImageName("earthkingdomarmory.png");
	}

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.HAMMER);
	}
}
