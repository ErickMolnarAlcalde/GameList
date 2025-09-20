package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {


    private Long gameID;
    private Long gameListID;

    public BelongingPK() {
    }

    public BelongingPK(Long gameID, Long gameListID) {
        this.gameID = gameID;
        this.gameListID = gameListID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(gameID, that.gameID) && Objects.equals(gameListID, that.gameListID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, gameListID);
    }

    public Long getGameID() {
        return gameID;
    }

    public void setGameID(Long gameID) {
        this.gameID = gameID;
    }

    public Long getGameListID() {
        return gameListID;
    }

    public void setGameListID(Long gameListID) {
        this.gameListID = gameListID;
    }
}
