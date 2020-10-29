package poker.combinations;

import poker.Card;

import java.util.Collections;
import java.util.List;

public class ThreeOfKind implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        Collections.sort(cards);

        boolean result = cards.get(0).getRank() == cards.get(2).getRank()
                || cards.get(1).getRank() == cards.get(3).getRank()
                || cards.get(2).getRank() == cards.get(4).getRank();

        if (result) {
            System.out.println("Тройник!");
            return true;
        }

        return false;
    }
}
