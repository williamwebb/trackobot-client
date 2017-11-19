
package io.williamwebb.trackobot.model.stats.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.williamwebb.trackobot.model.stats.Stats;

public class ClassesStats {

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
