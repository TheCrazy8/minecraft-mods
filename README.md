# Copilot Mod

A Minecraft NeoForge mod that adds unique potion effects, custom blocks, and special items to enhance gameplay.

## Features

### Potion Effects

This mod adds **15 unique potion effects** and their corresponding potions:

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

15. **Levitation** - Makes you float upward continuously like a helium balloon
    - Available in: Normal, Long, Strong variants

### Custom Blocks

1. **Enchanted Crystal Block** - A decorative glowing block that emits maximum light (15)
   - Crafted with glass, amethyst shards, and glowstone dust
   - Has a glass-like sound and requires a proper tool to mine

### Custom Items

1. **Lucky Coin** - A consumable item that grants random beneficial effects
   - Stackable up to 16
   - Grants one of 10 different beneficial effects when used:
     - Regeneration II (20 seconds)
     - Resistance (60 seconds)  
     - Fire Resistance (60 seconds)
     - Speed II (60 seconds)
     - Haste II (60 seconds)
     - Strength II (30 seconds)
     - Luck III (120 seconds)
     - Absorption II (60 seconds)
     - Jump Boost III (60 seconds)
     - Night Vision (60 seconds)
   - Crafted with gold nuggets and a diamond

## Total Content

- **15 unique potion effects**
- **44 potion variants** (including normal, long, and strong versions)
- Each potion also has **splash** and **lingering** variants automatically
- **1 custom block** (Enchanted Crystal Block)
- **1 custom item** (Lucky Coin)
- **Custom creative mode tab** for easy access to all items

## Building

This mod requires:
- Minecraft 1.21.1
- NeoForge 21.1.72+
- Java 21

### Easy Build (Recommended)

Use the provided build scripts:

**On Linux/Mac:**
```bash
./build.sh
```

**On Windows:**
```batch
build.bat
```

These scripts will:
1. Clean previous builds
2. Build the mod jar
3. Show you where the output jar is located

### Manual Build

Alternatively, you can build manually:
```bash
./gradlew build
```

The compiled mod jar will be in `build/libs/`.

## Installation

1. Install NeoForge for Minecraft 1.21.1
2. Place this mod jar in your mods folder
3. Launch Minecraft with the NeoForge profile

## Usage

### Commands

Potions can be obtained through creative mode or by using commands:
```
/effect give @p copilotmod:freezing
/effect give @p copilotmod:phasing
/effect give @p copilotmod:berserk
/effect give @p copilotmod:magnetic
/effect give @p copilotmod:lightweight
/effect give @p copilotmod:recall
/effect give @p copilotmod:vampiric
/effect give @p copilotmod:decay
/effect give @p copilotmod:gravity
/effect give @p copilotmod:explosion_resistance
/effect give @p copilotmod:reach
/effect give @p copilotmod:thorns
/effect give @p copilotmod:mining_speed
/effect give @p copilotmod:soul_fire
/effect give @p copilotmod:levitation
```

### Creative Mode

All custom blocks and items can be found in the "Copilot Mod" creative tab.

## License

MIT

