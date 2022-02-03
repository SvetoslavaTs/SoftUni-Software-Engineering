package SetsAndMaps;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniPartyOnlyOneTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            if (input.length() != 8) {
                break;
            }
            guests.add(input);
            input = scanner.nextLine();
        }

        while (!(input = scanner.nextLine()).equals("END")) {
            guests.remove(input);
        }
        System.out.println(guests.size());
        guests.forEach(System.out::println);

    }
}
