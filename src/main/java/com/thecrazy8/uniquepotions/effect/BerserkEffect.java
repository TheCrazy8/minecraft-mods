package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BerserkEffect extends StatusEffect {
	public BerserkEffect(StatusEffectCategory category, int color) {
		super(category, color);
		this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "648d7064-6a60-4f59-8abe-c2c23a6dd7a9", 4.0, EntityAttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "55fced67-e92a-486e-9800-b47f202c4386", 0.5, EntityAttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.15, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		// Additional berserk logic could be added here
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
