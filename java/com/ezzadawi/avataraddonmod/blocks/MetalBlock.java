package com.ezzadawi.avataraddonmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MetalBlock extends BlockBase
{
	
	public MetalBlock(String name, Material material ) {
		 
		super(name, material);
		setSoundType(SoundType.ANVIL);
		setHardness(5.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	
	
	

}
