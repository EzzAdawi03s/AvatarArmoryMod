package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ItemModSword;
import com.ezzadawi.avataraddonmod.util.IHasModel;

import org.apache.logging.log4j.core.appender.ConsoleAppender.Target;

import com.ezzadawi.avataraddonmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPoisonKnife extends ItemModSword implements IHasModel 

{

	public ToolPoisonKnife(String name, ToolMaterial material)
	{
		super(material, 2.0F, 5.0F);
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
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		// TODO Auto-generated method stub
		if(!target.world.isRemote)
		  {
		     target.addPotionEffect(new PotionEffect(MobEffects.POISON, 200, 2));
		  }
		return super.hitEntity(stack, target, attacker);
		
	}
	
	
	
		
	
}
 	
	
	
	

