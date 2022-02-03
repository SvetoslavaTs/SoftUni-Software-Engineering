package ExercisesStackAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(e -> integers.push(e));

        while (integers.size() > 0) {
            System.out.print(integers.pop() + " ");
        }
    }
}
