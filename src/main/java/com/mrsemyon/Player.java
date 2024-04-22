package com.mrsemyon;

public abstract class Player {
    final String name;
    int score = 0;
    protected Hand lastHand = null;

    Player(String name) {
        this.name = name;
    }

    protected abstract void selectHand();
}

