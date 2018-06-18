package com.blackjack2000.domain;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    //private Deque<Card> stack = new ArrayDeque<>();
    //Investigate this implementation
    private final Stack<Card> stackOfCards = new Stack<>();

    public Deck() {

        fillEmptyDeck();
    }

    private void fillEmptyDeck() {

        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] cardNames = {
            "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Jack", "Queen", "King"
        };
        int[] numericValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        Card tempCard;

        for (String suit : suits) {

            for (int i = 0; i < cardNames.length; i++) {

                tempCard = new Card(numericValues[i], suit, cardNames[i]);
                stackOfCards.push(tempCard);
            }
        }
    }

    public Stack<Card> getDeck() {

        return stackOfCards;
    }

    public void shuffleDeck() {

        for (int i = 0; i < 3; i++) {
            Collections.shuffle(stackOfCards);
        }
    }

    public class Card implements Comparable<Card> {

        private final int cardValue;
        private final String cardSuit;
        private final String cardName;
        private boolean faceDown;

        public Card(int cardValue, String cardSuit, String cardName) {

            this.cardValue = cardValue;
            this.cardSuit = cardSuit;
            this.cardName = cardName;
        }

        public String getCardName() {
            return cardName;
        }

        public int getCardValue() {
            return cardValue;
        }

        public String getCardSuit() {
            return cardSuit;
        }

        public boolean isFaceDown() {
            return faceDown;
        }

        public Card setFaceDown(boolean faceDown) {
            this.faceDown = faceDown;
            return this;
        }

        @Override
        public int compareTo(Card cardToCompare) {

            if (getCardValue() > cardToCompare.getCardValue()) {
                return 1;
            } else if (getCardValue() < cardToCompare.getCardValue()) {
                return -1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {

            return cardName + " of " + cardSuit;
        }
    }
}
