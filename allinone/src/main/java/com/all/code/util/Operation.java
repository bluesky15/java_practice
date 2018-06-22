package com.all.code.util;

import com.all.code.deckofcard.Suit;

import java.util.Collections;

public class Operation {
    public static Suit suffle(Suit suit,int frequency){
        for(int i=0;i<frequency;i++){
        Collections.shuffle(suit.getPack());
        }
        return suit;
    }
}
