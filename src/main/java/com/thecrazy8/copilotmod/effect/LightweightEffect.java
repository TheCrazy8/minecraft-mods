package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class LightweightEffect extends MobEffect {
	public LightweightEffect(MobEffectCategory category, int color) {
		super(category, color);
		// Increase movement speed
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Reduce fall damage by negating some velocity
		if (!entity.onGround() && entity.getDeltaMovement().y < 0) {
			entity.setDeltaMovement(entity.getDeltaMovement().multiply(1.0, 0.9, 1.0));
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
