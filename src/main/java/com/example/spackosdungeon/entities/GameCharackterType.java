package com.example.spackosdungeon.entities;

import java.util.List;
import java.util.Random;

public class GameCharackterType {
    Types charackterType;

    String attackName;
    String attackDescription;
    Integer damage;

    String defenseName;
    String defenseDescription;
    Integer defensePower;


    String delimiter = "____________________________________________________________________ \n";
    String breakLine = "\n";
    Enum charakterType;

    Integer lifepoints;
    Integer strength;
    Integer agility;

    Boolean isAlive = true;
    List<Item> bag;


    public void hit(int damage){
        //

    }

    public Integer hitEnemy(){

        //TODO[] implement randomNumber in range
        return rollTheDice() * 5;
    }

    void putItemInBag(Item item){
        bag.add(item);
    }



    Integer attack(){
        return this.damage * rollTheDice();
    }

    Integer defend(){
        return this.defensePower * rollTheDice();
    }

    Integer rollTheDice(){
        Random random = new Random(); // Eine Instanz von Random erstellen


        int dice = 1 + random.nextInt(12); // Generiert eine zufällige Ganzzahl zwischen 0 (inklusive) und 100 (inklusive)

        return dice;
    }
}
