package com.github.mrsemyon;

import java.util.List;
import java.util.ArrayList;

public class App{
    public void run(){
        Messenger messenger = new Messenger();
        Game game = new Game();

        messenger.welcome();
        int playersCount = messenger.insertPlayersCount();
        List<Player> players = new ArrayList<Player>();

        int playerType = 0;
        String playerName = "";

        for (int i = 0; i < playersCount; i++) {
            playerType = messenger.insertPlayerType(i);
            playerName = messenger.insertPlayerName(i);

            players.add(PlayerFactory.getPlayer(
                    (playerType == 1) ? PlayerType.BOT : PlayerType.LEATHER,
                    playerName
            ));
        }

        players.get(0).selectHand();
        players.get(1).selectHand();

        messenger.printSelectedHands(players);

        Player winner = game.play(players);

        messenger.showWinner(winner);

        messenger.printScores(players);
    }
}
