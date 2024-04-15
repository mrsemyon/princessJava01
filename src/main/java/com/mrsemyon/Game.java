package com.mrsemyon;

import java.util.Random;
import java.util.Scanner;

public class Game{

    private final int[][] cost = {{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}};

    private int numberRounds;

    private int playerFirstValue;
    private int playerSecondValue;

    public void setNumberRounds(int number){
        this.numberRounds = number;
    }

    public void setPlayerFirstValue(int value){
        this.playerFirstValue = value;
    }

    public void setPlayerSecondValue(int value){
        this.playerSecondValue = value;
    }

    public int getPlayerSecondValue(){
        return this.playerSecondValue;
    }

    public void mainGame(){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper & Scissors!");

        System.out.println("Insert the number of rounds:");
        setNumberRounds(in.nextInt());

        for (int i = 0; i < numberRounds; i++){

            System.out.println("Insert your shape (0 - rock, 1 - paper, 2 - scissors):");

            setPlayerFirstValue(in.nextInt());

            setPlayerSecondValue(rand.nextInt(3));

            System.out.println("You opponent chose a " + getPlayerSecondValue());

            System.out.println(checkResult());
        }

        System.out.println("Game over.");
    }

    public String checkResult(){
        String result;

        if (cost[playerFirstValue][playerSecondValue] == 0) {
            result = "Draw -_-";
        } else if (cost[playerFirstValue][playerSecondValue] < 0){
            result = "You lose...";
        } else {
            result = "You win!!!";
        }

        return result;
    }
}
