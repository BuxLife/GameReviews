package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Review implements Serializable{
    private Reviewer reviewer;
    private Game game;
    private String review;
    private UpVote upVotes;
    private DownVote downVotes;
    private int votes;
    private int reviewID;

    private Review(){}


    public void setVotes(int votes) {
        this.votes = votes;
    }

    public static class Builder{
        private Reviewer activeReviewer;
        private String currentReview;
        private Game currentGame;
        private int totalVotes;
        private UpVote voteUp;
        private DownVote voteDown;

        public Builder review(String value)
        {
            this.currentReview = value;
            return this;
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        return reviewID == review.reviewID;
    }

    @Override
    public int hashCode() {
        return reviewID;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
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
