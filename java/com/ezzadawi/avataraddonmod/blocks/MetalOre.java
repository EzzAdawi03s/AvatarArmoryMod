package com.ezzadawi.avataraddonmod.blocks;

import java.util.Random;

import com.ezzadawi.avataraddonmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class MetalOre extends BlockBase
{

	public MetalOre(String name, Material material ) {
		 
		super(name, material);
		setSoundType(SoundType.ANVIL);
		setHardness(5.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.METAL_INGOT;
	}
	
	
	@Override
	public int quantityDropped(Random rand) 
	{
		return 2;
	}
}
