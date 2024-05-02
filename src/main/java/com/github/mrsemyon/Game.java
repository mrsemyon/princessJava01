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
            players.get(0).setScore(players.get(0).getScore() + 1);
            return players.get(0);
        } else {
            players.get(1).setScore(players.get(1).getScore() + 1);
            return players.get(1);
        }
    }
}
