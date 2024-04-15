package com.mrsemyon;

import java.util.Random;
import java.util.Scanner;

public class Game{

    private final int[][] cost = {{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}};

    private int numberRounds;

    public void setNumberRounds(int number){
        this.numberRounds = number;
    }

    public void mainGame(){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        Player playerFirst = new Player();
        Player playerSecond = new Player();

        System.out.println("Welcome to Rock, Paper & Scissors!");

        System.out.println("Insert the first player (0 - human, 1 - bot)");
        playerFirst.setStatus(in.nextInt());

        System.out.println("Insert the second player (0 - human, 1 - bot)");
        playerSecond.setStatus(in.nextInt());

        System.out.println("Insert the number of rounds:");
        setNumberRounds(in.nextInt());

        for (int i = 0; i < numberRounds; i++){

            if (playerFirst.getStatus() == 0) {
                System.out.println("Insert player 1 shape (0 - rock, 1 - paper, 2 - scissors):");
                playerFirst.setValue(in.nextInt());
            } else {
                playerFirst.setValue(rand.nextInt(3));
            }

            Hand handFirst = new Hand(playerFirst.getValue());
            System.out.println("First player is chosen a " + handFirst.getName());

            if (playerSecond.getStatus() == 0) {
                System.out.println("Insert player 2 shape (0 - rock, 1 - paper, 2 - scissors):");
                playerSecond.setValue(in.nextInt());
            } else {
                playerSecond.setValue(rand.nextInt(3));
            }

            Hand handSedond = new Hand(playerSecond.getValue());
            System.out.println("Second player is chosen a " + handSedond.getName());

            System.out.println(checkResult(playerFirst, playerSecond));
        }

        System.out.println("Game over.");
    }

    public String checkResult(Player playerFirst, Player playerSecond){
        String result;

        if (cost[playerFirst.getValue()][playerSecond.getValue()] == 0) {
            result = "Draw -_-";
        } else if (cost[playerFirst.getValue()][playerSecond.getValue()] < 0){
            result = "Player 1 lose...";
        } else {
            result = "Player 2 win!!!";
        }

        return result;
    }
}
