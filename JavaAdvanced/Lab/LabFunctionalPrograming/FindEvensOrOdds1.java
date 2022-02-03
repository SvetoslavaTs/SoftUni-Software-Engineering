package LabFunctionalPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String condition = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            numbers.add(i);
        }

        List<Integer> filtered = numbers.stream()
                .filter(createTester(condition))
                .collect(Collectors.toList());

        for (Integer s : filtered)
            System.out.print(s + " ");
    }


    private static Predicate<Integer> createTester(String condition) {
        Predicate<Integer> tester = null;
        switch (condition) {
            case "odd":
                tester = x -> x % 2 != 0;
                break;
            case "even":
                tester = x -> x % 2 == 0;
        }
        return tester;

    }
}
