package com.thecrazy8.uniquepotions;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
	// Register for Creative Mode Tabs
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
		DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UniquePotionsMod.MOD_ID);

	// Custom Creative Tab
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> UNIQUE_POTIONS_TAB = CREATIVE_MODE_TABS.register("unique_potions_tab",
		() -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.unique_potions"))
			.icon(() -> new ItemStack(ModItems.LUCKY_COIN.get()))
			.displayItems((parameters, output) -> {
				// Add all our custom items
				output.accept(ModItems.ENCHANTED_CRYSTAL_BLOCK_ITEM.get());
				output.accept(ModItems.LUCKY_COIN.get());
			})
			.build());
}
