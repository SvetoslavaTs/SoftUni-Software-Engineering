package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Move":
                    String leftOrRight = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (index < 0 || index > list.size()) {
                        break;
                    }
                    if (leftOrRight.equals("Left")) {
                        moveToLeft(index, list);
                    } else if (leftOrRight.equals("Right")) {
                        moveToRight(index, list);
                    }
                    break;
                case "Check":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("Even")) {
                        for (int i = 0; i < list.size(); i++) {
                            if (i % 2 == 0) {
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (evenOrOdd.equals("Odd")) {
                        for (int i = 0; i < list.size(); i++) {
                            if (i % 2 != 0) {
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.print("You crafted ");
        System.out.print(String.join("", list));
        System.out.print("!");

    }

    private static void moveToRight(int index, List<String> list) {
        if (index + 1 <= list.size() - 1) {
            String current = list.get(index + 1);
            list.set(index + 1, list.get(index));
            list.set(index, current);
        }
    }

    private static void moveToLeft(int index, List<String> list) {
        if (index - 1 >= 0) {
            String current = list.get(index - 1);
            list.set(index - 1, list.get(index));
            list.set(index, current);
        }
    }
}
