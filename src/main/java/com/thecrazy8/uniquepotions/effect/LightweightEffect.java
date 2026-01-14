package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class LightweightEffect extends StatusEffect {
	public LightweightEffect(StatusEffectCategory category, int color) {
		super(category, color);
		// Increase movement speed
		this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", 0.25, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		// Reduce fall damage by negating some velocity
		if (!entity.isOnGround() && entity.getVelocity().y < 0) {
			entity.setVelocity(entity.getVelocity().x, entity.getVelocity().y * 0.9, entity.getVelocity().z);
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
