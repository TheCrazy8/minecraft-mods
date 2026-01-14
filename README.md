# Unique Potions Mod

A Minecraft NeoForge mod that adds a bunch of unique potion effects and potions to enhance gameplay.

## Features

This mod adds 8 new unique potion effects and their corresponding potions:

### Potion Effects

1. **Freezing** - Slows movement significantly and deals cold damage over time
   - Available in: Normal, Long, Strong variants
   
2. **Phasing** - Allows movement through blocks (noclip)
   - Available in: Normal, Long variants
   
3. **Berserk** - Increases attack damage, attack speed, and movement speed
   - Available in: Normal, Long, Strong variants
   
4. **Magnetic** - Pulls nearby items towards the player
   - Available in: Normal, Long, Strong variants
   
5. **Lightweight** - Increases movement speed and reduces fall damage
   - Available in: Normal, Long variants
   
6. **Recall** - Teleports the player back to their spawn point when the effect expires
   - Available in: Normal variant
   
7. **Vampiric** - Provides slow regeneration over time
   - Available in: Normal, Long, Strong variants
   
8. **Decay** - Deals magic damage over time
   - Available in: Normal, Long, Strong variants

## Building

This mod requires:
- Minecraft 1.21.1
- NeoForge 21.1.72+
- Java 21

To build:
```bash
./gradlew build
```

The compiled mod jar will be in `build/libs/`.

## Installation

1. Install NeoForge for Minecraft 1.21.1
2. Place this mod jar in your mods folder
3. Launch Minecraft with the NeoForge profile

## Usage

Potions can be obtained through creative mode or by using commands:
```
/effect give @p unique_potions:freezing
/effect give @p unique_potions:phasing
/effect give @p unique_potions:berserk
/effect give @p unique_potions:magnetic
/effect give @p unique_potions:lightweight
/effect give @p unique_potions:recall
/effect give @p unique_potions:vampiric
/effect give @p unique_potions:decay
```

## License

MIT

