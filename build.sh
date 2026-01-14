#!/bin/bash

# Unique Potions Mod Build Script
# This script builds the mod jar file using Gradle

echo "========================================="
echo "Unique Potions Mod - Build Script"
echo "========================================="
echo ""

# Check if gradlew exists
if [ ! -f "./gradlew" ]; then
    echo "Error: gradlew not found in current directory"
    echo "Please run this script from the mod root directory"
    exit 1
fi

# Make gradlew executable
chmod +x ./gradlew

echo "Cleaning previous builds..."
./gradlew clean

if [ $? -ne 0 ]; then
    echo ""
    echo "Error: Clean failed"
    exit 1
fi

echo ""
echo "Building mod jar..."
./gradlew build

if [ $? -ne 0 ]; then
    echo ""
    echo "Error: Build failed"
    exit 1
fi

echo ""
echo "========================================="
echo "Build completed successfully!"
echo "========================================="
echo ""
echo "Output jar files can be found in:"
echo "  build/libs/"
echo ""

# List the jar files
if [ -d "build/libs" ]; then
    echo "Generated files:"
    ls -lh build/libs/*.jar
    echo ""
    
    # Find the main jar (not sources)
    MAIN_JAR=$(ls build/libs/*.jar | grep -v sources | head -n 1)
    if [ -n "$MAIN_JAR" ]; then
        echo "Main mod jar: $MAIN_JAR"
        echo "File size: $(du -h "$MAIN_JAR" | cut -f1)"
    fi
fi

echo ""
echo "To install the mod:"
echo "  1. Install NeoForge 21.1.72+ for Minecraft 1.21.1"
echo "  2. Copy the jar file to your mods folder"
echo "  3. Launch Minecraft"
echo ""
