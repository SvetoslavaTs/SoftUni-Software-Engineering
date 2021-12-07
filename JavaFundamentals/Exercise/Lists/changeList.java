package ExerciseList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Delete":
                    int elementForDelete = Integer.parseInt(tokens[1]);
                    list.removeIf(e -> (e == elementForDelete));
                    break;
                case "Insert":
                    int elementForInsert = Integer.parseInt(tokens[1]);
                    int indexOfElementForInsert = Integer.parseInt(tokens[2]);
                    if (indexOfElementForInsert < list.size()) {
                        list.add(indexOfElementForInsert, elementForInsert);
                    }
            }
            line = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
