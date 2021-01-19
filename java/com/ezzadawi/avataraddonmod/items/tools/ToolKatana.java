package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemModSword;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class ToolKatana extends ItemModSword implements IHasModel

{

	public ToolKatana(String name, ToolMaterial material)
	{
		super(material, 5.0F, -1.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.earthkingdomearmory);
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	@Override
	public boolean isShield(ItemStack stack, EntityLivingBase entity) {
		// TODO Auto-generated method stub
		return super.isShield(stack, entity);
		
	}
	
}