package com.all.code.deckofcard;

public class Card {
    private String suitName;
    private FaceValue faceValue;
    private int globalPosition;

    public Card(String suitName, FaceValue faceValue) {
        this.suitName = suitName;
        this.faceValue = faceValue;
    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

    public int getGlobalPosition() {
        return globalPosition;
    }

    public void setGlobalPosition(int position) {
        this.globalPosition = position;
    }

    @Override
    public String toString() {
        return faceValue.getCardName()+" of "+suitName;
    }
}
