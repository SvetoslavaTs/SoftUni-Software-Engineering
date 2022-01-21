package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults1 {
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
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.printf("Submissions:%n");

        submissions.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });

    }
}
