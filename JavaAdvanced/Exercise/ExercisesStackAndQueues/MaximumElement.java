package ExercisesStackAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> elements = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int[] tokens = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int command = tokens[0];

            switch (command) {
                case 1:
                    int numberToPush = tokens[1];
                    elements.push(numberToPush);
                    break;
                case 2:
                    if (!elements.isEmpty()) {
                        elements.pop();
                    }
                    break;
                case 3:
                    if (!elements.isEmpty()) {
                        System.out.println(Collections.max(elements));
                    }
                    break;
            }
        }
    }
}
