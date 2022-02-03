package ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class readMatrixFromDownLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");
        int[][] matrix = readMatrix(scanner, data);


        int row = Integer.parseInt(data[0]) - 1;
        int col = 0;

        while (row >= 0) {

            int innerRow = row;
            int innerCol = col;

            while (innerRow >= 0 && innerCol >= 0) {
                System.out.print(matrix[innerRow--][innerCol--] + " ");

            }
            System.out.println();

            col++;
            if (col >= matrix[row].length) {
                col = matrix[row].length - 1;
                row--;
            }
        }

    }

    public static int[][] readMatrix(Scanner scanner, String[] data) {

        int[][] matrix = new int[Integer.parseInt(data[0])][Integer.parseInt(data[1])];
        for (int i = 0; i < matrix.length; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = current;
        }
        return matrix;
    }
}


