package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().replaceAll(" ", "");
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            Integer currentOccurrences = occurrences.get(currentChar);
            if (currentOccurrences == null) {
                currentOccurrences = 0;
            }
            occurrences.put(currentChar, currentOccurrences + 1);
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // occurrences.forEach((k,v) -> System.out.println(k + " -> " + v));

    }
}
