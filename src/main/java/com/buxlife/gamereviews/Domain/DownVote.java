package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class DownVote implements Serializable {
    private int counter;

    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }


}
