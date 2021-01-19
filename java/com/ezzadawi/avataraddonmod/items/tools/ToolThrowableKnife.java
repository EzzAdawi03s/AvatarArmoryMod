package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.Main;
import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemBoomerang;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import net.minecraft.item.ItemStack;

public class ToolThrowableKnife extends ItemBoomerang implements IHasModel {
	
	public ToolThrowableKnife(String name, ToolMaterial material)
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.firenationarmory);
		setMaxDamage((int) 10.0F);
		setMaxStackSize(100);
		
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
    @Override
    public String getCreatorModId(ItemStack itemStack) {
    	
    	itemRand.nextInt();
    	// TODO Auto-generated method stub
    	return super.getCreatorModId(itemStack);
    }
	
	

}
