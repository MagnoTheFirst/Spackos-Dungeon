package com.example.spackosdungeon.entities;

import com.example.spackosdungeon.config.ConsoleColors;

import java.io.IOException;

public class Game {
    public static Boolean isOver = false;
    String delimiter = "____________________________________________________________________";
    String breakLine = "\n";
    static final String INTRO =

            """
                                                           Spackos Dungeon \n
                    ____________________________________________________________________________________________________ \n
                                
                    Spackos Dungeon ein Spiel entwickelt von Spackos für Spackos.
                    Von den Machern von:
                    "Die einte git die angere nimmts"
                    
                    
                    Taucht ein in diese imaginäre Welt                                       
                    voller Rätsel, Abenteuer und wie wir hoffen auch Spass. 
                    
                                
                    Im Verlauf dieses Rätsels werdet ihr zwei hübschen Hinweise Sammeln. 
                    Ziel dieses Spiels ist alle Quests zu überleben um Ende das Ultimative Rätsel zu lösen, dass euch
                    zu unserem Geschenk führen wird. 
                    Jessica & Alejandro Laneri wünschen euch viel Spass, lasst die Spiele beginnen..................... 
                    ____________________________________________________________________________________________________ \n
                    """;

    public static void startGame() throws IOException {

        System.out.println(ConsoleColors.ANSI_BLUE + INTRO );
        Player player1 = new Player();

        Player player2 = new Player();
    }

    public static void setUpPlayer(){

    }


    //TODO[] SEQUENZ 1 definieren
    String sequenz1(){
        return """
                SEQUENZ 1:
                """+ delimiter + breakLine + delimiter+
                """
                Es ist Mitternacht einr wunderschönen Nacht, 
                        """;

    }

    //TODO[] SEQUENZ 2 definieren
    String sequenz2(){
        return """
                SEQUENZ 2:
                """+ delimiter + breakLine + delimiter+
                """
                 
                        """;

    }


    //TODO[] SEQUENZ 3 definieren
    String sequenz3(){
        return """
                SEQUENZ 3:
                """+ delimiter + breakLine + delimiter+
                """
                 
                        """;

    }

}
