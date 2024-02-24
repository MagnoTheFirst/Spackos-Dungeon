package com.example.spackosdungeon.entities;

import java.util.List;

public class GameCharackterType {

    Enum charakterType;

    Integer lifepoints;
    Integer strength;
    Integer agility;

    Boolean isAlive;
    List<Item> bag;


    public void hit(int damage){
        //

    }

    Integer hitEnemy(){

        //TODO[] implement randomNumber in range
        return null;
    }

    void putItemInBag(Item item){
        bag.add(item);
    }

}
