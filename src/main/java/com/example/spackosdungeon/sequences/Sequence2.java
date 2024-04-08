package com.example.spackosdungeon.sequences;

import java.io.IOException;

public class Sequence2 extends Sequence{

    private boolean sequence_2_switch = true;

    final static String INTRO = """
            Nach der ernüchternden Erkenntniss, dass eure Suche beinahe von Vorne anfängt, beschliesst ihr die Dorfbewohner zu befragen. 
            """;
    final static String txt1 = """
             
            """;
    final static String txt2 = """
             
            """;
    public void akt1_the_search() throws IOException {
        while(this.sequence_2_switch == true){
            final String akt1 ="""
                    Ihr lauft durch das Dorf. Es wird von einer enormen Wand umrandet, die weit über die Häuser ragt. 
                    Leider unterscheiden sich die Häuser kaum von einander, doch das Dorf erscheint trotzdem in ungewohnt schönem Glanz. 
                    Sakura Bäume verzieren die Strassen durch die Ihr lauft und die Gebäude werden durch Papier Laternen geschmückt. 
                    
                    Um euch im Dorf zu bewegen, wählt eine der folgenden Richtungen aus: 
                    w -> um euch nach vorne zu bewegen
                    s -> um nach hinten zu gehen
                    a -> für links
                    d -> für rechts
                    """;
            String input = read_string_input(akt1);
        }
    }
}
