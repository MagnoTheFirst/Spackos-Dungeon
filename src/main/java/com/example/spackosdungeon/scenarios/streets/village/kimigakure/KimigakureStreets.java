package com.example.spackosdungeon.scenarios.streets.village.kimigakure;

import com.example.spackosdungeon.scenarios.streets.ScenarioObjectTypes;
import com.example.spackosdungeon.scenarios.streets.Streets;

public class KimigakureStreets extends Streets {

    //TODO[] reduce to one description per street and direction and put it into a List in the village Object
    public KimigakureStreets(ScenarioObjectTypes scenarioObjectTypes, String plaza_variable_description, String custom_description, String scenario_description) {
        super(scenarioObjectTypes, plaza_variable_description, custom_description, scenario_description);
    }

    final String FORWARD_STREET_1 =  getBASIC_DESCRIPTION_FORWARD() +"""
            Strasse vorne 1
            """;
    final String FORWARD_STREET_2 = getBASIC_DESCRIPTION_FORWARD() + """
            Strasse vorne 2
            """;
    final String FORWARD_STREET_3 = getBASIC_DESCRIPTION_FORWARD() + """
            Strasse vorne 3
            """;
    final String FORWARD_STREET_4 =  getBASIC_DESCRIPTION_FORWARD() +"""
            Strasse vorne 4
            """;
    final String RIGHT_STREET_1 =  getBASIC_DESCRIPTION_RIGHT() +"""
            Strasse rechts 1
            """;
    final String RIGHT_STREET_2 =  getBASIC_DESCRIPTION_RIGHT() +"""
            Strasse rechts 2            
            """;
    final String RIGHT_STREET_3 =  getBASIC_DESCRIPTION_RIGHT() +"""
            Strasse rechts 1            
            """;
    final String RIGHT_STREET_4 =  getBASIC_DESCRIPTION_RIGHT() +"""
            Strasse rechts 1
            """;
    final String LEFT_STREET_1 =  getBASIC_DESCRIPTION_LEFT() +"""
            Strasse links 1
            """;
    final String LEFT_STREET_2 =  getBASIC_DESCRIPTION_LEFT() +"""
            Strasse links 2
            """;
    final String LEFT_STREET_3 =  getBASIC_DESCRIPTION_LEFT() +"""
            Strasse links 3
            """;
    final String LEFT_STREET_4 = getBASIC_DESCRIPTION_LEFT() + """
            Strasse links 4
            """;
    final String BACK_TO_THE_GATE = """
            Zurück zum Tor
            """;

}
