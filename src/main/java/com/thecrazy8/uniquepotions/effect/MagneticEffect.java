package com.thecrazy8.uniquepotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class MagneticEffect extends MobEffect {
	public MagneticEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// Pull nearby items towards the entity
		double range = 5.0 + (amplifier * 2.0);
		AABB box = new AABB(
			entity.getX() - range, entity.getY() - range, entity.getZ() - range,
			entity.getX() + range, entity.getY() + range, entity.getZ() + range
		);

		List<ItemEntity> items = entity.level().getEntitiesOfClass(ItemEntity.class, box);
		
		for (ItemEntity item : items) {
			Vec3 toEntity = entity.position().subtract(item.position());
			double distance = toEntity.length();
			// Only pull if not too close to avoid division by zero
			if (distance > 0.5) {
				Vec3 direction = toEntity.normalize();
				item.setDeltaMovement(item.getDeltaMovement().add(direction.scale(0.1)));
			}
		}
		return true;
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
