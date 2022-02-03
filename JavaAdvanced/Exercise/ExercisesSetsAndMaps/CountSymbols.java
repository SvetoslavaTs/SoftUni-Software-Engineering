package ExercisesSetsAndMaps;

import java.text.Format;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> occur = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            //var1
//            if (!occur.containsKey(current)){
//                occur.put(current, 1);
//            } else {
//                occur.put(current, occur.get(current) + 1);
//            }
//            var2
//            occur.putIfAbsent(current, 0);
//            occur.put(current, occur.get(current) + 1);

            int currentValue = occur.getOrDefault(current, 0);
            occur.put(current, currentValue + 1);
        }

        for (Map.Entry<Character, Integer> entry : occur.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
