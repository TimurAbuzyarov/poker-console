package poker.combinations;

import poker.Card;

import java.util.List;

public class TwoPairs implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        long count = cards.stream().mapToInt(Card::getRank).distinct().count();

        if (count == 3) {
            System.out.println("Две пары!");
            return true;
        }

        return false;
    }
}
