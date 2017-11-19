package io.williamwebb.trackobot.model.ladder;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class History implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("hero")
    @Expose
    private String hero;
    @SerializedName("hero_deck")
    @Expose
    private String heroDeck;
    @SerializedName("opponent")
    @Expose
    private String opponent;
    @SerializedName("opponent_deck")
    @Expose
    private Object opponentDeck;
    @SerializedName("coin")
    @Expose
    private Boolean coin;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("note")
    @Expose
    private Object note;
    @SerializedName("added")
    @Expose
    private String added;
    @SerializedName("card_history")
    @Expose
    private List<CardHistory> cardHistory = null;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("legend")
    @Expose
    private Object legend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroDeck() {
        return heroDeck;
    }

    public void setHeroDeck(String heroDeck) {
        this.heroDeck = heroDeck;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public Object getOpponentDeck() {
        return opponentDeck;
    }

    public void setOpponentDeck(Object opponentDeck) {
        this.opponentDeck = opponentDeck;
    }

    public Boolean getCoin() {
        return coin;
    }

    public void setCoin(Boolean coin) {
        this.coin = coin;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDuration() {
        return duration + "";
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public List<CardHistory> getCardHistory() {
        return cardHistory;
    }

    public void setCardHistory(List<CardHistory> cardHistory) {
        this.cardHistory = cardHistory;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Object getLegend() {
        return legend;
    }

    public void setLegend(Object legend) {
        this.legend = legend;
    }

}
