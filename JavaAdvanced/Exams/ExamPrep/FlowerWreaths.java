package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(liliesStack::push);

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(rosesQueue::offer);
        int wreaths = 0;
        int storedFlowers = 0;

        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {
            int lilies = liliesStack.pop();
            int roses = rosesQueue.poll();
            if (lilies + roses == 15) {
                wreaths++;
            } else if (lilies + roses > 15) {
                while (lilies + roses > 15) {
                    lilies -= 2;
                }
                wreaths++;
            } else if (lilies + roses < 15) {
                storedFlowers += lilies + roses;
            }
        }
        while (storedFlowers >= 15) {
            wreaths++;
            storedFlowers -= 15;
        }
        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }
    }
}
