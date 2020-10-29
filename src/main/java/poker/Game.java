package poker;

import lombok.Cleanup;
import lombok.Getter;

import java.util.Arrays;
import java.util.Scanner;

@Getter
public class Game {
    private final Deck deck;
    private final Hand hand;

    public Game() {
        deck = new Deck();
        hand = new Hand();
    }

    public void init() {
        dealCards();
        printCards();
        changeCards();
        printCards();
        System.out.println();
        CheckWin.check(hand.getCards());
    }

    private void dealCards() {
        deck.shuffleDeck();

        for (int i = 0; i < 5; i++) {
            hand.addCard(deck.takeCard());
        }
    }

    private void printCards() {
        Hand.printCards(hand.getCards());
    }

    private void changeCards() {
        @Cleanup
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите номера карт, которые вы хотите заменить через пробел\n" +
                "Например, \"1 3 5\" заменят 1, 3 и 5 карты соответственно");

        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Игрок решает не менять карты");
            return;
        }

        String result = input.replaceAll("\\D", "");

        Arrays.stream(result
                .split(""))
                .map(Integer::parseInt)
                .filter(i -> i >= 1 && i <= 5)
                .distinct()
                .forEach(i -> hand.changeCard(i, deck.takeCard()));
    }
}