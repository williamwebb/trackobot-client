
package io.williamwebb.trackobot.model.stats.decks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CThunDruid {

    @SerializedName("deck_id")
    @Expose
    private Integer deckId;
    @SerializedName("hero")
    @Expose
    private String hero;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("losses")
    @Expose
    private Integer losses;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Integer getDeckId() {
        return deckId;
    }

    public void setDeckId(Integer deckId) {
        this.deckId = deckId;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
