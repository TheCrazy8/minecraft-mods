package com.thecrazy8.uniquepotions;

import com.thecrazy8.uniquepotions.effect.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(UniquePotionsMod.MOD_ID)
public class UniquePotionsMod {
	public static final String MOD_ID = "unique_potions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Register for Status Effects
	public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, MOD_ID);

	// Original Custom Status Effects
	public static final DeferredHolder<MobEffect, MobEffect> FREEZING = MOB_EFFECTS.register("freezing", 
		() -> new FreezingEffect(MobEffectCategory.HARMFUL, 0x7CB8E8));
	public static final DeferredHolder<MobEffect, MobEffect> PHASING = MOB_EFFECTS.register("phasing",
		() -> new PhasingEffect(MobEffectCategory.BENEFICIAL, 0xE8B8E8));
	public static final DeferredHolder<MobEffect, MobEffect> BERSERK = MOB_EFFECTS.register("berserk",
		() -> new BerserkEffect(MobEffectCategory.BENEFICIAL, 0xFF4444));
	public static final DeferredHolder<MobEffect, MobEffect> MAGNETIC = MOB_EFFECTS.register("magnetic",
		() -> new MagneticEffect(MobEffectCategory.BENEFICIAL, 0x888888));
	public static final DeferredHolder<MobEffect, MobEffect> LIGHTWEIGHT = MOB_EFFECTS.register("lightweight",
		() -> new LightweightEffect(MobEffectCategory.BENEFICIAL, 0xFFFFAA));
	public static final DeferredHolder<MobEffect, MobEffect> RECALL = MOB_EFFECTS.register("recall",
		() -> new RecallEffect(MobEffectCategory.BENEFICIAL, 0xAA88FF));
	public static final DeferredHolder<MobEffect, MobEffect> VAMPIRIC = MOB_EFFECTS.register("vampiric",
		() -> new VampiricEffect(MobEffectCategory.BENEFICIAL, 0xCC0000));
	public static final DeferredHolder<MobEffect, MobEffect> DECAY = MOB_EFFECTS.register("decay",
		() -> new DecayEffect(MobEffectCategory.HARMFUL, 0x4A4A4A));

	// New Custom Status Effects
	public static final DeferredHolder<MobEffect, MobEffect> GRAVITY = MOB_EFFECTS.register("gravity",
		() -> new GravityEffect(MobEffectCategory.BENEFICIAL, 0xDDDDFF));
	public static final DeferredHolder<MobEffect, MobEffect> EXPLOSION_RESISTANCE = MOB_EFFECTS.register("explosion_resistance",
		() -> new ExplosionResistanceEffect(MobEffectCategory.BENEFICIAL, 0xFF8800));
	public static final DeferredHolder<MobEffect, MobEffect> REACH = MOB_EFFECTS.register("reach",
		() -> new ReachEffect(MobEffectCategory.BENEFICIAL, 0x88FFFF));
	public static final DeferredHolder<MobEffect, MobEffect> THORNS = MOB_EFFECTS.register("thorns",
		() -> new ThornsEffect(MobEffectCategory.BENEFICIAL, 0x44FF44));
	public static final DeferredHolder<MobEffect, MobEffect> MINING_SPEED = MOB_EFFECTS.register("mining_speed",
		() -> new MiningSpeedEffect(MobEffectCategory.BENEFICIAL, 0xFFDD44));
	public static final DeferredHolder<MobEffect, MobEffect> SOUL_FIRE = MOB_EFFECTS.register("soul_fire",
		() -> new SoulFireEffect(MobEffectCategory.HARMFUL, 0x4444FF));
	public static final DeferredHolder<MobEffect, MobEffect> LEVITATION = MOB_EFFECTS.register("levitation",
		() -> new LevitationEffect(MobEffectCategory.BENEFICIAL, 0xCCFFFF));

	public UniquePotionsMod(IEventBus modEventBus) {
		LOGGER.info("Initializing Unique Potions Mod");

		// Register Status Effects
		MOB_EFFECTS.register(modEventBus);

		// Register Potions
		ModPotions.POTIONS.register(modEventBus);

		// Register Blocks
		ModBlocks.BLOCKS.register(modEventBus);

		// Register Items
		ModItems.ITEMS.register(modEventBus);

		// Register Creative Mode Tabs
		ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

		LOGGER.info("Unique Potions Mod initialized successfully");
	}
}
