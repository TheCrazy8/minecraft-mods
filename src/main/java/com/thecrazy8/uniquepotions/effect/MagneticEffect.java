package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class MagneticEffect extends StatusEffect {
	public MagneticEffect(StatusEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		// Pull nearby items towards the entity
		double range = 5.0 + (amplifier * 2.0);
		Box box = new Box(
			entity.getX() - range, entity.getY() - range, entity.getZ() - range,
			entity.getX() + range, entity.getY() + range, entity.getZ() + range
		);

		List<ItemEntity> items = entity.getWorld().getEntitiesByClass(ItemEntity.class, box, item -> true);
		
		for (ItemEntity item : items) {
			Vec3d direction = entity.getPos().subtract(item.getPos()).normalize();
			item.addVelocity(direction.x * 0.1, direction.y * 0.1, direction.z * 0.1);
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
