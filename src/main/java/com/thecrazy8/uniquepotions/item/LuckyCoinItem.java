package com.thecrazy8.uniquepotions.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class LuckyCoinItem extends Item {
	private static final Random RANDOM = new Random();

	public LuckyCoinItem(Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack itemStack = player.getItemInHand(hand);

		if (!level.isClientSide) {
			// Give a random beneficial effect
			MobEffectInstance effect = getRandomBeneficialEffect();
			player.addEffect(effect);

			// Consume the lucky coin
			if (!player.getAbilities().instabuild) {
				itemStack.shrink(1);
			}
		}

		return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
	}

	private MobEffectInstance getRandomBeneficialEffect() {
		// Array of beneficial effects with durations
		MobEffectInstance[] effects = {
			new MobEffectInstance(MobEffects.REGENERATION, 400, 1), // 20 seconds, level 2
			new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0), // 60 seconds, level 1
			new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), // 60 seconds
			new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), // 60 seconds, level 2
			new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), // 60 seconds, level 2
			new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), // 30 seconds, level 2
			new MobEffectInstance(MobEffects.LUCK, 2400, 2), // 120 seconds, level 3
			new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1), // 60 seconds, level 2
			new MobEffectInstance(MobEffects.JUMP, 1200, 2), // 60 seconds, level 3
			new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0) // 60 seconds
		};

		return effects[RANDOM.nextInt(effects.length)];
	}
}
