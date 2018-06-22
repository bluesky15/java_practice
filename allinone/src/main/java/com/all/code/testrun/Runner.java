package com.all.code.testrun;

import com.all.code.deckofcard.Card;
import com.all.code.deckofcard.DeckOfCard;
import com.all.code.deckofcard.Suit;
import com.all.code.util.SuitFactory;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Card> cardsInPlayerHand = new ArrayList<>();
        DeckOfCard deck = new DeckOfCard();
        Suit s1 = SuitFactory.generateSuit("Hearts");
        Suit s2 = SuitFactory.generateSuit("Spades");
        Suit s3 = SuitFactory.generateSuit("Clubs");
        Suit s4 = SuitFactory.generateSuit("Diamond");
        ArrayList<Suit> suits = new ArrayList<>();
        suits.add(s1);
        suits.add(s2);
        suits.add(s3);
        suits.add(s4);
        deck.setDeck(suits);

        //s = Operation.suffle(s, 10);
//        for (Card c : s.getPack()) {
//            System.out.println(c);
//        }
    }
}
