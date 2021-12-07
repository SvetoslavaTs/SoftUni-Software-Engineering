package ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!(firstList.isEmpty() || secondList.isEmpty())) {
            if (firstList.get(0) > secondList.get(0)) {
                firstList.add(firstList.get(0));
                firstList.add(secondList.get(0));
                firstList.remove(0);
                secondList.remove(0);
            } else if (firstList.get(0) < secondList.get(0)) {
                secondList.add(secondList.get(0));
                secondList.add(firstList.get(0));
                secondList.remove(0);
                firstList.remove(0);
            } else if (firstList.get(0).equals(secondList.get(0))) {
                firstList.remove(0);
                secondList.remove(0);
            }
        }
        int sum = 0;
        if (secondList.isEmpty()) {
            for (Integer number : firstList) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer number : secondList) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
