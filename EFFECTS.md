# Unique Potions - Effect Details

## Effect Implementations

### 1. Freezing (Harmful)
- **Color**: Light Blue (0x7CB8E8)
- **Effect**: 
  - Slows movement by 50%
  - Deals freeze damage every 2 seconds
  - Damage scales with amplifier
- **Potion Variants**: Normal (1:30), Long (3:00), Strong (0:45 at level II)

### 2. Phasing (Beneficial)
- **Color**: Light Purple (0xE8B8E8)
- **Effect**:
  - Enables noclip mode (pass through blocks)
  - Automatically disabled when effect ends
- **Potion Variants**: Normal (1:00), Long (2:00)

### 3. Berserk (Beneficial)
- **Color**: Red (0xFF4444)
- **Effect**:
  - +4 attack damage
  - +50% attack speed
  - +15% movement speed
- **Potion Variants**: Normal (1:30), Long (3:00), Strong (0:45 at level II)

### 4. Magnetic (Beneficial)
- **Color**: Gray (0x888888)
- **Effect**:
  - Pulls nearby items towards player
  - Base range: 5 blocks (scales with amplifier)
  - Items are pulled every tick
- **Potion Variants**: Normal (1:30), Long (3:00), Strong (0:45 at level II)

### 5. Lightweight (Beneficial)
- **Color**: Light Yellow (0xFFFFAA)
- **Effect**:
  - +25% movement speed
  - Reduces fall velocity by 10% while falling
  - Effectively reduces fall damage
- **Potion Variants**: Normal (1:30), Long (3:00)

### 6. Recall (Beneficial)
- **Color**: Purple (0xAA88FF)
- **Effect**:
  - Teleports player to spawn point when effect expires
  - Uses player's bed spawn if set, otherwise world spawn
- **Potion Variants**: Normal (0:05 - 5 seconds)

### 7. Vampiric (Beneficial)
- **Color**: Dark Red (0xCC0000)
- **Effect**:
  - Heals 1 HP every 4 seconds
  - Healing scales with amplifier
  - Only heals when below max health
- **Potion Variants**: Normal (1:30), Long (3:00), Strong (0:45 at level II)

### 8. Decay (Harmful)
- **Color**: Dark Gray (0x4A4A4A)
- **Effect**:
  - Deals 1.5 magic damage every 2 seconds
  - Damage scales with amplifier
  - Bypasses armor
- **Potion Variants**: Normal (1:30), Long (3:00), Strong (0:45 at level II)

## Usage in Game

All effects can be applied using commands:
```
/effect give @p unique-potions:freezing <duration> <amplifier>
/effect give @p unique-potions:phasing <duration> <amplifier>
/effect give @p unique-potions:berserk <duration> <amplifier>
/effect give @p unique-potions:magnetic <duration> <amplifier>
/effect give @p unique-potions:lightweight <duration> <amplifier>
/effect give @p unique-potions:recall <duration> <amplifier>
/effect give @p unique-potions:vampiric <duration> <amplifier>
/effect give @p unique-potions:decay <duration> <amplifier>
```

Potions are also registered and can be obtained in creative mode or through brewing (if brewing recipes are added).

## Technical Notes

- All effects are properly registered in the Minecraft registry
- Each effect has proper color coding for visual identification
- Effects support amplifier levels for increased potency
- Language files provide proper localization for English
- Potions support splash and lingering variants automatically through Minecraft's potion system
