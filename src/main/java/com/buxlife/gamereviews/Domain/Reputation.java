package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Reputation implements Serializable{
    private int reputation;
    private Reviewer reviewer;

    public int getReputation() {
        return reputation;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }
}
