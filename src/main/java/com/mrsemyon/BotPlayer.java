package com.mrsemyon;

import java.util.Random;

public class BotPlayer extends Player{
    private static final Random random = new Random();

    BotPlayer(String name) {
        super(name);
    }

    static Hand random(){
        Hand[] options = Hand.values();
        int selected = random.nextInt(options.length);
        return options[selected];
    }

    @Override
    protected void selectHand() {
        this.lastHand = BotPlayer.random();
    }
}
