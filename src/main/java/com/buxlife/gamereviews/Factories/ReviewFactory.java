package com.buxlife.gamereviews.Factories;

import com.buxlife.gamereviews.Domain.*;

import java.util.Map;

/**
 * Created by Bux_Life on 2017/09/02.
 */
public class ReviewFactory {
    public static Review getGame(Map<String, Object> values) {
        Review review = new Review.Builder()
                .reviewer((Reviewer) values.get("reviewer"))
                .game((Game) (values.get("game")))
                .review((String) values.get("review"))
                .build();
        return review;
    }
}
