package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 1;
        int printedNumbers = 0;

        while (n > printedNumbers) {
            if (number % 2 == 1) {
                sum += number;
                System.out.println(number);
                printedNumbers++;
            }
            number++;
        }
        System.out.println("Sum: " + sum);
    }
}
