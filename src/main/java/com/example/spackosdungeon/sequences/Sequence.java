package com.example.spackosdungeon.sequences;

import com.example.spackosdungeon.config.ConsoleColors;
import com.example.spackosdungeon.entities.Game;
import com.example.spackosdungeon.entities.Player;
import com.example.spackosdungeon.scenarios.streets.Scenario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Sequence {
    public static Player player1 = Game.player1;
    public static Player player2 = Game.player2;
    public static Boolean isOver = false;
    public boolean isMoving = true;
    public static String CONSOLE_COLOR = ConsoleColors.ANSI_BLUE;
    public static final String DELIMITER = "____________________________________________________________________\n";
    public static final String BREAKELINE = "\n";
    public List<Scenario> scenarioList = new LinkedList<>();

    public Integer reade_input_numeric_choice(String input_text) throws IOException {
        System.out.println(DELIMITER + BREAKELINE + DELIMITER);
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println(ConsoleColors.ANSI_BLUE );
        System.out.println(input_text);

        String input = reader.readLine().toString();

        return Integer.parseInt(input);
    }

    public String read_string_input(String input_text) throws IOException {
        System.out.println(DELIMITER + BREAKELINE + DELIMITER);
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println(ConsoleColors.ANSI_BLUE );
        System.out.println(input_text);

        String input = reader.readLine().toString();
        return input;
    }

    public Player getPlayer1(){
        return this.player1;
    }

    public Player getPlayer2(){
        return this.player2;
    }

    public String outro(){
        return "EMPTY";
    }

    public String checkDirection(String direction, String forward, String backward, String right, String left){
        switch(direction){
            case "w":
                return forward;
            case "s":
                return backward;
            case "a":
                return left;
            case "d":
                return right;
            default:
                return "Ungültige Eingabe";
        }
    }

    public void sequence_loop(){
        Scenario currentScenario
        while(isMoving == true){
            check
        }
    }
}
