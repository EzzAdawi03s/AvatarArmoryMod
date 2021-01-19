package com.ezzadawi.avataraddonmod.events;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;

public class EventExample 
{
	public void exampleEvent(HarvestDropsEvent event)
	{
		World world = event.getWorld();
		EntityPlayer player = event.getHarvester();
		BlockPos pos = event.getPos();
		IBlockState state = event.getState();
		Block block = state.getBlock();
		Item item = Item.getItemFromBlock(block);
		int fotuneLevel = event.getFortuneLevel();
		boolean isSilkTouching = event.isSilkTouching();
		boolean isCancelable = event.isCancelable();
		boolean isCanceld = event.isCanceled();
		EventPriority priority = event.getPhase();
		float dropChance = event.getDropChance();
		
		
	}
}
