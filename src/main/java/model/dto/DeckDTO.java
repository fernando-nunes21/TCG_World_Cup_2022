package model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DeckDTO {
    private Integer id;

    @JsonProperty("deck_name")
    private String deckName;

    @JsonProperty("deck_type")
    private String deckType;

    @JsonProperty("deck_cards")
    private ArrayList<Integer> deckCards;

    @JsonProperty("user_id")
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public String getDeckType() {
        return deckType;
    }

    public void setDeckType(String deckType) {
        this.deckType = deckType;
    }

    public ArrayList<Integer> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(ArrayList<Integer> deckCards) {
        this.deckCards = deckCards;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
