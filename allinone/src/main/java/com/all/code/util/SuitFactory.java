package com.all.code.util;

import com.all.code.deckofcard.Card;
import com.all.code.deckofcard.FaceValue;
import com.all.code.deckofcard.Suit;

import java.util.ArrayList;

public class SuitFactory {
    public static Suit generateSuit(String suitName) {
        Suit s = new Suit(suitName);
        ArrayList<Card> pack = new ArrayList<>();
//        for (int i = 1; i < 14; i++) {
//            Card card = new Card(suitName, i);
//            pack.add(card);
//        }
        Card c1 = new Card(suitName, FaceValue.ACE);
        pack.add(c1);
        c1=null;
        Card c2 = new Card(suitName, FaceValue.TWO);
        pack.add(c2);
        c2=null;
        Card c3 = new Card(suitName, FaceValue.THREE);
        pack.add(c3);
        c3=null;
        Card c4 = new Card(suitName, FaceValue.FOUR);
        pack.add(c4);
        c4=null;
        Card c5 = new Card(suitName, FaceValue.FIVE);
        pack.add(c5);
        c5=null;
        Card c6 = new Card(suitName, FaceValue.SIX);
        pack.add(c6);
        c6=null;
        Card c7 = new Card(suitName, FaceValue.SEVEN);
        pack.add(c7);
        c7=null;
        Card c8 = new Card(suitName, FaceValue.EIGHT);
        pack.add(c8);
        c8=null;
        Card c9 = new Card(suitName, FaceValue.NINE);
        pack.add(c9);
        c9=null;
        Card c10 = new Card(suitName, FaceValue.TEN);
        pack.add(c10);
        c10=null;
        Card c11 = new Card(suitName, FaceValue.JACK);
        pack.add(c11);
        c11=null;
        Card c12 = new Card(suitName, FaceValue.QUEEN);
        pack.add(c12);
        c12=null;
        Card c13 = new Card(suitName, FaceValue.KING);
        pack.add(c13);
        c13=null;
        s.setPack(pack);
        return s;
    }
}
