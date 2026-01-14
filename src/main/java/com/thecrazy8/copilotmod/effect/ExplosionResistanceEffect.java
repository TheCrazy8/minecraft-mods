package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ExplosionResistanceEffect extends MobEffect {
	public ExplosionResistanceEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// The actual explosion resistance would be handled via damage reduction in a mixin
		// This is a placeholder for the effect tick
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return false; // No periodic ticking needed
	}
}
