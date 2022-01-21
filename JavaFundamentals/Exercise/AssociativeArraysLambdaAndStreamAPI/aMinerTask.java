package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Map<String, Integer> miner = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int currentQuantities = scanner.nextInt();
            Integer quantities = miner.get(input);
            if (miner.get(input) == null) {
                quantities = 0;
            }
            miner.put(input, quantities + currentQuantities);
            input = scanner.next();
        }
        for (Map.Entry<String, Integer> entry : miner.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
