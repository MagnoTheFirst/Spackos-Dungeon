package com.example.spackosdungeon.entities;

import com.example.spackosdungeon.config.ConsoleColors;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

public class Player extends GameCharackterType{

    public String getName() {
        return name;
    }

    String name;

    public Boolean female = false;
    List<Item> bag;
    Integer joker = 2;

    String initializeCharakterText1 =
            """
            Bitte gib den Namen ein mit dem du wünschst zu Spielen...
            
            """;
    String initializeCharakterText2 =
            """
            Bist du männlich oder weiblich?
            """
                   + breakLine + delimiter + breakLine +
            """

                    Drücke 1 wenn du weiblich bist \n
                    Drücke 2 wenn du männlich bist \n
                    """ + delimiter + breakLine ;
    String initializeCharakterText3 =

            """
            
            """;


    public Player() throws IOException {
        setupPlayer();

    }

    void died(){
        this.isAlive = false;
    }



    String getPlayerGenderText =
            """
                Spieler 1 bitte wähle einen würdigen Namen:  
            """+ delimiter + breakLine;
    String getGenderText = this.name +
            """
                  bitte wähle dein Geschlecht: """+ delimiter+ breakLine +
                 """
                 1.) Weiblich
                 2.) Männlich       
                 Alles andere gibt es nicht kein non-binär, fluent-gender oder bullshit gender.....             
            """;
    //TODO[]BUG mit den Namen die Namen werden nicht angezeigt. Die Namen müssen eher oder später zugewiesen werden
    String getCharackterType =
            """ 
            In Ordnung   
            """
                    + this.name  +
                    """
                    Nun wähle dein Element aus: 
                    """ + delimiter + breakLine +
                    """
                    1.) Feuer
                    2.) Wasser
                    3.) Wind
                    4.) Erde
                    5.) Metall
                    """ + delimiter + breakLine;

    void setupPlayer() throws IOException {

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println(ConsoleColors.ANSI_BLUE );
        System.out.println(initializeCharakterText1);

        String name = reader.readLine().toString();
        // Reading data using readLine
        this.name = name;

        System.out.println(getGenderText);
        if(Integer.parseInt(reader.readLine())==1){
            this.female = true;
        }
        else{
            this.female = false;
        }
        System.out.println(getCharackterType);

        Integer type = Integer.parseInt(reader.readLine());
        switch(type){
            case 1:
                this.charackterType = Types.VAMPIR;
                //TODO[] Name so okey?
                this.attackName = "Finsterklauen";
                this.defenseName = "Manifestation der Unsterblichkeit";

                this.attackDescription = """
                        Blitzartig löst sich dein Körper in dunklen Rauch auf. 
                        Mit einem heftigen Windstoss rauschst du auf deinen Gegner zu um ihn mit deinen Klauen zu verletzen."""+ breakLine ;
                this.defenseDescription =
                        """
                        Pfeile, Speere und Schwerter können dir nichts anhaben. Deine Wunden heilen von selbst, es sei denn,
                        diese Schwerter, Pfeile und Speere sind aus silber, dann erleidest du doppelten Schaden. 
                       
                        """+ breakLine ;

                this.damage = 2;
                this.defensePower = 7;

            break;
            case 2:
                this.charackterType = Types.NEKROMANT;
                this.attackName = "Armee der Untoten";
                this.defenseName = "Panzerwall der Untoten";
                //TODO[] Ausarbeiten
                this.attackDescription = """
                        Ein Portal öffnet sich und eine Armee von Untoten betritt das Spielfeld. Sie sind langsam aber unerbitterlich.
                        """;
                this.defenseDescription =
                        """
                        Diese Armee der Untoten bildet eine schützende Wand um dich vor feindlichen Angriffen zu beschützen.
                        """;
                this.damage = 5;
                this.defensePower = 10;

                break;
            case 3:
                this.charackterType = Types.ZWERG;
                this.attackName = "Zwergen Wildsau";
                this.defenseName = "Flinker Dickschädel";
                //TODO[] Ausarbeiten
                this.attackDescription = """
                        Du reitest auf einer Wildsau die deine Gegner mit ihren mächtigen Hauern aufschlitzt. 
                        """;
                this.defenseDescription =
                        """
                        Dein mit einem dicken Helm geschützter Schädel ist imun gegen Schwerthiebe und Schläge.
                        Treffen deine Gegner aber deinen Körper spürst du den schmerz.
                        """;
                this.damage = 7;
                this.defensePower = 3;
                break;
            case 4:
                this.charackterType = Types.ZAUBERER;
                this.attackName = "Feuer Hagel";
                this.defenseName = "Expecto Patronum";
                //TODO[] Ausarbeiten
                this.attackDescription = """
                        Ein breitflächiger Angriff der grossen Schaden verursacht.  
                        """;
                this.defenseDescription =
                        """
                        Mit Expecto Patronum bist du perfect gegen die sklaven der Dunkelheit gewappnet. 
                        Triffst du allerdings einen Waldläufer, dann lauf lieber du wirst versagen. 
                        """;
                this.damage = 9;
                this.defensePower = 4;
                break;
            case 5:
                this.charackterType = Types.KRIEGER;
                this.attackName = "Silberklinge";
                this.defenseName = "Schild der Medusa";
                //TODO[] Ausarbeiten
                this.attackDescription = """
                        Deine Angriffe sind Stark aber langsam, ausserdem Wirkungslos gegen Kreaturen der Dunkelheit. 
                        """;
                this.defenseDescription =
                        """
                        Wer in den Schild der Medusa Blickt wird mit dem ewigen Zukiyomi bestraft. Der gegnerische Angriff schadet 
                        dem Gegner mehr als dir. 
                        """;
                this.damage = 3;
                this.defensePower = 7;
                break;

        }
        // Printing the read line
        System.out.println();
    }

    @Override
    public Integer hitEnemy(){
        return rollTheDice() * 10;
    }


}

