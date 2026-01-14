# Unique Potions Mod

A Minecraft Fabric mod that adds a bunch of unique potion effects and potions to enhance gameplay.

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
- Minecraft 1.20.4
- Fabric Loader 0.15.3+
- Fabric API 0.91.2+1.20.4

To build:
```bash
./gradlew build
```

## Installation

1. Install Fabric Loader for Minecraft 1.20.4
2. Download Fabric API
3. Place this mod jar and Fabric API in your mods folder
4. Launch Minecraft with the Fabric profile

## Usage

Potions can be obtained through creative mode or by using commands:
```
/effect give @p unique-potions:freezing
/effect give @p unique-potions:phasing
/effect give @p unique-potions:berserk
/effect give @p unique-potions:magnetic
/effect give @p unique-potions:lightweight
/effect give @p unique-potions:recall
/effect give @p unique-potions:vampiric
/effect give @p unique-potions:decay
```

## License

MIT

