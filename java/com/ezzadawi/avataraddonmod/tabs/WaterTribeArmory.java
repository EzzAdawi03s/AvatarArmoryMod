package com.ezzadawi.avataraddonmod.tabs;

import com.ezzadawi.avataraddonmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WaterTribeArmory extends CreativeTabs
{
	public WaterTribeArmory(String name) 
	{
		super("watertribearmory");
		this.setBackgroundImageName("watertribearmory.png");
	}

	public ItemStack getTabIconItem() {return new ItemStack(ModItems.BATTLE_CLUB);
	}
}
