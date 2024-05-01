package com.github.mrsemyon;

import java.util.List;

public class Game{
    public Player play(List<Player> players){
        Hand first = players.get(0).lastHand;
        Hand second = players.get(1).lastHand;
        if (first == second){
            return null;
        }

        if (first.beats(second)){
            return players.get(0);
        } else {
            return players.get(1);
        }
    }
}
