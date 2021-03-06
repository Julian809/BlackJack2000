package com.blackjack2000.domain.game;

import com.blackjack2000.domain.Deck;

public class Deal {

    private final Deck.Card firstCard;
    private final Deck.Card secondCard;

    public Deal(Deck.Card firstCard, Deck.Card secondCard) {

        this.firstCard = firstCard;
        this.secondCard = secondCard;
    }

    public Deck.Card getFirtCard() {
        return firstCard;
    }

    public Deck.Card getSecondCard() {
        return secondCard;
    }
}
