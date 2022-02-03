package ExamRetake;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tulipsStack = new ArrayDeque<>();
        ArrayDeque<Integer> daffodilsQueue = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tulipsStack::push);

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(daffodilsQueue::offer);
        int wreaths = 0;
        int storedFlowers = 0;

        while (!tulipsStack.isEmpty() && !daffodilsQueue.isEmpty()) {
            int tulips = tulipsStack.pop();
            int daffodils = daffodilsQueue.poll();
            if (tulips + daffodils == 15) {
                wreaths++;
            } else if (tulips + daffodils > 15) {
                while (tulips + daffodils > 15) {
                    tulips -= 2;
                }
                wreaths++;
            } else if (tulips + daffodils < 15) {
                storedFlowers += tulips + daffodils;
            }
        }
        while (storedFlowers >= 15) {
            wreaths++;
            storedFlowers -= 15;
        }
        if (wreaths >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", wreaths);
        } else {
            System.out.printf("You failed... You need more %d bouquets.", 5 - wreaths);
        }
    }
}

