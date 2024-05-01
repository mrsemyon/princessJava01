package com.github.mrsemyon;

import java.util.Scanner;

public class LeatherPlayer extends Player {
    private static final Scanner input = new Scanner(System.in);

    LeatherPlayer(String name) {
        super(name);
    }

    static Hand input(){
        Hand[] options = Hand.values();
        int selected = input.nextInt();
        return options[selected];
    }

    @Override
    protected void selectHand() {
        this.lastHand = LeatherPlayer.input();
    }
}
