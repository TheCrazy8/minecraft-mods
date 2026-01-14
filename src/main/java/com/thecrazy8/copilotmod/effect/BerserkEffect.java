package com.thecrazy8.copilotmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class BerserkEffect extends MobEffect {
	public BerserkEffect(MobEffectCategory category, int color) {
		super(category, color);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "648d7064-6a60-4f59-8abe-c2c23a6dd7a9", 4.0, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, "55fced67-e92a-486e-9800-b47f202c4386", 0.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.15, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Additional berserk logic could be added here
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return false; // Attributes handle the effect automatically
	}
}
