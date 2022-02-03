package ExercisesSetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        Map<String, Integer> miner = new HashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            miner.putIfAbsent(line, 0);
            miner.put(line, miner.get(line) + quantity);
            line = scanner.nextLine();
        }
//        for (Map.Entry<String, Integer> entry : miner.entrySet()) {
//            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
//        }

        miner.forEach((key, value) -> System.out.println(String.format("%s -> %d", key, value)));
    }
}
