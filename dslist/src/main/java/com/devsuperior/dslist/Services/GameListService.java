package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.DTOs.GameDTO;
import com.devsuperior.dslist.DTOs.GameListDTO;
import com.devsuperior.dslist.Projections.GameProjection;
import com.devsuperior.dslist.Repositories.GameListRepository;
import com.devsuperior.dslist.Repositories.GameRepository;
import com.devsuperior.dslist.entities.GameList;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;
    private final GameRepository gameRepository;

    public GameListService(GameListRepository gameListRepository, GameRepository gameRepository) {
        this.gameListRepository = gameListRepository;
        this.gameRepository = gameRepository;
    }

    public List<GameListDTO> gameListDTOS(){
        List<GameList> gameLists = gameListRepository.findAll();
        List<GameListDTO> gameListDTOS = gameLists.stream().map(y->new GameListDTO(y)).
                collect(Collectors.toList());
        return gameListDTOS;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex ){

        List<GameProjection> list = gameRepository.searchByList(listId);

        GameProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex,obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max ; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }


    }

}
