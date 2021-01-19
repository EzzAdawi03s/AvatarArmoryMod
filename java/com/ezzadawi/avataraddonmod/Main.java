package com.ezzadawi.avataraddonmod;



import com.ezzadawi.avataraddonmod.events.EventExample;
import com.ezzadawi.avataraddonmod.init.ModRecipes;
import com.ezzadawi.avataraddonmod.proxy.CommonProxy;
import com.ezzadawi.avataraddonmod.tabs.AirNomadArmory;
import com.ezzadawi.avataraddonmod.tabs.EarthKingdomArmory;
import com.ezzadawi.avataraddonmod.tabs.FireNationArmory;
import com.ezzadawi.avataraddonmod.tabs.WaterTribeArmory;
import com.ezzadawi.avataraddonmod.util.Reference;
import com.ezzadawi.avataraddonmod.util.handlers.RegistryHandler;
import com.ezzadawi.avataraddonmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	
	public static final CreativeTabs watertribearmory = new WaterTribeArmory("watertribearmory");
	public static final CreativeTabs firenationarmory = new FireNationArmory("firenationarmory");
	public static final CreativeTabs earthkingdomearmory = new EarthKingdomArmory("earthkingdomearmory");
	public static final CreativeTabs airnomadarmory = new AirNomadArmory("airnomadarmory");
	
	@Instance
	public static Main instance;
	
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
		RegistryHandler.preInitRegistries();
		EventExample exampleEvent = new EventExample();
		
		MinecraftForge.EVENT_BUS.register(exampleEvent);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
	
	
	

}
