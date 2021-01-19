package com.ezzadawi.avataraddonmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ezzadawi.avataraddonmod.blocks.BlockBase;
import com.ezzadawi.avataraddonmod.blocks.MetalBlock;
import com.ezzadawi.avataraddonmod.blocks.MetalOre;
import com.ezzadawi.avataraddonmod.blocks.Meteorite;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block METAL_BLOCK = new MetalBlock("metal_block", Material.IRON);
	public static final Block METAL_ORE = new MetalOre("metal_ore", Material.ROCK);
	public static final Block METEORITE = new Meteorite("meteorite", Material.ROCK);

	
	
}
