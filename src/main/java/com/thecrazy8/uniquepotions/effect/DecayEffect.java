package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DecayEffect extends StatusEffect {
	public DecayEffect(StatusEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		// Gradually reduces max health and deals damage over time
		if (entity.age % 40 == 0) {
			entity.damage(entity.getDamageSources().magic(), 1.5f * (amplifier + 1));
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
