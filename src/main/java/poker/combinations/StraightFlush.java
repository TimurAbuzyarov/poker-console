package poker.combinations;

import poker.Card;

import java.util.List;

public class StraightFlush implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        boolean suit = cards
                .stream()
                .allMatch(card -> card.getSuit() == cards.get(0).getSuit());

        int average = (int) cards
                .stream()
                .sorted()
                .mapToInt(Card::getRank)
                .average()
                .orElse(-1);

        boolean value = average == cards.get(2).getRank();

        if (suit && value) {
            System.out.println("Стрит Флеш!");
            return true;
        }

        return false;
    }
}
