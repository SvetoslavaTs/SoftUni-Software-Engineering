package ExercisesSetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, Integer>> logs = new TreeMap<>();

        while (n-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split("\\s+");
            String IP = tokens[0];
            int duration = Integer.parseInt(tokens[2]);
            String user = tokens[1];
            logs.putIfAbsent(user, new TreeMap<>());
            logs.get(user).putIfAbsent(IP, 0);
            logs.get(user).put(IP, logs.get(user).get(IP) + duration);

        }
        logs.entrySet().stream().forEach(stringMapEntry -> {
            System.out.println(String.format("%s: %d [%s]", stringMapEntry.getKey(),
                    stringMapEntry.getValue().values().stream().mapToInt(e -> e).sum(),
                    stringMapEntry.getValue().keySet().toString().replaceAll("[\\[\\]]", "")));
        });


//
    }
}
