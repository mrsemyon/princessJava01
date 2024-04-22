package com.mrsemyon;

import java.util.ArrayList;

public class Game{
    private static Integer playerNumber = 1;

    public static Integer getPlayerNumber() {
        return playerNumber;
    }

    public static void incPlayerNumber() {
        Game.playerNumber++;
    }

    static Player play(Player[] players){
        Hand first = players[0].lastHand;
        Hand second = players[1].lastHand;
        if (first == second){
            return null;
        }

        if (first.beats(second)){
            return players[0];
        } else {
            return players[1];
        }
    }
}
