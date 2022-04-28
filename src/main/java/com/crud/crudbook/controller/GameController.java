package com.crud.crudbook.controller;


import com.crud.crudbook.entity.Game;
import com.crud.crudbook.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class GameController {

    @Autowired
    private IGameService service;

    @GetMapping("get/games")
    public List<Game> getGames(){
        return service.getGames();
    }

    @PostMapping("save/game")
    public Game saveGame(@RequestBody Game game){
        return service.saveGame(game);
    }

    @PutMapping("update/game")
    public Game updateGame(@RequestBody Game game){
        return service.updateGame(game);
    }

    @DeleteMapping("delete/game/{id}")
    public void deleteGame(@PathVariable Long id){
        service.deleteGame(id);
    }
}
