package ExercisesStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> undo = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            switch (command) {
                case "1":
                    undo.push(text.toString());
                    String textToAppend = input[1];
                    text.append(textToAppend);
                    break;
                case "2":
                    undo.push(text.toString());
                    int count = Integer.parseInt(input[1]);
                    for (int j = 0; j < count; j++) {
                        text = new StringBuilder(text.substring(0, text.length() - 1));
                    }
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    if (!undo.isEmpty()) {
                        text = new StringBuilder(undo.pop());
                    }
                    break;
                default:
                    break;
            }

        }


    }
}
