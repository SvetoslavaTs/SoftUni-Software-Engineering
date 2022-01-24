package FinalExam;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> statistics = new LinkedHashMap<>();

        while (!line.equals("Statistics")) {
            String[] tokens = line.split("->");
            String command = tokens[0];
            switch (command) {
                case "Add": {
                    String username = tokens[1];
                    List<String> sentEmails = statistics.get(username);
                    if (sentEmails == null) {
                        sentEmails = new ArrayList<>();
                        statistics.put(username, sentEmails);
                    } else {
                        System.out.println(username + " is already registered");
                    }
                    break;
                }
                case "Send": {
                    String username = tokens[1];
                    String email = tokens[2];
                    statistics.get(username).add(email);
                    break;
                }
                case "Delete": {
                    String username = tokens[1];
                    if (statistics.get(username) == null) {
                        System.out.println(username + " not found!");
                    } else {
                        statistics.remove(username);
                    }
                    break;
                }

            }
            line = scanner.nextLine();
        }

        if (statistics.size() > 0) {
            System.out.println("Users count: " + statistics.size());

            statistics.entrySet().stream()
                    .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                    .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                    .forEach(entry -> {
                        System.out.println(entry.getKey());
                        entry.getValue().stream().forEach(e -> System.out.println(String.format("- %s", e)));
                    });

        } else {
            System.out.println("Users count: 0");
        }


    }
}
