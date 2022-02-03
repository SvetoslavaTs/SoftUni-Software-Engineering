package ExercisesSetsAndMaps;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> chemicalElements = new TreeSet<>();

        while (n-- > 0) {
            String line = scanner.nextLine();
            String[] chEl = line.split("\\s+");
            Collections.addAll(chemicalElements, chEl);
        }
        for (String element : chemicalElements) {
            System.out.print(element + " ");
        }

    }
}
