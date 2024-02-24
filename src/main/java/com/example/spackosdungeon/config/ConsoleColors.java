package com.example.spackosdungeon.config;

import com.example.spackosdungeon.entities.Player;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ConsoleColors {
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String BACKGROUND_RED = "\033[41m";
    public static final String BACKGROUND_GREEN = "\033[42m";
    public static final String BACKGROUND_YELLOW = "\033[43m";
    public static final String BACKGROUND_BLUE = "\033[44m";
    public static final String BACKGROUND_MAGENTA = "\033[45m";
    public static final String BACKGROUND_CYAN = "\033[46m";
    public static final String BACKGROUND_WHITE = "\033[47m";


    public static void playBackgroundMusic() {
        String backgroundMusic = "./src/main/audio/Dead Wrong - Jeremy Blake.mp3";
    }
}
