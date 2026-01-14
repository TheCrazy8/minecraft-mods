package com.thecrazy8.copilotmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
	// Register for Creative Mode Tabs
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
		DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CopilotMod.MOD_ID);

	// Custom Creative Tab
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COPILOT_MOD_TAB = CREATIVE_MODE_TABS.register("copilotmod_tab",
		() -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup.copilotmod"))
			.icon(() -> new ItemStack(ModItems.LUCKY_COIN.get()))
			.displayItems((parameters, output) -> {
				// Add all our custom items
				output.accept(ModItems.ENCHANTED_CRYSTAL_BLOCK_ITEM.get());
				output.accept(ModItems.LUCKY_COIN.get());
			})
			.build());
}
