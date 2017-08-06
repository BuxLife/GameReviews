package com.buxlife.gamereviews.Domain;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class DownVote {
    private int counter;

    public DownVote(Builder builder){this.counter = builder.counter;}

    public static class Builder {
        private int counter;

        public Builder counter(int value) {
            this.counter = value;
            return this;
        }

        public DownVote build(){return new DownVote(this);}
    }
}
