package ExercisesStackAndQueues;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] NSX = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = NSX[0];
        int S = NSX[1];
        int X = NSX[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }
        for (int i = 0; i < S; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        } else if (stack.contains(X)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
