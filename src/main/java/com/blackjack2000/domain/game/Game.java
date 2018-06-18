package com.blackjack2000.domain.game;

import com.blackjack2000.domain.Deck;
import com.blackjack2000.domain.participant.Dealer;
import com.blackjack2000.domain.participant.Player;

public class Game {
    
    Dealer dealer;
    Deal playerDeal;
    Deal dealerDeal;
    Player player;
    
    public Game(Dealer dealer, Player player) {
    
        dealer = new Dealer(new Deck());
        playerDeal = new Deal(dealer.dealCardFaceUp(), dealer.dealCardFaceUp());
        dealerDeal = new Deal(dealer.dealCardFaceUp(), dealer.dealCardFaceDown());
        player = new Player(playerDeal);   
    }
}
