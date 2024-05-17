package com.example.spackosdungeon.sequences;

import com.example.spackosdungeon.scenarios.streets.definitions.KimigakureStreets;
import com.example.spackosdungeon.scenarios.streets.village.kimigakure.Village;

import java.io.IOException;
//TODO[] Fibonacci Reihe als rätsel einbauen
public class Sequence2 extends Sequence{

    private boolean sequence_2_switch = true;

    Village kimigakure = new Village(KimigakureStreets.street1, KimigakureStreets.street2,KimigakureStreets.street3,
            KimigakureStreets.street4,KimigakureStreets.street5,KimigakureStreets.street6,
            KimigakureStreets.street7,KimigakureStreets.street8,KimigakureStreets.street8,
            "KIMIGAKURE", "Ein Dorf umrandet von hohen Mauern mit 6 Wachtürmen.", this.getPlayer1(), this.getPlayer2()
    );

    public final String INTRO = """
            Nach der ernüchternden Erkenntniss, dass eure Suche beinahe von Vorne anfängt, beschliesst ihr die Dorfbewohner zu befragen. 
            """;
    final static String txt1 = """
             
            """;
    final static String txt2 = """
             
            """;
    public void akt1_the_search() throws IOException {
        String searchIntro = """
                    Ihr lauft durch das Dorf. Es wird von einer enormen Wand umrandet, die weit über die Häuser ragt. 
                    Leider unterscheiden sich die Häuser kaum von einander, doch das Dorf erscheint trotzdem in ungewohnt schönem Glanz. 
                    Sakura Bäume verzieren die Strassen durch die Ihr lauft und die Gebäude werden durch Papier Laternen geschmückt. 
                    """;
        final String akt1 ="""
                    
                    
                    Um euch im Dorf zu bewegen, wählt eine der folgenden Richtungen aus: 
                    w -> um euch nach vorne zu bewegen
                    s -> um nach hinten zu gehen
                    a -> für links
                    d -> für rechts
                    """;
        System.out.println(searchIntro);
        while(this.sequence_2_switch == true){


            String input = read_string_input(akt1);
        }
    }

    public void akt1_move_in_city() throws IOException {
        this.kimigakure.move();
    }

    public String getIntro(){
        return this.INTRO;
    }
}
