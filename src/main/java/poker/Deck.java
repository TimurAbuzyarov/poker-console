package poker;

import lombok.Getter;

import java.util.*;

@Getter
public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (CardValue value : CardValue.values()) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public Card takeCard() {
        Card card = cards.get(0);
        cards.remove(card);
        return card;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public void takeBackCard(Card card) {
        cards.add(card);
    }
}
