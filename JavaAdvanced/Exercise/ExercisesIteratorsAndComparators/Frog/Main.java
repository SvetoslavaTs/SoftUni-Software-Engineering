package ExercisesIteratorsAndComparators.Frog;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        Lake lake = new Lake(input);
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = lake.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(", ");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 2));
    }
}
