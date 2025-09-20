package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.DTOs.GameDTO;
import com.devsuperior.dslist.DTOs.GameFullDTO;
import com.devsuperior.dslist.DTOs.GameListDTO;
import com.devsuperior.dslist.Projections.GameProjection;
import com.devsuperior.dslist.Repositories.GameListRepository;
import com.devsuperior.dslist.Repositories.GameRepository;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }



    public List<GameDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gamesDTO = games.stream().map(y -> new GameDTO(y)).toList();
        return gamesDTO;
    }

    public GameFullDTO findbyID(Long id) {
        Game game = gameRepository.findById(id).orElseThrow(() ->
                new RuntimeException("ID não encontrado"));
        return new GameFullDTO(game);
    }

    public List<GameDTO> searchByList(Long listId){
       List<GameProjection> gameProjection = gameRepository.searchByList(listId);
       List<GameDTO> gameDTOS = gameProjection.stream().map(x->new GameDTO(x)).toList();
       return gameDTOS;
    }



}