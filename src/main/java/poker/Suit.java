package poker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Suit {
    HEARTS("Черви"), TILES("Бубны"), CLOVES("Крести"), PIKES("Пики");

    private final String value;
}