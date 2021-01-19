package com.ezzadawi.avataraddonmod.items.tools;

import com.ezzadawi.avataraddonmod.util.IHasModel;

import com.ezzadawi.avataraddonmod.Main;

import com.ezzadawi.avataraddonmod.init.ModItems;
import com.ezzadawi.avataraddonmod.items.ModShields;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

import net.minecraft.item.ItemShield;

public class ToolShieldA extends ItemShield implements IHasModel


{
    public ToolShieldA(String name, ToolMaterial material)
    {
       
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxDamage(600);
        setCreativeTab(Main.earthkingdomearmory);
        
        ModItems.ITEMS.add(this);
    }

 

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
