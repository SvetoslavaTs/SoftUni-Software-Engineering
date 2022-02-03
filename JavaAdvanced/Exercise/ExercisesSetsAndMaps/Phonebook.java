package ExercisesSetsAndMaps;

import java.awt.datatransfer.FlavorListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();

        while (!line.equals("search")) {
            String[] tokens = line.split("-");
            phonebook.putIfAbsent(tokens[0], "");
            phonebook.put(tokens[0], tokens[1]);
            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("stop")) {
            if (phonebook.containsKey(line)) {
                System.out.printf("%s -> %s%n", line, phonebook.get(line));
            } else {
                System.out.printf("Contact %s does not exist.%n", line);
            }
            line = scanner.nextLine();
        }


    }
}
