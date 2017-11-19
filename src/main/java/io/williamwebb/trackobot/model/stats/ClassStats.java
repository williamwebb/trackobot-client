
package io.williamwebb.trackobot.model.stats;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.williamwebb.trackobot.model.stats.arena.Druid;
import io.williamwebb.trackobot.model.stats.arena.Hunter;
import io.williamwebb.trackobot.model.stats.arena.Mage;
import io.williamwebb.trackobot.model.stats.arena.Paladin;
import io.williamwebb.trackobot.model.stats.arena.Priest;
import io.williamwebb.trackobot.model.stats.arena.Rogue;
import io.williamwebb.trackobot.model.stats.arena.Shaman;
import io.williamwebb.trackobot.model.stats.arena.Warlock;
import io.williamwebb.trackobot.model.stats.arena.Warrior;

public class ClassStats {

    @SerializedName("druid")
    @Expose
    private Druid druid;
    @SerializedName("shaman")
    @Expose
    private Shaman shaman;
    @SerializedName("hunter")
    @Expose
    private Hunter hunter;
    @SerializedName("warlock")
    @Expose
    private Warlock warlock;
    @SerializedName("warrior")
    @Expose
    private Warrior warrior;
    @SerializedName("paladin")
    @Expose
    private Paladin paladin;
    @SerializedName("mage")
    @Expose
    private Mage mage;
    @SerializedName("rogue")
    @Expose
    private Rogue rogue;
    @SerializedName("priest")
    @Expose
    private Priest priest;

    public Druid getDruid() {
        return druid;
    }

    public void setDruid(Druid druid) {
        this.druid = druid;
    }

    public Shaman getShaman() {
        return shaman;
    }

    public void setShaman(Shaman shaman) {
        this.shaman = shaman;
    }

    public Hunter getHunter() {
        return hunter;
    }

    public void setHunter(Hunter hunter) {
        this.hunter = hunter;
    }

    public Warlock getWarlock() {
        return warlock;
    }

    public void setWarlock(Warlock warlock) {
        this.warlock = warlock;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Paladin getPaladin() {
        return paladin;
    }

    public void setPaladin(Paladin paladin) {
        this.paladin = paladin;
    }

    public Mage getMage() {
        return mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
    }

    public Rogue getRogue() {
        return rogue;
    }

    public void setRogue(Rogue rogue) {
        this.rogue = rogue;
    }

    public Priest getPriest() {
        return priest;
    }

    public void setPriest(Priest priest) {
        this.priest = priest;
    }

}
