package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;

        for (String child : children)
            queue.offer(child);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++)
                queue.offer(queue.poll());

            if (isPrime(cycle))
                System.out.println("Prime " + queue.peek());
            else
                System.out.println("Removed " + queue.poll());

            cycle++;
        }
        System.out.println("Last is " + queue.poll());

    }

    private static boolean isPrime(int cycle) {
        boolean isPrimeCycle = true;
        if (cycle == 1) {
            isPrimeCycle = false;
        } else {
            for (int i = 2; i <= cycle / 2; ++i) {
                if (cycle % i == 0) {
                    isPrimeCycle = false;
                    break;
                }
            }
        }
        return isPrimeCycle;
    }
}


