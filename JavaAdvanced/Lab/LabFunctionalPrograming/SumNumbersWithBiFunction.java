package LabFunctionalPrograming;

import java.util.Scanner;
import java.util.function.BiFunction;

public class SumNumbersWithBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int length = input.length;
        int sum = Integer.parseInt(input[0]);

        if (input.length >= 2) {
            BiFunction<Integer, String, Integer> parser =
                    (x, y) -> x + Integer.parseInt(y);
            for (int i = 1; i < input.length; i++)
                sum = parser.apply(sum, input[i]);
        }

        System.out.println("Count = " + length);
        System.out.println("Sum = " + sum);

    }
}
