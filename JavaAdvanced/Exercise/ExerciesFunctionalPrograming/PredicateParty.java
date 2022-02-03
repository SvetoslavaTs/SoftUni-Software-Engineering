package ExerciesFunctionalPrograming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    static List<String> guestsList = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        guestsList = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Remove":
                    removeOne(getPredicate(tokens));
                    break;
                case "Double":
                    addOneMore(getPredicate(tokens));
                    break;
            }

            input = scanner.nextLine();
        }

        if (guestsList.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guestsList);
            System.out.println(guestsList.toString().replaceAll("[\\[\\]]", "") + " are going to the party!");
        }
    }

    private static void removeOne(Predicate<String> predicate) {
        guestsList.removeIf(predicate);
    }

    private static void addOneMore(Predicate<String> predicate) {
        List<String> namesToAdd = new ArrayList<>();
        guestsList.stream().filter(predicate).forEach(namesToAdd::add);
        guestsList.addAll(namesToAdd);

    }

    public static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;
        if (tokens[1].equals("StartsWith")) {
            predicate = name -> name.startsWith(tokens[2]);
        } else if (tokens[1].equals("EndsWith")) {
            predicate = name -> name.endsWith(tokens[2]);
        } else if (tokens[1].equals("Length")) {
            predicate = name -> name.length() == Integer.parseInt(tokens[2]);
        }

        return predicate;
    }
}
