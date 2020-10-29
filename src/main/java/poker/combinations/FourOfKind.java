package poker.combinations;

import poker.Card;

import java.util.Collections;
import java.util.List;

public class FourOfKind implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        Collections.sort(cards);

        boolean result = cards.get(0).getRank() == cards.get(3).getRank()
                || cards.get(1).getRank() == cards.get(4).getRank();

        if (result) {
            System.out.println("Каре!");
            return true;
        }

        return false;
    }
}
