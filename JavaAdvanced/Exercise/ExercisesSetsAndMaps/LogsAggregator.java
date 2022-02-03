package ExercisesSetsAndMaps;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<Set<String>, Integer>> logs = new TreeMap<>();

        while (n-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split("\\s+");
            String IP = tokens[0];
            Set<String> currentSet = new TreeSet<>();
            currentSet.add(IP);
            int duration = Integer.parseInt(tokens[2]);
            String user = tokens[1];
            logs.putIfAbsent(user, new LinkedHashMap<>());
            logs.get(user).putIfAbsent(new TreeSet<>() {{
                add(IP);
            }}, 0);
//            logs.get(user).put(Collections.singleton(IP), logs.get(user).get(Collections.singleton(IP)) + duration);

        }
//        logs.entrySet().stream().forEach(stringMapEntry -> {
//            Map<Set<String>, Integer> innerMap = stringMapEntry.getValue();
//            innerMap.keySet().stream().sorted((s, s1) -> s.toString().compareTo(s1.toString()));
//            System.out.println(String.format("%s: %d [%s]", stringMapEntry.getKey(),
//                    stringMapEntry.getValue().values().stream().mapToInt(e -> e).sum(),
//                    stringMapEntry.getValue().keySet().toString().replaceAll("[\\[\\]]", "")));
//        });


//
    }
}
