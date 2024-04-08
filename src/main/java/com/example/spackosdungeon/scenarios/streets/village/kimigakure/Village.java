package com.example.spackosdungeon.scenarios.streets.village.kimigakure;

import com.example.spackosdungeon.scenarios.streets.Streets;

import java.util.LinkedList;
import java.util.List;

public class Village {
    public final String NAME;
    public final String DESCRIPTION;
    public final int ID;
    List<Streets> streets = new LinkedList<>();

    public Village(String NAME, String DESCRIPTION, int ID) {
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.ID = ID;
    }

    public void add_street_to_village(Streets streets){
        this.streets.add(streets);
    }

}
