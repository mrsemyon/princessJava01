package com.github.mrsemyon;

public class App{
    public void run(){
        Messenger messenger = new Messenger();
        Game game = new Game();

        messenger.welcome();

        int playerType = messenger.insertPlayerType(1);

        Player firstPlayer = PlayerFactory.getPlayer(
                (playerType == 1)
                        ? PlayerType.BOT : PlayerType.LEATHER,
                messenger.insertPlayerName(1)
        );

        playerType = messenger.insertPlayerType(2);

        Player secondPlayer = PlayerFactory.getPlayer(
                (playerType == 1)
                        ? PlayerType.BOT : PlayerType.LEATHER,
                messenger.insertPlayerName(2)
        );

        Player[] players = new Player[] {firstPlayer, secondPlayer};

        firstPlayer.selectHand();
        secondPlayer.selectHand();

        messenger.printSelectedHands(players);

        Player winner = game.play(players);

        messenger.showWinner(winner);

        messenger.printScores(players);
    }
}
