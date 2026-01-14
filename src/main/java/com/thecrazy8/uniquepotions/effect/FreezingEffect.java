package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class FreezingEffect extends StatusEffect {
	public FreezingEffect(StatusEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		if (entity instanceof PlayerEntity player) {
			// Slow down movement significantly (simulating freezing)
			player.setVelocity(player.getVelocity().multiply(0.5, 1.0, 0.5));
			
			// Add freezing damage over time
			if (entity.age % 40 == 0) {
				entity.damage(entity.getDamageSources().freeze(), 1.0f * (amplifier + 1));
			}
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
