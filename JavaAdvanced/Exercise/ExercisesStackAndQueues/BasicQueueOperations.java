package ExercisesStackAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tokens = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(queue::offer);

        if (!queue.isEmpty()) {
            for (int i = 0; i < tokens[1]; i++) {
                queue.poll();
            }
        }
        if (queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(tokens[2])) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}

