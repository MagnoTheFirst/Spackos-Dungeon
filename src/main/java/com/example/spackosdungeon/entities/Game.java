package com.example.spackosdungeon.entities;

import com.example.spackosdungeon.config.ConsoleColors;
import com.example.spackosdungeon.sequences.Intro;
import com.example.spackosdungeon.sequences.Sequence;
import com.example.spackosdungeon.sequences.Sequence1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//TODO[] braucht es diese klasse noch? vlt könnte man sie in die main methode überführen
public class Game extends Sequence {
    Intro intro = new Intro();
    Sequence1 s1;
    Sequence1 s2;
    Sequence1 s3;
    Sequence1 s4;

    public Game() throws IOException {

        System.out.println(this.CONSOLE_COLOR + Intro.INTRO_TEXT );
        this.player1 = new Player();
        this.player2 = new Player();
        this.s1 = new Sequence1();
        this.s2 = new Sequence1();
        this.s3 = new Sequence1();
        this.s4 = new Sequence1();
    }

    public void startGame() throws IOException {

        s1.akt1();
        s1.akt2();
        s1.outro();

    }

    public static void setUpPlayer(){

    }



}
