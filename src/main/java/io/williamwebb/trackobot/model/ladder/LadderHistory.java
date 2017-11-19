package io.williamwebb.trackobot.model.ladder;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LadderHistory implements Serializable {

    @SerializedName("history")
    @Expose
    private List<History> history = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
