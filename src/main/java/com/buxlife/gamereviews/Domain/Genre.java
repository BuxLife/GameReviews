package com.buxlife.gamereviews.Domain;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Genre {
    private Game game;
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
