package com.buxlife.gamereviews.API;

import com.buxlife.gamereviews.Domain.Game;
import com.buxlife.gamereviews.Factories.GameFactory;
import com.buxlife.gamereviews.Services.Game.Impl.GameServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by Bux_Life on 2017/09/06.
 */
@Controller
@RequestMapping(path = "/GameReviews")
public class GameController {

    @Autowired
    private GameServiceImpl gameService;

    @GetMapping(path = "/add/{gameTitle]")
    public @ResponseBody String addGame(@PathVariable String gameTitle, String description){
        Game game = GameFactory.buildGame(gameTitle, description);
        gameService.save(game);
        return new Gson().toJson(game);
    }
}
