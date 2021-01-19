package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemModSword;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;

public class ToolStaff extends ItemModSword implements IHasModel

{

	public ToolStaff(String name, ToolMaterial material)
	{
		super(material, 5.0F, -1.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.airnomadarmory);
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		// TODO Auto-generated method stub
		if(!target.world.isRemote)
		  {
		     target.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 5, 2));
		  }
		return super.hitEntity(stack, target, attacker);

	
}
}