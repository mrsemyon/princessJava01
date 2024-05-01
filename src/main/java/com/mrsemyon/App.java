package com.mrsemyon;

public class App{
    public void run(){
        Messenger.welcome();

        Player firstPlayer = PlayerFactory.getPlayer(
                (Messenger.insertPlayerType(Game.getPlayerNumber()) == 1)
                        ? PlayerType.BOT : PlayerType.LEATHER,
                Messenger.insertPlayerName(Game.getPlayerNumber())
        );
        Game.incPlayerNumber();

        Player secondPlayer = PlayerFactory.getPlayer(
                (Messenger.insertPlayerType(Game.getPlayerNumber()) == 1)
                        ? PlayerType.BOT : PlayerType.LEATHER,
                Messenger.insertPlayerName(Game.getPlayerNumber())
        );
        Game.incPlayerNumber();

        Player[] players = new Player[] {firstPlayer, secondPlayer};



        firstPlayer.selectHand();
        secondPlayer.selectHand();

        Messenger.printSelectedHands(players);

        Player winner = Game.play(players);

        Messenger.showWinner(winner);

        Messenger.printScores(players);
    }
}
