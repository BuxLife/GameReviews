package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Reviewer implements Serializable{
    private User user;
    private Review review;
    private Rank rank;
    private Reputation reputation;
    private int reviewerID;

}
