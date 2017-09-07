package com.buxlife.gamereviews.Services.Game.Impl;

import com.buxlife.gamereviews.Domain.Game;
import com.buxlife.gamereviews.Repositories.GameRepository;
import com.buxlife.gamereviews.Services.Game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bux_Life on 2017/09/06.
 */
@Component
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepository gameRepository;

    @Override
    public Game save(Game entity){
        return
                gameRepository.save(entity);
    }

    @Override
    public Game findById(String s){
        return gameRepository.findOne(s);
    }

    @Override
    public Game update(String s){return null;};
}
