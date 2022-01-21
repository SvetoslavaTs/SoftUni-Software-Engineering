package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> results = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();

        while (!input.equals("exam finished")) {
            String[] tokens = input.split("-");
            if (input.contains("banned")) {
                String name = tokens[0];
                results.remove(name);
            } else {
                String name = tokens[0];
                String language = tokens[1];
                Integer points = Integer.parseInt(tokens[2]);
                results.putIfAbsent(name, 0);
                if (results.get(name) < points) {
                    results.put(name, points);
                }
                submissions.putIfAbsent(language, 0);
                submissions.put(language, submissions.get(language) + 1);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Results:%n");

        results.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(e -> {
                    System.out.println(e.getKey() + " | " + e.getValue());
                });

        System.out.printf("Submissions:%n");

        submissions.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
