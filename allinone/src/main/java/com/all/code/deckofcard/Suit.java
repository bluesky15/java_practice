package com.all.code.deckofcard;

import java.util.ArrayList;

public class Suit {
    private String suitName;
    private ArrayList<Card> pack;

    public Suit(String suitName) {
        this.suitName = suitName;
    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }

    public ArrayList<Card> getPack() {
        return pack;
    }

    public void setPack(ArrayList<Card> pack) {
        this.pack = pack;
    }
}
