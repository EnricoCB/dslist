package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public record GameListDTO(long id, String name) {

    public GameListDTO(GameList gameList) {
        this(
                gameList.getId(),
                gameList.getName()
        );
    }
}
