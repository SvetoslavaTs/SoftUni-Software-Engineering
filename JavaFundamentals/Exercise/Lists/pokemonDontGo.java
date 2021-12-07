package ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!distances.isEmpty()) {
            int indexes = scanner.nextInt();
            int currentDistance = 0;

            if (indexes < 0) {
                currentDistance = distances.get(0);
                sum += currentDistance;
                distances.remove(0);
                distances.add(0, distances.get(distances.size() - 1));
            } else if (indexes > distances.size() - 1) {
                currentDistance = distances.get(distances.size() - 1);
                sum += currentDistance;
                distances.remove(distances.size() - 1);
                distances.add(distances.get(0));
            } else {
                currentDistance = distances.get(indexes);
                sum += currentDistance;
                distances.remove(indexes);
            }

            for (int i = 0; i < distances.size(); i++) {
                if (distances.get(i) <= (currentDistance)) {
                    distances.set(i, distances.get(i) + currentDistance);
                } else {
                    distances.set(i, distances.get(i) - currentDistance);
                }
            }
        }

        System.out.println(sum);
    }
}
