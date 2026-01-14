@echo off
REM Unique Potions Mod Build Script
REM This script builds the mod jar file using Gradle

echo =========================================
echo Unique Potions Mod - Build Script
echo =========================================
echo.

REM Check if gradlew.bat exists
if not exist "gradlew.bat" (
    echo Error: gradlew.bat not found in current directory
    echo Please run this script from the mod root directory
    pause
    exit /b 1
)

echo Cleaning previous builds...
call gradlew.bat clean

if errorlevel 1 (
    echo.
    echo Error: Clean failed
    pause
    exit /b 1
)

echo.
echo Building mod jar...
call gradlew.bat build

if errorlevel 1 (
    echo.
    echo Error: Build failed
    pause
    exit /b 1
)

echo.
echo =========================================
echo Build completed successfully!
echo =========================================
echo.
echo Output jar files can be found in:
echo   build\libs\
echo.

REM List the jar files
if exist "build\libs" (
    echo Generated files:
    dir /b build\libs\*.jar
    echo.
)

echo.
echo To install the mod:
echo   1. Install NeoForge 21.1.72+ for Minecraft 1.21.1
echo   2. Copy the jar file to your mods folder
echo   3. Launch Minecraft
echo.

pause
