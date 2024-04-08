package com.example.spackosdungeon.levels.streets;

public class Streets {

    final String BASIC_DESCRIPTION_FORWARD = "Ihr macht ein Paar Schritte und seht ";
    final String BASIC_DESCRIPTION_BACKWARD = "Ihr geht in die Richtung zurück aus der ihr gekommen seid ";
    final String BASIC_DESCRIPTION_RIGHT = "Ihr biegt rechts ab und seht ";
    final String BASIC_DESCRIPTION_LEFT = "Ihr biegt links ab und seht ";
    final String BUILDING_DESCRIPTION = "Ihr seht ein Gebäude ";
    public String plaza_variable_description = "";
    final String PLAZA_DESCRIPTION = "Ihr kommt an einen Platz, ";


    public String getBASIC_DESCRIPTION_FORWARD() {
        return BASIC_DESCRIPTION_FORWARD;
    }

    public String getBASIC_DESCRIPTION_BACKWARD() {
        return BASIC_DESCRIPTION_BACKWARD;
    }

    public String getBASIC_DESCRIPTION_RIGHT() {
        return BASIC_DESCRIPTION_RIGHT;
    }

    public String getBASIC_DESCRIPTION_LEFT() {
        return BASIC_DESCRIPTION_LEFT;
    }

    public String getBUILDING_DESCRIPTION() {
        return BUILDING_DESCRIPTION;
    }

    public String getPlaza_variable_description() {
        return plaza_variable_description;
    }

    public String getPLAZA_DESCRIPTION() {
        return PLAZA_DESCRIPTION+plaza_variable_description;
    }

    public void setPlaza_variable_description(String plaza_variable_description) {
        this.plaza_variable_description = plaza_variable_description;
    }
}
