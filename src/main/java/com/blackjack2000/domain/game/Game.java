package com.blackjack2000.domain.game;

import com.blackjack2000.domain.Deck;
import com.blackjack2000.domain.participant.Dealer;

public class Game {
    
    Dealer dealer = new Dealer(new Deck());
    Deal playerDeal = new Deal(dealer.dealCardFaceUp(), dealer.dealCardFaceUp());
    Deal dealerDeal = new Deal(dealer.dealCardFaceUp(), dealer.dealCardFaceDown());
}
