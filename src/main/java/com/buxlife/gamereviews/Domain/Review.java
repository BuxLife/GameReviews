package com.buxlife.gamereviews.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
@Entity
public class Review implements Serializable{
    @Id
    private String reviewID;
    private Reviewer reviewer;
    private Game game;
    private String review;


    private Review(){}
    public Review(Builder builder){}

    public static class Builder{
        private String reviewID;
        private Reviewer activeReviewer;
        private String currentReview;
        private Game currentGame;

        public Builder reviewer(Reviewer value){
            this.activeReviewer = value;
            return this;
        }
        public Builder review(String value)
        {
            this.currentReview = value;
            return this;
        }

        public Builder game(Game value){
            this.currentGame = value;
            return this;
        }

        public Review build(){ return new Review(this);}
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        return reviewID == review.reviewID;
    }


    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
