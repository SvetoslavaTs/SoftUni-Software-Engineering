package ExercisesTextProcessing;

import java.util.Scanner;

public class lettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (String token : tokens) {
            char firstLetter = token.charAt(0);
            int positionOfFirstLetter = getPositionInTheAlphabet(firstLetter);
            char secondLetter = token.charAt(token.length() - 1);
            int positionOfSecondLetter = getPositionInTheAlphabet(secondLetter);
            double number = Double.parseDouble(token.substring(1, token.length() - 1));

            double result = 0;

            if (Character.isUpperCase(firstLetter)) {
                result = number / positionOfFirstLetter;
            } else if (Character.isLowerCase(firstLetter)) {
                result = number * positionOfFirstLetter;
            }

            if (Character.isUpperCase(secondLetter)) {
                result -= positionOfSecondLetter;
            } else if (Character.isLowerCase(secondLetter)) {
                result += positionOfSecondLetter;
            }
            sum += result;

        }
        System.out.printf("%.2f", sum);
    }

    private static int getPositionInTheAlphabet(char letter) {
        char firstLetter = Character.toLowerCase(letter);
        return firstLetter - 96;
    }
}
