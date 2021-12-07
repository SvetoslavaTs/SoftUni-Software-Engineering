package ExerciseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        String input2 = scanner.nextLine();

        while (!input2.equals("3:1")) {
            String[] tokens = input2.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "merge":
                    int startIndex = Math.max(0, Integer.parseInt(tokens[1]));
                    int endIndex = Math.min(list.size() - 1, Integer.parseInt(tokens[2]));
                    // if (startIndex < 0 || startIndex > list.size()-1) {
                    //     startIndex = 0;
                    //} else if (endIndex > list.size()-1 || endIndex < 0) {
                    //  endIndex = list.size()-1;
                    //}
                    while (startIndex < endIndex) {
                        list.set(startIndex, list.get(startIndex) + list.get(startIndex + 1));
                        list.remove(startIndex + 1);
                        endIndex -= 1;
                    }
                    break;

                case "divide":
                    int index = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);
                    String element = list.get(index);
                    list.remove(index);
                    List<String> current = new ArrayList<>();

                    if (element.length() % partitions == 0) {
                        int count = element.length() / partitions;
                        int indexString = 0;
                        for (int i = 0; i < partitions; i++) {
                            String currentElement = "";
                            for (int j = 0; j < count; j++) {
                                char temp = element.charAt(indexString);
                                currentElement += temp;
                                indexString++;
                            }
                            current.add(currentElement);
                        }
                    } else {
                        int count = element.length() / partitions;
                        int indexString = 0;
                        for (int i = 0; i < partitions; i++) {
                            String currentElement = "";
                            for (int j = 0; j < count; j++) {
                                char temp = element.charAt(indexString);
                                currentElement += temp;
                                indexString++;
                            }
                            current.add(currentElement);
                        }
                        String currentElement = "";
                        for (int i = partitions * count; i < element.length(); i++) {
                            char temp = element.charAt(i);
                            currentElement += temp;
                        }
                        current.set(current.size() - 1, (current.get(current.size() - 1) + currentElement));

                    }
                    list.addAll(index, current);
                    break;
            }
            input2 = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
