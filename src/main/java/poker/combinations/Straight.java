package poker.combinations;

import poker.Card;

import java.util.Collections;
import java.util.List;

public class Straight implements Combination {
    @Override
    public boolean check(List<Card> cards) {
        int count = 1;

        Collections.sort(cards);

        for (int i = 0; i < cards.size() - 1; i++) {
            if (cards.get(i).getRank() + 1 == cards.get(i + 1).getRank()) count++;
            if (count == 5) {
                System.out.println("Стрит!");
                return true;
            }
        }

        return false;
    }
}
