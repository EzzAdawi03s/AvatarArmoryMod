package com.ezzadawi.avataraddonmod.tabs;

import com.ezzadawi.avataraddonmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FireNationArmory extends CreativeTabs
{
	public FireNationArmory(String name) 
	{
		super("firenationarmory");
		this.setBackgroundImageName("firenationarmory.png");
	}

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.DAO_BROADSWORD);
	}
}
