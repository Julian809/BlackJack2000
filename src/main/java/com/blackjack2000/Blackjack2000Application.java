package com.blackjack2000;

import com.blackjack2000.domain.Deck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Blackjack2000Application {

    public static void main(String[] args) {

        SpringApplication.run(Blackjack2000Application.class, args);
        Deck deck = new Deck();
        
        for(Deck.Card card : deck.getDeck()) 
            System.out.println(card.toString());
    }
}
