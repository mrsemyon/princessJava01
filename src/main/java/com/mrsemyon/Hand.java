package com.mrsemyon;

import java.util.Map;
import java.util.Set;

public enum Hand{
    ROCK,
    PAPER,
    SCISSORS;

    public static final Map<Hand, Set<Hand>> beatsMap = Map.of(
            ROCK, Set.of(SCISSORS),
            SCISSORS, Set.of(PAPER),
            PAPER, Set.of(ROCK)
    );

    boolean beats(Hand other){
        return beatsMap.get(this).contains(other);
    }
}
