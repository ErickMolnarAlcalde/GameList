package com.devsuperior.dslist.DTOs;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameDTO() {

    }

    public GameDTO(Game game){
        this.id = game.getId();
        this.shortDescription = game.getShortDescription();
        this.year = game.getYear();
        this.title = game.getTitle();
        this.imgUrl = game.getImgUrl();
    }

    public GameDTO(Long id, String shortDescription, Integer year, String title, String imgUrl) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.year = year;
        this.title = title;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
