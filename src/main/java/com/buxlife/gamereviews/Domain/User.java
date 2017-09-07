package com.buxlife.gamereviews.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Bux_Life on 2017/08/05.
 */
@Entity
public class User implements Serializable{
    @Id
    private String userID;
    private Date dateJoined;
    private String username;
    private String password;

    public User(){
    }

    public User(Builder builder){}
    public Date getDateJoined() {
        return dateJoined;
    }
    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public static class Builder{
        private String userID;
        private Date dateJoined;
        private String username;
        private String password;

        public Builder userID(String value){
            this.userID = value;
            return this;
        }
        public Builder dateJoined(Date value){
            this.dateJoined = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public User build(){ return new User(this);}

    }

}
