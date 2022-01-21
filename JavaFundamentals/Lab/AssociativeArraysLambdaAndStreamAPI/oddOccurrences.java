package AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class oddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordOccurrences = new LinkedHashMap<>();

        String[] words = scanner.nextLine().toLowerCase().split(" ");
        for (String word : words) {
            Integer occurrences = wordOccurrences.get(word);
            if (occurrences == null) {
                occurrences = 0;
            }
            wordOccurrences.put(word, occurrences + 1);
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", odds));
    }
}
