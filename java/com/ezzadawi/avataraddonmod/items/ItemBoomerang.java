package com.ezzadawi.avataraddonmod.items;

import com.ezzadawi.avataraddonmod.Main;
import com.ezzadawi.avataraddonmod.entities.projectile.EntityBoomerang;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemBoomerang extends Item
{
		

	public ItemBoomerang()
    {
        this.maxStackSize = 100;
		
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.BLOCK_STONE_HIT, SoundCategory.NEUTRAL, 8.0F, 7.9F / (itemRand.nextFloat() * 6.0F + 12.0F));

        if (!worldIn.isRemote)
        {
            EntityBoomerang entityboomerang = new EntityBoomerang(worldIn, playerIn);
            entityboomerang.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityboomerang);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}