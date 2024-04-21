package com.mrsemyon;

public class App{
    App(){
        Player[] players = new Player[] {
                new BotPlayer("Lol"),
                new LeatherPlayer("Kek")
        };

        Game.selectHands(players);
        Game.showSelectedHands(players);
        Player winner = Game.evaluateRound(players);

        Game.showWinner(winner);
        Game.printScores(players);
    }
}
