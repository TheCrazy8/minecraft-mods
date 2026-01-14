package com.thecrazy8.uniquepotions;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
	// Register for Blocks
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, UniquePotionsMod.MOD_ID);

	// Enchanted Crystal Block - A decorative glowing block
	public static final DeferredHolder<Block, Block> ENCHANTED_CRYSTAL_BLOCK = BLOCKS.register("enchanted_crystal_block",
		() -> new Block(BlockBehaviour.Properties.of()
			.strength(3.0f, 6.0f)
			.sound(SoundType.GLASS)
			.lightLevel(state -> 15) // Maximum light level (like a torch)
			.requiresCorrectToolForDrops()));
}
