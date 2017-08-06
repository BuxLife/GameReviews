package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */

public class UpVote implements Serializable {
    private int counter;


    public UpVote(Builder builder){this.counter = builder.counter;}


    public static class Builder {
        private int counter;

        public Builder counter(int value) {
            this.counter = value;
            return this;
        }

        public UpVote build(){return new UpVote(this);}
    }

}
