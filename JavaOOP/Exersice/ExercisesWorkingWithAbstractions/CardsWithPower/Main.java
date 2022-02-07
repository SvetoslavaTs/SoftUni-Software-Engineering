package ExercisesWorkingWithAbstractions.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rankPower = scanner.nextLine();
        String suitPower = scanner.nextLine();

        Card card = new Card(CardRank.valueOf(rankPower), CardSuit.valueOf(suitPower));
        System.out.println(card);

    }
}
