package io.williamwebb.trackobot.model.stats;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.williamwebb.trackobot.model.stats.arena.AsHero;
import io.williamwebb.trackobot.model.stats.classes.AsClass;
import io.williamwebb.trackobot.model.stats.classes.VsClass;

import java.util.List;

/**
 * Created by williamwebb on 4/8/17.
 */

public class Stats {
  @Expose
  @SerializedName("overall")
  Overall overallStats;
  @Expose
  @SerializedName("as_class")
  AsClass asClass;
  @Expose
  @SerializedName("vs_class")
  VsClass vsClass;
  @Expose
  @SerializedName("as_hero")
  AsHero asHero;
  @Expose
  @SerializedName("count_by_wins")
  List<Integer> countByWins;

  public Overall getOverallStats() {
    return overallStats;
  }

  public AsClass getAsClass() {
    return asClass;
  }

  public VsClass getVsClass() {
    return vsClass;
  }

  public AsHero getAsHero() {
    return asHero;
  }

  public void setAsHero(AsHero asHero) {
    this.asHero = asHero;
  }

  public List<Integer> getCountByWins() {
    return countByWins;
  }

  public void setCountByWins(List<Integer> countByWins) {
    this.countByWins = countByWins;
  }

}
