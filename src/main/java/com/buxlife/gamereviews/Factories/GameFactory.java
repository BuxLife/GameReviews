package com.buxlife.gamereviews.Factories;


import com.buxlife.gamereviews.Domain.Game;
import com.buxlife.gamereviews.Utility.KeyGenerator;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class GameFactory {
    public static Game buildGame(String title, String description){
        Game game = new Game.Builder()
                .id(KeyGenerator.getEntityId())
                .title(title)
                .description(description)
                .build();
        return game;
    }
}
