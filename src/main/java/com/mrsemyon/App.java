package com.mrsemyon;

public class App{
    App(){
        Player firstPlayer = new BotPlayer("Lol");
        Player secondPlayer = new LeatherPlayer("Kek");

        Player[] players = new Player[] {firstPlayer, secondPlayer};

        firstPlayer.selectHand();
        secondPlayer.selectHand();

        Game.showSelectedHands(players);

        Player winner = Game.evaluateRound(players);

        Game.showWinner(winner);

        Game.printScores(players);
    }
}
