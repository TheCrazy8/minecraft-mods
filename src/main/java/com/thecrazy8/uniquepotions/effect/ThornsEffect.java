package com.thecrazy8.uniquepotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class ThornsEffect extends MobEffect {
	public ThornsEffect(MobEffectCategory category, int color) {
		super(category, color);
		// Increase armor for thorns effect
		this.addAttributeModifier(Attributes.ARMOR, "A1B2C3D4-E5F6-7890-ABCD-EF1234567890", 4.0, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// The actual thorns damage reflection would be handled via damage event in a mixin
		// This effect provides armor bonus and the framework for thorns
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return false; // No periodic ticking needed
	}
}
