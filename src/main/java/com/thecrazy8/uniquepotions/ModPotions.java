package com.thecrazy8.uniquepotions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
	// Define custom potions
	public static final Potion FREEZING_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.FREEZING, 1800, 0));
	public static final Potion LONG_FREEZING_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.FREEZING, 3600, 0));
	public static final Potion STRONG_FREEZING_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.FREEZING, 900, 1));

	public static final Potion PHASING_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.PHASING, 1200, 0));
	public static final Potion LONG_PHASING_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.PHASING, 2400, 0));

	public static final Potion BERSERK_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.BERSERK, 1800, 0));
	public static final Potion LONG_BERSERK_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.BERSERK, 3600, 0));
	public static final Potion STRONG_BERSERK_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.BERSERK, 900, 1));

	public static final Potion MAGNETIC_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.MAGNETIC, 1800, 0));
	public static final Potion LONG_MAGNETIC_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.MAGNETIC, 3600, 0));
	public static final Potion STRONG_MAGNETIC_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.MAGNETIC, 900, 1));

	public static final Potion LIGHTWEIGHT_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.LIGHTWEIGHT, 1800, 0));
	public static final Potion LONG_LIGHTWEIGHT_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.LIGHTWEIGHT, 3600, 0));

	public static final Potion RECALL_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.RECALL, 100, 0));

	public static final Potion VAMPIRIC_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.VAMPIRIC, 1800, 0));
	public static final Potion LONG_VAMPIRIC_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.VAMPIRIC, 3600, 0));
	public static final Potion STRONG_VAMPIRIC_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.VAMPIRIC, 900, 1));

	public static final Potion DECAY_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.DECAY, 1800, 0));
	public static final Potion LONG_DECAY_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.DECAY, 3600, 0));
	public static final Potion STRONG_DECAY_POTION = new Potion(new StatusEffectInstance(UniquePotionsMod.DECAY, 900, 1));

	public static void register() {
		// Register Freezing Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "freezing"), FREEZING_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_freezing"), LONG_FREEZING_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "strong_freezing"), STRONG_FREEZING_POTION);

		// Register Phasing Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "phasing"), PHASING_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_phasing"), LONG_PHASING_POTION);

		// Register Berserk Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "berserk"), BERSERK_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_berserk"), LONG_BERSERK_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "strong_berserk"), STRONG_BERSERK_POTION);

		// Register Magnetic Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "magnetic"), MAGNETIC_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_magnetic"), LONG_MAGNETIC_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "strong_magnetic"), STRONG_MAGNETIC_POTION);

		// Register Lightweight Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "lightweight"), LIGHTWEIGHT_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_lightweight"), LONG_LIGHTWEIGHT_POTION);

		// Register Recall Potion
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "recall"), RECALL_POTION);

		// Register Vampiric Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "vampiric"), VAMPIRIC_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_vampiric"), LONG_VAMPIRIC_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "strong_vampiric"), STRONG_VAMPIRIC_POTION);

		// Register Decay Potions
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "decay"), DECAY_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "long_decay"), LONG_DECAY_POTION);
		Registry.register(Registries.POTION, new Identifier(UniquePotionsMod.MOD_ID, "strong_decay"), STRONG_DECAY_POTION);

		UniquePotionsMod.LOGGER.info("Registered custom potions");
	}
}
