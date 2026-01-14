package com.thecrazy8.uniquepotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class ReachEffect extends MobEffect {
	public ReachEffect(MobEffectCategory category, int color) {
		super(category, color);
		// Increase block reach distance
		this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, "E4D89A2B-3F7C-4E1A-9B8D-6C2F1A4E7B9C", 2.0, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE, "F5E9AB3C-4G8D-5F2B-AC9E-7D3G2B5F8CAD", 2.0, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Reach is handled by attribute modifiers
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return false; // No periodic ticking needed
	}
}
