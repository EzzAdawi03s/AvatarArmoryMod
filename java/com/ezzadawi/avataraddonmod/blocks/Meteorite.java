package com.ezzadawi.avataraddonmod.blocks;

import java.util.Random;

import com.ezzadawi.avataraddonmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class Meteorite extends BlockBase
{

	public Meteorite(String name, Material material ) {
		 
		super(name, material);
		setSoundType(SoundType.ANVIL);
		setHardness(10.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;	
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
	    return false;
	}
}
