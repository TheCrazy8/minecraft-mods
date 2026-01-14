package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class LevitationEffect extends MobEffect {
	public LevitationEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Push entity upward continuously
		double levitationStrength = 0.05 + (amplifier * 0.02);
		entity.setDeltaMovement(entity.getDeltaMovement().add(0, levitationStrength, 0));
		
		// Cap maximum upward velocity to prevent extreme speeds
		if (entity.getDeltaMovement().y > 0.8) {
			entity.setDeltaMovement(entity.getDeltaMovement().x, 0.8, entity.getDeltaMovement().z);
		}
		
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
