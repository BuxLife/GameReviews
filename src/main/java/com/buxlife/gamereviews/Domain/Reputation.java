package com.buxlife.gamereviews.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/05.
 */
public class Reputation implements Serializable{
    private int reputation;
    private String rank;

    public int getReputation() {
        return reputation;
    }

    public String getRank(int reputation){
        if(reputation < 10){
            rank = "Novice";
        }
        else if((reputation > 10) && (reputation < 20) ){
            rank = "Casual";
        }
        else if (reputation == 100){
            rank = "Grand Master";
        }

        return rank;
    }

}
