package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companies = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            companies.putIfAbsent(tokens[0], new ArrayList<>());
            if (companies.get(tokens[0]).contains(tokens[1])) {
                input = scanner.nextLine();
                continue;
            } else {
                companies.get(tokens[0]).add(tokens[1]);
            }


            input = scanner.nextLine();
        }
        companies.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(stringListEntry -> {
                    System.out.println(stringListEntry.getKey());
                    stringListEntry.getValue().stream().forEach(v -> System.out.println(String.format("-- %s", v)));
                });


    }
}
