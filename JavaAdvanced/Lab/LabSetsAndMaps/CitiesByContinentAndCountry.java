package SetsAndMaps;

import java.text.Format;
import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> ccc = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            ccc.putIfAbsent(continent, new LinkedHashMap<>());
            ccc.get(continent).putIfAbsent(country, new ArrayList<>());
            ccc.get(continent).get(country).add(city);
        }
        ccc.entrySet().stream().forEach(stringMapEntry -> {
            System.out.println(String.format("%s:", stringMapEntry.getKey()));
            stringMapEntry.getValue().forEach((k, v) -> {
                System.out.printf("%s -> %s%n", k,
                        String.join(", ", v));
            });
        });


    }
}
