package com.github.mrsemyon;

import java.util.List;
import java.util.Scanner;

public class Messenger {
    private final Scanner input = new Scanner(System.in);

    public void printScores(List<Player> players){
        for (Player player : players) {
            System.out.printf("Score %s : %d\n", player.name, player.score);
        }
    }

    public void printSelectedHands(List<Player> players){
        for (Player player : players){
            System.out.printf("%s drawn %s\n", player.name, player.lastHand);
        }
    }

    public void showWinner(Player winner){
        if (winner == null){
            System.out.println("Draw -_-");
        } else {
            System.out.println(winner.name + " is win!");
        }
    }

    public void welcome() {
        System.out.println("Welcome to Rock, Paper & Scissors!");
    }

    public int insertPlayerType(int playerNumber) {
        System.out.println("Insert the " + playerNumber + " player type (0 - human, 1 - bot)");
        return input.nextInt();
    }

    public String insertPlayerName(int playerNumber) {
        System.out.println("Insert the " + playerNumber + " player name");
        return input.next();
    }

    public int insertPlayersCount() {
        System.out.println("Insert the number of players");
        return input.nextInt();
    }
}
