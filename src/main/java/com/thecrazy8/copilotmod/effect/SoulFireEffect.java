package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SoulFireEffect extends MobEffect {
	public SoulFireEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Deal soul fire damage over time
		if (!entity.fireImmune()) {
			entity.hurt(entity.damageSources().inFire(), 2.0f * (amplifier + 1));
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		// Damage every 20 ticks (1 second)
		return duration % 20 == 0;
	}
}
