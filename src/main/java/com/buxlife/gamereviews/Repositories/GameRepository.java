package com.buxlife.gamereviews.Repositories;

import com.buxlife.gamereviews.Domain.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bux_Life on 2017/08/12.
 */
public interface GameRepository extends CrudRepository<Game, String>{
}
