package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class PhasingEffect extends StatusEffect {
	public PhasingEffect(StatusEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		if (entity instanceof PlayerEntity player) {
			// Enable noclip-like behavior by allowing movement through blocks
			// This is simplified - in a full implementation would use mixins
			player.noClip = true;
		}
	}

	@Override
	public void onRemoved(LivingEntity entity) {
		if (entity instanceof PlayerEntity player) {
			player.noClip = false;
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
