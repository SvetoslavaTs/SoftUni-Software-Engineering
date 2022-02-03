package SetsAndMaps;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> VIPGuests = new TreeSet<>();
        TreeSet<String> regularGuests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            if (input.length() != 8) {
                break;
            } else if (Character.isDigit(input.charAt(0))) {
                VIPGuests.add(input);
            } else {
                regularGuests.add(input);

            }
            input = scanner.nextLine();
        }

        while (!(input = scanner.nextLine()).equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                VIPGuests.remove(input);
            } else {
                regularGuests.remove(input);
            }
        }
        System.out.println(VIPGuests.size() + regularGuests.size());
        VIPGuests.forEach(System.out::println);
        regularGuests.forEach(System.out::println);
    }
}
