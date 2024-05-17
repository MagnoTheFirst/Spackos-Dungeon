package com.example.spackosdungeon.scenarios.streets.village.kimigakure;

import com.example.spackosdungeon.config.ConsoleColors;
import com.example.spackosdungeon.entities.Player;
import com.example.spackosdungeon.scenarios.streets.ScenarioObjectTypes;
import com.example.spackosdungeon.scenarios.streets.Streets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Village {

    boolean moving = true;
    Player player1;
    Player player2;


    Streets streets1;
    Streets streets2;
    Streets streets3;
    Streets streets4;
    Streets streets5;
    Streets streets6;
    Streets streets7;
    Streets streets8;
    Streets streets9;


    public int ID;

    public Village(Streets streets1, Streets streets2, Streets streets3, Streets streets4, Streets streets5, Streets streets6, Streets streets7, Streets streets8, Streets streets9, String NAME, String DESCRIPTION, Player player1, Player player2) {
        this.streets1 = streets1;
        this.streets2 = streets2;
        this.streets3 = streets3;
        this.streets4 = streets4;
        this.streets5 = streets5;
        this.streets6 = streets6;
        this.streets7 = streets7;
        this.streets8 = streets8;
        this.streets9 = streets9;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.player1 = player1;
        this.player2 = player2;
    }

    Streets[][] villageStreets = {{streets1,streets2,streets3},{streets4,streets5,streets6},{streets7,streets8,streets9}};
    public final String NAME;
    public final String DESCRIPTION;

    List<Streets> streets = new LinkedList<>();

    public Village(String NAME, String DESCRIPTION, int ID) {
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.ID = ID;
    }

    public void add_street_to_village(Streets streets){
        this.streets.add(streets);
    }

    public Streets getStreets1() {
        return streets1;
    }

    public void setStreets1(Streets streets1) {
        this.streets1 = streets1;
    }

    public Streets getStreets2() {
        return streets2;
    }

    public void setStreets2(Streets streets2) {
        this.streets2 = streets2;
    }

    public Streets getStreets3() {
        return streets3;
    }

    public void setStreets3(Streets streets3) {
        this.streets3 = streets3;
    }

    public Streets getStreets4() {
        return streets4;
    }

    public void setStreets4(Streets streets4) {
        this.streets4 = streets4;
    }

    public Streets getStreets5() {
        return streets5;
    }

    public void setStreets5(Streets streets5) {
        this.streets5 = streets5;
    }

    public Streets getStreets6() {
        return streets6;
    }

    public void setStreets6(Streets streets6) {
        this.streets6 = streets6;
    }

    public Streets getStreets7() {
        return streets7;
    }

    public void setStreets7(Streets streets7) {
        this.streets7 = streets7;
    }

    public Streets getStreets8() {
        return streets8;
    }

    public void setStreets8(Streets streets8) {
        this.streets8 = streets8;
    }

    public Streets getStreets9() {
        return streets9;
    }

    public void setStreets9(Streets streets9) {
        this.streets9 = streets9;
    }

    public void move() throws IOException {

        System.out.println(this.DESCRIPTION);
        while(this.moving == true){

            String move ="""
                    
                    
                    Um euch im Dorf zu bewegen, wählt eine der folgenden Richtungen aus: 
                    w -> um euch nach Norden zu bewegen
                    s -> um nach Süden zu gehen
                    a -> für Westen 
                    d -> für Osten
                    
                              Norden
                     Westen            Osten
                              Süden
                    \n""" ;
            move += this.player1.move(1,0);
            String input = read_string_input(move);

        }
    }

    public static final String DELIMITER = "____________________________________________________________________\n";
    public static final String BREAKELINE = "\n";

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

    public int[] checkDirection(String direction, String forward, String backward, String right, String left){
        int[] position = new int[1];

        switch(direction){
            case "w":
                position[0]=0;
                position[1]=1;
                return position;
            case "s":
                position[0]=0;
                position[1]=-1;
                return position;
            case "a":
                position[0]=-1;
                position[1]=0;
                return position;
            case "d":
                position[0]=1;
                position[1]=0;
                return position;
            default:
                position[0]=0;
                position[1]=0;
                return position;
        }
    }
}
