package Exam;

import java.util.*;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBoxQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();
        List<Integer> collection = new ArrayList<>();

        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(firstBoxQueue::offer);
        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondBoxStack::push);

        while ((!firstBoxQueue.isEmpty()) && (!secondBoxStack.isEmpty())) {
            int currentIntFromQuew = firstBoxQueue.peek();
            int currentINtFromDeck = secondBoxStack.pop();
            int sum = currentINtFromDeck + currentIntFromQuew;
            if (sum % 2 == 0) {
                collection.add(sum);
                firstBoxQueue.poll();
            } else {
                firstBoxQueue.offer(currentINtFromDeck);
            }
        }
        if (firstBoxQueue.isEmpty()) {
            System.out.println("First magic box is empty.");
        } else {
            System.out.println("Second magic box is empty.");
        }
        int sumCollection = 0;
        for (Integer integer : collection) {
            sumCollection += integer;
        }
        if (sumCollection >= 90) {
            System.out.println("Wow, your prey was epic! Value: " + sumCollection);
        } else {
            System.out.println("Poor prey... Value: " + sumCollection);
        }

    }
}
