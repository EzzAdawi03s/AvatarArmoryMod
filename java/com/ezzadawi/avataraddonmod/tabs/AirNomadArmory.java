package com.ezzadawi.avataraddonmod.tabs;

import com.ezzadawi.avataraddonmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AirNomadArmory extends CreativeTabs
{
	public AirNomadArmory(String name) 
	{
		super("airnomadarmory");
		this.setBackgroundImageName("airnomadarmory.png");
	}

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.STAFF);
	}
}
