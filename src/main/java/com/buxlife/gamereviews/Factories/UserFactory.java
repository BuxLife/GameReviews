package com.buxlife.gamereviews.Factories;

import com.buxlife.gamereviews.Domain.User;
import com.buxlife.gamereviews.Utility.KeyGenerator;

import java.util.Date;

/**
 * Created by Bux_Life on 2017/09/05.
 */
public class UserFactory {
        public static User buildUser(Date dateJoined, String username, String pwd){
            User game = new User.Builder()
                    .userID(KeyGenerator.getEntityId())
                    .dateJoined(dateJoined)
                    .username(username)
                    .password(pwd)
                    .build();
            return game;
    }
}
