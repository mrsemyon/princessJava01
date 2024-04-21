package com.mrsemyon;

public class App{
    App(){
        Player left = new ComputerPlayer("Left");
        Player right = new ComputerPlayer("Right");

        Player[] players = new Player[] {left, right};

        Game.selectHands(players);
        Game.showSelectedHands(players);
        Player winner = Game.evaluateRound(players);

        Game.showWinner(winner);
        Game.printScores(players);
    }
}
