package com.devsuperior.dslist.Controller;

import com.devsuperior.dslist.DTOs.GameDTO;
import com.devsuperior.dslist.DTOs.GameFullDTO;
import com.devsuperior.dslist.Services.GameService;
import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll(){
        List<GameDTO> games = gameService.findAll();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameFullDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(gameService.findbyID(id));
    }
}
