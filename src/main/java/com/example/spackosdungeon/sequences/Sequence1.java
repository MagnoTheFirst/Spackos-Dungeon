package com.example.spackosdungeon.sequences;

import com.example.spackosdungeon.entities.Player;

import java.io.IOException;

/**
 * Die Zahl des zweiten Akts ist 4 TODO[] evt änden noch mit jessi anschauen
 *
 * */
public class Sequence1 extends Sequence{

    //TODO[] an dieser stelle evt ein bisschen mehr investieren vlt dass sie den Schein aus der Tasche nehmen müssen oder etwas auswählen können
    private final String outro_txt_1 = """
            Ihr begebt euch mit dem soeben erhaltenen Schein zum Tor von Kirigakure, andem euch zwei Wachen empfangen. 
            >> Wer Seit ihr hier und was wollt ihr?
            ** Wir sind""" + this.getPlayer1().getName() + " und " + this.getPlayer2().getName() +
            """
            ** Wir haben diesen Schein, und suchen das Haus mit der Roten Tür und der Nummer 4 auf ihr. 
            >> Wozu, dass denn?
            ** Er ist ein alter Bekannter, den wir seit langem wieder sehen möchten. 
            """; //TODO[] an dieser stelle noch Auswahl zur Verfügung stellen. Lügen, Wahrheit sagen.

    private final String outro_txt_2 = """ 
            Ihr geht durch das Tor. Vor euch das Dorf Kirigakure, indem ein Haus dem anderen gleicht. 
            Jedes Haus hat eine rote Tür mit einer 4 auf ihr. Der Hinweis den ihr erhalten habt war also nutzlos. 
            Ihr müsst euch also auf die Suche nach Mimaru machen. 
            """;



    //TODO[] SEQUENZ 1 definieren
    //TODO[] evt richtiges Datum eingfügen?
    public static String akt1() throws IOException {
        String akt1 = """
                1 AKT:
                """+ DELIMITER + BREAKELINE + DELIMITER +
                """
                Wir schreiben Samstag den 27.04.2024 04:00 Uhr Folgetag der Hochzeit von Nadja und Matthias. 
                Nadja und Matthias schlafen genüsslich. Während Nadja Töne von sich gibt, die dem Horn von Gondor ähneln
                bereiten sich zwei Ninjas vom Foot Clan vor, um über die Aussenfassade auf die Terrasse zu gelangen.
                Sie verschaffen sich beinahe ohne ein Geräusch zu verursachen, Zutritt zur Wohnung. Sie schleichen in das Wohnzimmer indem 
                alle Geschenke gelagert sind. Auf einem altharähnlichen Konstrukt steht eine Holzschatulle.
                die durch das Licht des Vollmondes wundervoll Glanz aufblitzt. Die Anthagonisten greifen sich die Schatulle und versuchen sie zu öffnen, 
                doch die Schatulle lässt sich nicht öffnen, die Schatulle bleibt verschlossen. 
                
                Sie schauen sich um, doch vom Schlüssel fehlt jede Spur. Aus dem Schlafzimmer hören Sie wie eine Stimme etwas murmelt. 
                Beinahe panisch ergreifen Sie die Flucht, als sie am Schlafzimmer vorbei huschen, sehen sie Matthias mit weit aufgerissenen Augen 
                im Bett liegen. Er ist es der im Schlaf undeutlich vor sich her plappert. 
                
                "
                In Maryland ist es verboten, einen Löwen mit ins Kino zu nehmen.
                Pferde können gar nicht kotzen.
                Die britische Labour Party singt ihre Parteihymne zur Melodie von „O Tannenbaum“.
                An Wahltagen darf in Norwegen kein Alkohol verkauft werden.
                Auberginen enthalten Nikotin.
                Statistisch gesehen lügen Menschen alle 4 bis 8 Minuten. Bei Ale sind es alle 60 Minuten weil er einfach der tollste aller Tollsten ist.
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
                
                "Was isch de mit dir los Bella das du so muetig bisch? Hüt chlei zviel Katzemünze gha oder wa?"
            
                >>Angscht und Geld hani keine<< antwortet sie
                
                "Jo aber daschde schono chlei gfährlech gsi, meinsch nid? "
                
                >> Hörst du mich Gefahr ich lach dir ins Gesicht hahahahahaaaaa.... 
                
                "Okey, das wär eigentlech mi Text gsi aber isch i.O häääää itzt chlei schlafe isch chlei stressig gsi."
                
                >> Nachti Nacht 
                
                
                """ + DELIMITER + BREAKELINE +

                """
                Damit unser frisch gepackenes Ehepaar (in diesem Fall ihr) ihre Ehe nicht mit dem falschen Fuss beginnt, ist es eure Aufgabe das
                wertvollste aller Geschenke zurück zu holen. Ihr habt dafür bis Sonnenaufgang Zeit bevor unser Ehepaar aufwacht. 
                Lasst die Spiele beginnen.....................
                
                """;
        return akt1;
    }

    //TODO[] SEQUENZ 2 definieren
    public String akt2() throws IOException {
        String text = """
                2 AKT:
                """ + DELIMITER + BREAKELINE + DELIMITER +
                """
                        Während der überhasteten Flucht der zwei Ninjas, liess einer der beiden ein kleines aber feines Indiz fallen. 
                        Das Stirnband zeigt das Emblem von Kirigakure. Ihr begebt euch auf den Weg nach Kirigakure um das gestohlene Geschenk zurück zu holen. 
                        In einem Wald mit unfassbar hohen Bäumen bewegt ihr euch durch das unterholz. Ihr bekommt zunehmend das Gefühl
                        beobachtet zu werden. Die Äste der Baumkronen rascheln hin und wieder obschon kein Lüftchen weht. 
                        In den Baumkronen seht ihr zwei Schatten, könnt aber nicht genau erkennen wer euch verfolgt.
                        Handelt es sich um Freund oder Feind? 
                        Was wollt ihr tun?
                                """;
        System.out.println(text);
        akt_2_interaktion_1();
        //sequenz_2_raetsel_1();
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
        //TODO[] als konstante definieren.
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
                            
                            Ihr verdeutlicht, wie wichtig eure Mission ist, da es sich um die liebenswertesten aller Spackos handelt. Nadja und Matthias. 
                            
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
                            
                            "Nun, es scheint als wäre Mimimaru kurz davor in einen Blutrausch zu verfallen. 
                            Euch bleibt wohl nichts anderes übrig als folgendes Rätsel zu lösen: 
                            """
                            + DELIMITER + BREAKELINE
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
                            
                            >> Wenn ich mich nicht täusche ist das, das Stirnband von Mangetsu dieser Nichtsnutz, wie kann er nur sein Stirnband verlieren...  
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
                            + DELIMITER + BREAKELINE
            );
            sequenz_2_raetsel_1();

        }else if(choice == 3){
            System.out.println("Ihr seid nun verheiratet, euch zu trennen sollte keine Option sein oder nicht? Versucht es nochmal");
            akt_2_interaktion_1();
        }else{
            System.out.println("EEEEEEYYYYYYYY NIIIID BSCHIISSSSEEEEE BITTE NUMME ZAHLE VO 1 - 3 !!!!!!");
            akt_2_interaktion_1();
        }
        return "";
    }


    /*
     *
     * */
    public void sequenz_2_raetsel_1() throws IOException {
        //TODO[] evt noch elemente einbauen wie wegbeschrieb und kreuzungen an denen sie den richtigen Weg wählen müssen.
        System.out.println("Was befindet sich immer vor uns, und wenn wir uns auch noch so anstrengen, wir können es niemals einholen?");
        String input = read_string_input("Wie lautet eure Anwort");
        if(input.equals("Zeit")||input.equals("zeit")|| input.equals("Zit")||input.equals("zit")){
            System.out.println(
                    """
                    "Eure Antwort ist richtig. Nun Mangetsu befindet sich im Dorf. Seine Haus ist das einzige Haus mit einer roten Tür und der Zahl 4 auf ihr.
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
                    
                    # Für di gits ou no e Chlapf id Schnure. 
                    
                    Ihr spührt wie das Leben in euch zurück kehrt. 
                    
                    Eine bärtige kleine Fee flattert vor euren Augen umher. Sie hat euch geheilt. 
                    Wenn man diese Fee beschreiben müsste dann wäre es Tinkerbells körper mit Ale's Kopf in übergrösse. 
                    Er hat eure Feinde ausser Gefecht gesetzt und reicht euch einen Passierschein. 
                    
                    # 
                    D'richtigi Antwort, wär d'zit gsi. Aber ja jetzt nehmet der Passierschien und ghöt uf Kirigakure. 
                    Dir müesst zum einzige Huus mit ere rote Tür. Dört findeter ner de Mangatsu vlt. heter das Gschenk. 
                    #
                    
                    """);
        }
    }

    @Override
    public String outro(){
        System.out.println(this.outro_txt_1 + this.outro_txt_2);
        return this.outro_txt_1 + this.outro_txt_2;
    }

}
