package ExercisesMultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CrossfireOrMatrixOfLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = rowsAndCols[0];
        int col = rowsAndCols[1];
        ArrayList<ArrayList<Integer>> field = new ArrayList<>();

        int counter = 1;

        for (int i = 0; i < row; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                numbers.add(counter++);
            }
            field.add(numbers);
        }

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[] tokens = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int rows = tokens[0];
            int cols = tokens[1];
            int radius = tokens[2];


            for (int i = cols - radius; i <= cols + radius; i++) {
                if (rows >= 0 && rows < field.size() && i >= 0 && i < field.get(rows).size()) {
                    field.get(rows).set(i, -1);
                }
            }

            for (int i = rows - radius; i <= rows + radius; i++) {
                if (i >= 0 && i < field.size() && cols >= 0 && cols < field.get(i).size()) {
                    field.get(i).set(cols, -1);
                }
            }


            for (ArrayList<Integer> list : field) {
                removeElementFromListMatrix(list);
            }
            //  field.removeIf(l -> l.isEmpty());
            field = field.stream()
                    .filter(e -> !e.isEmpty())
                    .collect(Collectors.toCollection(ArrayList::new));
            input = scanner.nextLine();

        }

        printMatrix(field);
    }

    private static void removeElementFromListMatrix(ArrayList<Integer> currentRow) {
//        while (currentRow.contains(-1)) {
//            currentRow.remove(currentRow.indexOf(-1));
//        }
        currentRow.removeAll(Arrays.asList(-1));

    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> field) {
        for (int i = 0; i < field.size(); i++) {
            for (int j = 0; j < field.get(i).size(); j++) {
                System.out.print(field.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
