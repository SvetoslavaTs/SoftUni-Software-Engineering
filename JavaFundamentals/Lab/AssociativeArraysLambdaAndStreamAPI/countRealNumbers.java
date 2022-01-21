package AssociativeArraysLambdaAndStreamAPI;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOccurrences = new TreeMap<>();

        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            double number = Double.parseDouble(line[i]);
            Integer occurrences = numberOccurrences.get(number);
            if (occurrences == null) {
                occurrences = 0;
            }
            numberOccurrences.put(number, occurrences + 1);
        }
        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

        //for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
        //    System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        //}


    }
}
