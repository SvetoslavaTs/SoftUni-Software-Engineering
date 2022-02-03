package LabFunctionalPrograming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            people.putIfAbsent(input[0], Integer.parseInt(input[1]));
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String formatter = scanner.nextLine();

        Predicate<Integer> tester = createTester(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(formatter);
        printFilteredStudent(people, tester, printer);


    }

    private static void printFilteredStudent(LinkedHashMap<String, Integer> people, Predicate<Integer> tester,
                                             Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (tester.test(entry.getValue())) {
                printer.accept(entry);
            }
        }

    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String formatter) {
        Consumer<Map.Entry<String, Integer>> printer = null;
        switch (formatter) {
            case "name age":
                printer = person -> System.out.printf("%s - %d%n",
                        person.getKey(), person.getValue());
                break;
            case "name":
                printer = person -> System.out.printf("%s%n", person.getKey());
                break;
            case "age":
                printer = person -> System.out.printf("%s%n", person.getValue());
        }
        return printer;

    }

    private static Predicate<Integer> createTester(String condition, int age) {
        Predicate<Integer> tester = null;
        switch (condition) {
            case "younger":
                tester = x -> x <= age;
                break;
            case "older":
                tester = x -> x >= age;
        }
        return tester;

    }
}

