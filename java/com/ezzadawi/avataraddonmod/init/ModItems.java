package com.ezzadawi.avataraddonmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ezzadawi.avataraddonmod.items.ItemBase;
import com.ezzadawi.avataraddonmod.items.ItemBaseB;
import com.ezzadawi.avataraddonmod.items.ItemBoomerang;
import com.ezzadawi.avataraddonmod.items.ItemModSword;
import com.ezzadawi.avataraddonmod.items.ModSwordShield;
import com.ezzadawi.avataraddonmod.items.armor.ArmorBase;
import com.ezzadawi.avataraddonmod.items.armor.ArmorBaseA;
import com.ezzadawi.avataraddonmod.items.armor.ArmorBaseB;
import com.ezzadawi.avataraddonmod.items.armor.ArmorBaseC;
import com.ezzadawi.avataraddonmod.items.food.FoodBase;
import com.ezzadawi.avataraddonmod.items.food.FoodEffectBase;
import com.ezzadawi.avataraddonmod.items.tools.ToolBattleClub;
import com.ezzadawi.avataraddonmod.items.tools.ToolPuDao;
import com.ezzadawi.avataraddonmod.items.tools.ToolWarFan;
import com.ezzadawi.avataraddonmod.items.tools.ToolHammer;
import com.ezzadawi.avataraddonmod.items.tools.ToolKukri;
import com.ezzadawi.avataraddonmod.items.tools.ToolLochaberArm;
import com.ezzadawi.avataraddonmod.items.tools.ToolNunchaku;
import com.ezzadawi.avataraddonmod.items.tools.ToolStaff;
import com.ezzadawi.avataraddonmod.items.tools.ToolThrowableKnife;
import com.ezzadawi.avataraddonmod.items.tools.ToolNaginata;
import com.ezzadawi.avataraddonmod.items.tools.ToolDadao;
import com.ezzadawi.avataraddonmod.items.tools.ToolJianSword;
import com.ezzadawi.avataraddonmod.items.tools.ToolJawBlade;
import com.ezzadawi.avataraddonmod.items.tools.ToolKanabo;
import com.ezzadawi.avataraddonmod.items.tools.ToolSanGuCha;
import com.ezzadawi.avataraddonmod.items.tools.ToolPoisonKnife;
import com.ezzadawi.avataraddonmod.items.tools.ToolBoomerang;
import com.ezzadawi.avataraddonmod.items.tools.ToolSpear;
import com.ezzadawi.avataraddonmod.items.tools.ToolWhalesToothScimitar;
import com.ezzadawi.avataraddonmod.items.tools.ToolMachete;
import com.ezzadawi.avataraddonmod.items.tools.ToolMetalAxe;
import com.ezzadawi.avataraddonmod.items.tools.ToolMeteoriteSword;
import com.ezzadawi.avataraddonmod.items.tools.ToolKatana;
import com.ezzadawi.avataraddonmod.items.tools.ToolButterflySword;
import com.ezzadawi.avataraddonmod.items.tools.ToolDaoBroadSword;
import com.ezzadawi.avataraddonmod.items.tools.ToolKama;
import com.ezzadawi.avataraddonmod.items.tools.ToolShield;
import com.ezzadawi.avataraddonmod.items.tools.ToolShieldA;
import com.ezzadawi.avataraddonmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MACHETE =EnumHelper.addToolMaterial("material_machete", 3, 1561, 8.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_BATTLE_CLUB =EnumHelper.addToolMaterial("material_battle_club", 0, 1561, 0.0F, 5.0F, 10);
	public static final ToolMaterial MATERIAL_JAW_BLADE =EnumHelper.addToolMaterial("material_jaw_blade", 0, 1561, 0.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_SPEAR =EnumHelper.addToolMaterial("material_spear", 0, 1561, 0.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_WHALES_TOOTH_SCIMITAR =EnumHelper.addToolMaterial("material_whales_tooth_scimitar", 0, 1561, 0.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_WATERTRIBE =EnumHelper.addToolMaterial("material_watertribe", 0, 1561, 0.0F, 3.0F, 10);
	
	public static final ToolMaterial MATERIAL_WATER_TRIBE_SHIELD =EnumHelper.addToolMaterial("material_water_tribe_shield", 0, 1561, 0.0F, 3.0F, 10);
	
	public static final ArmorMaterial ARMOR_MATERIAL_WATERTRIBE =EnumHelper.addArmorMaterial("armor_material_watertribe", Reference.MOD_ID + ":watertribe", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WATERTRIBEA =EnumHelper.addArmorMaterial("armor_material_watertribea", Reference.MOD_ID + ":watertribea", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WATERTRIBEB =EnumHelper.addArmorMaterial("armor_material_watertribeb", Reference.MOD_ID + ":watertribeb", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WATERTRIBEC =EnumHelper.addArmorMaterial("armor_material_watertribec", Reference.MOD_ID + ":watertribec", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_EARTHKINGDOME =EnumHelper.addArmorMaterial("armor_material_earthkingdome", Reference.MOD_ID + ":earthkingdome", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_EARTHKINGDOMEA =EnumHelper.addArmorMaterial("armor_material_earthkingdomea", Reference.MOD_ID + ":earthkingdomea", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_KYOSHIWARRIOR =EnumHelper.addArmorMaterial("armor_material_kyoshiwarrior", Reference.MOD_ID + ":kyoshiwarrior", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);

	public static final ArmorMaterial ARMOR_MATERIAL_FIREHEAVYARMOR =EnumHelper.addArmorMaterial("armor_material_fireheavyarmor", Reference.MOD_ID + ":fireheavyarmor", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_FIREHEAVYARMORA =EnumHelper.addArmorMaterial("armor_material_fireheavyarmora", Reference.MOD_ID + ":fireheavyarmora", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BLUESPIRIT =EnumHelper.addArmorMaterial("armor_material_bluespirit", Reference.MOD_ID + ":bluespirit", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 2.0F);

	
	public static final ArmorMaterial ARMOR_MATERIAL_YOUNGAIRNOMAD =EnumHelper.addArmorMaterial("armor_material_youngairnomad", Reference.MOD_ID + ":youngairnomad", 20, new int[] {4, 7, 9, 0}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_NEWAIRBENDER =EnumHelper.addArmorMaterial("armor_material_newairbender", Reference.MOD_ID + ":newairbender", 20, new int[] {4, 7, 9, 0}, 10, SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA, 3.0F);

	
	
	//Weapons
	public static final ItemModSword MACHETE = new ToolMachete("machete", MATERIAL_MACHETE);
	public static final ItemModSword BATTLE_CLUB = new ToolBattleClub("battle_club", MATERIAL_BATTLE_CLUB);
	public static final ItemModSword JAW_BLADE = new ToolJawBlade("jaw_blade", MATERIAL_JAW_BLADE);
	public static final ItemModSword SPEAR = new ToolSpear("spear", MATERIAL_SPEAR);
	public static final ItemModSword WHALES_TOOTH_SCIMITAR = new ToolWhalesToothScimitar("whales_tooth_scimitar", MATERIAL_SPEAR);
	public static final ItemModSword KATANA = new ToolKatana("katana", MATERIAL_MACHETE);
	public static final ItemModSword BUTTERFLY_SWORD = new ToolButterflySword("butterfly_sword", MATERIAL_SPEAR);
	public static final ItemModSword DAO_BROADSWORD = new ToolDaoBroadSword("dao_broadsword", MATERIAL_SPEAR);
	public static final ItemModSword HOOK_SWORD = new ToolKatana("hook_sword", MATERIAL_MACHETE);
	public static final ItemModSword KAMA = new ToolKama("kama", MATERIAL_SPEAR);
	public static final ItemModSword KUKRI = new ToolKukri("kukri", MATERIAL_JAW_BLADE);
	public static final ItemModSword LOCHABER_AXE = new ToolLochaberArm("lochaber_axe", MATERIAL_SPEAR);
	public static final ItemModSword NAGINATA = new ToolNaginata("naginata", MATERIAL_SPEAR);
	public static final ItemModSword NUNCHAKU = new ToolNunchaku("nunchaku", MATERIAL_SPEAR);
	public static final ItemModSword PEARL_HANDLED_DAGGER = new ToolKukri("pearle_handled_dagger", MATERIAL_SPEAR);
	public static final ItemModSword POLEARM = new ToolLochaberArm("polearm", MATERIAL_SPEAR);
	public static final ItemModSword PU_DAO = new ToolPuDao("pu_dao", MATERIAL_SPEAR);
	public static final ItemModSword WAR_FAN = new ToolWarFan("war_fan", MATERIAL_BATTLE_CLUB);
	public static final ItemModSword HAMMER = new ToolHammer("hammer", MATERIAL_BATTLE_CLUB);
	public static final ItemModSword STAFF = new ToolStaff("staff", MATERIAL_MACHETE);
	public static final ItemModSword ROCK_GLOVES = new ToolKama("rock_gloves", MATERIAL_SPEAR);
	public static final ItemModSword NINJATO = new ToolButterflySword("ninjato", MATERIAL_MACHETE);
	public static final ItemModSword QIAN_KUN_RI_YUE_DAO = new ToolKama("qian_kun_ri_yue_dao", MATERIAL_SPEAR);
	public static final ItemModSword DADAO = new ToolDadao("dadao", MATERIAL_SPEAR);
	public static final ItemModSword FIRENATION_SWORD = new ToolDadao("firenation_sword", MATERIAL_SPEAR);
	public static final ItemModSword JIAN_SWORD = new ToolJianSword("jian_sword", MATERIAL_MACHETE);
	public static final ItemModSword JII = new ToolLochaberArm("jii", MATERIAL_SPEAR);
	public static final ItemModSword GUAN_DAO = new ToolNaginata("guan_dao", MATERIAL_SPEAR);
	public static final ItemModSword KANABO = new ToolKanabo("kanabo", MATERIAL_SPEAR);
	public static final ItemModSword POISON_KNIFE = new ToolPoisonKnife("poison_knife", MATERIAL_JAW_BLADE);
	public static final ItemModSword SAN_GU_CHA = new ToolSanGuCha("san_gu_cha", MATERIAL_JAW_BLADE);
	public static final ItemBoomerang BOOMERANG = new ToolBoomerang("boomerang", MATERIAL_JAW_BLADE);
	public static final ItemModSword METEORITE_SWORD = new ToolMeteoriteSword("meteorite_sword", MATERIAL_MACHETE);
	public static final ItemBoomerang THROWABLE_KNIFE = new ToolThrowableKnife("throwable_knife", MATERIAL_JAW_BLADE);
	public static final ItemBoomerang STILETTOS = new ToolThrowableKnife("stilettos", MATERIAL_JAW_BLADE);
	public static final ItemAxe METAL_AXE = new ToolMetalAxe("metal_axe", MATERIAL_BATTLE_CLUB);
	public static final ItemModSword METAL_KNIFE = new ToolJawBlade("metal_knife", MATERIAL_JAW_BLADE);




	//Armors
	public static final Item WATER_TRIBE_WOLF_HELMET = new ArmorBase("water_tribe_wolf_helmet", ARMOR_MATERIAL_WATERTRIBE, 1, EntityEquipmentSlot.HEAD);
	public static final Item WATER_TRIBE_WOLF_CHESTPLATE = new ArmorBase("water_tribe_wolf_chestplate", ARMOR_MATERIAL_WATERTRIBE, 1, EntityEquipmentSlot.CHEST);
	public static final Item WATER_TRIBE_WOLF_LEGGINGS = new ArmorBase("water_tribe_wolf_leggings", ARMOR_MATERIAL_WATERTRIBE, 2, EntityEquipmentSlot.LEGS);
	public static final Item WATER_TRIBE_WOLF_BOOTS = new ArmorBase("water_tribe_wolf_boots", ARMOR_MATERIAL_WATERTRIBE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item WATER_TRIBE_WOLF_SOLDIER_HELMET = new ArmorBase("water_tribe_wolf_soldier_helmet", ARMOR_MATERIAL_WATERTRIBEA, 1, EntityEquipmentSlot.HEAD);
	
	public static final Item WATER_TRIBE_WOLF_SERGENT_HELMET = new ArmorBase("water_tribe_wolf_sergent_helmet", ARMOR_MATERIAL_WATERTRIBEB, 1, EntityEquipmentSlot.HEAD);
	public static final Item WATER_TRIBE_WOLF_SERGENT_CHESTPLATE = new ArmorBase("water_tribe_wolf_sergent_chestplate", ARMOR_MATERIAL_WATERTRIBEB, 1, EntityEquipmentSlot.CHEST);

	public static final Item WATER_TRIBE_WOLF_GENERAL_HELMET = new ArmorBase("water_tribe_wolf_general_helmet", ARMOR_MATERIAL_WATERTRIBEC, 1, EntityEquipmentSlot.HEAD);
    public static final Item WATER_TRIBE_WOLF_GENERAL_CHESTPLATE = new ArmorBase("water_tribe_wolf_general_chestplate", ARMOR_MATERIAL_WATERTRIBEC, 1, EntityEquipmentSlot.CHEST);

    public static final Item EARTHKINGDOME_HELMET = new ArmorBaseA("earthkingdome_helmet", ARMOR_MATERIAL_EARTHKINGDOME, 1, EntityEquipmentSlot.HEAD);
	public static final Item EARTHKINGDOME_CHESTPLATE = new ArmorBaseA("earthkingdome_chestplate", ARMOR_MATERIAL_EARTHKINGDOME, 1, EntityEquipmentSlot.CHEST);
	public static final Item EARTHKINGDOME_LEGGINGS = new ArmorBaseA("earthkingdome_leggings", ARMOR_MATERIAL_EARTHKINGDOME, 2, EntityEquipmentSlot.LEGS);
	public static final Item EARTHKINGDOME_BOOTS = new ArmorBaseA("earthkingdome_boots", ARMOR_MATERIAL_EARTHKINGDOME, 1, EntityEquipmentSlot.FEET);
	
    public static final Item EARTHKINGDOME_CAPTAIN_HELMET = new ArmorBaseA("earthkingdome_captain_helmet", ARMOR_MATERIAL_EARTHKINGDOMEA, 1, EntityEquipmentSlot.HEAD);
    
    public static final Item KYOSHI_MAKE_UP = new ArmorBaseA("kyoshi_make_up", ARMOR_MATERIAL_KYOSHIWARRIOR, 1, EntityEquipmentSlot.HEAD);
   	public static final Item KYOSHI_CHESTPLATE = new ArmorBaseA("kyoshi_chestplate", ARMOR_MATERIAL_KYOSHIWARRIOR, 1, EntityEquipmentSlot.CHEST);
   	public static final Item KYOSHI_LEGGINGS = new ArmorBaseA("kyoshi_leggings", ARMOR_MATERIAL_KYOSHIWARRIOR, 2, EntityEquipmentSlot.LEGS);
   	public static final Item KYOSHI_BOOTS = new ArmorBaseA("kyoshi_boots", ARMOR_MATERIAL_KYOSHIWARRIOR, 1, EntityEquipmentSlot.FEET);
   		
    public static final Item FIRENATION_HELMET = new ArmorBaseB("firenation_helmet", ARMOR_MATERIAL_FIREHEAVYARMOR, 1, EntityEquipmentSlot.HEAD);
  	public static final Item FIRENATION_CHESTPLATE = new ArmorBaseB("firenation_chestplate", ARMOR_MATERIAL_FIREHEAVYARMOR, 1, EntityEquipmentSlot.CHEST);
  	public static final Item FIRENATION_LEGGINGS = new ArmorBaseB("firenation_leggings", ARMOR_MATERIAL_FIREHEAVYARMOR, 2, EntityEquipmentSlot.LEGS);
  	public static final Item FIRENATION_BOOTS = new ArmorBaseB("firenation_boots", ARMOR_MATERIAL_FIREHEAVYARMOR, 1, EntityEquipmentSlot.FEET);
   	
    public static final Item FIRENATION_HELMET_MASK = new ArmorBaseB("firenation_helmet_mask", ARMOR_MATERIAL_FIREHEAVYARMORA, 1, EntityEquipmentSlot.HEAD);
     
    public static final Item BLUE_SPIRIT_MASK = new ArmorBaseB("blue_spirit_mask", ARMOR_MATERIAL_BLUESPIRIT, 1, EntityEquipmentSlot.HEAD);

    
  	public static final Item YOUNGAIRNOMAD_CHESTPLATE = new ArmorBaseC("youngairnomad_chestplate", ARMOR_MATERIAL_YOUNGAIRNOMAD, 1, EntityEquipmentSlot.CHEST);
  	public static final Item YOUNGAIRNOMAD_LEGGINGS = new ArmorBaseC("youngairnomad_leggings", ARMOR_MATERIAL_YOUNGAIRNOMAD, 2, EntityEquipmentSlot.LEGS);
  	public static final Item YOUNGAIRNOMAD_BOOTS = new ArmorBaseC("youngairnomad_boots", ARMOR_MATERIAL_YOUNGAIRNOMAD, 1, EntityEquipmentSlot.FEET);
  	
  	public static final Item AIRBENDER_WINGSUIT_CHESTPLATE = new ArmorBaseC("airbender_wingsuit_chestplate", ARMOR_MATERIAL_NEWAIRBENDER, 1, EntityEquipmentSlot.CHEST);
  	public static final Item AIRBENDER_WINGSUIT_LEGGINGS = new ArmorBaseC("airbender_wingsuit_leggings", ARMOR_MATERIAL_NEWAIRBENDER, 2, EntityEquipmentSlot.LEGS);
  	public static final Item AIRBENDER_WINGSUIT_BOOTS = new ArmorBaseC("airbender_wingsuit_boots", ARMOR_MATERIAL_NEWAIRBENDER, 1, EntityEquipmentSlot.FEET);
  	
  	//Shields
	public static final ItemShield WATER_TRIBE_SHIELD = new ToolShield("water_tribe_shield", MATERIAL_WATER_TRIBE_SHIELD);
	public static final ItemShield WAR_FAN_SHIELD = new ToolShieldA("war_fan_shield", MATERIAL_WATER_TRIBE_SHIELD);
	
	//Items
	public static final Item BLUE_HEAVY_BALL = new ItemBase("blue_heavy_ball");
	public static final Item WOLF_TOOTH = new ItemBase("wolf_tooth");
	public static final Item WHALE_TOOTH = new ItemBase("whale_tooth");
	public static final Item METAL_INGOT = new ItemBaseB("metal_ingot");
	public static final Item WOLF_TAIL = new ItemBase("wolf_tail");
	public static final Item EARTH_KINGDOME_COPPER_COINS = new ItemBaseB("earth_kingdome_copper_coins");
	public static final Item EARTH_KINGDOME_SILVER_COINS = new ItemBaseB("earth_kingdome_silver_coins");
	public static final Item EARTH_KINGDOME_GOLD_COINS = new ItemBaseB("earth_kingdome_gold_coins");
	public static final Item WATER_TRIBE_COINS = new ItemBaseB("water_tribe_coins");
	public static final Item FIRE_NATION_COPPER_PIECE = new ItemBaseB("fire_nation_copper_piece");
	public static final Item FIRE_NATION_SILVER_PIECE = new ItemBaseB("fire_nation_silver_piece");
	public static final Item FIRE_NATION_GOLD_PIECE = new ItemBaseB("fire_nation_gold_piece");
	public static final Item METEORITE_INGOT = new ItemBaseB("meteorite_ingot");
	public static final Item COPPER_INGOT = new ItemBaseB("copper_ingot");
	public static final Item SILVER_INGOT = new ItemBaseB("silver_ingot");
	public static final Item METAL_PLATE = new ItemBaseB("metal_plate");
	public static final Item RED_METAL_PLATE = new ItemBaseB("red_metal_plate");
	public static final Item BLUE_METAL_PLATE = new ItemBaseB("blue_metal_plate");
	public static final Item GREEN_METAL_PLATE = new ItemBaseB("green_metal_plate");
	public static final Item YELLOW_METAL_PLATE = new ItemBaseB("yellow_metal_plate");
	public static final Item LEATHER_GRIP = new ItemBaseB("leather_grip");
	public static final Item BLACK_LEATHER_GRIP = new ItemBaseB("black_leather_grip");
	public static final Item RED_LEATHER_GRIP = new ItemBaseB("red_leather_grip");
	public static final Item BONE_HANDLE = new ItemBaseB("bone_handle");
	public static final Item BONE_LEATHER_GRIPPED_HANDLE = new ItemBaseB("bone_leather_gripped_handle");
	public static final Item BONE_STICK = new ItemBaseB("bone_stick");
	public static final Item BONE_STICK_FOR_SPEARS = new ItemBaseB("bone_stick_for_spears");
	public static final Item WOODEN_HANDLE = new ItemBaseB("wooden_handle");
	public static final Item JIAN_COLLAR = new ItemBaseB("jian_collar");
	public static final Item JIAN_HANDLE = new ItemBaseB("jian_handle");
	public static final Item STICK_FOR_SPEARS = new ItemBaseB("stick_for_spears");
	public static final Item RED_WOODEN_HANDLE = new ItemBaseB("red_wooden_handle");
	public static final Item TSUKA = new ItemBaseB("tsuka");
	public static final Item GOLDEN_GUARD = new ItemBaseB("golden_guard");
	
	
	//Food
	//public static final Item CACTUS_JUICE = new FoodBase("cactus_juice", 6, 2.4f, false);
	
	
	//Food+Effects
	//public static final Item CACTUS_JUICE = new FoodEffectBase("cactus_juice", 6, 2.4f, false);
	public static final Item CACTUS_JUICE = new FoodEffectBase("cactus_juice", 6, 2.4f, false, new PotionEffect(MobEffects.NAUSEA, (60*20), 0, false, false));





	public static void registerRenders() {
		// TODO Auto-generated method stub
		
	}
}
