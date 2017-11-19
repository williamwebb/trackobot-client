
package io.williamwebb.trackobot.model.stats.decks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DecksStats {

    @SerializedName("stats")
    @Expose
    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
