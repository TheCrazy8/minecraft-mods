# Unique Potions Mod

A Minecraft NeoForge mod that adds a bunch of unique potion effects and potions to enhance gameplay.

## Features

This mod adds **14 new unique potion effects** and their corresponding potions:

### Original Potion Effects

1. **Freezing** - Slows movement significantly and deals cold damage over time
   - Available in: Normal, Long, Strong variants
   
2. **Phasing** - Allows movement through blocks (noclip) with void safety
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

### New Potion Effects

9. **Low Gravity** - Reduces gravity effect, slower falling
   - Available in: Normal, Long variants
   
10. **Explosion Resistance** - Provides blast protection
    - Available in: Normal, Long, Strong variants
    
11. **Extended Reach** - Increases block and entity interaction range
    - Available in: Normal, Long, Strong variants
    
12. **Thorns** - Provides armor bonus and damage reflection
    - Available in: Normal, Long, Strong variants
    
13. **Mining Speed** - Increases block breaking speed
    - Available in: Normal, Long, Strong variants
    
14. **Soul Fire** - Deals soul fire damage over time
    - Available in: Normal, Long, Strong variants

## Total Content

- **14 unique potion effects**
- **41 potion variants** (including normal, long, and strong versions)
- Each potion also has **splash** and **lingering** variants automatically

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
/effect give @p unique_potions:gravity
/effect give @p unique_potions:explosion_resistance
/effect give @p unique_potions:reach
/effect give @p unique_potions:thorns
/effect give @p unique_potions:mining_speed
/effect give @p unique_potions:soul_fire
```

## License

MIT

