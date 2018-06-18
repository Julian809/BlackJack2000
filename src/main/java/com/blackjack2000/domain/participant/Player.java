package com.blackjack2000.domain.participant;

import com.blackjack2000.domain.game.Deal;

public class Player {
    
    
    private Deal deal;
    public Player(Deal deal) {
        
        this.deal = deal;
    }
    
    //Place a bet
    public void placeBet(int betAmount) {
    
    }
    
    public boolean aceIsWorth11() {
        
        return true;
    }
    
    
}
