package com.example.spackosdungeon.entities;

import com.example.spackosdungeon.config.ConsoleColors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Game {

    Player player1;
    Player player2;
    public static Boolean isOver = false;
    String delimiter = "____________________________________________________________________\n";
    String breakLine = "\n";
    static final String INTRO =

            """
                                                           Spackos Dungeon \n
                    ____________________________________________________________________________________________________ \n
                                
                    Spackos Dungeon ein Spiel entwickelt von Spackos für Spackos.
                    Von den Machern von:
                    "Die einte gits die angere nimmts",
                    "Und wennde nüt chasch, das chasch ou nid",
                    "Zügle geit  nume 2 - 3 Stung,  mir hei scho huere viel züglet",
                    "Wüsster no woni gseit ha mir mache Alkohol freie Monet, it was a lieeeeeeeeeee!!!!!!" &
                    angeri Szene.
                    
                    
                    Taucht ein in diese imaginäre Welt                                       
                    voller Rätsel, Abenteuer und wie wir hoffen auch Spass, ein. 
                    
                                
                    Im Verlauf dieses Spiels werdet ihr zwei hübschen Hinweise sammeln. 
                    Ziel dieses Spiels ist alle Quests zu überleben um Ende das ultimative Rätsel zu lösen, dass euch
                    zu eurem Geschenk führen wird. 
                    Jessica & Alejandro Laneri wünschen euch viel Spass. 
                    ____________________________________________________________________________________________________ \n
                    """;

    public void startGame() throws IOException {

        System.out.println(ConsoleColors.ANSI_BLUE + INTRO );
        System.out.println(sequenz1());
        player1 = new Player();

        player2 = new Player();

        sequenz2();
    }

    public static void setUpPlayer(){

    }


    //TODO[] SEQUENZ 1 definieren
    String sequenz1() throws IOException {

        return """
                1 AKT:
                """+ delimiter + breakLine + delimiter+
                """
                Wir schreiben Samstag den 27.04.2024 04:00 Uhr Folgetag der Hochzeit von Nadja und Matthias. 
                Nadja und Matthias schlafen genüsslich. Während Nadja im Schlaf Töne von sich gibt, die dem Horn von Gondor ähneln
                bereiten sich zwei Ninjas vom Foot Clan vor um über die Aussenfassade auf die Terrasse zu gelangen.
                Sie verschaffen sich beinahe ohne ein Geräusch zu verursachen, zutritt zur Wohnung. Sie schleichen in das Wohnzimmer indem 
                alle Geschenke gelagert sind. Auf einem altharähnlichen Konstrukt steht eine Holzschatulle.
                die durch das Licht des Vollmondes wundervoll Glanz aufblitzt. Die Anthagonisten greifen sich die Schatulle und versuchen sie zu öffnen, 
                doch die Schatulle lässt sich nicht öffnen, die Schatulle bleibt verschlossen. 
                
                Sie schauen sich um, doch vom Schlüssel fehlt jede Spur. Aus dem Schlafzimmer hören Sie wie eine Stimme etwas murmelt. 
                Beinahe panisch ergreifen Sie die Flucht, als sie am Schlafzimmer vorbei schleichen, sehen sie Matthias mit weit aufgerissenen Augen 
                im Bett liegen. Er ist es der im Schlaf etwas vor sich hin murmelt. 
                
                "
                In Maryland ist es verboten, einen Löwen mit ins Kino zu nehmen.
                Pferde können gar nicht kotzen.
                Die britische Labour Party singt ihre Parteihymne zur Melodie von „O Tannenbaum“.
                An Wahltagen darf in Norwegen kein Alkohol verkauft werden.
                Auberginen enthalten Nikotin.
                Statistisch lügen Menschen alle 4,8 Minuten. Bei Ale sind es 48.
                Der Eifelturm schrumpft bei Kälte um 15 Zentimeter.
                Der Film „Titanic“ dauert genauso lange, wie das echte Schiff unterging.
                Pilot und Co-Pilot essen an Bord nie das Gleiche. So eine gleichzeitige Lebensmittelvergiftung unwahrscheinlicher.
                Am 28. Januar 2005 fiel in der Sahara Schnee.
                .....................
                "
                
                Die Eindringlinge schauen sich verdutzt an: 
                "Ischer am schlofe? " 
                >> I gloube scho weiss nid. <<
                
                Einer der beiden winkt mit seiner Hand vor Matthias Augen und bemerkt, dass um Matthias Hals ein Schlüssel hängt. "
                Noch bevor sich die Missetäter den Schlüssel unter den Nagel reissen können, sehen sie einen riesigen Schatten an der Wand. 
                Als Bella die Einbrecher sieht, Miaut sie in unerwartet tiefen Tönen, beinahe wie das Gebrüll eines Löwen.
                Die Einbrecher springen gereuschlos zur Tür und verschwinden im Schutz der Dunkelheit.
                 
                Simba und Bella verkriechen sich wieder unter das Bett. Nachdenklich fragt Simba Bella:
                
                "Was isch de mit dir los Bella das du so muetig bisch? Hüt chlei zviel Katzemünze gha oder wa?" fragt Simba
            
                >>Angscht und Geld hani keine<< antwortet Sie
                
                "Jo aber daschde schono chlei gfährlech gsi, meinsch nid? "
                
                >> Hörst du mich Gefahr ich lach dir ins Gesicht hahahahaha.... 
                
                "Okey, das wär eigentlech mi Text gsi aber isch i.O häääää itzt chlei schlafe isch chlei stressig gsi."
                
                >> Nachti Nacht 
                
                
                """ + delimiter + breakLine +

                """
                Damit unser frisch gepackenes Ehepaar ihre Ehe nicht mit dem falschen Fuss beginnt, ist es eure Aufgabe das
                wertvollste aller Geschenke zurück zu holen. Ihr habt dafür bis Sonnenaufgang Zeit bevor unser Ehepaar aufwacht. 
                Lasst die Spiele beginnen.....................
                
                """;
    }

    //TODO[] SEQUENZ 2 definieren
    String sequenz2() throws IOException {
        String text = """
                2 AKT:
                """+ delimiter + breakLine + delimiter+
                """
                Während der überhasteten Flucht der zwei Ninjas, liess einer der beiden ein kleines aber feines Indiz fallen. 
                Das Stirnband zeigt das Emblem von Kirigakure. Ihr begebt euch auf den Weg nach Kirigakure. 
                In einem Wald mit unglaublich hohen Bäumen bewegt ihr euch durch unterholz. Ihr habt von Anfang an das Gefühl
                beobachtet zu werden. In den Baumkronen seht ihr zwei Schatten, könnt aber nicht genau erkennen wer euch verfolgt.
                Handelt es sich um Freund oder Feind? 
                Was wollt ihr tun?
                        """;
        System.out.println(text);
        akt_2_interaktion_1();
        //sequenz_2_raetsel_1();
        sequenz3();
        return text;

    }

    /*
     * Die zwei werden verfolgt was sollen sie tun
     * //TODO[] Falls wir uns doch für Fähigkeiten entscheiden muss diese Interaktion angepasst werden, sodass der Angriff
     *    Mit den Fähigkeiten übereinstimmt.
     * */
    public String akt_2_interaktion_1() throws IOException {
        Integer choice = reade_input_numeric_choice(
                """
                        1.) Wir laufen weiter und warten die Intention des Verfolgers ab.
                        2.) Wir greifen an
                        3.) Wir trennen uns
                        """
        );
        Player male_charackter;
        if(this.player1.female == true){
            male_charackter = this.player2;
        }else{
            male_charackter = this.player1;
        }
        if(choice == 1){
            System.out.println(
                    this.player1.getName() + " und "+  this.player2.getName() +
                            """

                            Die Verfolger springen euch aus den Baumkronen entgegen.
                            Ein grosser schlackziger und ein etwas pumelliger Ninja stehen vor euch:  
     
                            "Was machen zwei so hässliche gestalten wie ihr in unserem Territorium." Beginnt der grössere von beiden das Gespräch.
                            >> Ihr seht ja mal richtig scheisse aus, fast so als hättet ihr die ganze Nacht gefeiert. 
                            
                            Ihr erklärt den beiden wer ihr seid, warum ihr hier seid und zeigt den beiden das gefundene Stirnband. Der kleine pummelige Ninja 
                            inspiziert das Stirnband genauer und findet am rechten unteren Eck das eingestanztes Familien Wappen des Hoozuki Clans. 
                            
                            >> Wenn ich mich nicht täusche ist das, das Stirnband von Mangetsu dieser Nichtsnutz, wie kann er nur sein Stirnband verlieren.  
                            Ergänzt der stämmige Ninja.
                            
                            Ihr verdeutlicht, wie wichtig eure Mission ist, da es sich um die liebevollsten aller Spackos handelt. Nadja und Matthias. 
                            
                            "Mhhhhhhhh.... verstehe. 
                            Nun es ist nicht so, dass wir euch nicht helfen wollen, aber ihr seid in Kirigakure eingedrungen ohne um erlaubnis zu bitten. 
                            Antwortet der krakslige Ninja mit seiner unverkennlichen rauchigen Stimme die der von Bruce Willis ähnelt. 
                            
                            "Allerdings, wäre es eine Blamage wenn das jemand mitbekommen würde, dass einem unserer Ninjas so ein Anfängerfehler passiert ist. 
                            Mhhhh...... schwierig schwierig." 
                            Sagt er während er sich mit dem Knöchel seines Zeigefingers das Kinn reibt. 
                            
                            "Wir können euch auch nicht einfach so abmurksen, wäre ja schade bei dem Pfirsich Popo den " 
                            """+
                            male_charackter.getName()+
                            """
                            hat." \n Sagt er während er den Po von """ + male_charackter.getName() +
                            """
                            begutachtet.
                            "Nun wir wollen ja auch keine Unmenschen sein, wir haben von unseren Spionen im Westen des Landes gehört,
                            das es sich bei dem Ehepaar um zwei anständige Knilche handelt. Wir wollen einem frisch verheirateten Ehepaar
                            doch nicht die Ehe vermiessen." Fügt er hinzu. 
                            
                            >> Lass sie doch ein Rätsel lösen, wenn sie es lösen können helfen wir ihnen, wenn nicht töten wir sie. 
                            Sagt der Fettwanzt, während sein Blick ein Spiegel der steigenden Raserei ist, in die sich der Ninja steigert. 
                                                       
                            "Wir haben gesagt wir töten sie nicht..."
                            
                            >> Ist mir egaaaaaaaalll ich will Blut seheeeeeennnnnnnn!!!!!!!
                            
                            "Okey es scheint als hätte sich Mimimaru reingesteigert. Euch bleibt wohl nichts anderes übrig als folgendes Rätsel zu lösen: 
                            """
                            + delimiter + breakLine + delimiter
            );
            sequenz_2_raetsel_1();

        }else if(choice == 2){

            System.out.println(
                    this.player1.getName() + " und "+  this.player2.getName() +
                            """
                             werfen gleichzeitig ihre Kunais, doch die beiden haben ihre Fähigkeiten masslos überschätzt.
                             Gekonnt, wehren die Verfolger die Kunais ab und springen ihnen aus den Baumkronen entgegen.
                             Ein grosser und ein etwas pumelliger Ninja stehen vor euch:  
     
                            "Was machen zwei so hässliche gestalten wie ihr in unserem Territorium." Beginnt der grössere von beiden das Gespräch.
                            >> Ihr seht ja mal richtig scheisse aus, fast so als hättet ihr die ganze Nacht gefeiert. 
                            
                            Ihr erklärt den beiden wer ihr seid, warum ihr hier seid und zeigt den beiden das gefundene Stirnband. Der kleine pummelige Ninja 
                            inspiziert das Stirnband genauer und findet am rechten unteren Eck das eingestanztes Familien Wappen des Hoozuki Clans. 
                            
                            >> Wenn ich mich nicht täusche ist das, das Stirnband von Mangetsu dieser Nichtsnutz, wie kann er nur sein Stirnband verlieren.  
                            Ergänzt der stämmige Ninja.
                            
                            Ihr verdeutlicht, wie wichtig eure Mission ist, da es sich um die liebevollsten aller Spackos handelt. Nadja und Matthias. 
                            
                            "Mhhhhhhhh.... verstehe. 
                            Nun es ist nicht so, dass wir euch nicht helfen wollen, aber ihr seid in Kirigakure eingedrungen ohne um erlaubnis zu bitten. 
                            Antwortet der krakslige Ninja mit seiner unverkennlichen rauchigen Stimme die der von Bruce Willis ähnelt. 
                            
                            "Allerdings, wäre es eine Blamage wenn das jemand mitbekommen würde, dass einem unserer Ninjas so ein Anfängerfehler passiert ist. 
                            Mhhhh...... schwierig schwierig." 
                            Sagt er während er sich mit dem Knöchel seines Zeigefingers das Kinn reibt. 
                            
                            "Wir können euch auch nicht einfach so abmurksen, wäre ja schade bei dem Pfirsich Popo den " 
                            """+
                            male_charackter.getName()+
                            """
                            hat." \n Sagt er während er den Po von """ + male_charackter.getName() +
                            """
                            begutachtet.
                            "Nun wir wollen ja auch keine Unmenschen sein, wir haben von unseren Spionen im Westen des Landes gehört,
                            das es sich bei dem Ehepaar um zwei anständige Knilche handelt. Wir wollen einem frisch verheirateten Ehepaar
                            doch nicht die Ehe vermiessen." Fügt er hinzu. 
                            
                            >> Lass sie doch ein Rätsel lösen, wenn sie es lösen können helfen wir ihnen, wenn nicht töten wir sie. 
                            Sagt der Fettwanzt, während sein Blick ein Spiegel der steigenden Raserei ist, in die sich der Ninja steigert. 
                                                       
                            "Wir haben gesagt wir töten sie nicht..."
                            
                            >> Ist mir egaaaaaaaalll ich will Blut seheeeeeennnnnnnn!!!!!!!
                            
                            "Okey es scheint als hätte sich Mimimaru reingesteigert. Euch bleibt wohl nichts anderes übrig als folgendes Rätsel zu lösen: 
                            """
                            + delimiter + breakLine + delimiter
            );
            sequenz_2_raetsel_1();

        }else if(choice == 3){
            System.out.println("Ihr seid nun verheiratet, euch zu trennen sollte keine Option sein oder nicht? Versucht es nochmal");
            akt_2_interaktion_1();
        }else{
            System.out.println("EEEEEEYYYYYYYY NIIIID BSCHIISSSSEEEEE!!!!!!");
            akt_2_interaktion_1();
        }
        return "";
    }

    /*
    *
    * */
    public String sequenz_2_raetsel_1() throws IOException {

        System.out.println("Was befindet sich immer vor uns, und wenn wir uns auch noch so anstrengen, wir können es niemals einholen?");
        String input = read_string_input("Wie lautet eure Anwort");
        if(input.equals("Zukunft")||input.equals("Die Zukunft")|| input.equals("Zukunft")||input.equals("die Zukunft")|| input.equals("Die Zuekunft")||input.equals("die Zuekunft") || input.equals("die zuekunft")){
            System.out.println(
                    """
                    "Eure Antwort ist richtig. Nun Mangetsu befindet sich im Dorf. Seine Haus ist das einzige Haus mit einer roten Tür.
                   Hier nehmt diesen Passierschein. So könnt ihr ohne Probleme ins Dorf. Macht aber keinen Ärger auf dem Schein steht mein Name.
                   Viel Erfolg!" 
                   
                   Sagt der schlacksige Ninja während er mit einem freundlichen lächeln zum Abschied winkt.
                   
                   >> Ja das wünsche ich euch auch.
                   
                   Ergänzt der Fettsack. 
                    
                    """);
        }else{
            System.out.println("""
                    Mimimaru der pummelige Ninja verschwindet in einem Augenblick und taucht hinter euch auf.
                    Ohne auch nur ein Wort zu verlieren schneidet er eure Kehlen auf. 
                    ---------------------------  GAME OVER  -------------------------- 
               
                    Ihr fallt zu Boden wie zwei Kartoffelsäcke. Eure Sichtfeld wird immer kleiner und ihr nehmt die 
                    Umwelt mit wachsender Unschärfe wahr. Gerade als ihr kurz davor wart abzunippeln, seht ihr wie etwas
                    vor euren in der Luft flattert. Ihr hört es Poltern Mimaru und sein Genosse werden nieder geschlagen. 
                    
                    # Für di gits ou no e Chlapf id schnure. 
                    
                    Ihr spührt wie das Leben in euch zurück kehrt. 
                    
                    Eine bartige kleine Fee flattert vor euren Augen umher. Sie hat euch geheilt. 
                    Wenn man diese Fee beschreiben müsste dann wäre es Tinkerbells körper mit Ale's Kopf in übergrösse. 
                    Er hat eure Feinde ausser Gefecht gesetzt und reicht euch einen Passierschein. 
                    
                    # 
                    D'richtigi Antwort, wär d'zit gsi. Aber ja jetzt nehmet der Passierschien und ghöt uf Kirigakure. 
                    Dir müesst zum einzige Huus mit ere rote Tür. Dört findeter ner de Mangatsu vlt. heter das Gschenk. 
                    #
                    
                    """);
        }
        return null;
    }


    //TODO[] SEQUENZ 3 definieren
    void sequenz3() throws IOException {
        String text = "\n"+delimiter + breakLine + delimiter+"""
                AKT 3:
                """+ delimiter + breakLine + delimiter+
                """
                Ihr lauft durch den Walt. In der Ferne seht ihr die grossen Tore  von Kirigakure vor dem 2 Wächter stehen. 
                Ihr nähert euch bis ihr von den Wächtern angesprochen werden. 
                
                >> Wer seid ihr und was wollt ihr hier?
                
                ** Wir sind  """ + this.player1 + " & " + this.player2 + """
                ** Mangetsu und Hongetsu schicken uns.
                ** Wir sollen euch diesen Passierschein zeigen. 
                
                >> Wenn dem wirklich so ist, dann müsstet ihr folgendes Rätsel ohne probleme lösen können nicht wahr? 
                >> Ist dem nicht so werden wir euch festnehmen. 
                
                
                
                """;

        sequenz_3_raetsel_1();
    }

    String sequenz_3_raetsel_1() throws IOException {

        String answer = read_string_input("Was hat Städte aber keine Häuser, Wälder aber keine Bäume & Flüsse aber kein Wasser?");
        if(answer.equals("Eine Karte") || answer.equals("Eine Landkarte")|| answer.equals("eine karte")
                || answer.equals("eine landkarte")||answer.equals("Ein Atlas")||answer.equals("ein Atlas")
        || answer.equals("eine Karte") || answer.equals("Eine karte") || answer.equals("Eine atlas") || answer.equals("ein Atlas")){
            System.out.println(">> Ihr dürft passieren.");

        }
        else{
            System.out.println("Ihr werdet Festgenommen \n ------------------- GAME OVER -----------------------");
        }
        return null;
    }

    private Integer reade_input_numeric_choice(String input_text) throws IOException {
        System.out.println(delimiter + breakLine + delimiter);
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println(ConsoleColors.ANSI_BLUE );
        System.out.println(input_text);

        String input = reader.readLine().toString();

        return Integer.parseInt(input);
    }

    private String read_string_input(String input_text) throws IOException {
        System.out.println(delimiter + breakLine + delimiter);
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println(ConsoleColors.ANSI_BLUE );
        System.out.println(input_text);

        String input = reader.readLine().toString();
        return input;
    }


}
