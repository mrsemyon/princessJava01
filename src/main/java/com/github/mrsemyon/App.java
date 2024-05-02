package com.github.mrsemyon;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App{
    public void run() throws IOException {
        Messenger messenger = new Messenger();
        Game game = new Game();
        List<Player> players = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        messenger.welcome();
        int playersCount = messenger.insertPlayersCount();

        int playerType;
        String playerName;

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
        messenger.showWinner(game.play(players));
        messenger.printScores(players);
        mapper.writeValue(new File("test.json"), players);
    }
}
