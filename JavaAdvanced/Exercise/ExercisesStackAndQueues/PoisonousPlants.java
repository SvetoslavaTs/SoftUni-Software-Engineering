package ExercisesStackAndQueues;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> plants = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Stack<Integer> deadPlantsIndexes = new Stack<>();

        int counterOfDays = 0;

        while (true) {
            counterOfDays++;
            int lastDeadDay = 0;
            for (int i = 0; i < n - 1; i++) {
                if (plants.get(i + 1) > plants.get(i)) {
                    deadPlantsIndexes.push(i + 1);
                    lastDeadDay = 1;
                }
            }
            while (!deadPlantsIndexes.isEmpty()) {
                plants.remove((int) deadPlantsIndexes.pop());
            }
            n = plants.size();

            if (lastDeadDay == 0) {
                System.out.println(counterOfDays - 1);
                return;
            }

        }


    }
}
