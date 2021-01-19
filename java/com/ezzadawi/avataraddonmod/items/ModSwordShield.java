package com.ezzadawi.avataraddonmod.items;

import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import com.ezzadawi.avataraddonmod.Main;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModSwordShield extends ItemBase

{
	 private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
	    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};
		private float attackDamage;
		private float attackSpeed;
		private float efficiency;

	    protected ModSwordShield(Item.ToolMaterial material)
	    {
	        super(material, EFFECTIVE_ON);
	        this.attackDamage = ATTACK_DAMAGES[material.ordinal()];
	        this.attackSpeed = ATTACK_SPEEDS[material.ordinal()];
	    }

	    protected ModSwordShield(Item.ToolMaterial material, float damage, float speed)
	    {
	        super(material, EFFECTIVE_ON);
	        this.attackDamage = damage;
	        this.attackSpeed = speed;
	    }

	    public float getDestroySpeed(ItemStack stack, IBlockState state)
	    {
	        Material material = state.getMaterial();
	        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
	    };

	public ModSwordShield(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	

        this.maxStackSize = 1;
        this.setCreativeTab(Main.watertribearmory);
        this.setMaxDamage(600);
        this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
        BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(this, ItemArmor.DISPENSER_BEHAVIOR);
	   
	}
	
	public String getItemStackDisplayName(ItemStack stack)
    {
        if (stack.getSubCompound("BlockEntityTag") != null)
        {
            EnumDyeColor enumdyecolor = TileEntityBanner.getColor(stack);
            return I18n.translateToLocal("item.shield." + enumdyecolor.getUnlocalizedName() + ".name");
        }
        else
        {
            return I18n.translateToLocal("item.shield.name");
        }
    }
	
	
	 @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	    {
	        ItemBanner.appendHoverTextFromTileEntityTag(stack, tooltip);
	    }
	 
	 
	 public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.BLOCK;
	    }
	 
	 public int getMaxItemUseDuration(ItemStack stack)
	    {
	        return 72000;
	    }

	
	
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);
	        playerIn.setActiveHand(handIn);
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	    }
	 
	 public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	    {
	        return repair.getItem() == Item.getItemFromBlock(Blocks.PLANKS) ? true : super.getIsRepairable(toRepair, repair);
	    }
		
}
	

   
