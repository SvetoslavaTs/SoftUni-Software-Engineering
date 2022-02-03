package ExercisesMultidimensionalArrays;

import java.util.*;

public class ReverseMatrixDiagonalsWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");
        int[][] matrix = readMatrix(scanner, data);


        int row = Integer.parseInt(data[0]) - 1;
        int col = Integer.parseInt(data[1]) - 1;

        while (row >= 0) {

            int innerRow = row;
            int innerCol = col;

            while (innerRow >= 0 && innerCol <= matrix[innerRow].length - 1) {
                System.out.print(matrix[innerRow--][innerCol++] + " ");

            }
            System.out.println();

            col--;
            if (col < 0) {
                col = 0;
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

