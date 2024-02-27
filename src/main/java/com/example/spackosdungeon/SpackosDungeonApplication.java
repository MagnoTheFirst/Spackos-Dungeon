package com.example.spackosdungeon;

import com.example.spackosdungeon.config.ConsoleColors;
import com.example.spackosdungeon.entities.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
//TODO[] Nach AKT 1 kommt das Setup der Spieler.
@SpringBootApplication
public class SpackosDungeonApplication {
    String testDoors = """
                        |||||||||||||           |||||||||||||           |||||||||||||
                        ||         ||           ||         ||           ||         ||
                        ||         ||           ||         ||           ||         ||
                        ||         ||           ||         ||           ||         ||
                        ||_________||           ||         ||           ||         ||
                        ||     --o ||           ||     --o ||           ||     --o ||
                        ||---------||           ||         ||           ||         ||
                        ||         ||           ||         ||           ||         ||                                                                                                                          
            
            """;
    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpackosDungeonApplication.class, args);
        System.out.println(ConsoleColors.ANSI_RED + "This text is colored" + ConsoleColors.ANSI_RESET);
        System.out.println(ConsoleColors.ANSI_BLUE + "This text is colored" + ConsoleColors.ANSI_RESET);
        System.out.println( "\033[41m" + ConsoleColors.ANSI_PURPLE + "This text is colored" + ConsoleColors.ANSI_RESET);
        Game game = new Game();
        game.startGame();

    }

}
