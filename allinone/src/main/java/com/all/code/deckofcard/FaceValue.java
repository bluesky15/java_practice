package com.all.code.deckofcard;

public enum FaceValue {
    ACE(1,"Ace"),
    TWO(2,"Two"),
    THREE(3,"Three"),
    FOUR(4,"Four"),
    FIVE(5,"Five"),
    SIX(6,"Six"),
    SEVEN(7,"Seven"),
    EIGHT(8,"Eight"),
    NINE(9,"Nine"),
    TEN(10,"Ten"),
    JACK(11,"Jack"),
    QUEEN(12,"Queen"),
    KING(13,"King");
    private final int faceValue;
    private final String name;

    private FaceValue(int faceValue, String name) {
        this.faceValue = faceValue;
        this.name = name;
    }
    public int getCardFaceValue() {
        return this.faceValue;
    }
    public String getCardName() {
        return this.name;
    }
}
