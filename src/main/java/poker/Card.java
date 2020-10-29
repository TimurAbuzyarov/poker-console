package poker;

import lombok.Value;

@Value
public class Card implements Comparable<Card> {
    Suit suit;
    CardValue value;

    @Override
    public String toString() {
        return value.getValue() + "-" + suit.getValue();
    }

    public int getRank() {
        return value.getRank();
    }

    @Override
    public int compareTo(Card o) {
        return this.getRank() - o.getRank();
    }
}