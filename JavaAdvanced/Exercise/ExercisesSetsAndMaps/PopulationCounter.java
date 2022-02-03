package ExercisesSetsAndMaps;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Long>> populationInfo = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("report")) {
            String[] tokens = line.split("\\|");
            String country = tokens[1];
            String city = tokens[0];
            long population = Long.parseLong(tokens[2]);

            populationInfo.putIfAbsent(country, new LinkedHashMap<>());
            populationInfo.get(country).putIfAbsent(city, population);


            line = scanner.nextLine();
        }

        populationInfo.entrySet().stream().sorted((c1, c2) -> {
            long p1 = c1.getValue().values().stream().mapToLong(l -> l).sum();
            long p2 = c2.getValue().values().stream().mapToLong((l -> l)).sum();
            return Long.compare(p2, p1);
        }).forEach(c -> {
            long totalPopulation = c.getValue().values().stream().mapToLong(e -> e).sum();
            System.out.println(String.format("%s (total population: %d)", c.getKey(), totalPopulation));
            Map<String, Long> innerMap = c.getValue();
            innerMap.entrySet().stream().sorted((s1, s2) -> Long.compare(s2.getValue(), s1.getValue()))
                    .forEach(s -> System.out.println(String.format("=>%s: %d", s.getKey(), s.getValue())));

        });

    }
}
