package com.crud.crudbook.service;

import com.crud.crudbook.entity.Game;

import java.util.List;

public interface IGameService {

    List<Game> getGames();

    Game saveGame(Game game);

    Game updateGame(Game game);

    void deleteGame(Long id);

}