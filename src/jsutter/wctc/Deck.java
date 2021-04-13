package jsutter.wctc;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<Card>();
    public Deck() {
        deck.add(new Card("Two", "Heart", 2));
        deck.add(new Card("Three", "Heart", 3));
        deck.add(new Card("Four", "Heart", 4));
        deck.add(new Card("Five", "Heart", 5));
        deck.add(new Card("Six", "Heart", 6));
        deck.add(new Card("Seven", "Heart", 7));
        deck.add(new Card("Eight", "Heart", 8));
        deck.add(new Card("Nine", "Heart", 9));
        deck.add(new Card("Ten", "Heart", 10));
        deck.add(new Card("Jack", "Heart", 11));
        deck.add(new Card("Queen", "Heart", 12));
        deck.add(new Card("King", "Heart", 13));
        deck.add(new Card("Ace", "Heart", 14));
        deck.add(new Card("Two", "Diamond", 2));
        deck.add(new Card("Three", "Diamond", 3));
        deck.add(new Card("Four", "Diamond", 4));
        deck.add(new Card("Five", "Diamond", 5));
        deck.add(new Card("Six", "Diamond", 6));
        deck.add(new Card("Seven", "Diamond", 7));
        deck.add(new Card("Eight", "Diamond", 8));
        deck.add(new Card("Nine", "Diamond", 9));
        deck.add(new Card("Ten", "Diamond", 10));
        deck.add(new Card("Jack", "Diamond", 11));
        deck.add(new Card("Queen", "Diamond", 12));
        deck.add(new Card("King", "Diamond", 13));
        deck.add(new Card("Ace", "Diamond", 14));
        deck.add(new Card("Two", "Club", 2));
        deck.add(new Card("Three", "Club", 3));
        deck.add(new Card("Four", "Club", 4));
        deck.add(new Card("Five", "Club", 5));
        deck.add(new Card("Six", "Club", 6));
        deck.add(new Card("Seven", "Club", 7));
        deck.add(new Card("Eight", "Club", 8));
        deck.add(new Card("Nine", "Club", 9));
        deck.add(new Card("Ten", "Club", 10));
        deck.add(new Card("Jack", "Club", 11));
        deck.add(new Card("Queen", "Club", 12));
        deck.add(new Card("King", "Club", 13));
        deck.add(new Card("Ace", "Club", 14));
        deck.add(new Card("Two", "Spade", 2));
        deck.add(new Card("Three", "Spade", 3));
        deck.add(new Card("Four", "Spade", 4));
        deck.add(new Card("Five", "Spade", 5));
        deck.add(new Card("Six", "Spade", 6));
        deck.add(new Card("Seven", "Spade", 7));
        deck.add(new Card("Eight", "Spade", 8));
        deck.add(new Card("Nine", "Spade", 9));
        deck.add(new Card("Ten", "Spade", 10));
        deck.add(new Card("Jack", "Spade", 11));
        deck.add(new Card("Queen", "Spade", 12));
        deck.add(new Card("King", "Spade", 13));
        deck.add(new Card("Ace", "Spade", 14));

    }

    public Card getCard(int i) {
        return deck.get(i);
    }

}
