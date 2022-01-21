package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            if (tokens[0].equals("register")) {
                if (!parking.containsKey(tokens[1])) {
                    parking.put(tokens[1], tokens[2]);
                    System.out.printf("%s registered %s successfully%n", tokens[1], tokens[2]);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", tokens[2]);
                }
            } else if (tokens[0].equals("unregister")) {
                if (!parking.containsKey(tokens[1])) {
                    System.out.printf("ERROR: user %s not found%n", tokens[1]);
                } else {
                    System.out.printf("%s unregistered successfully%n", tokens[1]);
                    parking.remove(tokens[1]);
                }
            }

        }
        parking.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
