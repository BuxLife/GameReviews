package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Game implements Serializable{
    private int gameID;
    private String title;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return gameID == game.gameID;
    }

    @Override
    public int hashCode() {
        return gameID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
