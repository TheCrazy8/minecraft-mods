package com.thecrazy8.uniquepotions.effect;

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
		// When the entity deals damage, it heals (handled via mixins in full implementation)
		// For simplicity, provide slow regeneration
		if (entity instanceof Player player) {
			if (entity.tickCount % 80 == 0 && player.getHealth() < player.getMaxHealth()) {
				player.heal(1.0f * (amplifier + 1));
			}
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
