package com.mrsemyon;

public class ComputerPlayer extends Player{
    ComputerPlayer(String name) {
        super(name);
    }

    @Override
    protected Hand selectHand() {
        return Hand.random();
    }
}
