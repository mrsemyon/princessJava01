package com.mrsemyon;

public class Hand{
    private String name;

    public String getName(){
        return this.name;
    }

    Hand(int value){
        switch (value){
            case 0:
                this.name = "rock";
                break;
            case 1:
                this.name = "paper";
                break;
            case 2:
                this.name = "scissors";
                break;
        }
    }
}
