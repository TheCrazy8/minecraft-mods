package com.thecrazy8.uniquepotions;

import com.thecrazy8.uniquepotions.item.LuckyCoinItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	// Register for Items
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, UniquePotionsMod.MOD_ID);

	// Block Items
	public static final DeferredHolder<Item, Item> ENCHANTED_CRYSTAL_BLOCK_ITEM = ITEMS.register("enchanted_crystal_block",
		() -> new BlockItem(ModBlocks.ENCHANTED_CRYSTAL_BLOCK.get(), new Item.Properties()));

	// Custom Items
	public static final DeferredHolder<Item, Item> LUCKY_COIN = ITEMS.register("lucky_coin",
		() -> new LuckyCoinItem(new Item.Properties().stacksTo(16)));
}
