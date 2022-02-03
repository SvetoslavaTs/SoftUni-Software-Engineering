package SetsAndMaps;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> info = new TreeMap<>();

        while (n-- > 0) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();
            info.putIfAbsent(name, grades);
        }

        for (Map.Entry<String, double[]> stringEntry : info.entrySet()) {
            double avg = 0;
            for (double v : stringEntry.getValue()) {
                avg += v;
            }
            avg /= stringEntry.getValue().length;
            System.out.printf("%s is graduated with %s%n", stringEntry.getKey(), avg);
        }
    }
}
