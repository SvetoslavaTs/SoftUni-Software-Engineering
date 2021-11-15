package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int numberAsInt = Integer.parseInt(number);
        int sum = 0;

        for (int i = 0; i <= number.length() - 1; i++) {
            char currentDigit = number.charAt(i);
            int digit = Integer.parseInt(String.valueOf(currentDigit));

            int sumFactorial = 1;
            for (int j = 1; j <= digit; j++) {
                sumFactorial *= j;
            }
            sum += sumFactorial;
        }
        if (sum == numberAsInt) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

