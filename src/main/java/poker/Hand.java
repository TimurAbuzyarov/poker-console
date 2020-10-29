package poker;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Hand {
    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void changeCard(int position, Card card) {
        cards.remove(position - 1);
        cards.add(position - 1, card);
    }

    public static void printCards(List<Card> cards) {
        System.out.printf("%-9s | %-9s | %-9s | %-9s | %-9s\n", 1, 2, 3, 4, 5);
        System.out.printf("%-9s | %-9s | %-9s | %-9s | %-9s\n", cards.toArray());
    }
}