package model;

public class Card {
    private Integer id;
    private String cardName;
    private String cardType;
    private Integer cardAtk;
    private Integer cardDef;
    private Integer cardStars;
    private String cardPowerEffects;
    private String cardFileName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getCardAtk() {
        return cardAtk;
    }

    public void setCardAtk(Integer cardAtk) {
        this.cardAtk = cardAtk;
    }

    public Integer getCardDef() {
        return cardDef;
    }

    public void setCardDef(Integer cardDef) {
        this.cardDef = cardDef;
    }

    public Integer getCardStars() {
        return cardStars;
    }

    public void setCardStars(Integer cardStars) {
        this.cardStars = cardStars;
    }

    public String getCardPowerEffects() {
        return cardPowerEffects;
    }

    public void setCardPowerEffects(String cardPowerEffects) {
        this.cardPowerEffects = cardPowerEffects;
    }

    public String getCardFileName() {
        return cardFileName;
    }

    public void setCardFileName(String cardFileName) {
        this.cardFileName = cardFileName;
    }
}
