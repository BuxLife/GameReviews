package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */

public class UpVote implements Serializable {
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpVote upVote = (UpVote) o;

        return counter == upVote.counter;
    }

    @Override
    public int hashCode() {
        return counter;
    }
}
