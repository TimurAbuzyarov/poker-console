package poker.combinations;

import poker.Card;

import java.util.List;

public class Flush implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        boolean result = cards.stream().allMatch(card -> card.getSuit() == cards.get(0).getSuit());

        if (result) {
            System.out.println("Флеш!");
            return true;
        }

        return false;
    }
}
