package com.example.spackosdungeon.entities;

import com.example.spackosdungeon.config.ConsoleColors;
import com.example.spackosdungeon.sequences.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//TODO[] braucht es diese klasse noch? vlt könnte man sie in die main methode überführen
public class Game extends Sequence {
    Intro intro = new Intro();
    Sequence1 s1;
    Sequence2 s2;
    Sequence3 s3;
    Sequence4 s4;

    public Game() throws IOException {

        System.out.println(this.CONSOLE_COLOR + Intro.INTRO_TEXT );
        this.player1 = new Player();
        this.player2 = new Player();
        this.s1 = new Sequence1();
        this.s2 = new Sequence2();
        this.s3 = new Sequence3();
        this.s4 = new Sequence4();
    }

    public void startGame() throws IOException {

        System.out.println(s1.akt1());
        s1.akt2();
        System.out.println(s1.outro());
        s2.getIntro();
        s2.akt1_move_in_city();

    }

    public static void setUpPlayer(){

    }



}
