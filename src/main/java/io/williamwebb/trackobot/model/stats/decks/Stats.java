
package io.williamwebb.trackobot.model.stats.decks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.williamwebb.trackobot.model.stats.Overall;

public class Stats {

    @SerializedName("overall")
    @Expose
    private Overall overall;
    @SerializedName("as_deck")
    @Expose
    private AsDeck asDeck;
    @SerializedName("vs_deck")
    @Expose
    private VsDeck vsDeck;

    public Overall getOverall() {
        return overall;
    }

    public void setOverall(Overall overall) {
        this.overall = overall;
    }

    public AsDeck getAsDeck() {
        return asDeck;
    }

    public void setAsDeck(AsDeck asDeck) {
        this.asDeck = asDeck;
    }

    public VsDeck getVsDeck() {
        return vsDeck;
    }

    public void setVsDeck(VsDeck vsDeck) {
        this.vsDeck = vsDeck;
    }

}
