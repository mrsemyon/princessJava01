package com.github.mrsemyon;

public class Game{
    private Player[] players;

    public Player play(Player[] players){
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
