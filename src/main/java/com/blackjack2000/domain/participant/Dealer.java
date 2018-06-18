package com.blackjack2000.domain.participant;

import com.blackjack2000.domain.Deck;

public class Dealer {

    Deck deck;
    public Dealer(Deck deck) {
        
        this.deck = deck;
    }
    
    public Deck.Card dealCardFaceUp() {
        
        return deck.getDeck().pop();
    }
    
    public Deck.Card dealCardFaceDown() {
        
        return  deck.getDeck().pop().setFaceDown(true);
    }
}
