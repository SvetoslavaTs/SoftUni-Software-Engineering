package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        String command = scanner.nextLine();
        String current = null;

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    if (current != null) {
                        forward.addFirst(current);
                        current = history.pop();
                    }
                }
            } else if (command.equals("forward")) {
                if (forward.isEmpty()) {
                    System.out.println("no next URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    if (current != null) {
                        history.push(current);
                        current = forward.poll();
                    }
                }
            } else {
                if (current != null) {
                    forward.clear();
                    history.push(current);
                }
                current = command;
            }


            System.out.println(current);

            command = scanner.nextLine();

        }


    }
}
