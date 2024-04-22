package com.mrsemyon;

public class PlayerFactory{
    public static Player getPlayer(PlayerType type, String name) {
        return switch (type) {
            case BOT -> new BotPlayer(name);
            case LEATHER -> new LeatherPlayer(name);
        };
    }
}
