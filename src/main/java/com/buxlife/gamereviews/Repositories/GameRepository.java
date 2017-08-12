package com.buxlife.gamereviews.Repositories;

import com.buxlife.gamereviews.Domain.Game;

/**
 * Created by Bux_Life on 2017/08/12.
 */
public interface GameRepository {
    Game create(Game game);
    Game read();
    Game update();
    void delete();
}
