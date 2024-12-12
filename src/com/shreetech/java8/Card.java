package com.shreetech.java8;

public class Card {

    private Long cardId;
    private Double cardLimit;
    private String cardType;
    private String cardHolder;

    public Card(Long cardId, Double cardLimit, String cardType, String cardHolder) {
        this.cardId = cardId;
        this.cardLimit = cardLimit;
        this.cardType = cardType;
        this.cardHolder = cardHolder;

    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardLimit=" + cardLimit +
                ", cardType='" + cardType + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                '}';
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Double getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(Double cardLimit) {
        this.cardLimit = cardLimit;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
}
