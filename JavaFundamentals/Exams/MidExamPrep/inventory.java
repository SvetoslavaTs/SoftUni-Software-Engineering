package midExamPrep;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            switch (command) {
                case "Collect": {
                    String item = tokens[1];
                    if (!list.contains(item)) {
                        list.add(item);
                    }
                    break;
                }
                case "Drop": {
                    String item = tokens[1];
                    if (list.contains(item)) {
                        int indexOfItem = list.indexOf(item);
                        list.remove(indexOfItem);
                    }
                    break;
                }
                case "Combine Items": {
                    String[] tokensOfItems = tokens[1].split(":");
                    String oldItem = tokensOfItems[0];
                    String newItem = tokensOfItems[1];
                    int indexOfOldItem = list.indexOf(oldItem);
                    if (list.contains(oldItem)) {
                        list.add(indexOfOldItem + 1, newItem);
                    }
                    break;
                }
                case "Renew": {
                    String item = tokens[1];
                    int indexOfitem = list.indexOf(item);
                    if (list.contains(item) && indexOfitem != list.size() - 1) {
                        list.add(item);
                        list.remove(indexOfitem);
                    }
                    break;
                }
                default: {
                    break;
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print(list.get(list.size() - 1));
    }
}
