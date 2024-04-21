package com.mrsemyon;

public class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

    @Override
    protected Hand selectHand() {
        return Hand.input();
    }
}
