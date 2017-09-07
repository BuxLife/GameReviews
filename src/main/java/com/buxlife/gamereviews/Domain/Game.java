package com.buxlife.gamereviews.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * Created by Bux_Life on 2017/08/05.
 */
@Entity
public class Game implements Serializable{
    @Id
    private String gameID;
    private String title;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return gameID == game.gameID;
    }

    public Game(Builder builder){

    }

    public static class Builder{
        private String id;
        private String gameTitle;
        private String discript;

        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder title(String value){
            this.gameTitle = value;
            return this;
        }
        public Builder description(String value){
            this.discript = value;
            return this;
        }

        public Game build(){ return new Game(this);}
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
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
