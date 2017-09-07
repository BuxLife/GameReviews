package com.buxlife.gamereviews.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
@Entity
public class Reviewer extends User implements Serializable{
    @Id
    private String reviewerID;
    private Review review;
    private Reputation reputation;

    public static class Builder{

    }

    public String getReviewerID() {
        return reviewerID;
    }

    public void setReviewerID(String reviewerID) {
        this.reviewerID = reviewerID;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Reputation getReputation() {
        return reputation;
    }

    public void setReputation(Reputation reputation) {
        this.reputation = reputation;
    }
}
