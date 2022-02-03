package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        String command = scanner.nextLine();
        String current = null;

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    current = history.pop();
                }
            } else {
                if (current != null) {
                    history.push(current);
                }
                current = command;
            }


            System.out.println(current);

            command = scanner.nextLine();

        }


    }
}
