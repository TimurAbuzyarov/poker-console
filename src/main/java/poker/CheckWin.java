package poker;

import poker.combinations.*;

import java.util.List;

public class CheckWin {
    private static final Combination[] combinations = new Combination[]{
            new RoyalFlush(),
            new StraightFlush(),
            new FourOfKind(),
            new FullHouse(),
            new Flush(),
            new Straight(),
            new ThreeOfKind(),
            new TwoPairs(),
            new Pair()
    };

    public static void check(List<Card> cards) {
        for (Combination combination : combinations) {
            if (combination.check(cards)) {
                Hand.printCards(cards);
                break;
            }
        }
    }
}
