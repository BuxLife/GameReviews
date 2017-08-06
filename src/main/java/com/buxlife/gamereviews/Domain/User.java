package com.buxlife.gamereviews.Domain;

import java.util.Date;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class User {
    private Date dateJoined;
    private String username;
    private String password;
    private int upVotes;
    private int DownVotes;

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

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return DownVotes;
    }

    public void setDownVotes(int downVotes) {
        DownVotes = downVotes;
    }
}
