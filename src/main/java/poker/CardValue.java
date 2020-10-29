package poker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CardValue {
    V2("2", 2), V3("3", 3), V4("4", 4),
    V5("5", 5), V6("6", 6), V7("7", 7),
    V8("8", 8), V9("9", 9), V10("10", 10),
    J("J", 11), Q("Q", 12), K("K", 13),
    A("A", 14);

    private final String value;
    private final int rank;
}
