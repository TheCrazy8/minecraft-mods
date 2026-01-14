package com.thecrazy8.copilotmod.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class RecallEffect extends MobEffect {
	public RecallEffect(MobEffectCategory category, int color) {
		super(category, color);
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		// This effect teleports the player back to spawn when it expires
		// The actual teleport happens in onMobRemoved
		return true;
	}

	@Override
	public void onMobRemoved(LivingEntity entity, int amplifier, net.minecraft.world.effect.MobEffectInstance.OnRemovalReason reason) {
		// Only teleport if effect expired naturally, not if removed by commands/milk
		if (reason == net.minecraft.world.effect.MobEffectInstance.OnRemovalReason.EXPIRED) {
			if (entity instanceof Player player && entity.level() instanceof ServerLevel serverLevel) {
				// Teleport to spawn point
				BlockPos spawnPos = player.getRespawnPosition();
				if (spawnPos != null) {
					player.teleportTo(serverLevel, spawnPos.getX() + 0.5, spawnPos.getY(), spawnPos.getZ() + 0.5, player.getYRot(), player.getXRot());
				} else {
					BlockPos worldSpawn = serverLevel.getSharedSpawnPos();
					player.teleportTo(serverLevel, worldSpawn.getX() + 0.5, worldSpawn.getY(), worldSpawn.getZ() + 0.5, player.getYRot(), player.getXRot());
				}
			}
		}
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}
}
