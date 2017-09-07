package com.buxlife.gamereviews.Utility;

import java.util.UUID;

/**
 * Created by Bux_Life on 2017/09/05.
 */
public class KeyGenerator {

    public static String getEntityId(){
        return UUID.randomUUID().toString();
    }
}
