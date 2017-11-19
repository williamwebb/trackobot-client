
package io.williamwebb.trackobot.model.ladder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Card implements Serializable{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("mana")
    @Expose
    private Integer mana;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

}
