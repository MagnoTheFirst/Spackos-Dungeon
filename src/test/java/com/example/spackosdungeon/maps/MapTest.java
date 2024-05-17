package com.example.spackosdungeon.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    @Test
    void avoidExitingTheMap1() {
        Map map = new Map();
        assertEquals(true, map.avoidExitingTheMap(1,0));
    }


    @Test
    void avoidExitingTheMap2() {
        Map map = new Map();
        assertEquals(true, map.avoidExitingTheMap(1,1));
    }


    @Test
    void avoidExitingTheMap3() {
        Map map = new Map();
        assertEquals(true, map.avoidExitingTheMap(-1,0));
    }

    @Test
    void avoidExitingTheMap4() {
        Map map = new Map();
        assertEquals(true, map.avoidExitingTheMap(0,-1));
    }

    @Test
    void printPosition() {
        Map map = new Map();
        map.move(1,0);
        map.printPosition();
    }
}