package com.all.code.deckofcard;

import java.util.ArrayList;

public class DeckOfCard {
    private String name;
    private ArrayList<Suit> deck;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Suit> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Suit> deck) {
        this.deck = deck;
    }

}
