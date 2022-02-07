package ExercisesWorkingWithAbstractions.CardsSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Card Suits")) {
            CardSuit[] values = CardSuit.values();
            System.out.println(input + ":");
            for (CardSuit value : values) {
                System.out.println(value);
            }
        }
    }
}