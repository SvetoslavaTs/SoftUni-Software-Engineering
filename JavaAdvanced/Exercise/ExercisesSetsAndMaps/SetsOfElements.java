package ExercisesSetsAndMaps;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> n = new LinkedHashSet<>();
        Set<Integer> m = new LinkedHashSet<>();
        int num;
        for (int i = 0; i < input[0]; i++) {
            num = scanner.nextInt();
            n.add(num);
        }

        for (int i = 0; i < input[1]; i++) {
            num = scanner.nextInt();
            m.add(num);
        }

        n.forEach(e -> {
            if (m.contains(e)) {
                System.out.print(e + " ");
            }
        });

    }
}
