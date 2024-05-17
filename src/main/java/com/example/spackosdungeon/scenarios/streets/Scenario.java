package com.example.spackosdungeon.scenarios.streets;

import java.util.LinkedList;
import java.util.List;

public class Scenario {

    ScenarioObjectTypes scenarioObjectTypes;
    final String BASIC_DESCRIPTION_FORWARD = "Ihr macht ein Paar Schritte und seht ";
    final String BASIC_DESCRIPTION_BACKWARD = "Ihr geht in die Richtung zurück aus der ihr gekommen seid ";
    final String BASIC_DESCRIPTION_RIGHT = "Ihr biegt rechts ab und seht ";
    final String BASIC_DESCRIPTION_LEFT = "Ihr biegt links ab und seht ";
    final String BUILDING_DESCRIPTION = "Ihr seht ein Gebäude ";
    public String plaza_variable_description = "";
    final String PLAZA_DESCRIPTION = "Ihr kommt an einen Platz, ";
    public String custom_description = "";

    //FOR DEV
    public String scenario_description = """
            """;

    public Scenario(ScenarioObjectTypes scenarioObjectTypes, String plaza_variable_description, String custom_description, String scenario_description) {
        this.scenarioObjectTypes = scenarioObjectTypes;
        this.plaza_variable_description = plaza_variable_description;
        this.custom_description = custom_description;
        this.scenario_description = scenario_description;
    }

    //TODO[] to be completed
    public Scenario load_scenario(ScenarioObjectTypes snecrarioType, int scenarioIdentifier, int previousScenarioIdentifier){
        return null;
    }




}
