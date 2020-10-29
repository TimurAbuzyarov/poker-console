package poker.combinations;

import poker.Card;

import java.util.List;

public interface Combination {
    boolean check(List<Card> cards);
}
