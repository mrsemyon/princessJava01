package com.mrsemyon;

public class LeatherPlayer extends Player {
    LeatherPlayer(String name) {
        super(name);
    }

    @Override
    protected Hand selectHand() {
        return Hand.input();
    }
}
