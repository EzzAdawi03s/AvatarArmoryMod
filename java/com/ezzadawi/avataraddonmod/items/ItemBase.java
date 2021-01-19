package com.ezzadawi.avataraddonmod.items;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.tabs.WaterTribeArmory;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import java.util.Set;

import com.ezzadawi.avataraddonmod.Main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.watertribearmory);
		
		
		ModItems.ITEMS.add(this);
	}

	public ItemBase(ToolMaterial material, Set<Block> effectiveOn) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
