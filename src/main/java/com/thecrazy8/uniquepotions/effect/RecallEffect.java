package com.thecrazy8.uniquepotions.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class RecallEffect extends StatusEffect {
	public RecallEffect(StatusEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		// This effect teleports the player back to spawn when it expires
		// The actual teleport happens in onRemoved
	}

	@Override
	public void onRemoved(LivingEntity entity) {
		if (entity instanceof PlayerEntity player && entity.getWorld() instanceof ServerWorld serverWorld) {
			// Teleport to spawn point
			BlockPos spawnPos = player.getSpawnPointPosition();
			if (spawnPos != null) {
				player.teleport(serverWorld, spawnPos.getX() + 0.5, spawnPos.getY(), spawnPos.getZ() + 0.5, player.getYaw(), player.getPitch());
			} else {
				BlockPos worldSpawn = serverWorld.getSpawnPos();
				player.teleport(serverWorld, worldSpawn.getX() + 0.5, worldSpawn.getY(), worldSpawn.getZ() + 0.5, player.getYaw(), player.getPitch());
			}
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
