package com.example.spackosdungeon.entities;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void move() throws IOException {
        Player player = new Player("test");
        player.move(1,0);
        player.move(1,0);
        player.move(-1,0);
        player.move(0,1);
        player.move(0,1);
        player.move(0,-1);
    }
}