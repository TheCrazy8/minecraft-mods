package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class VampiricEffect extends MobEffect {
	public VampiricEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Provide slow regeneration
		if (entity instanceof Player player) {
			if (player.getHealth() < player.getMaxHealth()) {
				player.heal(1.0f * (amplifier + 1));
			}
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		// Heal every 4 seconds (80 ticks)
		return duration % 80 == 0;
	}
}
