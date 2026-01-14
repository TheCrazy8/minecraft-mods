package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class FreezingEffect extends MobEffect {
	public FreezingEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		if (entity instanceof Player player) {
			// Slow down movement significantly (simulating freezing)
			player.setDeltaMovement(player.getDeltaMovement().multiply(0.5, 1.0, 0.5));
			
			// Add freezing damage over time
			if (entity.tickCount % 40 == 0) {
				entity.hurt(entity.damageSources().freeze(), 1.0f * (amplifier + 1));
			}
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
