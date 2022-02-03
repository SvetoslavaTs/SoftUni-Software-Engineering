package ExerciesFunctionalPrograming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestsList = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        Map<String, Predicate<String>> predicates = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Print")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String predicateName = tokens[1] + tokens[2];
            switch (command) {
                case "Add filter":
                    Predicate<String> predicate = getPredicate(tokens);
                    predicates.put(predicateName, predicate);
                    break;
                case "Remove filter":
                    predicates.remove(predicateName);
                    break;
            }

            input = scanner.nextLine();
        }
        guestsList.stream().filter(guest -> {
            boolean isValid = true;
            for (Predicate<String> value : predicates.values()) {
                if (value.test(guest)) {
                    isValid = false;
                    break;
                }
            }
            return isValid;
        }).forEach(e -> System.out.print(e + " "));
    }


    public static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;
        if (tokens[1].equals("Starts with")) {
            predicate = name -> name.startsWith(tokens[2]);
        } else if (tokens[1].equals("Ends with")) {
            predicate = name -> name.endsWith(tokens[2]);
        } else if (tokens[1].equals("Length")) {
            predicate = name -> name.length() == Integer.parseInt(tokens[2]);
        } else if (tokens[1].equals("Contains")) {
            predicate = name -> name.contains(tokens[2]);
        }

        return predicate;
    }

    public static void print2(List<String> list) {
        for (String s : list)
            System.out.print(s + " ");
    }
}
