package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        LinkedHashMap<Double, Integer> result = new LinkedHashMap<>();
        for (Double number : input) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                result.put(number, result.get(number) + 1);
            }
        }
        for (Double key : result.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, result.get(key)));
        }


    }
}
