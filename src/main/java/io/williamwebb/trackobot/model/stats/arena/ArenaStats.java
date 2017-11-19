
package io.williamwebb.trackobot.model.stats.arena;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.williamwebb.trackobot.model.stats.Stats;

public class ArenaStats {

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
