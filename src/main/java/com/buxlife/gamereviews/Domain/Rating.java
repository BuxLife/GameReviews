package com.buxlife.gamereviews.Domain;

/**
 * Created by Bux_Life on 2017/08/06.
 */
public class Rating {
    private int rating;
    private Game game;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
