package LabMethods;

import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());
        System.out.println(getMultipleOfEvensAndOdds(number));

    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int sumEvens = getSumOfEvens(number);
        int sumOdds = getSumOfOdds(number);
        return sumEvens * sumOdds;
    }

    public static int getSumOfEvens(int number) {
        int sumEven = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            }
            number /= 10;
        }

        return sumEven;
    }

    public static int getSumOfOdds(int number) {
        int sumOdds = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sumOdds += digit;
            }
            number /= 10;
        }
        return sumOdds;
    }
}

