package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberGameReadSetWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).forEach(firstDeck::add);

        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));


        int rounds = 1;
        while (rounds <= 50 || firstDeck.isEmpty() || secondDeck.isEmpty()) {

            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }
            int firstNumber = firstDeck.iterator().next();
            firstDeck.remove(firstNumber);

            int secondNumber = secondDeck.iterator().next();
            secondDeck.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstDeck.add(firstNumber);
                firstDeck.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            } else {
                firstDeck.add(firstNumber);
                secondDeck.add(secondNumber);
            }

            rounds++;
        }

        if (secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player win!");
        } else if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
