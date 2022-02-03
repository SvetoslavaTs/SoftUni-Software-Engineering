package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.peek());
                    queue.poll();
                }
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

//        for (String s : queue) {
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(queue.toArray()));

    }
}
