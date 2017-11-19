package io.williamwebb.trackobot.model.ladder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CardHistory implements Serializable {

    @SerializedName("turn")
    @Expose
    private Integer turn;
    @SerializedName("player")
    @Expose
    private String player;
    @SerializedName("card")
    @Expose
    private Card card;

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
