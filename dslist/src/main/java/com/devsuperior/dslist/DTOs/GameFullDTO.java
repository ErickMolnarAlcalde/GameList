package com.devsuperior.dslist.DTOs;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameFullDTO {

    private Long id;
    private String title;
    private Integer year;
    private String Genre;
    private String platform;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameFullDTO(Game game){
        BeanUtils.copyProperties(game, this);
    }

}
