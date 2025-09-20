package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.DTOs.GameListDTO;
import com.devsuperior.dslist.Repositories.GameListRepository;
import com.devsuperior.dslist.entities.GameList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public List<GameListDTO> gameListDTOS(){
        List<GameList> gameLists = gameListRepository.findAll();
        List<GameListDTO> gameListDTOS = gameLists.stream().map(y->new GameListDTO(y)).
                collect(Collectors.toList());
        return gameListDTOS;
    }

}
