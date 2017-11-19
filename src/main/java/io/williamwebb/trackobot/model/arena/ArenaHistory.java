
package io.williamwebb.trackobot.model.arena;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArenaHistory {

    @SerializedName("arena")
    @Expose
    private List<Arena> arena = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<Arena> getArena() {
        return arena;
    }

    public void setArena(List<Arena> arena) {
        this.arena = arena;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
