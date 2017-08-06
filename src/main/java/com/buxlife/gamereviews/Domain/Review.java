package com.buxlife.gamereviews.Domain;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Review {
    private Reviewer reviewer;
    private String review;
    private int reviewID;

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
