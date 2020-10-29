package poker.combinations;

import poker.Card;
import poker.CardValue;

import java.util.Collections;
import java.util.List;

public class RoyalFlush implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        Collections.sort(cards);

        boolean suit = cards
                .stream()
                .allMatch(card -> card.getSuit() == cards.get(0).getSuit());

        boolean value = cards.get(0).getValue() == CardValue.V10
                && cards.get(cards.size() - 1).getValue() == CardValue.A;

        if (suit && value) {
            System.out.println("Роял Флеш!");
            return true;
        }

        return false;
    }
}
