package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.DTOs.GameDTO;
import com.devsuperior.dslist.Repositories.GameRepository;
import com.devsuperior.dslist.entities.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameDTO> findAll(){
       List<Game> games = gameRepository.findAll();
        List<GameDTO> gamesDTO = games.stream().map(y -> new GameDTO(y)).toList();
        return gamesDTO;
    }
}
