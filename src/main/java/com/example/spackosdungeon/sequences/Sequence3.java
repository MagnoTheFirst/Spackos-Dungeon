package com.example.spackosdungeon.sequences;

import com.example.spackosdungeon.entities.Game;
import com.example.spackosdungeon.entities.Player;

import java.io.IOException;

public class Sequence3 extends Sequence{
    private Player player1 = Game.player1;
    private Player player2 = Game.player2;




    //TODO[] SEQUENZ 3 definieren
    void akt1() throws IOException {
        String text = "\n"+ DELIMITER + BREAKELINE + DELIMITER +"""
                AKT 3:
                """+ DELIMITER + BREAKELINE + DELIMITER +
                """
                Ihr lauft durch den Walt. In der Ferne seht ihr die grossen Tore  von Kirigakure vor dem 2 Wächter stehen. 
                Ihr nähert euch bis ihr von den Wächtern angesprochen werden. 
                
                >> Wer seid ihr und was wollt ihr hier?
                
                ** Wir sind  """ + this.player1 + " & " + this.player2 + """
                ** Mangetsu und Hongetsu schicken uns.
                ** Wir sollen euch diesen Passierschein zeigen. 
                
                >> Wenn dem wirklich so ist, dann müsstet ihr folgendes Rätsel ohne probleme lösen können nicht wahr? 
                >> Ist dem nicht so werden wir euch festnehmen. 
                
                
                
                """;

        sequenz_3_raetsel_1();
    }

    String sequenz_3_raetsel_1() throws IOException {

        String answer = read_string_input("Was hat Städte aber keine Häuser, Wälder aber keine Bäume & Flüsse aber kein Wasser?");
        if(answer.equals("Eine Karte") || answer.equals("Eine Landkarte")|| answer.equals("eine karte")
                || answer.equals("eine landkarte")||answer.equals("Ein Atlas")||answer.equals("ein Atlas")
                || answer.equals("eine Karte") || answer.equals("Eine karte") || answer.equals("Eine atlas") || answer.equals("ein Atlas")|| answer.equals("landkarte")){
            System.out.println(">> Ihr dürft passieren.");

        }
        else{
            System.out.println("Ihr werdet Festgenommen \n ------------------- GAME OVER -----------------------");
        }
        return null;
    }

    public void act_2(){

    }


    public void act_3(){

    }


    public void act_4(){



    }



}
