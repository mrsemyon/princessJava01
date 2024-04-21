package com.mrsemyon;

public abstract class Player {
    final String name;
    int score = 0;
    Hand lastHand = null;

    Player(String name) {
        this.name = name;
    }

    Hand drawHand(){
        lastHand = selectHand();
        return lastHand;
    }

    protected abstract Hand selectHand();
}
