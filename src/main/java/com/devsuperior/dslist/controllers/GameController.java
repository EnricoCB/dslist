package com.devsuperior.dslist.controllers;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private final GameService gameService;
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> games = gameService.findAll();
        return games;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findAll(@PathVariable Long id){
        GameDTO game = gameService.findById(id);
        return game;
    }
}
