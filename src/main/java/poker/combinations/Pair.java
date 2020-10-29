package poker.combinations;

import poker.Card;

import java.util.List;

public class Pair implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        long count = cards.stream().mapToInt(Card::getRank).distinct().count();

        if (count == 4) {
            System.out.println("Пара!");
            return true;
        }

        return false;
    }
}
