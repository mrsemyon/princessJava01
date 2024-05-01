package com.github.mrsemyon;

public abstract class Player {
    private final String name;
    private int score = 0;
    protected Hand lastHand = null;

    Player(String name) {
        this.name = name;
    }

    protected abstract void selectHand();

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

