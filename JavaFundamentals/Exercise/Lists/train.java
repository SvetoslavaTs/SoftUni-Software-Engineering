package ExerciseList;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            if (tokens.length == 2) {
                String command = tokens[0];
                int passengers = Integer.parseInt(tokens[1]);
                list.add(passengers);
            } else if (tokens.length == 1) {
                int passengers = Integer.parseInt(tokens[0]);
                fitAllThePassengers(list, passengers, maxCapacity);
            }


            line = scanner.nextLine();
        }
        printList(list);

    }

    private static void printList(List<Integer> list) {
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void fitAllThePassengers(List<Integer> list, int passengers, int maxCapacity) {
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) + passengers) <= maxCapacity) {
                list.set(i, list.get(i) + passengers);
                break;
            }
        }
    }
}
