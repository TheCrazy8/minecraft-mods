package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class VampiricEffect extends StatusEffect {
	public VampiricEffect(StatusEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		// When the entity deals damage, it heals (handled via mixins in full implementation)
		// For simplicity, provide slow regeneration
		if (entity instanceof PlayerEntity player) {
			if (entity.age % 80 == 0 && player.getHealth() < player.getMaxHealth()) {
				player.heal(1.0f * (amplifier + 1));
			}
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
