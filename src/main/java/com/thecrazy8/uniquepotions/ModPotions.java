package com.thecrazy8.uniquepotions;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
	// Register for Potions
	public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(BuiltInRegistries.POTION, UniquePotionsMod.MOD_ID);

	// Define custom potions - Freezing
	public static final DeferredHolder<Potion, Potion> FREEZING_POTION = POTIONS.register("freezing",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.FREEZING, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_FREEZING_POTION = POTIONS.register("long_freezing",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.FREEZING, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_FREEZING_POTION = POTIONS.register("strong_freezing",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.FREEZING, 900, 1)));

	// Phasing
	public static final DeferredHolder<Potion, Potion> PHASING_POTION = POTIONS.register("phasing",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.PHASING, 1200, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_PHASING_POTION = POTIONS.register("long_phasing",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.PHASING, 2400, 0)));

	// Berserk
	public static final DeferredHolder<Potion, Potion> BERSERK_POTION = POTIONS.register("berserk",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.BERSERK, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_BERSERK_POTION = POTIONS.register("long_berserk",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.BERSERK, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_BERSERK_POTION = POTIONS.register("strong_berserk",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.BERSERK, 900, 1)));

	// Magnetic
	public static final DeferredHolder<Potion, Potion> MAGNETIC_POTION = POTIONS.register("magnetic",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.MAGNETIC, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_MAGNETIC_POTION = POTIONS.register("long_magnetic",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.MAGNETIC, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_MAGNETIC_POTION = POTIONS.register("strong_magnetic",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.MAGNETIC, 900, 1)));

	// Lightweight
	public static final DeferredHolder<Potion, Potion> LIGHTWEIGHT_POTION = POTIONS.register("lightweight",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.LIGHTWEIGHT, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_LIGHTWEIGHT_POTION = POTIONS.register("long_lightweight",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.LIGHTWEIGHT, 3600, 0)));

	// Recall
	public static final DeferredHolder<Potion, Potion> RECALL_POTION = POTIONS.register("recall",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.RECALL, 100, 0)));

	// Vampiric
	public static final DeferredHolder<Potion, Potion> VAMPIRIC_POTION = POTIONS.register("vampiric",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.VAMPIRIC, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_VAMPIRIC_POTION = POTIONS.register("long_vampiric",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.VAMPIRIC, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_VAMPIRIC_POTION = POTIONS.register("strong_vampiric",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.VAMPIRIC, 900, 1)));

	// Decay
	public static final DeferredHolder<Potion, Potion> DECAY_POTION = POTIONS.register("decay",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.DECAY, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_DECAY_POTION = POTIONS.register("long_decay",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.DECAY, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_DECAY_POTION = POTIONS.register("strong_decay",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.DECAY, 900, 1)));

	// Gravity
	public static final DeferredHolder<Potion, Potion> GRAVITY_POTION = POTIONS.register("gravity",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.GRAVITY, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_GRAVITY_POTION = POTIONS.register("long_gravity",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.GRAVITY, 3600, 0)));

	// Explosion Resistance
	public static final DeferredHolder<Potion, Potion> EXPLOSION_RESISTANCE_POTION = POTIONS.register("explosion_resistance",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.EXPLOSION_RESISTANCE, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_EXPLOSION_RESISTANCE_POTION = POTIONS.register("long_explosion_resistance",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.EXPLOSION_RESISTANCE, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_EXPLOSION_RESISTANCE_POTION = POTIONS.register("strong_explosion_resistance",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.EXPLOSION_RESISTANCE, 900, 1)));

	// Reach
	public static final DeferredHolder<Potion, Potion> REACH_POTION = POTIONS.register("reach",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.REACH, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_REACH_POTION = POTIONS.register("long_reach",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.REACH, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_REACH_POTION = POTIONS.register("strong_reach",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.REACH, 900, 1)));

	// Thorns
	public static final DeferredHolder<Potion, Potion> THORNS_POTION = POTIONS.register("thorns",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.THORNS, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_THORNS_POTION = POTIONS.register("long_thorns",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.THORNS, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_THORNS_POTION = POTIONS.register("strong_thorns",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.THORNS, 900, 1)));

	// Mining Speed
	public static final DeferredHolder<Potion, Potion> MINING_SPEED_POTION = POTIONS.register("mining_speed",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.MINING_SPEED, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_MINING_SPEED_POTION = POTIONS.register("long_mining_speed",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.MINING_SPEED, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_MINING_SPEED_POTION = POTIONS.register("strong_mining_speed",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.MINING_SPEED, 900, 1)));

	// Soul Fire
	public static final DeferredHolder<Potion, Potion> SOUL_FIRE_POTION = POTIONS.register("soul_fire",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.SOUL_FIRE, 1800, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_SOUL_FIRE_POTION = POTIONS.register("long_soul_fire",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.SOUL_FIRE, 3600, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_SOUL_FIRE_POTION = POTIONS.register("strong_soul_fire",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.SOUL_FIRE, 900, 1)));

	// Levitation
	public static final DeferredHolder<Potion, Potion> LEVITATION_POTION = POTIONS.register("levitation",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.LEVITATION, 1200, 0)));
	public static final DeferredHolder<Potion, Potion> LONG_LEVITATION_POTION = POTIONS.register("long_levitation",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.LEVITATION, 2400, 0)));
	public static final DeferredHolder<Potion, Potion> STRONG_LEVITATION_POTION = POTIONS.register("strong_levitation",
		() -> new Potion(new MobEffectInstance(UniquePotionsMod.LEVITATION, 600, 1)));
}
