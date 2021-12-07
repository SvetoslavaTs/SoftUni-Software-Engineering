package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (tokens[0]) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    if (list.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findAllEvenNums(list);
                    } else if (evenOrOdd.equals("odd")) {
                        findAllOddNums(list);
                    }
                    break;
                case "Get":
                    String sum = tokens[1];
                    if (sum.equals("sum")) {
                        sumAllNums(list);
                    }
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int conditionNumber = Integer.parseInt(tokens[2]);
                    if (condition.equals("<")) {
                        findSmallerElementsThanGivenNumber(list, condition, conditionNumber);
                    } else if (condition.equals(">")) {
                        findBiggerElementsThanGivenNumber(list, condition, conditionNumber);
                    } else if (condition.equals("<=")) {
                        findSmallerAndEqualElementsThanGivenNumber(list, condition, conditionNumber);
                    } else if (condition.equals(">=")) {
                        findBiggerAndEqualElementsThanGivenNumber(list, condition, conditionNumber);
                    }

                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void findBiggerAndEqualElementsThanGivenNumber(List<Integer> list, String condition, int conditionNumber) {
        List<Integer> tempList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= conditionNumber) {
                tempList.add(integer);
            }
        }
        printList(tempList);
    }

    private static void findSmallerAndEqualElementsThanGivenNumber(List<Integer> list, String condition, int conditionNumber) {
        List<Integer> tempList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer <= conditionNumber) {
                tempList.add(integer);
            }
        }
        printList(tempList);
    }

    private static void findBiggerElementsThanGivenNumber(List<Integer> list, String condition, int conditionNumber) {
        List<Integer> tempList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > conditionNumber) {
                tempList.add(integer);
            }
        }
        printList(tempList);
    }

    private static void findSmallerElementsThanGivenNumber(List<Integer> list, String condition, int conditionNumber) {
        List<Integer> tempList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer < conditionNumber) {
                tempList.add(integer);
            }
        }
        printList(tempList);
    }

    private static void sumAllNums(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>(list);
        for (int i = 0; i < tempList.size() - 1; i++) {
            tempList.set(i, tempList.get(i) + tempList.get(i + 1));
            tempList.remove(i + 1);
            i--;
        }
        printList(tempList);
    }

    private static void findAllOddNums(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>(list);
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) % 2 == 0) {
                tempList.remove(i--);
            }
        }
        printList(tempList);
    }

    private static void findAllEvenNums(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>(list);
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) % 2 != 0) {
                tempList.remove(i--);
            }
        }
        printList(tempList);
    }

    private static void printList(List<Integer> list) {
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
