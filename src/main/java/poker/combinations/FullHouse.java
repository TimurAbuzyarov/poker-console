package poker.combinations;

import poker.Card;

import java.util.List;

public class FullHouse implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        long count = cards
                .stream()
                .map(Card::getRank)
                .distinct()
                .count();

        if (count == 2) {
            System.out.println("Фул хаус!");
            return true;
        }

        return false;
    }
}
