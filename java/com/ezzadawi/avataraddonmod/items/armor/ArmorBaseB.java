package com.ezzadawi.avataraddonmod.items.armor;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBaseB extends ItemArmor implements IHasModel

{

	public ArmorBaseB(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
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
