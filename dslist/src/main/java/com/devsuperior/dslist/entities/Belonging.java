package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK belongingPKID;

    @ManyToOne
    @MapsId("gameID")
    private Game game;

    @ManyToOne
    @MapsId("gameListID")
    private GameList gameList;
    private Integer position;

    public Belonging() {
    }

    public Belonging(GameList gameList, Game game) {
        this.gameList = gameList;
        this.game = game;
        this.belongingPKID = new BelongingPK(game.getId(),gameList.getId());
    }

    public BelongingPK getBelongingPKID() {
        return belongingPKID;
    }

    public void setBelongingPKID(BelongingPK belongingPKID) {
        this.belongingPKID = belongingPKID;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(belongingPKID, belonging.belongingPKID) && Objects.equals(game, belonging.game) && Objects.equals(gameList, belonging.gameList) && Objects.equals(position, belonging.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(belongingPKID, game, gameList, position);
    }
}
