package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class DownVote implements Serializable {
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DownVote downVote = (DownVote) o;

        return counter == downVote.counter;
    }

    @Override
    public int hashCode() {
        return counter;
    }
}
