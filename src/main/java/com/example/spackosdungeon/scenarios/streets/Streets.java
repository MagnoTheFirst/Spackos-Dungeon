package com.example.spackosdungeon.scenarios.streets;

import java.util.ArrayList;

/**
 * Each street can hold multiple scenarios which can be buildings, structures and other stuff
 * */
public class Streets extends Scenario{


    ArrayList<Scenario> scenarios = new ArrayList<>();

    public Streets(ScenarioObjectTypes scenarioObjectTypes, String plaza_variable_description, String custom_description, String scenario_description) {
        super(scenarioObjectTypes, plaza_variable_description, custom_description, scenario_description);
    }

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
