package com.thecrazy8.uniquepotions;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thecrazy8.uniquepotions.effect.*;

public class UniquePotionsMod implements ModInitializer {
	public static final String MOD_ID = "unique-potions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Custom Status Effects
	public static final StatusEffect FREEZING = new FreezingEffect(StatusEffectCategory.HARMFUL, 0x7CB8E8);
	public static final StatusEffect PHASING = new PhasingEffect(StatusEffectCategory.BENEFICIAL, 0xE8B8E8);
	public static final StatusEffect BERSERK = new BerserkEffect(StatusEffectCategory.BENEFICIAL, 0xFF4444);
	public static final StatusEffect MAGNETIC = new MagneticEffect(StatusEffectCategory.BENEFICIAL, 0x888888);
	public static final StatusEffect LIGHTWEIGHT = new LightweightEffect(StatusEffectCategory.BENEFICIAL, 0xFFFFAA);
	public static final StatusEffect RECALL = new RecallEffect(StatusEffectCategory.BENEFICIAL, 0xAA88FF);
	public static final StatusEffect VAMPIRIC = new VampiricEffect(StatusEffectCategory.BENEFICIAL, 0xCC0000);
	public static final StatusEffect DECAY = new DecayEffect(StatusEffectCategory.HARMFUL, 0x4A4A4A);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Unique Potions Mod");

		// Register Status Effects
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "freezing"), FREEZING);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "phasing"), PHASING);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "berserk"), BERSERK);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "magnetic"), MAGNETIC);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "lightweight"), LIGHTWEIGHT);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "recall"), RECALL);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "vampiric"), VAMPIRIC);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "decay"), DECAY);

		// Register Potions
		ModPotions.register();

		LOGGER.info("Unique Potions Mod initialized successfully");
	}
}
