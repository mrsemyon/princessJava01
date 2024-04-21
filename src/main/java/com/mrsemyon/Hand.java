package com.mrsemyon;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
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

    private static final Random random = new Random();
    private static final Scanner input = new Scanner(System.in);

    boolean beats(Hand other){
        return beatsMap.get(this).contains(other);
    };

    static Hand random(){
        Hand[] options = Hand.values();
        int selected = random.nextInt(options.length);
        return options[selected];
    }

    static Hand input(){
        Hand[] options = Hand.values();
        int selected = input.nextInt();
        return options[selected];
    }
}
