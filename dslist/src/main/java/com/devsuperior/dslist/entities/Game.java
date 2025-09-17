package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_game")

@AllArgsConstructor
@NoArgsConstructor
@Data //gerando get,set,hashCode,equals,tostring

public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")//se deixasse como year, iria dar pau no bd
    private Integer year;
    private String Genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;





}
