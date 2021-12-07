package ExerciseList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfcommands = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfcommands; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            boolean isInTheList = list.contains(name);
            if (tokens.length == 3 && tokens[1].equals("is") && tokens[2].equals("going!")) {
                if (list.isEmpty() || (!isInTheList)) {
                    list.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                    ;
                }
            } else if (tokens.length == 4 && tokens[1].equals("is") && tokens[2].equals("not") && tokens[3].equals("going!")) {
                if (list.isEmpty() || !isInTheList) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    list.remove(String.valueOf(name));
                }
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
