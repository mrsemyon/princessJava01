package com.mrsemyon;

public class BotPlayer extends Player{
    BotPlayer(String name) {
        super(name);
    }

    @Override
    protected Hand selectHand() {
        return Hand.random();
    }
}
