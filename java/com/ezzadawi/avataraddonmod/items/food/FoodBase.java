package com.ezzadawi.avataraddonmod.items.food;

import com.ezzadawi.avataraddonmod.Main;
import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
   public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
   {
	   super(amount, saturation, isAnimalFood);
	   setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
   }

@Override
public void registerModels() {
	// TODO Auto-generated method stub
	
	Main.proxy.registerItemRenderer(this, 0, "inventory");

	
}
   
}
