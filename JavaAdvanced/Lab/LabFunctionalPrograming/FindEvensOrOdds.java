package LabFunctionalPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String condition = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            numbers.add(i);
            if (condition.equals("odd")) {
                if (EvenOrOdd(i, x -> x % 2 != 0)) {
                    System.out.print(i + " ");
                }
            } else if (condition.equals("even")) {
                if (EvenOrOdd(i, x -> x % 2 == 0)) {
                    System.out.print(i + " ");
                }
            }

        }

    }

    private static boolean EvenOrOdd(int number, Predicate<Integer> predicate) {
        return predicate.test(number);
    }
}
