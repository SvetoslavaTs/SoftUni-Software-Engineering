package midExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Urgent": {
                    String item = tokens[1];
                    if (!list.contains(item)) {
                        list.add(0, item);
                    }
                    break;
                }
                case "Unnecessary": {
                    String item = tokens[1];
                    int indexOfItem = list.indexOf(item);
                    if (list.contains(item)) {
                        list.remove(indexOfItem);
                    }
                    break;
                }
                case "Correct": {
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    int indexOfOldItem = list.indexOf(oldItem);
                    if (list.contains(oldItem)) {
                        list.set(indexOfOldItem, newItem);
                    }
                    break;
                }
                case "Rearrange": {
                    String item = tokens[1];
                    int indexOfItem = list.indexOf(item);
                    if (list.contains(item)) {
                        list.add(item);
                        list.remove(indexOfItem);
                    }
                    break;
                }
                default: {
                    break;
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", list));
    }
}
