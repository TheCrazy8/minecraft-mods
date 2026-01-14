package com.thecrazy8.uniquepotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class GravityEffect extends MobEffect {
	public GravityEffect(MobEffectCategory category, int color) {
		super(category, color);
		// Reduce gravity effect by modifying step height and movement
		this.addAttributeModifier(Attributes.GRAVITY, "B9C78E5A-7C1E-4B2D-8F3D-9A2B7C4E1D8F", -0.5, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Reduce fall speed
		if (!entity.onGround() && entity.getDeltaMovement().y < 0) {
			entity.setDeltaMovement(entity.getDeltaMovement().multiply(1.0, 0.7, 1.0));
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
