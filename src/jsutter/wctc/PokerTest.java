package jsutter.wctc;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PokerTest {
    Deck deck = new Deck();
    List<Card> hand = new ArrayList<Card>();
    Poker poker = new Poker();

    @BeforeEach
    void runIt() {
        hand.add(deck.getCard(2));
        hand.add(deck.getCard(9));
        hand.add(deck.getCard(4));
        hand.add(deck.getCard(5));
        hand.add(deck.getCard(6));
    }
    @org.junit.jupiter.api.Test
    void isStraight() {
        assertTrue(poker.isStraight(hand));
    }

    @org.junit.jupiter.api.Test
    void isStraightFlush() {
        assertTrue(poker.isStraightFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void isHighCard() {
        assertTrue(poker.isHighCard(hand));
    }

    @org.junit.jupiter.api.Test
    void isHighCard() {
        assertTrue(poker.isFullHouse(hand));
    }

    @org.junit.jupiter.api.Test
    void isHighCard() {
        assertTrue(poker.isTwoPairs(hand));
    }
}