package com.github.mrsemyon;

public class App{
    public void run(){
        Messenger.welcome();

        Game game = new Game();

        int playerType = Messenger.insertPlayerType(1);

        Player firstPlayer = PlayerFactory.getPlayer(
                (playerType == 1)
                        ? PlayerType.BOT : PlayerType.LEATHER,
                Messenger.insertPlayerName(1)
        );

        playerType = Messenger.insertPlayerType(2);

        Player secondPlayer = PlayerFactory.getPlayer(
                (playerType == 1)
                        ? PlayerType.BOT : PlayerType.LEATHER,
                Messenger.insertPlayerName(2)
        );

        Player[] players = new Player[] {firstPlayer, secondPlayer};

        firstPlayer.selectHand();
        secondPlayer.selectHand();

        Messenger.printSelectedHands(players);

        Player winner = game.play(players);

        Messenger.showWinner(winner);

        Messenger.printScores(players);
    }
}
