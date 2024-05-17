package com.example.spackosdungeon.maps;

import com.example.spackosdungeon.scenarios.streets.Streets;

import java.util.List;

public class Map {
    List<Streets> streets;
    int xPosition =0;
    int yPosition =0;
    int[][] map = new int[3][3];

    boolean avoidExitingTheMap(int moveX, int moveY){
        if(xPosition == 0 && moveX == -1){
            return false;
        }else if(yPosition == 0 && moveX == -1){
            return false;
        }else if(xPosition == 3 && moveX == 1){
            return false;
        }else if(yPosition == 3 && moveX == 1){
            return false;
        }
        else{
            return true;
        }
    }

    String printPosition(){
        String output = "";
        for(int i = 0; i < this.map.length ; i++){
            String xAxis = "";
            for(int k = 0; i < this.map.length ; k++){
                if(k == yPosition && i == xPosition){
                    xAxis += "[O]";
                }
                else{
                    xAxis += "[ ]";
                }
            }
            xAxis += "\n";
        }
        return output;
    }

    String move(int x, int y){
        if(!avoidExitingTheMap(x,y)){
            return printPosition();
        }
        else{
            return "Die Stadtmauer ist im Weg ihr könnt hier nicht lang";
        }

    }


}
