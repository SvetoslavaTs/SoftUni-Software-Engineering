package ExercisesWorkingWithAbstractions.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Card Ranks")) {
            CardRank[] values = CardRank.values();
            System.out.println(input + ":");
            for (CardRank value : values) {
                System.out.println(value);
            }
        }
    }
}
