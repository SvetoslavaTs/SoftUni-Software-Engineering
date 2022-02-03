package ExercisesGenerics.GenericSwapMethodStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box();

        for (int i = 0; i < n; i++) {
            box.add(scanner.nextLine());
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        box.swap(indexes[0], indexes[1]);
        System.out.println(box);

    }
}
