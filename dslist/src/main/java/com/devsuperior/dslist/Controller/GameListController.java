package com.devsuperior.dslist.Controller;

import com.devsuperior.dslist.DTOs.GameDTO;
import com.devsuperior.dslist.DTOs.GameListDTO;
import com.devsuperior.dslist.Services.GameListService;
import com.devsuperior.dslist.Services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService){
        this.gameListService = gameListService;
        this.gameService = gameService;
    }




    @GetMapping
    public ResponseEntity<List<GameListDTO>> findall(){
        return ResponseEntity.ok().body(gameListService.gameListDTOS());

    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameDTO>> findall2(@PathVariable Long listId){
        return ResponseEntity.ok().body(gameService.searchByList(listId));
    }
}
