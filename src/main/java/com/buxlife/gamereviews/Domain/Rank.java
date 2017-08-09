package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Rank implements Serializable{
    private String rank;
    private Reviewer reviewer;
    private Reputation reputation;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;

    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }
}
