package com.mrsemyon;

public class Game{
    static void play(int masScore, Player one, Player two){
        int round = 0;
    }

    static void selectHands(Player[] players){
        players[0].drawHand();
        players[1].drawHand();
    }

    static Player evaluateRound(Player[] players){
        Hand first = players[0].lastHand;
        Hand second = players[1].lastHand;
        if (first == second){
            return null;
        }

        if (first.beats(second)){
            return players[0];
        } else {
            return players[1];
        }
    }

    static void showWinner(Player winner){
        if (winner == null){
            System.out.println("Draw -_-");
        } else {
            System.out.println(winner.name + " is win!");
            winner.score++;
        }
    }

    static void printScores(Player[] players){
        System.out.printf("Score: %s %d : %s %d",
                players[0].name, players[0].score,
                players[1].name, players[1].score
        );
    }

    static void showSelectedHands(Player[] players){
        for (Player player : players){
            System.out.printf("%s drawn %s\n", player.name, player.lastHand);
        }
    }
}
