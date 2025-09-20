package com.devsuperior.dslist.DTOs;

import com.devsuperior.dslist.entities.GameList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameListDTO {

    private String name;

    public GameListDTO(GameList gameList){
        BeanUtils.copyProperties(gameList,this);
    }


}
