
package io.williamwebb.trackobot.model.stats;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Overall {

  @SerializedName("wins")
  @Expose
  private Integer wins;
  @SerializedName("losses")
  @Expose
  private Integer losses;
  @SerializedName("total")
  @Expose
  private Integer total;
  @SerializedName("runs")
  @Expose
  private int runs;

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

  public int getRuns() {
    return runs;
  }

  public void setRuns(int runs) {
    this.runs = runs;
  }

  public String getWinPercentage() {
    if (total > 0) {
      float percentage = (float) wins / (float) total * 100.0f;
      return round(percentage, 2) + "%";
    }
    return "- %";
  }

  public float getWinNumberPercentage() {
    return (float) wins / (float) total;
  }

  public String getAverage() {
    if (runs > 0) {
      float percentage = (float) wins / (float) runs;
      return round(percentage, 1) + "";
    }
    return "0";
  }

  public static float round(float d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(Float.toString(d));
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.floatValue();
  }

}
