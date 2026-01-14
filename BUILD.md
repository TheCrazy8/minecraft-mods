# Building the Unique Potions Mod

This guide explains how to build the Unique Potions mod from source.

## Prerequisites

Before building, ensure you have:

1. **Java Development Kit (JDK) 21 or higher**
   - Download from: https://adoptium.net/
   - Verify installation: `java -version`

2. **Git** (to clone the repository)
   - Download from: https://git-scm.com/
   
3. **Internet connection** (for first build to download dependencies)

## Quick Build

### Option 1: Using Build Scripts (Recommended)

The easiest way to build the mod is using the provided build scripts.

#### On Linux/Mac:
```bash
./build.sh
```

#### On Windows:
```batch
build.bat
```

The scripts will:
- Clean any previous builds
- Build the mod jar file
- Display the location of the output jar
- Show file size and installation instructions

### Option 2: Using Gradle Directly

If you prefer to use Gradle directly:

#### On Linux/Mac:
```bash
./gradlew clean build
```

#### On Windows:
```batch
gradlew.bat clean build
```

## Build Output

After a successful build, you'll find the mod jar in:
```
build/libs/unique_potions-1.0.0.jar
```

There may also be a sources jar:
```
build/libs/unique_potions-1.0.0-sources.jar
```

You only need the main jar file (without `-sources`) to run the mod.

## Build Tasks

The Gradle build system supports several tasks:

### Clean Build Artifacts
```bash
./gradlew clean
```
Removes all files from previous builds.

### Build the Mod
```bash
./gradlew build
```
Compiles the code and creates the jar file.

### Run Minecraft Client (for testing)
```bash
./gradlew runClient
```
Launches Minecraft with the mod loaded for testing.

### Run Minecraft Server (for testing)
```bash
./gradlew runServer
```
Launches a Minecraft server with the mod loaded.

### Generate Data Files
```bash
./gradlew runData
```
Generates any data files needed by the mod.

## Troubleshooting

### Build Fails with "Java version" error
**Solution:** Make sure you have Java 21 or higher installed.
```bash
java -version
```

### Build Fails with "Permission denied" (Linux/Mac)
**Solution:** Make the gradlew script executable:
```bash
chmod +x gradlew
```

### Build Fails with Network Errors
**Solution:** Check your internet connection. The first build downloads dependencies from Maven repositories.

### Build is Slow
**Solution:** Gradle caches dependencies after the first build. Subsequent builds will be much faster.

### "gradlew: command not found"
**Solution:** Make sure you're in the mod's root directory and use `./gradlew` (with `./` prefix).

## Development Build

For development with auto-recompilation:

```bash
./gradlew runClient --rerun-tasks
```

This will rebuild and restart the game when you make code changes.

## Build Configuration

The build is configured in several files:

- `build.gradle` - Main build configuration
- `gradle.properties` - Version numbers and properties
- `settings.gradle` - Gradle settings and plugin repositories

## Installing the Built Mod

1. Locate the jar file in `build/libs/`
2. Install NeoForge 21.1.72+ for Minecraft 1.21.1
3. Copy the jar to your Minecraft mods folder:
   - **Windows:** `%APPDATA%\.minecraft\mods\`
   - **Linux:** `~/.minecraft/mods/`
   - **Mac:** `~/Library/Application Support/minecraft/mods/`
4. Launch Minecraft with the NeoForge profile

## Clean Build

For a completely clean build (useful when things go wrong):

```bash
./gradlew clean
rm -rf .gradle/
./gradlew build
```

This removes all cached files and starts fresh.

## Getting Help

If you encounter build issues:

1. Check the error message carefully
2. Ensure all prerequisites are installed
3. Try a clean build
4. Check that you have the latest version of the source code
5. Open an issue on GitHub with the error details

## Building for Distribution

When building for release/distribution:

1. Update version number in `gradle.properties`
2. Run a clean build: `./gradlew clean build`
3. Test the jar file in Minecraft
4. The jar in `build/libs/` is ready for distribution

## Next Steps

After building, see:
- `README.md` - General mod information
- `EFFECTS.md` - Details about each potion effect
- `IMPLEMENTATION.md` - Technical implementation details
