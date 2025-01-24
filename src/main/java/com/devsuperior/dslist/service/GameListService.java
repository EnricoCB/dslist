package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public List<GameListDTO> findAll() {
        List<GameList> gameLists = gameListRepository.findAll();
        return gameLists.stream().map(x -> new GameListDTO(x)).toList();
    }

}
