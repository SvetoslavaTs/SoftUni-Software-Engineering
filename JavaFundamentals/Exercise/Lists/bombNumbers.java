package ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int bomb = scanner.nextInt();
        int power = scanner.nextInt();

        while (list.contains(bomb)) {
            int indexOfBomb = list.indexOf(bomb);
            int leftBound = Math.max(0, indexOfBomb - power);
            int rightBound = Math.min(list.size() - 1, indexOfBomb + power);

            for (int i = rightBound; i >= leftBound; i--) {
                list.remove(i);
            }
        }
        int sum = 0;
        for (Integer n : list) {
            sum += n;
        }
        System.out.println(sum);
    }
}
