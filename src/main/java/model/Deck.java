package model;

import java.util.ArrayList;

public class Deck {
    private Integer id;
    private String deckName;
    private String deckType;
    private ArrayList<Integer> deckCards;
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
