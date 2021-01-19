package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemModSword;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolDadao extends ItemModSword implements IHasModel

{

	public ToolDadao(String name, ToolMaterial material)
	{
		super(material, 4.0F, -2.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.firenationarmory);
		
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	
}