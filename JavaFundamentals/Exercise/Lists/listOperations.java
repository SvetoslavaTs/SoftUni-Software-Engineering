package ExerciseList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add": {
                    int number = Integer.parseInt(tokens[1]);
                    list.add(number);
                    break;
                }
                case "Insert": {
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index < 0 || index > list.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    list.add(index, number);
                    break;
                }
                case "Remove": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index > list.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    list.remove(index);
                    break;
                }
                case "Shift": {
                    String leftOrRight = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (leftOrRight.equals("left")) {
                        firstNumberBecomesLastCountTimes(list, count);
                    } else if (leftOrRight.equals("right")) {
                        lastNumberBecomesFirstCountTimes(list, count);
                    }
                    break;
                }
            }
            line = scanner.nextLine();
        }

        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void lastNumberBecomesFirstCountTimes(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            int lastNum = list.get(list.size() - 1);
            list.add(0, lastNum);
            list.remove(list.size() - 1);
        }
    }

    private static void firstNumberBecomesLastCountTimes(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            int firstNum = list.get(0);
            list.add(firstNum);
            list.remove(0);
        }
    }
}
