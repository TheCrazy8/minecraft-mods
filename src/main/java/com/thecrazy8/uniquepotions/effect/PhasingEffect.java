package com.thecrazy8.uniquepotions.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PhasingEffect extends MobEffect {
	public PhasingEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		if (entity instanceof Player player) {
			// Enable noclip-like behavior by allowing movement through blocks
			// This is simplified - in a full implementation would use mixins
			player.noPhysics = true;
		}
		return true;
	}

	@Override
	public void onEffectAdded(LivingEntity entity, int amplifier) {
		if (entity instanceof Player player) {
			player.noPhysics = true;
		}
	}

	@Override
	public void onMobRemoved(LivingEntity entity, int amplifier, net.minecraft.world.effect.MobEffectInstance.OnRemovalReason reason) {
		if (entity instanceof Player player) {
			player.noPhysics = false;
			// Safety check: if player is below Y=0 (void), teleport them to safety
			if (player.getY() < player.level().getMinBuildHeight()) {
				player.teleportTo(player.getX(), player.level().getMinBuildHeight() + 10, player.getZ());
			}
		}
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
